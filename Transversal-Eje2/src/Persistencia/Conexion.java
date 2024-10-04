package Persistencia;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection conectar;

    public Conexion() {
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/universidadulp", "root", "");
            JOptionPane.showInternalMessageDialog(null, "Coneccion Exitosa.");
        }            
        catch (SQLException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Falla en la Conexion.");
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Falla en los Drivers.");
        }
    }

    public static void insertTras1() {
        try {
            String sql = """
                         INSERT INTO `alumno` (`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) 
                         VALUES (0000, 'value-2', 'value-3', '2024-01-01', 0 )
                         """;
            
            //Enviar sentencia SQL:
            PreparedStatement ps = conectar.prepareStatement(sql);
            //Verificar si la orden fue recibida:
            int filas = ps.executeUpdate();
            if (filas > 0) JOptionPane.showMessageDialog(null, "Valor Cargado Exitosamente.");
        }
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "Error en la Sintaxis.");
        }
    }
    
    public static void select() {
        /**
        * Ejecutar un select...
        */
        Object[] datos = {
                "ID: ",
                "DNI: ",
                "Apellido: ",
                "Nombre: ",
                "Fecha de Nacimiento: ",
                "Estado: "
                };
        
        String sql = "SELECT * FROM `alumno`";

        try {
            PreparedStatement ps1 = conectar.prepareStatement(sql);
            ResultSet resultado = ps1.executeQuery();
            
            while (resultado.next()) {
                datos[0] += resultado.getString("idAlumno");
                datos[1] += resultado.getString("dni");
                datos[2] += resultado.getString("apellido");
                datos[3] += resultado.getString("nombre");
                datos[4] += resultado.getString("fechaNacimiento");
                datos[5] += resultado.getString("estado");
            }
            
            for (Object dato : datos) {
                System.out.println(dato.toString());
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error en la Sintaxis.");
        }
    }
    
    public static void main(String[] args) {
        Conexion.select();
    }
}
/*Consultar porque la clase no finaliza su ejecucion*/