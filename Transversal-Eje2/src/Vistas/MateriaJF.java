package Vistas;

import Modelo.Materia;
import Persistencia.Check;
import Persistencia.AlumnoData;
import javax.swing.JOptionPane;

public class MateriaJF extends javax.swing.JInternalFrame {

    AlumnoData coneccion;
    
    public MateriaJF() {
        initComponents();
        this.coneccion = new AlumnoData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        crearJB = new javax.swing.JButton();
        nombreJL1 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        anioJTF = new javax.swing.JTextField();
        activJChB = new javax.swing.JCheckBox();
        activoJL = new javax.swing.JLabel();
        actJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();
        buscarJB = new javax.swing.JButton();
        desJB = new javax.swing.JButton();

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

        crearJB.setBackground(new java.awt.Color(255, 204, 0));
        crearJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        crearJB.setForeground(new java.awt.Color(255, 255, 255));
        crearJB.setText("Crear");
        crearJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJBActionPerformed(evt);
            }
        });

        nombreJL1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        nombreJL1.setForeground(new java.awt.Color(255, 255, 255));
        nombreJL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreJL1.setText("Año:");

        nombreJTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTF.setPreferredSize(new java.awt.Dimension(60, 22));

        anioJTF.setBackground(new java.awt.Color(255, 255, 255));
        anioJTF.setForeground(new java.awt.Color(0, 0, 0));
        anioJTF.setPreferredSize(new java.awt.Dimension(20, 22));

        activJChB.setBackground(new java.awt.Color(0, 51, 102));
        activJChB.setForeground(new java.awt.Color(255, 255, 255));

        activoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        activoJL.setForeground(new java.awt.Color(255, 255, 255));
        activoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activoJL.setText("Activo:");

        actJB.setBackground(new java.awt.Color(255, 204, 0));
        actJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        actJB.setForeground(new java.awt.Color(255, 255, 255));
        actJB.setText("Actualizar");
        actJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actJBActionPerformed(evt);
            }
        });

        deleteJB.setBackground(new java.awt.Color(204, 0, 0));
        deleteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        deleteJB.setForeground(new java.awt.Color(255, 255, 255));
        deleteJB.setText("Eliminar");
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });

        buscarJB.setBackground(new java.awt.Color(255, 204, 0));
        buscarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        buscarJB.setForeground(new java.awt.Color(255, 255, 255));
        buscarJB.setText("Buscar");
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });

        desJB.setBackground(new java.awt.Color(255, 204, 0));
        desJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        desJB.setForeground(new java.awt.Color(255, 255, 255));
        desJB.setText("Desabilitar");
        desJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desJBActionPerformed(evt);
            }
        });

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
                                .addComponent(nombreJL1))
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
                .addGap(29, 29, 29)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                                .addComponent(activoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(crearJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actJB)
                        .addGap(10, 10, 10)
                        .addComponent(buscarJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(deleteJB)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJBActionPerformed
        boolean flag = Check.checkField(contenedorJP);

        if (flag) 
        {
            String nombre = nombreJTF.getText();
            int anio = Integer.parseInt(anioJTF.getText());
            boolean estado = activJChB.isSelected();

            Materia materia = new Materia(nombre, anio, estado);
            coneccion.cargarDato(materia);
            Check.cleanField(contenedorJP);
        } 
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos.");
        }
    }//GEN-LAST:event_crearJBActionPerformed

    private void actJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteJBActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buscarJBActionPerformed

    private void desJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actJB;
    private javax.swing.JCheckBox activJChB;
    private javax.swing.JLabel activoJL;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JTextField anioJTF;
    private javax.swing.JButton buscarJB;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JButton crearJB;
    private javax.swing.JButton deleteJB;
    private javax.swing.JButton desJB;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JLabel nombreJL1;
    private javax.swing.JTextField nombreJTF;
    // End of variables declaration//GEN-END:variables
}
