package Vistas;

public class InscripcionJF extends javax.swing.JInternalFrame {

    public InscripcionJF() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        rejistroJL = new javax.swing.JLabel();
        alumnoJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        materiaJL = new javax.swing.JLabel();
        materiaJCB = new javax.swing.JComboBox<>();
        alumnoJCB = new javax.swing.JComboBox<>();
        buscarPorJL = new javax.swing.JLabel();
        apellidoJRB = new javax.swing.JRadioButton();
        idJRB = new javax.swing.JRadioButton();
        recursanteJChB = new javax.swing.JCheckBox();
        recurJL = new javax.swing.JLabel();
        materiaJL1 = new javax.swing.JLabel();
        notaJTF = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Alumno");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        rejistroJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rejistroJL.setForeground(new java.awt.Color(255, 255, 255));
        rejistroJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rejistroJL.setText("Inscripcion");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        alumnoJL.setText("Alumno:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });

        materiaJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        materiaJL.setForeground(new java.awt.Color(255, 255, 255));
        materiaJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        materiaJL.setText("Materia:");

        materiaJCB.setBackground(new java.awt.Color(255, 255, 255));
        materiaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        materiaJCB.setPreferredSize(new java.awt.Dimension(60, 30));

        alumnoJCB.setBackground(new java.awt.Color(255, 255, 255));
        alumnoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        alumnoJCB.setPreferredSize(new java.awt.Dimension(60, 30));

        buscarPorJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buscarPorJL.setForeground(new java.awt.Color(255, 255, 255));
        buscarPorJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarPorJL.setText("Buscar por:");

        apellidoJRB.setBackground(new java.awt.Color(0, 51, 102));
        apellidoJRB.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJRB.setText("Apellido");
        apellidoJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoJRBActionPerformed(evt);
            }
        });

        idJRB.setBackground(new java.awt.Color(0, 51, 102));
        idJRB.setForeground(new java.awt.Color(255, 255, 255));
        idJRB.setText("ID");
        idJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJRBActionPerformed(evt);
            }
        });

        recursanteJChB.setBackground(new java.awt.Color(0, 51, 102));
        recursanteJChB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursanteJChBActionPerformed(evt);
            }
        });

        recurJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        recurJL.setForeground(new java.awt.Color(255, 255, 255));
        recurJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        recurJL.setText("Recursante:");

        materiaJL1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        materiaJL1.setForeground(new java.awt.Color(255, 255, 255));
        materiaJL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        materiaJL1.setText("Nota:");

        notaJTF.setBackground(new java.awt.Color(255, 255, 255));
        notaJTF.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                        .addComponent(buscarPorJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoJRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idJRB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rejistroJL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alumnoJL)
                                    .addComponent(materiaJL1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contenedorJPLayout.createSequentialGroup()
                                        .addComponent(notaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(recurJL))
                                    .addGroup(contenedorJPLayout.createSequentialGroup()
                                        .addComponent(alumnoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(materiaJL)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(materiaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recursanteJChB))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(siguienteJB)
                        .addGap(21, 21, 21))))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rejistroJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPorJL)
                    .addComponent(apellidoJRB)
                    .addComponent(idJRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materiaJL)
                    .addComponent(materiaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materiaJL1)
                            .addComponent(notaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recurJL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(siguienteJB)
                        .addGap(21, 21, 21))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(recursanteJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarBoxAlumnosApellido() {
    }
    
    private void cargarBoxAlumnosID() {
    }
    
    private void cargarBoxMaterias() {
    }
    
    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
    }//GEN-LAST:event_siguienteJBActionPerformed

    private void apellidoJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoJRBActionPerformed
    }//GEN-LAST:event_apellidoJRBActionPerformed

    private void idJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJRBActionPerformed
    }//GEN-LAST:event_idJRBActionPerformed

    private void recursanteJChBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursanteJChBActionPerformed
    }//GEN-LAST:event_recursanteJChBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alumnoJCB;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JRadioButton apellidoJRB;
    private javax.swing.JLabel buscarPorJL;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JRadioButton idJRB;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> materiaJCB;
    private javax.swing.JLabel materiaJL;
    private javax.swing.JLabel materiaJL1;
    private javax.swing.JTextField notaJTF;
    private javax.swing.JLabel recurJL;
    private javax.swing.JCheckBox recursanteJChB;
    private javax.swing.JLabel rejistroJL;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
