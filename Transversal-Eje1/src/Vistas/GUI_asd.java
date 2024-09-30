package Vistas;

import Persistencia.Coneccion;
import java.awt.Color;

public class GUI_asd extends javax.swing.JFrame {

    private Coneccion crud;
    
    public GUI_asd() {
        this.crud = new Coneccion();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelB = new javax.swing.JPanel();
        descJB = new javax.swing.JButton();
        panelA = new javax.swing.JPanel();
        usuarioJL = new javax.swing.JLabel();
        inicioJL = new javax.swing.JLabel();
        passJL = new javax.swing.JLabel();
        bddJL = new javax.swing.JLabel();
        userJTF = new javax.swing.JTextField();
        passJTF = new javax.swing.JTextField();
        bddJTF = new javax.swing.JTextField();
        iniciarJB = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        descJB.setBackground(new java.awt.Color(204, 0, 0));
        descJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        descJB.setForeground(new java.awt.Color(255, 255, 255));
        descJB.setText("Desconectar");
        descJB.setPreferredSize(new java.awt.Dimension(90, 30));
        descJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBLayout = new javax.swing.GroupLayout(panelB);
        panelB.setLayout(panelBLayout);
        panelBLayout.setHorizontalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(descJB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBLayout.setVerticalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBLayout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(descJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelA.setPreferredSize(new java.awt.Dimension(350, 150));

        usuarioJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        usuarioJL.setForeground(new java.awt.Color(255, 255, 255));
        usuarioJL.setText("Usuario:");
        usuarioJL.setPreferredSize(new java.awt.Dimension(110, 20));

        inicioJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        inicioJL.setForeground(new java.awt.Color(255, 255, 255));
        inicioJL.setText("Inicio de Secion");
        inicioJL.setPreferredSize(new java.awt.Dimension(140, 30));

        passJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        passJL.setForeground(new java.awt.Color(255, 255, 255));
        passJL.setText("Contraseña:");
        passJL.setPreferredSize(new java.awt.Dimension(110, 20));

        bddJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bddJL.setForeground(new java.awt.Color(255, 255, 255));
        bddJL.setText("Base de Datos:");
        bddJL.setPreferredSize(new java.awt.Dimension(110, 20));

        userJTF.setForeground(new java.awt.Color(0, 0, 0));
        userJTF.setPreferredSize(new java.awt.Dimension(190, 25));

        passJTF.setForeground(new java.awt.Color(0, 0, 0));
        passJTF.setPreferredSize(new java.awt.Dimension(190, 25));

        bddJTF.setForeground(new java.awt.Color(0, 0, 0));
        bddJTF.setPreferredSize(new java.awt.Dimension(190, 25));

        iniciarJB.setBackground(new java.awt.Color(0, 204, 204));
        iniciarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        iniciarJB.setForeground(new java.awt.Color(255, 255, 255));
        iniciarJB.setText("Iniciar");
        iniciarJB.setPreferredSize(new java.awt.Dimension(90, 30));
        iniciarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(inicioJL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iniciarJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createSequentialGroup()
                                .addComponent(bddJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bddJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelALayout.createSequentialGroup()
                                .addComponent(passJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelALayout.createSequentialGroup()
                                .addComponent(usuarioJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bddJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bddJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelA, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJBActionPerformed
        // TODO add your handling code here:
        boolean flag = crud.conectar(bddJTF, userJTF, passJTF);
        
        if (flag) {
            iniciarJB.setBackground(Color.green);
        }
    }//GEN-LAST:event_iniciarJBActionPerformed

    private void descJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descJBActionPerformed
        // TODO add your handling code here:
        Color color = new Color(0,204,204);
        
        crud.desconectar();
        
        iniciarJB.setBackground(color);
    }//GEN-LAST:event_descJBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_asd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_asd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_asd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_asd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_asd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bddJL;
    private javax.swing.JTextField bddJTF;
    private javax.swing.JButton descJB;
    private javax.swing.JButton iniciarJB;
    private javax.swing.JLabel inicioJL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelA;
    private javax.swing.JPanel panelB;
    private javax.swing.JLabel passJL;
    private javax.swing.JTextField passJTF;
    private javax.swing.JTextField userJTF;
    private javax.swing.JLabel usuarioJL;
    // End of variables declaration//GEN-END:variables
}
