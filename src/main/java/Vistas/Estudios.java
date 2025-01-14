/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author alanm
 */
public class Estudios extends javax.swing.JFrame {

    /**
     * Creates new form Estudios
     */
    public Estudios() {
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
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboInstrucciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        checkDicom = new javax.swing.JCheckBox();
        comboArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevasInstrucciones = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAreaBusqueda = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        checkRequiereAntecedentes = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudios = new javax.swing.JTable();
        comboAntecedentes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAntecedentes = new javax.swing.JTable();
        btnQuitarAntecedente = new javax.swing.JButton();
        btnNuevoAntecedente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha-regresar.png"))); // NOI18N
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboInstrucciones.setNextFocusableComponent(checkDicom);
        jPanel2.add(comboInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Instrucciones");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        checkDicom.setBackground(new java.awt.Color(204, 204, 255));
        checkDicom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkDicom.setText("Dicom");
        checkDicom.setNextFocusableComponent(btnGuardar);
        jPanel2.add(checkDicom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        comboArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboArea.setNextFocusableComponent(comboInstrucciones);
        jPanel2.add(comboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 240, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Área");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setNextFocusableComponent(comboArea);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, -1));

        btnNuevasInstrucciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevasInstrucciones.setForeground(new java.awt.Color(0, 0, 51));
        btnNuevasInstrucciones.setText("Nuevas instrucciones");
        btnNuevasInstrucciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevasInstrucciones.setContentAreaFilled(false);
        jPanel2.add(btnNuevasInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 400, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Buscar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Área");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel2.add(comboAreaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 190, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 51));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setNextFocusableComponent(txtNombre);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 90, 30));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ver2.png"))); // NOI18N
        btnVer.setContentAreaFilled(false);
        jPanel2.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 40, -1));

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 100, 30));

        checkRequiereAntecedentes.setBackground(new java.awt.Color(204, 204, 255));
        checkRequiereAntecedentes.setText("Requiere saber antecedentes");
        jPanel2.add(checkRequiereAntecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jScrollPane1.setViewportView(tableEstudios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 610, 510));
        jPanel2.add(comboAntecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 240, -1));

        jScrollPane2.setViewportView(tableAntecedentes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 140));

        btnQuitarAntecedente.setText("Quitar");
        jPanel2.add(btnQuitarAntecedente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        btnNuevoAntecedente.setText("Nuevo antecedente");
        jPanel2.add(btnNuevoAntecedente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 930, 600));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CerrarSecundario.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minSecundario.png"))); // NOI18N
        btnMinimizar.setContentAreaFilled(false);
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 30, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagotipo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Estudios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevasInstrucciones;
    public javax.swing.JButton btnNuevoAntecedente;
    public javax.swing.JButton btnQuitarAntecedente;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnVer;
    public javax.swing.JCheckBox checkDicom;
    public javax.swing.JCheckBox checkRequiereAntecedentes;
    public javax.swing.JComboBox<String> comboAntecedentes;
    public javax.swing.JComboBox<String> comboArea;
    public javax.swing.JComboBox<String> comboAreaBusqueda;
    public javax.swing.JComboBox<String> comboInstrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableAntecedentes;
    public javax.swing.JTable tableEstudios;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
