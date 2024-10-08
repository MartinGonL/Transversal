/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Alumno;

/**
 *
 * @author santi
 */
public class FormularioInscripción extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioInscripción
     */
    public FormularioInscripción() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFormInscripcion = new javax.swing.JLabel();
        txtSeleccioneAlumno = new javax.swing.JLabel();
        cmbAlumnos = new javax.swing.JComboBox<>();
        txtListadoMaterias = new javax.swing.JLabel();
        chbMatInscriptas = new javax.swing.JCheckBox();
        chbMatNoInscriptas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btnAnularInscripcion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        txtFormInscripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtFormInscripcion.setText("Formulario de Inscripción");

        txtSeleccioneAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSeleccioneAlumno.setText("Seleccione un alumno:");

        cmbAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtListadoMaterias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtListadoMaterias.setText("Listado de Materias");

        chbMatInscriptas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chbMatInscriptas.setText("Materias Inscriptas");
        chbMatInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMatInscriptasActionPerformed(evt);
            }
        });

        chbMatNoInscriptas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chbMatNoInscriptas.setText("Materias no Inscriptas");

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        btnInsertar.setText("Insertar");
        btnInsertar.setEnabled(false);

        btnAnularInscripcion.setText("Anular Inscripción");
        btnAnularInscripcion.setEnabled(false);
        btnAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularInscripcionActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnularInscripcion)
                .addGap(122, 122, 122)
                .addComponent(btnSalir)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFormInscripcion)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(chbMatInscriptas)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtSeleccioneAlumno)
                                .addGap(104, 104, 104)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbMatNoInscriptas)
                            .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(txtListadoMaterias)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtFormInscripcion)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeleccioneAlumno))
                .addGap(44, 44, 44)
                .addComponent(txtListadoMaterias)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbMatNoInscriptas)
                    .addComponent(chbMatInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnularInscripcion)
                    .addComponent(btnInsertar)
                    .addComponent(btnSalir))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbMatInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMatInscriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbMatInscriptasActionPerformed

    private void btnAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularInscripcion;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chbMatInscriptas;
    private javax.swing.JCheckBox chbMatNoInscriptas;
    private javax.swing.JComboBox<Alumno> cmbAlumnos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JLabel txtFormInscripcion;
    private javax.swing.JLabel txtListadoMaterias;
    private javax.swing.JLabel txtSeleccioneAlumno;
    // End of variables declaration//GEN-END:variables
}
