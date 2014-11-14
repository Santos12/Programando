package practicas_basicas;

import java.awt.Color;

/**
 *
 * @author Hack
 */
public class Botones_de_Opcion extends javax.swing.JFrame {

    public Botones_de_Opcion() {
        initComponents(); //Constructor
        Opt_Rojo.setSelected(true); //setSelected permite activar o desactivar un boton de Opcion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_Colores = new javax.swing.ButtonGroup();
        Btn_Aceptar = new javax.swing.JButton();
        JPanel_Colores = new javax.swing.JPanel();
        Opt_Rojo = new javax.swing.JRadioButton();
        Opt_Verde = new javax.swing.JRadioButton();
        Opt_Azul = new javax.swing.JRadioButton();
        Lbl_Resultado = new javax.swing.JLabel();
        JPanel_Vista = new javax.swing.JPanel();
        Btn_Vista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Aceptar.setText("Aceptar");
        Btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceptarActionPerformed(evt);
            }
        });

        JPanel_Colores.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));

        Grupo_Colores.add(Opt_Rojo);
        Opt_Rojo.setText("Rojo");

        Grupo_Colores.add(Opt_Verde);
        Opt_Verde.setText("Verde");

        Grupo_Colores.add(Opt_Azul);
        Opt_Azul.setText("Azul");

        javax.swing.GroupLayout JPanel_ColoresLayout = new javax.swing.GroupLayout(JPanel_Colores);
        JPanel_Colores.setLayout(JPanel_ColoresLayout);
        JPanel_ColoresLayout.setHorizontalGroup(
            JPanel_ColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opt_Rojo)
                    .addComponent(Opt_Verde)
                    .addComponent(Opt_Azul))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        JPanel_ColoresLayout.setVerticalGroup(
            JPanel_ColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ColoresLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Opt_Rojo)
                .addGap(18, 18, 18)
                .addComponent(Opt_Verde)
                .addGap(18, 18, 18)
                .addComponent(Opt_Azul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lbl_Resultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JPanel_Vista.setBorder(javax.swing.BorderFactory.createTitledBorder("Vista Previa"));

        javax.swing.GroupLayout JPanel_VistaLayout = new javax.swing.GroupLayout(JPanel_Vista);
        JPanel_Vista.setLayout(JPanel_VistaLayout);
        JPanel_VistaLayout.setHorizontalGroup(
            JPanel_VistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_VistaLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(Btn_Vista, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        JPanel_VistaLayout.setVerticalGroup(
            JPanel_VistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_VistaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Btn_Vista, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPanel_Colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel_Vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JPanel_Vista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanel_Colores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceptarActionPerformed
        // TODO add your handling code here:
        String Msg="Color elegido es: ";
        
        if (Opt_Rojo.isSelected()) {
            Msg=Msg+"Rojo";
            Btn_Vista.setBackground(Color.RED);
        } else if (Opt_Verde.isSelected()) {
            Msg=Msg+"Verde";
            Btn_Vista.setBackground(Color.GREEN);
        } else if (Opt_Azul.isSelected()) {
            Msg=Msg+"Azul";
            Btn_Vista.setBackground(Color.BLUE);
        }
        
        Lbl_Resultado.setText(Msg);
        
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
            java.util.logging.Logger.getLogger(Botones_de_Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Botones_de_Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Botones_de_Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Botones_de_Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Botones_de_Opcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Aceptar;
    private javax.swing.JButton Btn_Vista;
    private javax.swing.ButtonGroup Grupo_Colores;
    private javax.swing.JPanel JPanel_Colores;
    private javax.swing.JPanel JPanel_Vista;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JRadioButton Opt_Azul;
    private javax.swing.JRadioButton Opt_Rojo;
    private javax.swing.JRadioButton Opt_Verde;
    // End of variables declaration//GEN-END:variables
}
