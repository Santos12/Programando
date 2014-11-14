package practicas_basicas;
import javax.swing.DefaultListModel;

/**
 *
 * @author Hack
 */
public class Modelos_List extends javax.swing.JFrame {

    public Modelos_List() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Nombres = new javax.swing.JList();
        Btn_Lista1 = new javax.swing.JButton();
        Btn_Lista2 = new javax.swing.JButton();
        Lbl_Resultado = new javax.swing.JLabel();
        Btn_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista_Nombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista_NombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista_Nombres);

        Btn_Lista1.setText("Lista1");
        Btn_Lista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Lista1ActionPerformed(evt);
            }
        });

        Btn_Lista2.setText("Lista2");
        Btn_Lista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Lista2ActionPerformed(evt);
            }
        });

        Lbl_Resultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Btn_Limpiar.setText("Limpiar");
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Lista1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Lista2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Limpiar)
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Lista1)
                    .addComponent(Btn_Limpiar)
                    .addComponent(Btn_Lista2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Lista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Lista1ActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Juan");
        modelo.addElement("María");
        modelo.addElement("Luis");
        Lista_Nombres.setModel(modelo);
    }//GEN-LAST:event_Btn_Lista1ActionPerformed

    private void Btn_Lista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Lista2ActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Ana");
        modelo.addElement("Martha");
        modelo.addElement("Jose");
        Lista_Nombres.setModel(modelo);
    }//GEN-LAST:event_Btn_Lista2ActionPerformed

    private void Lista_NombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista_NombresMouseClicked
        // TODO add your handling code here:
        Lbl_Resultado.setText(Lista_Nombres.getSelectedValue().toString());
    }//GEN-LAST:event_Lista_NombresMouseClicked

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = new DefaultListModel();//nuevo modelo
        modelo.addElement(""); //modleo vacio
        Lista_Nombres.setModel(modelo); //Lista_Nombres Vaciado
        Lbl_Resultado.setText("");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Modelos_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelos_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelos_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelos_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelos_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Lista1;
    private javax.swing.JButton Btn_Lista2;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JList Lista_Nombres;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
