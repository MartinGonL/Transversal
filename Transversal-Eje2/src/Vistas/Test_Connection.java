package Vistas;

import Persistencia.AlumnoData;

public class Test_Connection {
    
    public static void main(String[] args) {
        
        AlumnoData alumno = new AlumnoData();
        
        /**
         * Ver linea 39 de la clase AlumnoData antes de compilar:)
         */
        alumno.conectar();
        
    }
    
}
