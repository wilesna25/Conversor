/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modulos.CNV;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author root
 */
public class pnlConvertirCNV extends javax.swing.JPanel {

    /**
     * Creates new form pnlConvertirCNV
     */
    CNV cnv;
    private String rutIpn;
    private String rutSta;
    private String rutCnv;
    
    public pnlConvertirCNV() {
        initComponents();
        cnv = new CNV();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        lblRut_ipn = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();
        lblMen2 = new javax.swing.JLabel();
        lblMen1 = new javax.swing.JLabel();
        lblMen3 = new javax.swing.JLabel();
        lblRuta_sta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEsta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setToolTipText("");

        jLabel1.setText("Seleccione el archivo .STA que se usará como referencia");
        jLabel1.setAlignmentX(0.5F);

        jButton4.setText("Cargar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setText("CNV");

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel3.setText("INFORMACION");

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblMen2.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        lblMen2.setText("Nombre del archivo");

        lblMen1.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        lblMen1.setText("Ruta archivo IPN");

        lblMen3.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        lblMen3.setText("Ruta archivo estaciones");

        jLabel2.setText("Seleccione el archivo *.IPN que desea convertir a CNV   ");
        jLabel2.setAlignmentX(0.5F);

        btnEsta.setText("Cargar");
        btnEsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstaActionPerformed(evt);
            }
        });

        jLabel4.setText(".CNV");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEsta)
                                    .addComponent(jButton4))
                                .addGap(28, 28, 28))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMen3)
                                    .addComponent(lblRut_ipn, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMen1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMen2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(lblRuta_sta, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnConvertir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblMen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRut_ipn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblMen3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRuta_sta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMen2)
                    .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(btnConvertir)
                .addGap(2, 2, 2)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IPN","IPN");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            cnv.setRuta(chooser.getSelectedFile().getAbsolutePath());
            lblRut_ipn.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (txtNombreArchivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe agregar un nombre de archivo");
        } else if (cnv.getRuta().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione el archivo a convertir");
//        }else if (cnv.getEsta_ref().equals("")) {
//            JOptionPane.showMessageDialog(null, "Cargue el archivo de estaciones de referencia");
//        else {
        } else {
            cnv.leerIPN(cnv.getRuta(), txtNombreArchivo.getText());
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnEstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstaActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("STA", "STA");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            cnv.setEsta_ref(chooser.getSelectedFile().getAbsolutePath());
            lblRuta_sta.setText(chooser.getSelectedFile().getAbsolutePath());
            cnv.cargarSta(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnEstaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnEsta;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMen1;
    private javax.swing.JLabel lblMen2;
    private javax.swing.JLabel lblMen3;
    private javax.swing.JLabel lblRut_ipn;
    private javax.swing.JLabel lblRuta_sta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the rutIpn
     */
    public String getRutIpn() {
        return rutIpn;
    }

    /**
     * @param rutIpn the rutIpn to set
     */
    public void setRutIpn(String rutIpn) {
        this.rutIpn = rutIpn;
    }

    /**
     * @return the rutSta
     */
    public String getRutSta() {
        return rutSta;
    }

    /**
     * @param rutSta the rutSta to set
     */
    public void setRutSta(String rutSta) {
        this.rutSta = rutSta;
    }

    /**
     * @return the rutCnv
     */
    public String getRutCnv() {
        return rutCnv;
    }

    /**
     * @param rutCnv the rutCnv to set
     */
    public void setRutCnv(String rutCnv) {
        this.rutCnv = rutCnv;
    }
}
