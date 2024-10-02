package Persistencia;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Ignacio
 */
public class Check {

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
            if (component instanceof JTextField jTextField) 
            {
                flag = !jTextField.getText().equals("");
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
    
    public static void data() {
        
    }

}
