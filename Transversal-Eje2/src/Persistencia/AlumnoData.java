package Persistencia;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlumnoData {
    
    public void conectar() {
        
        try {
            /**
             * Creamos una instancia de 'DriverManager' mediante el comando 'Class.forName()'
             * como parametro le asignamos en nombre del manejador JDBC que utilizaremos. En este
             * caso 'org.mariadb.jdbc.Driver'.
             * 
             * Creamos la coneccion:
             */
            Class.forName("org.mariadb.jdbc.Driver");
            
            /**
             * El primer parametro debe ser cargado tal cual se ve.
             * Se puede cambiar 'mysql' por 'maraidb'.
             * Tambien podriamos cambiar el valor 'localhost' por el IP 
             * o el nombre del host que contenga la BDD si el trabajo se 
             * estuviera realizando en 2 PC.
             * Y seguido de 'localhost/' se debera declarar el nombre de la BDD.
             * 
             * Establecemos una coneccion a la base de datos:
             */
            Connection line = DriverManager.getConnection("jdbc:mysql://localhost/universidadulp", "root", ""); // --> Si la coneccion no logra establecerce 
                                                                                                                //     saltara directametne al catch.
            /**
             * Establecer VALUES.
             */
            String sql = """
                         INSERT INTO `alumno` (`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) 
                         VALUES (0000, 'value-2', 'value-3', '2024-01-01', 0 )
                         """;
            
            //Enviar sentencia SQL:
            PreparedStatement ps = line.prepareStatement(sql);

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

        }catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "Falla en los Drivers.");
            
        }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Falla en la Coneccion.");
            
        }
    }
}