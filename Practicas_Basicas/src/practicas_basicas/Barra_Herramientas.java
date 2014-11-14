package practicas_basicas;
import javax.swing.JOptionPane;
/**
 *
 * @author Hack
 */
public class Barra_Herramientas extends javax.swing.JFrame {

    public Barra_Herramientas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra_Herramientas = new javax.swing.JToolBar();
        Btn_Uno = new javax.swing.JButton();
        Btn_Dos = new javax.swing.JButton();
        Btn_Tres = new javax.swing.JButton();
        Btn_Cuatro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Barra_Herramientas.setFloatable(false);
        Barra_Herramientas.setRollover(true);

        Btn_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img1.gif"))); // NOI18N
        Btn_Uno.setFocusable(false);
        Btn_Uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Uno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UnoActionPerformed(evt);
            }
        });
        Barra_Herramientas.add(Btn_Uno);

        Btn_Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img2.gif"))); // NOI18N
        Btn_Dos.setFocusable(false);
        Btn_Dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Dos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DosActionPerformed(evt);
            }
        });
        Barra_Herramientas.add(Btn_Dos);

        Btn_Tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img3.gif"))); // NOI18N
        Btn_Tres.setFocusable(false);
        Btn_Tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Tres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TresActionPerformed(evt);
            }
        });
        Barra_Herramientas.add(Btn_Tres);

        Btn_Cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img4.gif"))); // NOI18N
        Btn_Cuatro.setFocusable(false);
        Btn_Cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Cuatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CuatroActionPerformed(evt);
            }
        });
        Barra_Herramientas.add(Btn_Cuatro);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Herramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Barra_Herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UnoActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Activaste el botón uno");
    }//GEN-LAST:event_Btn_UnoActionPerformed

    private void Btn_DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DosActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Activaste el botón dos");
    }//GEN-LAST:event_Btn_DosActionPerformed

    private void Btn_TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TresActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Activaste el botón tres");
    }//GEN-LAST:event_Btn_TresActionPerformed

    private void Btn_CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CuatroActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Activaste el botón cuatro");
    }//GEN-LAST:event_Btn_CuatroActionPerformed

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
            java.util.logging.Logger.getLogger(Barra_Herramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barra_Herramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barra_Herramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barra_Herramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barra_Herramientas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Barra_Herramientas;
    private javax.swing.JButton Btn_Cuatro;
    private javax.swing.JButton Btn_Dos;
    private javax.swing.JButton Btn_Tres;
    private javax.swing.JButton Btn_Uno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
