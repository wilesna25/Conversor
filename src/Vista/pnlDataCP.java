/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modulos.DataCP;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rptrs
 */
public class pnlDataCP extends javax.swing.JPanel {

    /**
     * Creates new form pnlDataCP
     */
    DataCP data;

    public pnlDataCP() {
        initComponents();
        data = new DataCP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblInicial = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNTFS = new javax.swing.JTextField();
        txtNEQS = new javax.swing.JTextField();
        txtRMS = new javax.swing.JTextField();
        txtDVM = new javax.swing.JTextField();
        txtVDA = new javax.swing.JTextField();
        txtNITLOC = new javax.swing.JTextField();
        txtSTEPL = new javax.swing.JTextField();
        txtNITMAX = new javax.swing.JTextField();
        txtTLIM = new javax.swing.JTextField();
        txtNITPB = new javax.swing.JTextField();
        txtRMSTOP = new javax.swing.JTextField();
        txtNHITCT = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblRut_dat = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(414, 388));
        setPreferredSize(new java.awt.Dimension(414, 388));

        jLabel1.setText("NEQS");

        jLabel2.setText("NTFS");

        jLabel3.setText("NITLOC");

        jLabel4.setText("RMSCUT");

        jLabel5.setText("DVMAX");

        jLabel6.setText("VDAMP");

        jLabel7.setText("NITMAX");

        jLabel8.setText("NITPB");

        jLabel9.setText("TLIM");

        jLabel10.setText("STEPL");

        jLabel11.setText("RMSTOP");

        jLabel12.setText("NHITCT");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblInicial.setText("Seleccione el archivo DATACP que desea modificar:");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtNTFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNTFSActionPerformed(evt);
            }
        });

        txtNEQS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNEQSActionPerformed(evt);
            }
        });

        txtRMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRMSActionPerformed(evt);
            }
        });

        txtDVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVMActionPerformed(evt);
            }
        });

        txtVDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVDAActionPerformed(evt);
            }
        });

        txtNITLOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITLOCActionPerformed(evt);
            }
        });

        txtSTEPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSTEPLActionPerformed(evt);
            }
        });

        txtNITMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITMAXActionPerformed(evt);
            }
        });

        txtTLIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTLIMActionPerformed(evt);
            }
        });

        txtNITPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITPBActionPerformed(evt);
            }
        });

        txtRMSTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRMSTOPActionPerformed(evt);
            }
        });

        txtNHITCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNHITCTActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        lblTitulo.setText("DATACP");

        lblRut_dat.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCargar)
                                    .addComponent(lblInicial))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNTFS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNEQS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNITLOC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNHITCT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(txtNITMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtRMSTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel9)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSTEPL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTLIM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNITPB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtRMS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDVM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtVDA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(btnGuardar)))
                                .addGap(49, 49, 49)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRut_dat, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblInicial)
                .addGap(17, 17, 17)
                .addComponent(btnCargar)
                .addGap(8, 8, 8)
                .addComponent(lblRut_dat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNITPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTLIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSTEPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNTFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNEQS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNITLOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNITMAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRMSTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNHITCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNTFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNTFSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNTFSActionPerformed

    private void txtNEQSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNEQSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNEQSActionPerformed

    private void txtRMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRMSActionPerformed

    private void txtDVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVMActionPerformed

    private void txtVDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVDAActionPerformed

    private void txtNITLOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITLOCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITLOCActionPerformed

    private void txtSTEPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSTEPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSTEPLActionPerformed

    private void txtNITMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITMAXActionPerformed

    private void txtTLIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTLIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTLIMActionPerformed

    private void txtNITPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITPBActionPerformed

    private void txtRMSTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRMSTOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRMSTOPActionPerformed

    private void txtNHITCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNHITCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNHITCTActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("DATACP", "DATACP");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            data.setRuta(chooser.getSelectedFile().getAbsolutePath());
            lblRut_dat.setText(chooser.getSelectedFile().getAbsolutePath());
            String[] arc_datacp = data.leerDataCP().split(" ");
            txtNTFS.setText(arc_datacp[0]);
            txtNEQS.setText(arc_datacp[1]);
            txtNITLOC.setText(arc_datacp[2]);
            txtRMS.setText(arc_datacp[3]);
            txtDVM.setText(arc_datacp[4]);
             txtVDA.setText(arc_datacp[5]);
            txtNHITCT.setText(arc_datacp[6]);
            txtNITMAX.setText(arc_datacp[7]);
            txtRMSTOP.setText(arc_datacp[8]);
            txtSTEPL.setText(arc_datacp[9]);
            txtTLIM.setText(arc_datacp[10]);
            txtNITPB.setText(arc_datacp[11]);
           
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String aux = txtNTFS.getText() + " " + txtNEQS.getText() + " "
                + txtNITLOC.getText() + " " + txtRMS.getText() + " "
                + txtDVM.getText() + " " +               txtVDA.getText() + " /"

                + txtNHITCT.getText() + " " + txtNITMAX.getText() + " "
                + txtRMSTOP.getText() + " " + txtSTEPL.getText()
                + " " + txtTLIM.getText() + " " + txtNITPB.getText();
        data.escribirDataCp(aux);
        data.leerDataCP();
    }//GEN-LAST:event_btnGuardarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JLabel lblRut_dat;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDVM;
    private javax.swing.JTextField txtNEQS;
    private javax.swing.JTextField txtNHITCT;
    private javax.swing.JTextField txtNITLOC;
    private javax.swing.JTextField txtNITMAX;
    private javax.swing.JTextField txtNITPB;
    private javax.swing.JTextField txtNTFS;
    private javax.swing.JTextField txtRMS;
    private javax.swing.JTextField txtRMSTOP;
    private javax.swing.JTextField txtSTEPL;
    private javax.swing.JTextField txtTLIM;
    private javax.swing.JTextField txtVDA;
    // End of variables declaration//GEN-END:variables
}
