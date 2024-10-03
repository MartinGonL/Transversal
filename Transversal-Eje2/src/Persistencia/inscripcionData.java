/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import Persistencia.AlumnoData;

/**
 *
 * @author santi
 */
public class inscripcionData {
    private Connection con= null;

    public inscripcionData() {
        
        this.con= Conexion.getConexion();
        
    }
    
    
    
}
