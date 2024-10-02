package Vistas;

import Modelo.Alumno;
import Persistencia.Check;
import Persistencia.Coneccion;
import java.awt.Component;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AlumnoJF extends javax.swing.JInternalFrame {

    Coneccion coneccion;
    
    public AlumnoJF() {
        initComponents();
        this.coneccion = new Coneccion();
        
        coneccion.conectar();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        dniJL = new javax.swing.JLabel();
        apellidoJL = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        apellidoJTF = new javax.swing.JTextField();
        dniJTF = new javax.swing.JTextField();
        fechaNacJL = new javax.swing.JLabel();
        fechaJTF = new javax.swing.JTextField();
        activoJL = new javax.swing.JLabel();
        activJChB = new javax.swing.JCheckBox();
        panelBotonesJP = new javax.swing.JPanel();
        crearJB = new javax.swing.JButton();
        actualizarJB = new javax.swing.JButton();
        buscarJB = new javax.swing.JButton();
        desJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(51, 51, 51));
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

        dniJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        dniJL.setForeground(new java.awt.Color(255, 255, 255));
        dniJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dniJL.setText("DNI:");

        apellidoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        apellidoJL.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoJL.setText("Apellido:");

        nombreJTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTF.setMinimumSize(new java.awt.Dimension(68, 22));
        nombreJTF.setName("`nombre`"); // NOI18N

        apellidoJTF.setBackground(new java.awt.Color(255, 255, 255));
        apellidoJTF.setMinimumSize(new java.awt.Dimension(68, 22));
        apellidoJTF.setName("`apellido`"); // NOI18N

        dniJTF.setBackground(new java.awt.Color(255, 255, 255));
        dniJTF.setForeground(new java.awt.Color(0, 0, 0));
        dniJTF.setMinimumSize(new java.awt.Dimension(68, 22));
        dniJTF.setName("`dni`"); // NOI18N
        dniJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniJTFActionPerformed(evt);
            }
        });

        fechaNacJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        fechaNacJL.setForeground(new java.awt.Color(255, 255, 255));
        fechaNacJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaNacJL.setText("F. Nacimiento:");

        fechaJTF.setBackground(new java.awt.Color(255, 255, 255));
        fechaJTF.setForeground(new java.awt.Color(0, 0, 0));
        fechaJTF.setMinimumSize(new java.awt.Dimension(68, 22));
        fechaJTF.setName("`fechaNacimiento`"); // NOI18N

        activoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        activoJL.setForeground(new java.awt.Color(255, 255, 255));
        activoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activoJL.setText("Activo:");

        activJChB.setBackground(new java.awt.Color(0, 51, 102));
        activJChB.setForeground(new java.awt.Color(255, 255, 255));
        activJChB.setName("`estado`"); // NOI18N

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaNacJL)
                                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(fechaJTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorJPLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(apellidoJL)
                                    .addComponent(dniJL)
                                    .addComponent(activoJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activJChB)
                                    .addComponent(dniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(alumnoJL)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaNacJL)
                    .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoJL)
                    .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniJL))
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(activoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(activJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelBotonesJP.setBackground(new java.awt.Color(51, 51, 51));

        crearJB.setBackground(new java.awt.Color(255, 204, 0));
        crearJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        crearJB.setForeground(new java.awt.Color(255, 255, 255));
        crearJB.setText("Crear");
        crearJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJBActionPerformed(evt);
            }
        });

        actualizarJB.setBackground(new java.awt.Color(255, 204, 0));
        actualizarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        actualizarJB.setForeground(new java.awt.Color(255, 255, 255));
        actualizarJB.setText("Actualizar");
        actualizarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarJBActionPerformed(evt);
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

        desJB.setBackground(new java.awt.Color(255, 51, 0));
        desJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        desJB.setForeground(new java.awt.Color(255, 255, 255));
        desJB.setText("Desabilitar");
        desJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desJBActionPerformed(evt);
            }
        });

        deleteJB.setBackground(new java.awt.Color(204, 0, 0));
        deleteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        deleteJB.setForeground(new java.awt.Color(255, 255, 255));
        deleteJB.setText("Eliminar");
        deleteJB.setMaximumSize(new java.awt.Dimension(79, 28));
        deleteJB.setMinimumSize(new java.awt.Dimension(79, 28));
        deleteJB.setPreferredSize(new java.awt.Dimension(79, 28));
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesJPLayout = new javax.swing.GroupLayout(panelBotonesJP);
        panelBotonesJP.setLayout(panelBotonesJPLayout);
        panelBotonesJPLayout.setHorizontalGroup(
            panelBotonesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesJPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBotonesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelBotonesJPLayout.setVerticalGroup(
            panelBotonesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesJPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(crearJB)
                .addGap(18, 18, 18)
                .addComponent(actualizarJB)
                .addGap(18, 18, 18)
                .addComponent(buscarJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desJB)
                .addGap(18, 18, 18)
                .addComponent(deleteJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJBActionPerformed
        boolean flag = Check.checkField(contenedorJP);

        if (flag) 
        {
            int dni = Integer.parseInt(dniJTF.getText());
            String nombre = nombreJTF.getText();
            String apellido = apellidoJTF.getText();
            LocalDate fecha = LocalDate.parse(fechaJTF.getText());
            boolean estado = activJChB.isSelected();

            Alumno alumno = new Alumno(dni, nombre, apellido, fecha, estado);
            coneccion.cargarDato(alumno);
            Check.cleanField(contenedorJP);
        } 
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos.");
        }
    }//GEN-LAST:event_crearJBActionPerformed

    private void actualizarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarJBActionPerformed

    private void desJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteJBActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        HashMap<String, String> doms = new HashMap();
        String alumno = "`alumno`";
        
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
                            case "`dni`" -> { doms.put(txt.getName(), txt.getText()); }
                            case "`apellido`" -> { doms.put(txt.getName(), "'" + txt.getText() + "'"); }
                            case "`nombre`" -> { doms.put(txt.getName(), "'" + txt.getText() + "'"); }
                            case "`fechaNacimiento`" -> { doms.put(txt.getName(), "'" + txt.getText() + "'"); }
                        }
                    }
                }
                case JCheckBox check -> 
                {
                    if (check.isSelected()) 
                    {
                        doms.put(check.getName(), String.valueOf(check.isSelected()));
                    }
                }
                default -> {}
            }
        }

        if (!doms.isEmpty()) coneccion.buscarDato(alumno, doms);
        else JOptionPane.showMessageDialog(rootPane, "Complete al menos un campo.");
    }//GEN-LAST:event_buscarJBActionPerformed

    private void dniJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniJTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activJChB;
    private javax.swing.JLabel activoJL;
    private javax.swing.JButton actualizarJB;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JLabel apellidoJL;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.JButton buscarJB;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JButton crearJB;
    private javax.swing.JButton deleteJB;
    private javax.swing.JButton desJB;
    private javax.swing.JLabel dniJL;
    private javax.swing.JTextField dniJTF;
    private javax.swing.JTextField fechaJTF;
    private javax.swing.JLabel fechaNacJL;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JPanel panelBotonesJP;
    // End of variables declaration//GEN-END:variables
}
