package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Coneccion {
    
    private Connection coneccion;
    
    public Coneccion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error al cargar los Drivers.");
        }
    }
    
    public boolean conectar(JTextField bddJT, JTextField userJT, JTextField passJT) {
        boolean flag = false;
        
        String bdd = bddJT.getText();
        String user = userJT.getText();
        String pass = passJT.getText();
        
        try 
        {   
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost/" + bdd, user, pass);
            flag = true;
        }
        catch (SQLException ex) 
        {    
            JOptionPane.showInternalMessageDialog(null, "Error al establecer la Coneccion.");
        }
        
        return flag;
    }
    
    public void cargarDato(JTextField relacion, JTextField atributo_a, JTextField atributo_b) {
        String sql = "INSTERT INTO `" + relacion.getText() + "` (`atributo_b`, `atributo_c`) "
                   + "VALUES (" + atributo_a.getText() + ", " + atributo_b.getText() + ")";
        
        try 
        {
            PreparedStatement sentencia = coneccion.prepareStatement(sql);
            
            int filas = sentencia.executeUpdate();
            if (filas > 0) {
                JOptionPane.showInternalMessageDialog(null, "Dato cargado con exito.");
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Falla en la Sintaxis.");
        }
    }
    
    public void desconectar () {
        try {
            coneccion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
