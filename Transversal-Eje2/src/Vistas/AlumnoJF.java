package Vistas;

public class AlumnoJF extends javax.swing.JInternalFrame {

    public AlumnoJF() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        idJL = new javax.swing.JLabel();
        dniJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        apellidoJL1 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        apellidoJTF = new javax.swing.JTextField();
        dniJTF = new javax.swing.JTextField();
        idJTF = new javax.swing.JTextField();
        fechaNacJL = new javax.swing.JLabel();
        apellidoJTF1 = new javax.swing.JTextField();
        activoJL = new javax.swing.JLabel();
        activJChB = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Alumno");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setText("Cargado de Alumno");

        nombreJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        nombreJL.setForeground(new java.awt.Color(255, 255, 255));
        nombreJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreJL.setText("Nombre:");

        idJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        idJL.setForeground(new java.awt.Color(255, 255, 255));
        idJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idJL.setText("ID:");

        dniJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        dniJL.setForeground(new java.awt.Color(255, 255, 255));
        dniJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dniJL.setText("DNI:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });

        apellidoJL1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        apellidoJL1.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoJL1.setText("Apellido:");

        nombreJTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTF.setMinimumSize(new java.awt.Dimension(68, 22));

        apellidoJTF.setBackground(new java.awt.Color(255, 255, 255));
        apellidoJTF.setMinimumSize(new java.awt.Dimension(68, 22));

        dniJTF.setBackground(new java.awt.Color(255, 255, 255));
        dniJTF.setForeground(new java.awt.Color(0, 0, 0));
        dniJTF.setMinimumSize(new java.awt.Dimension(68, 22));

        idJTF.setBackground(new java.awt.Color(255, 255, 255));
        idJTF.setForeground(new java.awt.Color(0, 0, 0));
        idJTF.setMinimumSize(new java.awt.Dimension(68, 22));

        fechaNacJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        fechaNacJL.setForeground(new java.awt.Color(255, 255, 255));
        fechaNacJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaNacJL.setText("Fecha de Nacimiento:");

        apellidoJTF1.setBackground(new java.awt.Color(255, 255, 255));
        apellidoJTF1.setForeground(new java.awt.Color(0, 0, 0));
        apellidoJTF1.setMinimumSize(new java.awt.Dimension(68, 22));

        activoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        activoJL.setForeground(new java.awt.Color(255, 255, 255));
        activoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activoJL.setText("Activo:");

        activJChB.setBackground(new java.awt.Color(0, 51, 102));
        activJChB.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(alumnoJL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addComponent(nombreJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                    .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                            .addComponent(apellidoJL1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contenedorJPLayout.createSequentialGroup()
                                            .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(idJL)
                                                .addComponent(dniJL)
                                                .addComponent(activoJL))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(activJChB))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(siguienteJB))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                    .addComponent(fechaNacJL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(apellidoJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaNacJL)
                    .addComponent(apellidoJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoJL1)
                    .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniJL)
                    .addComponent(dniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idJL)
                            .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(activoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activJChB, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguienteJB)
                        .addGap(19, 19, 19))))
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

    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
      
    }//GEN-LAST:event_siguienteJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activJChB;
    private javax.swing.JLabel activoJL;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JLabel apellidoJL1;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.JTextField apellidoJTF1;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JLabel dniJL;
    private javax.swing.JTextField dniJTF;
    private javax.swing.JLabel fechaNacJL;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextField idJTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
