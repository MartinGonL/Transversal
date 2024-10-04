package Persistencia;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Ignacio
 */
public class Funciones {

    /**
     * true: Campos llenos. 
     * false: Campos vacios.
     *
     * @param jPanel
     * @return
     */
    public static Boolean checkField(JPanel jPanel) {
        boolean flag = false;

        for (Component component : jPanel.getComponents()) 
        {
            if (component instanceof JTextField txt) 
            {
                flag = !txt.getText().equals("");
            }
        }

        return flag;
    }
    
    /**
     * Recetear las cajas de texto y los combobox.
     * 
     * @param jPanel 
     */
    public static void cleanField(JPanel jPanel) {
        for (Component component : jPanel.getComponents()) 
        {
            if (component instanceof JTextField txt) 
            {
                txt.setText("");
            }
            if (component instanceof JComboBox combo) 
            {
                combo.setSelectedIndex(-1);
            }
        }
    }
    
    public static void colorField(JPanel jPanel, Color fondo, Color letra) {
        
        for (Component component : jPanel.getComponents()) 
        {
            if (component instanceof JTextField txt) 
            {
                txt.setBackground(fondo);
                txt.setForeground(letra);
            }
        }
    }

}
