package practicas_basicas;
/**
 *
 * @author Hack
 */
public class Variables_Globales extends javax.swing.JFrame {

    int Coches;
    
    public Variables_Globales() {
        initComponents();
        Coches=0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Entro = new javax.swing.JButton();
        Btn_Salio = new javax.swing.JButton();
        Btn_Reiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Lbl_coches = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Entro.setText("Entro un coche");
        Btn_Entro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EntroActionPerformed(evt);
            }
        });

        Btn_Salio.setText("Salio un coche");
        Btn_Salio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalioActionPerformed(evt);
            }
        });

        Btn_Reiniciar.setText("Reiniciar");
        Btn_Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Coches en el Parkin");

        Lbl_coches.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_coches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_coches.setText("0");
        Lbl_coches.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Btn_Entro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Salio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_coches, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Btn_Entro)
                .addGap(18, 18, 18)
                .addComponent(Btn_Salio)
                .addGap(18, 18, 18)
                .addComponent(Btn_Reiniciar)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_coches, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EntroActionPerformed
        // TODO add your handling code here:
        Coches = Coches+1;
        //primero se concatena el valor con "" vacíos y se envía a Lbl_coches
        Lbl_coches.setText(""+Coches);
    }//GEN-LAST:event_Btn_EntroActionPerformed

    private void Btn_SalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalioActionPerformed
        // TODO add your handling code here:
        if(Coches>0){
          Coches = Coches-1;
          Lbl_coches.setText(""+Coches);
        }
        else javax.swing.JOptionPane.showMessageDialog(null,"Parking vacío");
    }//GEN-LAST:event_Btn_SalioActionPerformed

    private void Btn_ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReiniciarActionPerformed
        // TODO add your handling code here:
        Coches=0;
        Lbl_coches.setText(""+Coches);
    }//GEN-LAST:event_Btn_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Variables_Globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Variables_Globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Variables_Globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Variables_Globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Variables_Globales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Entro;
    private javax.swing.JButton Btn_Reiniciar;
    private javax.swing.JButton Btn_Salio;
    private javax.swing.JLabel Lbl_coches;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
