/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package iu;
import java.util.Timer;

/**
 *
 * @author marti
 */
public class VentanaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public VentanaPrincipal() {
        Timer timer = new Timer();
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

        tglbtnPausa = new javax.swing.JToggleButton();
        lblLblnumlinas = new javax.swing.JLabel();

        tglbtnPausa.setText("Pausa");
        tglbtnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglbtnPausaActionPerformed(evt);
            }
        });

        lblLblnumlinas.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLblnumlinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(tglbtnPausa)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglbtnPausa)
                    .addComponent(lblLblnumlinas))
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tglbtnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglbtnPausaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglbtnPausaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLblnumlinas;
    private javax.swing.JToggleButton tglbtnPausa;
    // End of variables declaration//GEN-END:variables
}
