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
public class Visualizando_Reserva_Antes_Check_in extends javax.swing.JFrame {
    public Visualizando_Reserva_Antes_Check_in() {
        initComponents();
        
        JButton[] buttons = {
        btneditarreserva, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btncancelarreserva,
        btnvoltar,btncheckin};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfcpf,txtfnomehospede,txtfvalordiaria,txtfnumeroadultos,txtfnumerocriacas,
        observacoes,txtfacomodacao,txtfnumeroreserva,ftxtfdatafimreserva,ftxtfdatainicioreserva};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
         
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ftxtfdatainicioreserva = new javax.swing.JFormattedTextField();
        ftxtfdatafimreserva = new javax.swing.JFormattedTextField();
        txtfcpf = new javax.swing.JTextField();
        txtfnomehospede = new javax.swing.JTextField();
        txtfvalordiaria = new javax.swing.JTextField();
        txtfnumeroadultos = new javax.swing.JTextField();
        txtfnumerocriacas = new javax.swing.JTextField();
        observacoes = new javax.swing.JTextField();
        txtfacomodacao = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        txtfnumeroreserva = new javax.swing.JTextField();
        btncancelarreserva = new javax.swing.JButton();
        btncheckin = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btneditarreserva = new javax.swing.JButton();
        lblimagemvisualizandoReservaAntesCheck_in = new javax.swing.JLabel();

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

        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 240, 30));

        txtfnomehospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnomehospede.setBorder(null);
        txtfnomehospede.setEnabled(false);
        jPanel1.add(txtfnomehospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 153, 290, 30));

        txtfvalordiaria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfvalordiaria.setBorder(null);
        jPanel1.add(txtfvalordiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        txtfnumeroadultos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroadultos.setBorder(null);
        jPanel1.add(txtfnumeroadultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 357, 120, 30));

        txtfnumerocriacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerocriacas.setBorder(null);
        jPanel1.add(txtfnumerocriacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 130, 30));

        observacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        observacoes.setBorder(null);
        jPanel1.add(observacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 580, 70));

        txtfacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfacomodacao.setBorder(null);
        jPanel1.add(txtfacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 390, 30));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 150, 50));

        txtfnumeroreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroreserva.setBorder(null);
        jPanel1.add(txtfnumeroreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 290, 30));
        jPanel1.add(btncancelarreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 260, 50));
        jPanel1.add(btncheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 587, 170, 50));

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
        jPanel1.add(btneditarreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 250, 50));

        lblimagemvisualizandoReservaAntesCheck_in.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemvisualizandoReservaAntesCheck_in.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Visualizando_Reserva_Antes_Check-in.png")); // NOI18N
        jPanel1.add(lblimagemvisualizandoReservaAntesCheck_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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
        Visualizando_Reserva_Antes_Check_in.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Visualizando_Reserva_Antes_Check_in.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Visualizando_Reserva_Antes_Check_in.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Visualizando_Reserva_Antes_Check_in.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Visualizando_Reserva_Antes_Check_in.this.dispose();
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
            java.util.logging.Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizando_Reserva_Antes_Check_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btncancelarreserva;
    private javax.swing.JButton btncheckin;
    private javax.swing.JButton btneditarreserva;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdatafimreserva;
    private javax.swing.JFormattedTextField ftxtfdatainicioreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblimagemvisualizandoReservaAntesCheck_in;
    private javax.swing.JTextField observacoes;
    private javax.swing.JTextField txtfacomodacao;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfnomehospede;
    private javax.swing.JTextField txtfnumeroadultos;
    private javax.swing.JTextField txtfnumerocriacas;
    private javax.swing.JTextField txtfnumeroreserva;
    private javax.swing.JTextField txtfvalordiaria;
    // End of variables declaration//GEN-END:variables

    

    
}
