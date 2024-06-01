/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Nova_Reserva extends javax.swing.JFrame {
    public Nova_Reserva() {
        initComponents();
        
        JButton[] buttons = {
        btnfinalizarnovareserva, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnacomodação,
        btncpf,btnnovohospede,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        jTextField1,jTextField2,jTextField4,jTextField5,jTextField6,
        jTextField7,jTextField8,ftxtfdatafimreserva,ftxtfdatainicioreserva};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        
         
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ftxtfdatainicioreserva = new javax.swing.JFormattedTextField();
        ftxtfdatafimreserva = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        btncpf = new javax.swing.JButton();
        btnacomodação = new javax.swing.JButton();
        btnnovohospede = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnfinalizarnovareserva = new javax.swing.JButton();
        lblimagemnovareserva = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftxtfdatainicioreserva.setBorder(null);
        try {
            ftxtfdatainicioreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatainicioreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatainicioreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 193, 120, 30));

        ftxtfdatafimreserva.setBorder(null);
        try {
            ftxtfdatafimreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatafimreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatafimreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 193, 120, 30));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 240, 30));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 153, 290, 30));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 357, 120, 30));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 130, 30));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 580, 70));

        jTextField8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 241, 390, 30));

        btncpf.setBorder(null);
        jPanel1.add(btncpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 103, 40, 40));

        btnacomodação.setBorder(null);
        jPanel1.add(btnacomodação, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 240, 40, 40));

        btnnovohospede.setBorder(null);
        jPanel1.add(btnnovohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 200, 40));

        btnvoltar.setBorder(null);
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 570, 140, 50));

        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 29, 81, 82));

        btnhospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 162, 77, 87));

        btnreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));

        btnmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmapaActionPerformed(evt);
            }
        });
        jPanel1.add(btnmapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 82, 64));

        btnajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajustesActionPerformed(evt);
            }
        });
        jPanel1.add(btnajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 531, 82, 90));
        jPanel1.add(btnfinalizarnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 570, 200, 50));

        lblimagemnovareserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemnovareserva.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Nova_Reserva.png")); // NOI18N
        jPanel1.add(lblimagemnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Nova_Reserva.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Nova_Reserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Nova_Reserva.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Nova_Reserva.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Nova_Reserva.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed
    
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
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nova_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacomodação;
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btncpf;
    private javax.swing.JButton btnfinalizarnovareserva;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovohospede;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdatafimreserva;
    private javax.swing.JFormattedTextField ftxtfdatainicioreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblimagemnovareserva;
    // End of variables declaration//GEN-END:variables

    

    
}
