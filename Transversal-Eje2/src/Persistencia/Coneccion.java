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
    
    public void buscarDato(String relacion, HashMap<String, String> domsAtr) {
        String cond = " WHERE ";
        String atrs = "";
        int count = 0;
        
        for (Map.Entry<String, String> domAtr : domsAtr.entrySet()) 
        {
            if (domAtr.getKey().equals("`fechaNacimiento`")) 
            {
                LocalDate fechaActual = LocalDate.now();
                cond += domAtr.getKey() + " BETWEEN " + domAtr.getValue() + " AND '" + fechaActual + "'";
            } 
            else cond += domAtr.getKey() + " = " + domAtr.getValue();
            
            atrs += domAtr.getKey();
            
            if (domsAtr.size() > 1 & count != domsAtr.size()-1) 
            {
                cond += " AND ";
                atrs += ", ";
            }
            
            count++;
        }
        
        String sql = "SELECT " + atrs + " FROM " + relacion /*+ cond*/;
        System.out.println(sql);
        
        try 
        {
            sentencia = coneccion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            
            while (resultado.next()) {
//                System.out.println("ID Alumno: " + resultado.getInt("idAlumno"));
                System.out.println("DNI: " + resultado.getInt("dni"));
                System.out.println("Apellido: " + resultado.getString("apellido"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Fecha de Nacimiento: " + resultado.getDate("fechaNacimiento"));
                System.out.println("Estado: " + resultado.getBoolean("estado"));
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "No se han encontrado resultados para la busqueda.");
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
