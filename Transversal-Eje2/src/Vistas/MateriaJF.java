package Vistas;

import Modelo.Materia;
import Persistencia.AlumnoData;
import Persistencia.Funciones;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MateriaJF extends javax.swing.JInternalFrame {

    private final AlumnoData funcion;
    private final String MATERIA;
    private final ArrayList<Object> materias = new ArrayList();
    private int FLAG;
    private final String ID;
    private String DOM;
    
    public MateriaJF() {
        initComponents();
        this.funcion = new AlumnoData();
        this.MATERIA = "`materia`";
        this.FLAG = 0;
        this.ID = "`idMateria`";
        this.DOM = "";
        
        funcion.conectar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        anioJL = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        anioJTF = new javax.swing.JTextField();
        activJChB = new javax.swing.JCheckBox();
        activoJL = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        crearJB = new javax.swing.JButton();
        actJB = new javax.swing.JButton();
        buscarJB = new javax.swing.JButton();
        desJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Materia");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setText("Cargado de Asignatura");

        nombreJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        nombreJL.setForeground(new java.awt.Color(255, 255, 255));
        nombreJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreJL.setText("Nombre:");

        anioJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        anioJL.setForeground(new java.awt.Color(255, 255, 255));
        anioJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        anioJL.setText("Año:");

        nombreJTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTF.setName("`nombre_materia`"); // NOI18N
        nombreJTF.setPreferredSize(new java.awt.Dimension(60, 22));

        anioJTF.setBackground(new java.awt.Color(255, 255, 255));
        anioJTF.setForeground(new java.awt.Color(0, 0, 0));
        anioJTF.setName("`año`"); // NOI18N
        anioJTF.setPreferredSize(new java.awt.Dimension(20, 22));

        activJChB.setBackground(new java.awt.Color(0, 51, 102));
        activJChB.setForeground(new java.awt.Color(255, 255, 255));
        activJChB.setName("`estado`"); // NOI18N

        activoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        activoJL.setForeground(new java.awt.Color(255, 255, 255));
        activoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activoJL.setText("Activo:");

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(anioJL))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(activoJL)))
                        .addGap(6, 6, 6)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activJChB)))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alumnoJL)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addComponent(nombreJL)
                                .addGap(6, 6, 6)
                                .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(activoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(activJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        panelBotones.setBackground(new java.awt.Color(51, 51, 51));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearJB.setBackground(new java.awt.Color(255, 204, 0));
        crearJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        crearJB.setForeground(new java.awt.Color(255, 255, 255));
        crearJB.setText("Crear");
        crearJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJBActionPerformed(evt);
            }
        });
        panelBotones.add(crearJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 106, -1));

        actJB.setBackground(new java.awt.Color(255, 204, 0));
        actJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        actJB.setForeground(new java.awt.Color(255, 255, 255));
        actJB.setText("Actualizar");
        actJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actJBActionPerformed(evt);
            }
        });
        panelBotones.add(actJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 106, -1));

        buscarJB.setBackground(new java.awt.Color(255, 204, 0));
        buscarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        buscarJB.setForeground(new java.awt.Color(255, 255, 255));
        buscarJB.setText("Buscar");
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });
        panelBotones.add(buscarJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 106, -1));

        desJB.setBackground(new java.awt.Color(255, 51, 0));
        desJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        desJB.setForeground(new java.awt.Color(255, 255, 255));
        desJB.setText("Desabilitar");
        desJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desJBActionPerformed(evt);
            }
        });
        panelBotones.add(desJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        deleteJB.setBackground(new java.awt.Color(204, 0, 0));
        deleteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        deleteJB.setForeground(new java.awt.Color(255, 255, 255));
        deleteJB.setText("Eliminar");
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });
        panelBotones.add(deleteJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 106, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJBActionPerformed
     boolean flag = Funciones.checkField(contenedorJP);
        try 
        {
            if (flag) 
            {
                String nombre = nombreJTF.getText();
                String anio = anioJTF.getText();
                boolean estado = activJChB.isSelected();

                Materia materia = new Materia(nombre, Integer.valueOf(anio), estado);
                funcion.cargarDato(materia);
                activJChB.setSelected(false);
                Funciones.cleanField(contenedorJP);
                
                buscarJBActionPerformed(evt);
            } 
            else 
            {
                JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos.");
            }
        } 
        catch (HeadlessException | NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Fecha incorrecta.");
        }
    }//GEN-LAST:event_crearJBActionPerformed

    private void actJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actJBActionPerformed
        if (FLAG == 0) 
        {
            buscarJBActionPerformed(evt);

            FLAG = 1;
            
            anioJL.setText("ID:");
            anioJTF.setBackground(new Color(0,102,0));
            anioJTF.setForeground(new Color(255,255,255));
            buscarJB.setBackground(new Color(0,102,0));
            deleteJB.setText("Cancelar");
            crearJB.setEnabled(false);
            desJB.setEnabled(false);
            actJB.setEnabled(false);
        }
        else 
        {
            HashMap<String, String> domsAtr = new HashMap();
        
            for (Component componente : contenedorJP.getComponents())
            {
                switch (componente) 
                {
                    case JTextField txt -> 
                    {
                        if (!txt.getText().equals("")) 
                        {
                            switch (txt.getName()) 
                            {
                                case "`nombre_materia`" -> { domsAtr.put(txt.getName(), "'" + txt.getText() + "'"); }
                                case "`año`" -> { domsAtr.put(txt.getName(), "'" + txt.getText() + "'"); }
                            }
                        }
                    }
                    case JCheckBox check -> 
                    {
                        if (check.isSelected()) 
                        {
                            domsAtr.put(check.getName(), String.valueOf(check.isSelected()));
                        }
                    }
                    default -> {}
                }
            }
            deleteJBActionPerformed(evt);
            activJChB.setSelected(false);
            funcion.actualizarDato(MATERIA, ID, DOM, domsAtr);
            buscarJBActionPerformed(evt);
        }
    }//GEN-LAST:event_actJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        try 
        {
            if (FLAG != 0 & FLAG != 4) throw new NumberFormatException();
           
            if (FLAG == 0) 
            {
                buscarJBActionPerformed(evt);
                anioJL.setText("ID:");
                anioJTF.setBackground(new Color(0,102,0));
                anioJTF.setForeground(new Color(255,255,255));
                buscarJB.setBackground(new Color(0,102,0));
                buscarJB.setText("Ok");
                deleteJB.setText("Cancelar");
                crearJB.setEnabled(false);
                actJB.setEnabled(false);
                desJB.setEnabled(false);

                FLAG = 3;
            } 
            else 
            {
                int confirm = JOptionPane.showConfirmDialog(rootPane, "Eliminar alumno?" );
                if (confirm == 0) 
                {
                    funcion.eliminarDato(MATERIA, DOM);
                }
                else JOptionPane.showMessageDialog(rootPane, "Operacion Cancelada.");
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException ex) 
        {
            Funciones.cleanField(contenedorJP);
            Funciones.colorField(contenedorJP, new Color(255,255,255), new Color(0,0,0));
            deleteJB.setText("Eliminar");
            anioJL.setText("Año:");
            buscarJB.setBackground(new Color(255,204,0));
            buscarJB.setText("Buscar");
            actJB.setText("Actualizar");
            actJB.setBackground(new Color(255,204,0));
            desJB.setEnabled(true);
            crearJB.setEnabled(true);
            actJB.setEnabled(true);
            buscarJB.setEnabled(true);

            FLAG = 0;
        }
    }//GEN-LAST:event_deleteJBActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        HashMap<String, String> domsAtr = new HashMap();
        materias.clear();
        
        try 
        {
            if (FLAG != 0) throw new NumberFormatException();
            
            for (Component componente : contenedorJP.getComponents()) 
            {
                switch (componente) 
                {
                    case JTextField txt -> 
                    {
                        if (!txt.getText().equals("")) 
                        {
                            switch (txt.getName()) 
                            {
                                case "`nombre_materia`" -> { domsAtr.put(txt.getName(), "'" + txt.getText() + "'"); }
                                case "`año`" -> { domsAtr.put(txt.getName(), txt.getText()); }
                            }
                        }
                    }
                    case JCheckBox check -> 
                    {
                        if (check.isSelected()) 
                        {
                            domsAtr.put(check.getName(), String.valueOf(check.isSelected()));
                        }
                    }
                    default -> {}
                }
            }
        }
        catch (NumberFormatException ex) 
        {
            DOM = anioJTF.getText();
            domsAtr.put("`idMateria`", DOM);
            
            switch (FLAG) {
                case 1 -> {
                    deleteJBActionPerformed(evt);
                    deleteJB.setText("Cancelar");

                    Funciones.colorField(contenedorJP, new Color(0, 102, 0), new Color(255,255,255));
                    actJB.setBackground(new Color(0, 102, 0));
                    actJB.setText("Guardar");
                    
                    crearJB.setEnabled(false);
                    buscarJB.setEnabled(false);
                    desJB.setEnabled(false);
                    
                    FLAG = 1;
                }
                case 2 -> {
                    desJBActionPerformed(evt);
                    domsAtr.clear();
                }
                case 3 -> {
                    FLAG = 4;
                    deleteJBActionPerformed(evt);
                }
            }
        }
        finally 
        {
            materias.addAll(funcion.buscarDato(MATERIA, domsAtr));
            Funciones.cleanField(contenedorJP);
            
            InicioJDP.resetTable();
            
            InicioJDP.setRow(materias);
        }
        
    }//GEN-LAST:event_buscarJBActionPerformed

    private void desJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desJBActionPerformed
        if (FLAG == 0) {
            buscarJBActionPerformed(evt);
            anioJL.setText("ID:");
            anioJTF.setBackground(new Color(0,102,0));
            anioJTF.setForeground(new Color(255,255,255));
            buscarJB.setBackground(new Color(0,102,0));
            buscarJB.setText("Ok");
            deleteJB.setText("Cancelar");
            crearJB.setEnabled(false);
            actJB.setEnabled(false);
            desJB.setEnabled(false);
            
            FLAG = 2;
        }
        else 
        {
            HashMap<String, String> domsAtr = new HashMap();
            domsAtr.put("`estado`", "false");
            
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea realizar la baja?");
            if (confirm == 0) 
            {
                funcion.actualizarDato(MATERIA, ID, DOM, domsAtr);
            }
            else JOptionPane.showMessageDialog(rootPane, "Operacion Cancelada.");
            
            deleteJBActionPerformed(evt);
        }
    }//GEN-LAST:event_desJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actJB;
    private javax.swing.JCheckBox activJChB;
    private javax.swing.JLabel activoJL;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JLabel anioJL;
    private javax.swing.JTextField anioJTF;
    private javax.swing.JButton buscarJB;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JButton crearJB;
    private javax.swing.JButton deleteJB;
    private javax.swing.JButton desJB;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
