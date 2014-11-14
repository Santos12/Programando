package practicas_basicas;
/**
 *
 * @author Hack
 */
public class Togglebuttons extends javax.swing.JFrame {
    public Togglebuttons() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Txt_PrecioInicial = new javax.swing.JTextField();
        Tgb_Instalacion = new javax.swing.JToggleButton();
        Tgb_Formacion = new javax.swing.JToggleButton();
        Tgb_Alimentacion = new javax.swing.JToggleButton();
        Lbl_PrecioInstalacion = new javax.swing.JLabel();
        Lbl_PrecioFormacion = new javax.swing.JLabel();
        Lbl_PrecioAlimentacionBd = new javax.swing.JLabel();
        Btn_Calcular = new javax.swing.JButton();
        Lbl_Total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Precio Base");

        Tgb_Instalacion.setText("Instalación");

        Tgb_Formacion.setText("Formación");

        Tgb_Alimentacion.setText("Alimentación de BD");

        Lbl_PrecioInstalacion.setText("40");

        Lbl_PrecioFormacion.setText("200");

        Lbl_PrecioAlimentacionBd.setText("200");

        Btn_Calcular.setText("Calcular");
        Btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CalcularActionPerformed(evt);
            }
        });

        Lbl_Total.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_PrecioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Tgb_Instalacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tgb_Formacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tgb_Alimentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_PrecioInstalacion)
                            .addComponent(Lbl_PrecioFormacion)
                            .addComponent(Lbl_PrecioAlimentacionBd)))
                    .addComponent(Btn_Calcular)
                    .addComponent(Lbl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_PrecioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tgb_Instalacion)
                    .addComponent(Lbl_PrecioInstalacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tgb_Formacion)
                    .addComponent(Lbl_PrecioFormacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tgb_Alimentacion)
                    .addComponent(Lbl_PrecioAlimentacionBd))
                .addGap(34, 34, 34)
                .addComponent(Btn_Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CalcularActionPerformed
        // TODO add your handling code here:    
        double precio_base = Double.parseDouble(Txt_PrecioInicial.getText());
        double precio_instal = Double.parseDouble(Lbl_PrecioInstalacion.getText());
        double precio_for = Double.parseDouble(Lbl_PrecioFormacion.getText());
        double precio_ali = Double.parseDouble(Lbl_PrecioAlimentacionBd.getText());       
    //Al precio base se le van añadiendo precio de extras según estén o no activados los JToggleButtons      
    double precio_total = precio_base;       
    if(Tgb_Instalacion.isSelected()) { //Si se seleccionó instalación
        precio_total = precio_total+precio_instal;
    }     
        if(Tgb_Formacion.isSelected()) { //Si se seleccionó formación
        precio_total = precio_total+precio_for;            
        }        
            if(Tgb_Alimentacion.isSelected()) { //Si se seleccionó Alimentación BD
             precio_total = precio_total+precio_ali;
            }            
            Lbl_Total.setText(precio_total+" $");

    }//GEN-LAST:event_Btn_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Togglebuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Togglebuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Togglebuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Togglebuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Togglebuttons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Calcular;
    private javax.swing.JLabel Lbl_PrecioAlimentacionBd;
    private javax.swing.JLabel Lbl_PrecioFormacion;
    private javax.swing.JLabel Lbl_PrecioInstalacion;
    private javax.swing.JLabel Lbl_Total;
    private javax.swing.JToggleButton Tgb_Alimentacion;
    private javax.swing.JToggleButton Tgb_Formacion;
    private javax.swing.JToggleButton Tgb_Instalacion;
    private javax.swing.JTextField Txt_PrecioInicial;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
