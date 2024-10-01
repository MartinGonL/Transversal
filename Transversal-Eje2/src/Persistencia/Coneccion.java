package Persistencia;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Coneccion {
    
    private Connection coneccion;
    private PreparedStatement sentencia;
//    private ResultSet resultado;
    
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
    
    public void desconectar () {
        try 
        {
            coneccion.close();    
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
