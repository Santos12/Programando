package practicas_basicas;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Hack
 */
public class Modelos_Combo extends javax.swing.JFrame {

    public Modelos_Combo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cmb_Numeros = new javax.swing.JComboBox();
        Btn_Pares = new javax.swing.JButton();
        Btn_Impares = new javax.swing.JButton();
        Lbl_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cmb_Numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_NumerosActionPerformed(evt);
            }
        });

        Btn_Pares.setText("Pares");
        Btn_Pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ParesActionPerformed(evt);
            }
        });

        Btn_Impares.setText("Impares");
        Btn_Impares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ImparesActionPerformed(evt);
            }
        });

        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lbl_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cmb_Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Pares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Impares)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Impares, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Numeros)
                    .addComponent(Btn_Pares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ParesActionPerformed
        // TODO add your handling code here:
    DefaultComboBoxModel modelo = new DefaultComboBoxModel(); 
    for (int i=0;i<10;i+=2) {
    modelo.addElement("Nº "+i);
    }    
    Cmb_Numeros.setModel(modelo);
    }//GEN-LAST:event_Btn_ParesActionPerformed

    private void Btn_ImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ImparesActionPerformed
        // TODO add your handling code here:
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();   
    for (int i=1;i<10;i+=2) {
    modelo.addElement("Nº "+i);
    }     
    Cmb_Numeros.setModel(modelo);
    }//GEN-LAST:event_Btn_ImparesActionPerformed

    private void Cmb_NumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_NumerosActionPerformed
        // TODO add your handling code here:
        Lbl_Resultado.setText(Cmb_Numeros.getSelectedItem().toString());
    }//GEN-LAST:event_Cmb_NumerosActionPerformed

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
            java.util.logging.Logger.getLogger(Modelos_Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelos_Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelos_Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelos_Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelos_Combo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Impares;
    private javax.swing.JButton Btn_Pares;
    private javax.swing.JComboBox Cmb_Numeros;
    private javax.swing.JLabel Lbl_Resultado;
    // End of variables declaration//GEN-END:variables
}
