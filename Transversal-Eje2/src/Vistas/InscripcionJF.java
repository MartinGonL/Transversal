package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.Funciones;
import Persistencia.InscripcionData;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InscripcionJF extends javax.swing.JInternalFrame {

    private final ArrayList<Alumno> alumnos = new ArrayList();
    private final ArrayList<Materia> materias = new ArrayList();
    private final ArrayList<Inscripcion> inscripciones = new ArrayList();
    private final InscripcionData funcion;
    private boolean estadoInsc;
    private boolean FLAG;
    
    public InscripcionJF() {
        initComponents();
        this.funcion = new InscripcionData();
        this.estadoInsc = true;
        this.FLAG = false;
        
        cargarBoxAlumnos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        rejistroJL = new javax.swing.JLabel();
        alumnoJL = new javax.swing.JLabel();
        alumnoIdJL = new javax.swing.JLabel();
        alumnoJCB = new javax.swing.JComboBox<>();
        buscarPorJL = new javax.swing.JLabel();
        inscriptoJRB = new javax.swing.JRadioButton();
        recursanteJChB = new javax.swing.JCheckBox();
        recurJL = new javax.swing.JLabel();
        materiaIdJL = new javax.swing.JLabel();
        materiaIdJTF = new javax.swing.JTextField();
        alumnoIdJTF = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        notaJB = new javax.swing.JButton();
        inscribirJB = new javax.swing.JButton();
        cancelJB = new javax.swing.JButton();
        notaJTF = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Alumno");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");
        contenedorJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rejistroJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rejistroJL.setForeground(new java.awt.Color(255, 255, 255));
        rejistroJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rejistroJL.setText("Inscripcion");
        contenedorJP.add(rejistroJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, -1, 50));

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        alumnoJL.setText("Alumno:");
        contenedorJP.add(alumnoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        alumnoIdJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        alumnoIdJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoIdJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        alumnoIdJL.setText("Alumno ID:");
        contenedorJP.add(alumnoIdJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        alumnoIdJL.setVisible(false);

        alumnoJCB.setBackground(new java.awt.Color(255, 255, 255));
        alumnoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Valor" }));
        alumnoJCB.setName(""); // NOI18N
        alumnoJCB.setPreferredSize(new java.awt.Dimension(60, 30));
        alumnoJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoJCBActionPerformed(evt);
            }
        });
        contenedorJP.add(alumnoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 170, -1));

        buscarPorJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buscarPorJL.setForeground(new java.awt.Color(255, 255, 255));
        buscarPorJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarPorJL.setText("Materias Inscriptas");
        contenedorJP.add(buscarPorJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        inscriptoJRB.setBackground(new java.awt.Color(0, 51, 102));
        inscriptoJRB.setForeground(new java.awt.Color(255, 255, 255));
        inscriptoJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptoJRBActionPerformed(evt);
            }
        });
        contenedorJP.add(inscriptoJRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        inscriptoJRB.setSelected(true);

        recursanteJChB.setBackground(new java.awt.Color(0, 51, 102));
        recursanteJChB.setName("`recursante`"); // NOI18N
        contenedorJP.add(recursanteJChB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 30, 31));
        recursanteJChB.setVisible(false);

        recurJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        recurJL.setForeground(new java.awt.Color(255, 255, 255));
        recurJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        recurJL.setText("Recursante:");
        contenedorJP.add(recurJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        recurJL.setVisible(false);

        materiaIdJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        materiaIdJL.setForeground(new java.awt.Color(255, 255, 255));
        materiaIdJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        materiaIdJL.setText("Materia ID:");
        contenedorJP.add(materiaIdJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        materiaIdJL.setVisible(false);

        materiaIdJTF.setBackground(new java.awt.Color(255, 255, 255));
        materiaIdJTF.setForeground(new java.awt.Color(0, 0, 0));
        materiaIdJTF.setName("`idMateria`"); // NOI18N
        materiaIdJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                materiaIdJTFFocusGained(evt);
            }
        });
        materiaIdJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                materiaIdJTFKeyReleased(evt);
            }
        });
        contenedorJP.add(materiaIdJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 50, 30));
        materiaIdJTF.setVisible(false);

        alumnoIdJTF.setBackground(new java.awt.Color(255, 255, 255));
        alumnoIdJTF.setForeground(new java.awt.Color(0, 0, 0));
        alumnoIdJTF.setName("`idAlumno`"); // NOI18N
        alumnoIdJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alumnoIdJTFFocusGained(evt);
            }
        });
        alumnoIdJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alumnoIdJTFKeyReleased(evt);
            }
        });
        contenedorJP.add(alumnoIdJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 50, 30));
        alumnoIdJTF.setVisible(false);

        panelBotones.setBackground(new java.awt.Color(51, 51, 51));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notaJB.setBackground(new java.awt.Color(255, 204, 0));
        notaJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        notaJB.setForeground(new java.awt.Color(255, 255, 255));
        notaJB.setText("Cargar Nota");
        notaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaJBActionPerformed(evt);
            }
        });
        panelBotones.add(notaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        inscribirJB.setBackground(new java.awt.Color(255, 204, 0));
        inscribirJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        inscribirJB.setForeground(new java.awt.Color(255, 255, 255));
        inscribirJB.setText("Inscribir");
        inscribirJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirJBActionPerformed(evt);
            }
        });
        panelBotones.add(inscribirJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 114, -1));

        cancelJB.setBackground(new java.awt.Color(204, 0, 0));
        cancelJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        cancelJB.setForeground(new java.awt.Color(255, 255, 255));
        cancelJB.setText("Cancelar");
        cancelJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJBActionPerformed(evt);
            }
        });
        panelBotones.add(cancelJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 114, -1));
        cancelJB.setVisible(false);

        notaJTF.setBackground(new java.awt.Color(255, 255, 255));
        notaJTF.setForeground(new java.awt.Color(0, 0, 0));
        notaJTF.setName("`nota`"); // NOI18N
        panelBotones.add(notaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, 30));
        notaJTF.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarBoxAlumnos() {
        /*Receteo el Array y cargo los nuevos elementos.*/
        alumnos.clear();
        funcion.buscarElementos(alumnos, materias);
        
        /*Recorrer cada elemento del array para armar el ComboBox de alumnos usando el numero de ID y el nombre de los mismos.*/
        for (Alumno alu : alumnos) 
        {
            alumnoJCB.addItem(String.valueOf(alu.getIDalumno()) + " " + alu.getNombre());
        }
        
        /*Vacio el Array para un proximo uso*/
        alumnos.clear();
    }
    
    private void inscriptoJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptoJRBActionPerformed
        /*Muestro determinado mensaje segun el estado del RadioButton.*/
        buscarPorJL.setText(inscriptoJRB.isSelected() ? "Materias Inscriptas." : "Materias No Inscriptas.");
        
        /*Asigno un valor a la variable global*/
        estadoInsc = (inscriptoJRB.isSelected());
        
        /*Refresco la tabla con los resultados correspondientes a cada alumno.*/
        alumnoJCBActionPerformed(evt);
    }//GEN-LAST:event_inscriptoJRBActionPerformed
                                
    private void notaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaJBActionPerformed
        if (!cancelJB.isVisible()) 
        {
            /*Muestro el campo de texto para buscar al alumno.*/
            alumnoIdJL.setVisible(true);
            alumnoIdJTF.setVisible(true);
            
            cancelJB.setVisible(true);
            
            /*Anulo los demas botones.*/
            inscribirJB.setEnabled(false);
            
            FLAG = true;
        }
        else 
        {
            if (!notaJTF.getText().equals("")) 
            {
                funcion.cargarNota(materias, alumnoIdJTF.getText(), materiaIdJTF.getText(), notaJTF.getText());
                FLAG = false;
                
                Funciones.cleanField(panelBotones);
                Funciones.cleanField(contenedorJP);
            }
            else JOptionPane.showMessageDialog(rootPane, "Ingrese una Nota.");
        }
    }//GEN-LAST:event_notaJBActionPerformed
    
    private void inscribirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirJBActionPerformed
        if (!cancelJB.isVisible()) 
        {
            /*Muestro los campos de texto para recibir los datos de inscripcion y el boton cancelar.*/
            cancelJB.setVisible(true);
            
            alumnoIdJL.setVisible(true);
            alumnoIdJTF.setVisible(true);
            materiaIdJTF.setVisible(true);
            materiaIdJL.setVisible(true);
            recurJL.setVisible(true);
            recursanteJChB.setVisible(true);
            
            alumnoJL.setVisible(false);
            alumnoJCB.setVisible(false);
            buscarPorJL.setVisible(false);
            inscriptoJRB.setVisible(false);
            
            notaJB.setEnabled(false);
            
            /*Seteo la variable con el valor false para evitar que el metodo entre en un bucle.*/
            estadoInsc = false;
        }
        else 
        {
            /*Controlo que el ususario haya completado todos los campos solicitados.*/
            boolean flag = Funciones.checkField(contenedorJP);
            if (flag) 
            {
                /*Instancio las variables que definiran los valores de los atributos de mi objeto.*/
                int IDalumno = Integer.parseInt(alumnoIdJTF.getText());
                int IDmateria = Integer.parseInt(materiaIdJTF.getText());
                boolean recur = recursanteJChB.isSelected();
                
                /*Lo instancio el objeto y lo envio al metodo '.cargarElemento()' para realizar la carga de los datos.*/
                Inscripcion inscripcion = new Inscripcion(IDalumno, IDmateria, recur);
                funcion.cargarElemento(inscripcion);
            }
            else JOptionPane.showMessageDialog(rootPane, "Complete lo campos requeridos.");
            
            /*Receteo los campos utilizados.*/
            Funciones.cleanField(contenedorJP);
            recursanteJChB.setSelected(false);
            InicioJDP.resetTable();
        }
    }//GEN-LAST:event_inscribirJBActionPerformed

    private void cancelJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJBActionPerformed
        /*Revierto todo cambio realizado en los metodos anteriores.*/
        inscribirJB.setEnabled(true);
        buscarPorJL.setVisible(true);
        inscriptoJRB.setVisible(true);
        alumnoJL.setVisible(true);
        alumnoJCB.setVisible(true);

        notaJB.setEnabled(true);
        notaJTF.setVisible(false);

        alumnoIdJTF.setVisible(false);
        alumnoIdJL.setVisible(false);
        materiaIdJL.setVisible(false);
        materiaIdJTF.setVisible(false);
        recurJL.setVisible(false);
        recursanteJChB.setVisible(false);

        cancelJB.setVisible(false);
        
        /*Reinico la variable.*/
        estadoInsc = true;
        FLAG = false;
    }//GEN-LAST:event_cancelJBActionPerformed

    private void alumnoJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnoJCBActionPerformed
        /*Vacio y cargo en el Array las respectivas materias de cada alumno.*/
        materias.clear();
        inscripciones.clear();
        funcion.buscarPorID(materias, inscripciones, alumnoJCB, estadoInsc);
        
        /*Receteo y las muestro dependiendo de la bandera.*/
        InicioJDP.resetTable();
        if (estadoInsc) 
        {
            InicioJDP.setColum(new Inscripcion());
            InicioJDP.setRow(inscripciones, materias);
        }
        else 
        {
            InicioJDP.setColum(new Materia());
            InicioJDP.setRow((ArrayList<Object>)(Object)materias);
        }
    }//GEN-LAST:event_alumnoJCBActionPerformed

    private void alumnoIdJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alumnoIdJTFFocusGained
        /*Vacio y relleno el Array de alumnos*/
        alumnos.clear();
        funcion.buscarElementos(alumnos, materias);
        
        /*Receteo y los muestro.*/
        InicioJDP.resetTable();
        InicioJDP.setColum(new Alumno());
        InicioJDP.setRow((ArrayList<Object>)(Object)alumnos);
    }//GEN-LAST:event_alumnoIdJTFFocusGained

    private void materiaIdJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_materiaIdJTFFocusGained
        /*Espero a que el ususario cargue el N° de ID del alumno para poder mostrar las materias a las que NO esta inscripto.
        Tambien me aseguro por medio de la bandera que la accion NO sea llamada por el metodo '.notaJBActionPerformed(...)'*/
        if (!alumnoIdJTF.getText().equals("") & FLAG == false) 
        {
            /*Vacio y relleno el Array de materias.*/
            materias.clear();
            funcion.buscarPorIDTxt(materias, alumnoIdJTF);

            /*Receteo y las muestro.*/
            InicioJDP.resetTable();
            InicioJDP.setColum(new Materia());
            InicioJDP.setRow((ArrayList<Object>)(Object)materias);
        }
        else if (!estadoInsc) 
        {
            JOptionPane.showMessageDialog(rootPane, "Primero seleccione un Alumno.");
            estadoInsc = true;
        }
        /*Si este metodo es llamado por '.notaJBActionPerformed(...)' muestro todas las materias inscriptas del alumno.*/
        else if (FLAG) 
        {
            materias.clear();
            funcion.cargarNota(materias, alumnoIdJTF.getText(), materiaIdJTF.getText(), notaJTF.getText());
            
            InicioJDP.resetTable();
            InicioJDP.setColum(new Materia());
            InicioJDP.setRow((ArrayList<Object>) (Object) materias);
        }
    }//GEN-LAST:event_materiaIdJTFFocusGained

    private void alumnoIdJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alumnoIdJTFKeyReleased
        try {   
            if (FLAG) 
            {
                for (Alumno alumno : alumnos) 
                {
                    int id = Integer.parseInt(alumnoIdJTF.getText());
                    
                    if (alumno.getIDalumno() == id) 
                    {
                        materiaIdJL.setVisible(true);
                        materiaIdJTF.setVisible(true);
                        break;
                    }
                    else 
                    {
                        materiaIdJL.setVisible(false);
                        materiaIdJTF.setVisible(false);
                    }
                }
            }
        }
        catch (NumberFormatException ex) {}
    }//GEN-LAST:event_alumnoIdJTFKeyReleased

    private void materiaIdJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materiaIdJTFKeyReleased
        try {   
            if (FLAG) 
            {
                for (Materia materia : materias) 
                {
                    int id = Integer.parseInt(materiaIdJTF.getText());
                    
                    if (materia.getIDmateria() == id) 
                    {
                        notaJTF.setVisible(true);
                        break;
                    }
                    else notaJTF.setVisible(false);
                }
            }
        }
        catch (NumberFormatException ex) {}
    }//GEN-LAST:event_materiaIdJTFKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alumnoIdJL;
    private javax.swing.JTextField alumnoIdJTF;
    private javax.swing.JComboBox<String> alumnoJCB;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JLabel buscarPorJL;
    private javax.swing.JButton cancelJB;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JButton inscribirJB;
    private javax.swing.JRadioButton inscriptoJRB;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel materiaIdJL;
    private javax.swing.JTextField materiaIdJTF;
    private javax.swing.JButton notaJB;
    private javax.swing.JTextField notaJTF;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JLabel recurJL;
    private javax.swing.JCheckBox recursanteJChB;
    private javax.swing.JLabel rejistroJL;
    // End of variables declaration//GEN-END:variables
}
