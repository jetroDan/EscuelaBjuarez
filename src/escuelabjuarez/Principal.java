/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelabjuarez;

/**
 *
 * @author jetro
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        pnlRegCurso = new javax.swing.JPanel();
        lbCodcurso = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbAula = new javax.swing.JLabel();
        lbProfesor = new javax.swing.JLabel();
        lbMateria = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cbxAula = new javax.swing.JComboBox<>();
        cbxProfesor = new javax.swing.JComboBox<>();
        cbxMateria = new javax.swing.JComboBox<>();
        btnGuardarReg = new javax.swing.JButton();
        txtCodCurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurso = new javax.swing.JTable();
        pnlConscurso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConsulCurso = new javax.swing.JTextField();
        btnBuscarCurso = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAlumno = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnuProfesor = new javax.swing.JMenu();
        mnuMateria = new javax.swing.JMenu();
        mnuAula = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRegCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar curso"));

        lbCodcurso.setText("Codigo del curso");

        lbFecha.setText("Fecha de inicio");

        lbAula.setText("Aula");

        lbProfesor.setText("Profesor");

        lbMateria.setText("Materia");

        cbxAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardarReg.setText("Guardar");
        btnGuardarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegActionPerformed(evt);
            }
        });

        txtCodCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegCursoLayout = new javax.swing.GroupLayout(pnlRegCurso);
        pnlRegCurso.setLayout(pnlRegCursoLayout);
        pnlRegCursoLayout.setHorizontalGroup(
            pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodcurso)
                    .addComponent(lbFecha)
                    .addComponent(lbAula)
                    .addComponent(lbProfesor)
                    .addComponent(lbMateria))
                .addGap(86, 86, 86)
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(cbxAula, 0, 127, Short.MAX_VALUE)
                    .addComponent(cbxProfesor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodCurso)
                    .addComponent(btnGuardarReg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlRegCursoLayout.setVerticalGroup(
            pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegCursoLayout.createSequentialGroup()
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegCursoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCodcurso))
                    .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAula)
                    .addComponent(cbxAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfesor)
                    .addComponent(cbxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMateria)
                    .addComponent(cbxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarReg))
        );

        tblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Aula", "Profesor", "Materia", "Alumno"
            }
        ));
        jScrollPane1.setViewportView(tblCurso);

        pnlConscurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar curso"));

        jLabel1.setText("Codigo del curso");

        txtConsulCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsulCursoActionPerformed(evt);
            }
        });

        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConscursoLayout = new javax.swing.GroupLayout(pnlConscurso);
        pnlConscurso.setLayout(pnlConscursoLayout);
        pnlConscursoLayout.setHorizontalGroup(
            pnlConscursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConscursoLayout.createSequentialGroup()
                .addGroup(pnlConscursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConscursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarCurso))
                    .addGroup(pnlConscursoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConsulCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        pnlConscursoLayout.setVerticalGroup(
            pnlConscursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConscursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConscursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsulCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCurso)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        mnuAlumno.setText("Alumno");
        jMenuBar1.add(mnuAlumno);
        jMenuBar1.add(jMenu2);

        mnuProfesor.setText("Profesor");
        jMenuBar1.add(mnuProfesor);

        mnuMateria.setText("Materia");
        jMenuBar1.add(mnuMateria);

        mnuAula.setText("Aula");
        jMenuBar1.add(mnuAula);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRegCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlConscurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlRegCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConscurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRegActionPerformed

    private void txtCodCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCursoActionPerformed

    private void txtConsulCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsulCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsulCursoActionPerformed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnGuardarReg;
    private javax.swing.JComboBox<String> cbxAula;
    private javax.swing.JComboBox<String> cbxMateria;
    private javax.swing.JComboBox<String> cbxProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAula;
    private javax.swing.JLabel lbCodcurso;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbProfesor;
    private javax.swing.JMenu mnuAlumno;
    private javax.swing.JMenu mnuAula;
    private javax.swing.JMenu mnuMateria;
    private javax.swing.JMenu mnuProfesor;
    private javax.swing.JPanel pnlConscurso;
    private javax.swing.JPanel pnlRegCurso;
    private javax.swing.JTable tblCurso;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtConsulCurso;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
