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
import java.util.HashMap;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Coneccion {
    
    private Connection coneccion;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    
    public Coneccion() {
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Error al cargar los Drivers.");
        }
    }
    
    public void conectar() {
        try 
        {   
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost/universidadulp", "root", "");
            JOptionPane.showInternalMessageDialog(null, "Coneccion Exitosa.");
        }
        catch (SQLException ex) 
        {    
            JOptionPane.showInternalMessageDialog(null, "Error al establecer la Coneccion.");
        }
    }
    
    public void cargarDato(Object objeto) {
        String relacion = "relacion";
        String atributos = "atributos";
        String doms = "dominios";
        
        switch (objeto) {
            case Alumno a -> 
            {
                relacion = "`alumno` ";
                atributos = "(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) ";
                doms = "(" + a.getDni() + ", '" + a.getApellido() + "', '" + a.getNombre() + "', '" + a.getFechaNacimiento() + "', " + a.isEstado() + ")";
            }
            case Materia b -> 
            {
                relacion = "`materia` ";
                atributos = "(`nombre_materia`, `año`, `estado`) ";
                doms = "('" + b.getNombre() + "', '" + b.getAño() + "', " + b.isEstado() + ")";
            }
            /**
             * Editar esta parte.
             */
            case Inscripcion c -> 
            {
                relacion = "`inscripcion` ";
                atributos = "(`nota`, `idAlumno`, `idMateria`, `recursante`) ";
                doms = "(" + c.getNota() + ", " + c.getIDalumno() + ", " + c.getIDmateria() + ", " + c.isRecursante() + ")";
            }
            default -> {}
        }
        
        String sql = "INSERT INTO " + relacion + atributos + "VALUES " + doms;
        
        try 
        {
            sentencia = coneccion.prepareStatement(sql);
            int filas = sentencia.executeUpdate();
            if (filas > 0) 
            {
                JOptionPane.showInternalMessageDialog(null, "Dato cargado con exito.");
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Falla en la Sintaxis.");
        }
    }
    
    public ArrayList<Object> buscarDato(String relacion, HashMap<String, String> domsAtr) {
        ArrayList<Object> objeto = new ArrayList();
        String cond = (!domsAtr.isEmpty()) ? " WHERE " : "";
//        String sql = "SELECT * FROM " + relacion + cond;
        int count = 0;

        for (Map.Entry<String, String> domAtr : domsAtr.entrySet()) 
        {
            if (domAtr.getKey().equals("`fechaNacimiento`")) 
            {
                LocalDate fechaActual = LocalDate.now();
                cond += domAtr.getKey() + " BETWEEN " + domAtr.getValue() + " AND '" + fechaActual + "'";
            }
            else 
            {
                cond += domAtr.getKey() + " = " + domAtr.getValue();
            }
            
            if (domsAtr.size() > 1 & count != domsAtr.size()-1) cond += " AND ";
            
            count++;
        }
        String sql = "SELECT * FROM " + relacion + cond;
        try 
        {
            sentencia = coneccion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {
                switch (relacion) {
                    case "`alumno`" -> {
                        Alumno alumno = new Alumno();
                        alumno.setIDalumno(resultado.getInt("idAlumno"));
                        alumno.setDni(resultado.getInt("dni"));
                        alumno.setApellido(resultado.getString("apellido"));
                        alumno.setNombre(resultado.getString("nombre"));
                        alumno.setFechaNacimiento(LocalDate.parse(resultado.getString("fechaNacimiento")));
                        alumno.setEstado(resultado.getBoolean("estado"));
                        System.out.println(alumno.toString());
                        
                        objeto.add(alumno);
                    }
                    case "`materia`" -> { Materia materia = new Materia(); }
                    case "`inscripcion`" -> { Inscripcion inscripcion = new Inscripcion(); }
                }
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "No se han encontrado resultados para la busqueda.");
        }
        return objeto;
    }
    
    public void actualizarDato(String relacion, String ID, HashMap<String, String> domsAtr) {
        String sql = "UPDATE " + relacion + " SET ";
        int count = 0;
        
        for (Map.Entry<String, String> domAtr : domsAtr.entrySet()) 
        {
            sql += domAtr.getKey() + " = " + domAtr.getValue();
            
            if (domsAtr.size() > 1 & count != domsAtr.size()-1) sql += ", ";
            
            count++;
        }
        
        sql += " WHERE `idAlumno` = " + ID;
        
        try 
        {
            sentencia = coneccion.prepareStatement(sql);
            int filas = sentencia.executeUpdate();
            if (filas > 0) 
            {
                JOptionPane.showMessageDialog(null, "Cambios Guardados.");
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error en la Sintaxis.");
        }
    }
    
    public void eliminarDato(String relacion, String ID) {
        String sql = "DELETE FROM " + relacion + " WHERE `idAlumno` = " + ID;
        System.out.println(sql);
        try 
        {
            sentencia = coneccion.prepareStatement(sql);
            int filas = sentencia.executeUpdate();
            if (filas > 0)
            {
                JOptionPane.showMessageDialog(null, "Valor Eliminado.");
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto.");
        }
    }
    
    public void desconectar () {
        try 
        {
            coneccion.close();    
            JOptionPane.showInternalMessageDialog(null, "La coneccion a sido finalizada.");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
