package practicas_basicas;
/**
 *
 * @author Hack
 */
public class Oper_Bas extends javax.swing.JFrame {
    public Oper_Bas() {
        initComponents();
    }

void Sumar(){
    String Val1, Val2;
    int a,b,Suma;
    
    Val1 = Txt_Numero1.getText(); //se obtiene el valor mediante getText
    Val2 = Txt_Numero2.getText(); //se obtiene el valor mediante getText
    a = Integer.parseInt(Val1);   //se convierte el valor a entero
    b = Integer.parseInt(Val2);   //se convierte el valor a entero
    Suma=a+b;                     //se realiza la operacion de suma 
    Lbl_Resultado.setText(""+Suma);
}

void Restar(){
    String Val1, Val2;
    int a,b,Resta;
    
    Val1 = Txt_Numero1.getText();
    Val2 = Txt_Numero2.getText();
    a = Integer.parseInt(Val1);
    b = Integer.parseInt(Val2);
    Resta=a-b;
    Lbl_Resultado.setText(""+Resta);
}

void Borrar(){
    Txt_Numero1.setText("");
    Txt_Numero2.setText("");
    Lbl_Resultado.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_Resultado = new javax.swing.JLabel();
        Txt_Numero1 = new javax.swing.JTextField();
        Txt_Numero2 = new javax.swing.JTextField();
        Btn_Sumar = new javax.swing.JButton();
        Btn_Restar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Oper = new javax.swing.JMenu();
        Item_Sumar = new javax.swing.JMenuItem();
        Item_Restar = new javax.swing.JMenuItem();
        Item_Borrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número 1:");

        jLabel2.setText("Número 2:");

        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Txt_Numero1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Txt_Numero1.setText("0");
        Txt_Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Numero1ActionPerformed(evt);
            }
        });

        Txt_Numero2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Txt_Numero2.setText("0");
        Txt_Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Numero2ActionPerformed(evt);
            }
        });

        Btn_Sumar.setText("Sumar");
        Btn_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SumarActionPerformed(evt);
            }
        });

        Btn_Restar.setText("Restar");
        Btn_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestarActionPerformed(evt);
            }
        });

        Btn_Borrar.setText("Borrar");
        Btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BorrarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        Menu_Oper.setText("OperBasic");

        Item_Sumar.setText("Sumar");
        Item_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SumarActionPerformed(evt);
            }
        });
        Menu_Oper.add(Item_Sumar);

        Item_Restar.setText("Restar");
        Item_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_RestarActionPerformed(evt);
            }
        });
        Menu_Oper.add(Item_Restar);

        Item_Borrar.setText("Borrar");
        Item_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_BorrarActionPerformed(evt);
            }
        });
        Menu_Oper.add(Item_Borrar);

        jMenu1.add(Menu_Oper);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Numero1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Numero2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Sumar)
                    .addComponent(Btn_Restar)
                    .addComponent(Btn_Borrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SumarActionPerformed
        // TODO add your handling code here:
        Sumar();
    }//GEN-LAST:event_Item_SumarActionPerformed

    private void Btn_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SumarActionPerformed
        // TODO add your handling code here:
        Sumar();
    }//GEN-LAST:event_Btn_SumarActionPerformed

    private void Txt_Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Numero1ActionPerformed

    private void Txt_Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Numero2ActionPerformed
        // TODO add your handling code here:
        Sumar();
    }//GEN-LAST:event_Txt_Numero2ActionPerformed

    private void Item_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_RestarActionPerformed
        // TODO add your handling code here:
        Restar();
    }//GEN-LAST:event_Item_RestarActionPerformed

    private void Btn_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestarActionPerformed
        // TODO add your handling code here:
        Restar();
    }//GEN-LAST:event_Btn_RestarActionPerformed

    private void Item_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_BorrarActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_Item_BorrarActionPerformed

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_Btn_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Oper_Bas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oper_Bas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oper_Bas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oper_Bas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oper_Bas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Restar;
    private javax.swing.JButton Btn_Sumar;
    private javax.swing.JMenuItem Item_Borrar;
    private javax.swing.JMenuItem Item_Restar;
    private javax.swing.JMenuItem Item_Sumar;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JMenu Menu_Oper;
    private javax.swing.JTextField Txt_Numero1;
    private javax.swing.JTextField Txt_Numero2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
