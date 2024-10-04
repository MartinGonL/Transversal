package Persistencia;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection conectar;

    public Conexion() {}
    
    public static Connection getConexion(){
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/universidadulp", "root", "");
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showInternalMessageDialog(null, "Error al cargar los Drivers.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;
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
            
            /**
             * Ejecutar un select...
             */
//            Object[] datos = new Object[6];
            
//            String select = """
//                         SELECT `idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado` 
//                         FROM `alumno`
//                         """;

//            PreparedStatement ps1 = line.prepareStatement(select);

//            ResultSet resultado = ps.executeQuery(sql);
            
//            while (resultado.next()) {
//                datos[0] = resultado.getInt("idAlumno");
//                datos[1] = resultado.getInt("dni");
//                datos[2] = resultado.getString("apellido");
//                datos[3] = resultado.getString("nombre");
//                datos[4] = resultado.getDate("fechaNacimiento");
//                datos[5] = resultado.getBoolean("estado");
//            }
//            
//            for (Object dato : datos) {
//                System.out.println(dato.toString());
//            }

       }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Falla en la Coneccion.");
            
        }
    }
}