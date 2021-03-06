/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author Info7
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        grupoTemp = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        cmdConvertir = new javax.swing.JButton();
        cboMedida = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        jPanel = new javax.swing.JPanel();
        optC = new javax.swing.JRadioButton();
        optF = new javax.swing.JRadioButton();
        optK = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdConvertir.setText("Convertir");
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });

        cboMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        cboMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMedidaActionPerformed(evt);
            }
        });

        jLabel1.setText("De grados...");

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Convertir a grados"));

        grupoTemp.add(optC);
        optC.setText("Celsius");
        optC.setToolTipText("");
        optC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCActionPerformed(evt);
            }
        });

        grupoTemp.add(optF);
        optF.setText("Fahrenheit");
        optF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFActionPerformed(evt);
            }
        });

        grupoTemp.add(optK);
        optK.setText("Kelvin");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optC)
                    .addComponent(optF)
                    .addComponent(optK))
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optK)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2.setText("Temperatura en");

        lblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMedida, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                            .addComponent(txtTemp, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdConvertir)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(cmdConvertir)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed
    String Resultado = null;
    double temp = 0;
    Conversor convertir = new Conversor();
        if (txtTemp.getText().length() != 0) {
            temp = Double.parseDouble(txtTemp.getText());
            if (cboMedida.getSelectedItem().toString().equals("Celsius")&& optF.isSelected()){
                Resultado = String.valueOf(convertir.CelsiusToFahrenheit(temp)); 
            }
            if (cboMedida.getSelectedItem().toString().equals("Celsius")&& optK.isSelected()){
                Resultado = String.valueOf(convertir.CelsiusToKelvin(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")&& optC.isSelected()){
                Resultado = String.valueOf(convertir.FahrenheitToCelsius(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")&& optK.isSelected()){
                Resultado = String.valueOf(convertir.FahrenheitToKelvin(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Kelvin")&& optC.isSelected()){
                Resultado = String.valueOf(convertir.KelvinToCelsius(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Kelvin")&& optF.isSelected()){
                Resultado = String.valueOf(convertir.KelvinToFahrenheit(temp));
            }
            
          lblResultado.setText(Resultado);
            
        }  else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor de temperatura");
        }
        
     
            
        
         
      
    }//GEN-LAST:event_cmdConvertirActionPerformed

    private void cboMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedidaActionPerformed

    private void optCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCActionPerformed

    }//GEN-LAST:event_optCActionPerformed

    private void optFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optFActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cboMedida;
    public javax.swing.JButton cmdConvertir;
    public javax.swing.ButtonGroup grupoTemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JLabel lblResultado;
    public javax.swing.JRadioButton optC;
    public javax.swing.JRadioButton optF;
    public javax.swing.JRadioButton optK;
    public javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
