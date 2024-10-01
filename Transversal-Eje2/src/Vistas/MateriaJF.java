package Vistas;

public class MateriaJF extends javax.swing.JInternalFrame {

    public MateriaJF() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        idJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        nombreJL1 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        anioJTF = new javax.swing.JTextField();
        idJTF = new javax.swing.JTextField();
        activJChB = new javax.swing.JCheckBox();
        activoJL = new javax.swing.JLabel();

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

        idJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        idJL.setForeground(new java.awt.Color(255, 255, 255));
        idJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idJL.setText("ID:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
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

        idJTF.setBackground(new java.awt.Color(255, 255, 255));
        idJTF.setForeground(new java.awt.Color(0, 0, 0));
        idJTF.setPreferredSize(new java.awt.Dimension(20, 22));

        activJChB.setBackground(new java.awt.Color(0, 51, 102));
        activJChB.setForeground(new java.awt.Color(255, 255, 255));

        activoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        activoJL.setForeground(new java.awt.Color(255, 255, 255));
        activoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activoJL.setText("Activo:");

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumnoJL)
                    .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(contenedorJPLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(siguienteJB))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                            .addComponent(nombreJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreJL1)
                                .addGroup(contenedorJPLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(anioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(idJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(activoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activJChB)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activJChB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguienteJB)
                .addGap(16, 16, 16))
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
    private javax.swing.JTextField anioJTF;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextField idJTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JLabel nombreJL1;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
