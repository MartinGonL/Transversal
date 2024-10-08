package Persistencia;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InscripcionData {
    
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;

    public InscripcionData() {
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidadulp", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa.");
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Cargar Drivers");
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Falla en la Conexion.");
        }
    }
    
    public void buscarElementos(ArrayList<Alumno> alumnos, ArrayList<Materia> materias) {
        
        /*Buscar TODOS los elementos de cada relacion para enviarlos al Frame y cargarlos en los ComboBox*/
        
        String sqlAlumno = "SELECT * FROM `alumno`";
        String sqlMateria = "SELECT * FROM `materia`";
        
        try 
        {
            /*Peticion de alumnos*/
            sentencia = conexion.prepareStatement(sqlAlumno);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {
                Alumno alumno = new Alumno();
                alumno.setIDalumno(resultado.getInt("idAlumno"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setDni(resultado.getInt("dni"));
                alumno.setFechaNacimiento(LocalDate.parse(resultado.getString("fechaNacimiento")));
                alumno.setEstado(resultado.getBoolean("estado"));
                
                /*Excluyo de las opciones aquellos alumnos dados de baja, es decir, que su estado sea false.*/
                if (alumno.isEstado()) alumnos.add(alumno);
            }
            
            /*Peticion de materias*/
            sentencia = conexion.prepareStatement(sqlMateria);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {
                Materia materia = new Materia();
                materia.setIDmateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre_materia"));
                materia.setAño(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
                
                /*Excluyo de las opciones aquellas materias que no esten disponibles, es decir, que su estado sea false.*/
                if (materia.isEstado()) materias.add(materia);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Falla en la Sintaxis.");
        }
    }
    
    public void buscarPorID(ArrayList<Materia> materias, ArrayList<Inscripcion> inscripciones, JComboBox box, Boolean FLAG) {
        /*Reservo el alumno seleccionado en el ComboBox, y defino otra variable donde guardare el ID del alumno.*/
        String select = box.getSelectedItem().toString();
        String ID = "";
        
        try 
        {
            /*Recorro cada caracter del valor seleccionado en el ComboBox para saber donde terminan los numeros del ID.*/
            for (int i = 0; i < select.length(); i++) 
            {
                /*Simplifico la exprecion en x, y multiplico los caracteres por 0 para saber si son numeros o letras.*/
                String x = Character.toString(select.charAt(i));
                if (Integer.parseInt(x)*0 == 0) 
                {
                    /*Guardo los numeros en la variable ID y espero a que la excepecion interrumpa el proceso. Esta interrupcion 
                    marcara el final de los numeros.*/
                    ID += select.charAt(i);
                }
            }
        } 
        catch (NumberFormatException ex){}
        
        /*Filtro entre materias inscriptas y no inscriptas segun la bandera.*/
        String sql = (FLAG) ? "SELECT a.idMateria, `nombre_materia`, `año`, `estado`, `idAlumno`, `nota`, `recursante` " + 
                              "FROM `materia` a " + 
                              "JOIN inscripcion b " + 
                              "ON a.idMateria = b.idMateria " + 
                              "WHERE b.idAlumno = " + ID 
                              : 
                              "SELECT a.idMateria, a.nombre_materia, a.año, a.estado " +
                              "FROM materia a " +
                              "LEFT JOIN (SELECT a.idMateria, nombre_materia, año, estado, idAlumno " +
                                          "FROM materia a " +
                                          "JOIN inscripcion b " +
                                          "ON a.idMateria = b.idMateria " +
                                          "WHERE b.idAlumno = " + ID +") b " +
                              "ON a.idMateria = b.idMateria " +
                              "WHERE idAlumno IS NULL";
        
        try 
        {
            //Una vez haya filtrado el ID del alumno seleccionado realizo la consulta.

            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {
                Materia materia = new Materia();
                materia.setIDmateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre_materia"));
                materia.setAño(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
                
                if (FLAG) 
                {
                    Inscripcion insc = new Inscripcion();
                    insc.setIDalumno(resultado.getInt("idAlumno"));
                    insc.setIDmateria(resultado.getInt("idMateria"));
                    insc.setNota(resultado.getInt("nota"));
                    insc.setRecursante(resultado.getBoolean("recursante"));

                    inscripciones.add(insc);
                }
                
                /*Excluyo de las opciones aquellas materias que no esten disponibles, es decir, que su estado sea false.*/
                if (materia.isEstado()) materias.add(materia);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Falla en la Sintaxis.");
        }
    }
    
    public void buscarPorIDTxt(ArrayList<Materia> materias, JTextField txt) {
        /*Reservo el ID del alumno.*/
        String ID = txt.getText();
        
        /*Filtro entre materias no inscriptas.*/
        String sql = "SELECT a.idMateria, a.nombre_materia, a.año, a.estado " +
                     "FROM materia a " +
                     "LEFT JOIN (SELECT a.idMateria, nombre_materia, año, estado, idAlumno " +
                                "FROM materia a " +
                                "JOIN inscripcion b " +
                                "ON a.idMateria = b.idMateria " +
                                "WHERE b.idAlumno = " + ID +") b " +
                      "ON a.idMateria = b.idMateria " +
                      "WHERE idAlumno IS NULL";
        
        try 
        {
            //Y realizo la consulta.

            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {
                Materia materia = new Materia();
                materia.setIDmateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre_materia"));
                materia.setAño(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
                
                /*Excluyo de las opciones aquellas materias que no esten disponibles, es decir, que su estado sea false.*/
                if (materia.isEstado()) materias.add(materia);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Falla en la Sintaxis.");
        }
    }
    
    public void cargarElemento(Inscripcion inscripcion) {
        /*Defino la sentencio SQL.*/
        String sql = "INSERT INTO `inscripcion`(`idAlumno`, `idMateria`, `recursante`) VALUES (";
        
        /*Seteo los valores.*/
        sql += inscripcion.getIDalumno() + ", " + inscripcion.getIDmateria() + ", " + inscripcion.isRecursante() + ")";
        
        try 
        {
            /*Envio la sentencia a la BDD.*/
            sentencia = conexion.prepareStatement(sql);
            /*Chequeo que la sentecia haya sido cargada con exito.*/
            int filas = sentencia.executeUpdate();
            if (filas > 0) JOptionPane.showMessageDialog(null, "Inscripcion Realizada.");
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error. Falla en la sintaxis.");
        }
    }
}
