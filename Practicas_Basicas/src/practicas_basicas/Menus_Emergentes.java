package practicas_basicas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Hack
 */
public class Menus_Emergentes extends javax.swing.JFrame {

    public Menus_Emergentes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Emergente = new javax.swing.JPopupMenu();
        Menu_Rojo = new javax.swing.JMenuItem();
        Menu_Verde = new javax.swing.JMenuItem();
        Menu_Azul = new javax.swing.JMenuItem();

        Menu_Rojo.setText("Rojo");
        Menu_Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_RojoActionPerformed(evt);
            }
        });
        Menu_Emergente.add(Menu_Rojo);

        Menu_Verde.setText("Verde");
        Menu_Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_VerdeActionPerformed(evt);
            }
        });
        Menu_Emergente.add(Menu_Verde);

        Menu_Azul.setText("Azul");
        Menu_Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AzulActionPerformed(evt);
            }
        });
        Menu_Emergente.add(Menu_Azul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==1){
           JOptionPane.showMessageDialog(null,"Pulso el izquierdo");
        }
        else if(evt.getButton()==2)  {
               JOptionPane.showMessageDialog(null,"Pulso el central");
        }
        else if(evt.getButton()==3) {
               Menu_Emergente.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    private void Menu_RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_RojoActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.RED); //importar java.awt.Color;
    }//GEN-LAST:event_Menu_RojoActionPerformed

    private void Menu_VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_VerdeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_Menu_VerdeActionPerformed

    private void Menu_AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AzulActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_Menu_AzulActionPerformed

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
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus_Emergentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus_Emergentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Azul;
    private javax.swing.JPopupMenu Menu_Emergente;
    private javax.swing.JMenuItem Menu_Rojo;
    private javax.swing.JMenuItem Menu_Verde;
    // End of variables declaration//GEN-END:variables
}
