package practicas_basicas;

/**
 *
 * @author Hack
 */
public class Manejo_de_Scrollbar extends javax.swing.JFrame {

    public Manejo_de_Scrollbar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Des_Valor = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        Lbl_valor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Des_Valor.setBlockIncrement(5);
        Des_Valor.setMaximum(80);
        Des_Valor.setMinimum(20);
        Des_Valor.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        Des_Valor.setUnitIncrement(5);
        Des_Valor.setVisibleAmount(5);
        Des_Valor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                Des_ValorAdjustmentValueChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manejo de Scrollbar");

        Lbl_valor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_valor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Des_Valor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Des_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(Lbl_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Des_ValorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_Des_ValorAdjustmentValueChanged
        // TODO add your handling code here:
        Lbl_valor.setText("El valor es: "+Des_Valor.getValue());
    }//GEN-LAST:event_Des_ValorAdjustmentValueChanged

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
            java.util.logging.Logger.getLogger(Manejo_de_Scrollbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_Scrollbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_Scrollbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_Scrollbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manejo_de_Scrollbar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar Des_Valor;
    private javax.swing.JLabel Lbl_valor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
