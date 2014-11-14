/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas_basicas;

/**
 *
 * @author Hack
 */
public class Cuadro_Verificación extends javax.swing.JFrame {

    /**
     * Creates new form Cuadro_Verificación
     */
    public Cuadro_Verificación() {
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

        Lbl_Resultado = new javax.swing.JLabel();
        Btn_Aceptar = new javax.swing.JButton();
        Chk_Perro = new javax.swing.JCheckBox();
        Chk_Gato = new javax.swing.JCheckBox();
        Chk_Raton = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Resultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        Btn_Aceptar.setText("Aceptar");
        Btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceptarActionPerformed(evt);
            }
        });

        Chk_Perro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Chk_Perro.setText("Perro");

        Chk_Gato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Chk_Gato.setText("Gato");

        Chk_Raton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Chk_Raton.setText("Raton");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuadro de Verificación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Aceptar)
                            .addComponent(Chk_Raton)
                            .addComponent(Chk_Gato)
                            .addComponent(Chk_Perro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Chk_Perro)
                .addGap(18, 18, 18)
                .addComponent(Chk_Gato)
                .addGap(18, 18, 18)
                .addComponent(Chk_Raton)
                .addGap(54, 54, 54)
                .addComponent(Btn_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceptarActionPerformed
        // TODO add your handling code here:
        
              String mensaje="Animales elegidos: ";
        if (Chk_Perro.isSelected()) {
            mensaje=mensaje+"Perro ";
        } 
        if (Chk_Gato.isSelected()) {
            mensaje=mensaje+"Gato ";
        }       
        if (Chk_Raton.isSelected()) {
            mensaje=mensaje+"Raton ";
        }      
        Lbl_Resultado.setText(mensaje);

    }//GEN-LAST:event_Btn_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Cuadro_Verificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuadro_Verificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuadro_Verificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuadro_Verificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuadro_Verificación().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Aceptar;
    private javax.swing.JCheckBox Chk_Gato;
    private javax.swing.JCheckBox Chk_Perro;
    private javax.swing.JCheckBox Chk_Raton;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
