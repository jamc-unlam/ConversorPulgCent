/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisin
 */
public class ConversorCentPulg extends javax.swing.JFrame {

    
    
    private Boolean convAPulgadas=true;
    /**
     * Creates new form ConversorCentPulg
     */
    public ConversorCentPulg() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        centimetrosTextField = new javax.swing.JTextField();
        pulgadasTextField = new javax.swing.JTextField();
        convertirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Centímetros");

        jLabel2.setText("Pulgadas");

        centimetrosTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                centimetrosTextFieldFocusLost(evt);
            }
        });
        centimetrosTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                centimetrosTextFieldKeyPressed(evt);
            }
        });

        pulgadasTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pulgadasTextFieldFocusLost(evt);
            }
        });
        pulgadasTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulgadasTextFieldKeyPressed(evt);
            }
        });

        convertirButton.setText("Convertir");
        convertirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pulgadasTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(centimetrosTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertirButton)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(centimetrosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pulgadasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(convertirButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centimetrosTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_centimetrosTextFieldFocusLost
        // TODO add your handling code here:
        convAPulgadas=true;
    }//GEN-LAST:event_centimetrosTextFieldFocusLost

    private void convertirAPulg(){
        
        String centimetrosString = centimetrosTextField.getText();
        
        if (!centimetrosString.isEmpty() ) {

            centimetrosString = centimetrosString.replace(',', '.');

            double centimetros;

            try{
                centimetros = Double.valueOf(centimetrosString);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "El valor ingresado no conforma un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double pulgadas = centimetros/2.54;

            String pulgadasString = String.format("%.2f", pulgadas);

            pulgadasTextField.setText(pulgadasString);
        }
        else 
            JOptionPane.showMessageDialog(this, "No se ingrese nada", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void convACentim()
    {
        String pulgadasString = pulgadasTextField.getText();
        
         if (!pulgadasString.isEmpty() ) {
        
            pulgadasString = pulgadasString.replace(',', '.');

            double pulgadas;

            try
            {
                pulgadas = Double.valueOf(pulgadasString);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "El valor ingresado no conforma un número", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }        

            double centimetros = pulgadas*2.54;

            String centimetrosString = String.format("%.2f", centimetros);

            centimetrosTextField.setText(centimetrosString);
         }
         else
             JOptionPane.showMessageDialog(this, "No se ingrese nada", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void convertirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtonActionPerformed
        // TODO add your handling code here:
        if(convAPulgadas)
        {
            convertirAPulg();
        }
        else
        {
            convACentim();
        }
    }//GEN-LAST:event_convertirButtonActionPerformed

    private void pulgadasTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pulgadasTextFieldFocusLost
        // TODO add your handling code here:
        convAPulgadas=false;
    }//GEN-LAST:event_pulgadasTextFieldFocusLost

    private void centimetrosTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_centimetrosTextFieldKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            {
                convertirAPulg();
            }
    }//GEN-LAST:event_centimetrosTextFieldKeyPressed

    private void pulgadasTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pulgadasTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            convACentim();
        }
    }//GEN-LAST:event_pulgadasTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ConversorCentPulg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorCentPulg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorCentPulg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorCentPulg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorCentPulg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField centimetrosTextField;
    private javax.swing.JButton convertirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField pulgadasTextField;
    // End of variables declaration//GEN-END:variables
}
