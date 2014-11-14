package practicas_basicas;

import javax.swing.JFileChooser;

/**
 *
 * @author Hack
 */
public class Manejo_de_JFileChooser extends javax.swing.JFrame {

    public Manejo_de_JFileChooser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        File_Chooser = new javax.swing.JFileChooser();
        Lbl_Direccion = new javax.swing.JLabel();
        Lbl_Url = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        Menu_Archivo = new javax.swing.JMenu();
        Menu_Abrir = new javax.swing.JMenuItem();
        Menu_Guardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Direccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Direccion.setText("Dirección:");

        Lbl_Url.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Url.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Menu_Archivo.setText("Archivo");

        Menu_Abrir.setText("Abrir");
        Menu_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AbrirActionPerformed(evt);
            }
        });
        Menu_Archivo.add(Menu_Abrir);

        Menu_Guardar.setText("Guardar");
        Menu_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_GuardarActionPerformed(evt);
            }
        });
        Menu_Archivo.add(Menu_Guardar);

        Barra_Menu.add(Menu_Archivo);

        setJMenuBar(Barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Url, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Url, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AbrirActionPerformed
        // TODO add your handling code here:
    int Busca=File_Chooser.showOpenDialog(this);
        
     if(Busca==JFileChooser.APPROVE_OPTION) { //importe javax.swing.JFileChooser
        Lbl_Url.setText(File_Chooser.getSelectedFile().toString());
       }
        else if(Busca==JFileChooser.CANCEL_OPTION) {
        Lbl_Url.setText("No se eligió ningún archivo");            
      }
    }//GEN-LAST:event_Menu_AbrirActionPerformed

    private void Menu_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_GuardarActionPerformed
        // TODO add your handling code here:
    int Guarda=File_Chooser.showSaveDialog(this);
        
     if(Guarda==JFileChooser.APPROVE_OPTION) {
        Lbl_Url.setText(File_Chooser.getSelectedFile().toString());
       }
        else if(Guarda==JFileChooser.CANCEL_OPTION) {
        Lbl_Url.setText("No se guardo ningun archivo");
        }
    }//GEN-LAST:event_Menu_GuardarActionPerformed
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
            java.util.logging.Logger.getLogger(Manejo_de_JFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_JFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_JFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manejo_de_JFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manejo_de_JFileChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JFileChooser File_Chooser;
    private javax.swing.JLabel Lbl_Direccion;
    private javax.swing.JLabel Lbl_Url;
    private javax.swing.JMenuItem Menu_Abrir;
    private javax.swing.JMenu Menu_Archivo;
    private javax.swing.JMenuItem Menu_Guardar;
    // End of variables declaration//GEN-END:variables
}
