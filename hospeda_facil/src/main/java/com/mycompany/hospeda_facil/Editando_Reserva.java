/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Editando_Reserva extends javax.swing.JFrame {
    public Editando_Reserva() {
        initComponents();
        transformarTextFieldstransparente();
        transformarButtostransparente();
        ftxtfdatafimreserva.setOpaque(false);
        ftxtfdatafimreserva.setBackground(new Color(0, 0, 0, 0));
        ftxtfdatainicioreserva.setOpaque(false);
        ftxtfdatainicioreserva.setBackground(new Color(0, 0, 0, 0));
         
    }
    private void transformarTextFieldstransparente() { //Deixando jTextFields trasparente
    JTextField[] textFields = {
        txtfcpf,txtfnomehospede,txtfvalordiaria,txtfnumeroadutos,
        txtfnumerocriancas,jTextField7,txtfacomodacao,txtnnumeroreserva
        };
        for (int i=0; i<textFields.length; i++) {
            JTextField txtf = textFields[i];
            txtf.setOpaque(false);
            txtf.setBackground(new Color(0, 0, 0, 0));
        }
    }
    private void transformarButtostransparente() { //Deixando jButtons trasparente
    JButton[] buttons = {
        btnsalvaralteracoes, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar
    };
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];                
            button.setOpaque(false);                    
            button.setBackground(new Color(0, 0, 0, 0));                       
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnsalvaralteracoes = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        ftxtfdatainicioreserva = new javax.swing.JFormattedTextField();
        ftxtfdatafimreserva = new javax.swing.JFormattedTextField();
        txtfcpf = new javax.swing.JTextField();
        txtfnomehospede = new javax.swing.JTextField();
        txtfvalordiaria = new javax.swing.JTextField();
        txtfnumeroadutos = new javax.swing.JTextField();
        txtfnumerocriancas = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtfacomodacao = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        txtnnumeroreserva = new javax.swing.JTextField();
        lbleditandoreserva = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalvaralteracoes.setBorder(null);
        btnsalvaralteracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalvaralteracoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalvaralteracoesMouseExited(evt);
            }
        });
        jPanel1.add(btnsalvaralteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 210, 50));

        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
            }
        });
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 29, 81, 82));

        btnhospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhospedeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhospedeMouseExited(evt);
            }
        });
        btnhospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 162, 77, 87));

        btnmapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmapaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmapaMouseExited(evt);
            }
        });
        btnmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmapaActionPerformed(evt);
            }
        });
        jPanel1.add(btnmapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 82, 64));

        btnajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnajustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnajustesMouseExited(evt);
            }
        });
        btnajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajustesActionPerformed(evt);
            }
        });
        jPanel1.add(btnajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 531, 82, 90));

        btnreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnreservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnreservaMouseExited(evt);
            }
        });
        btnreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));

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

        txtfnumeroadutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroadutos.setBorder(null);
        jPanel1.add(txtfnumeroadutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 357, 120, 30));

        txtfnumerocriancas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerocriancas.setBorder(null);
        jPanel1.add(txtfnumerocriancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 130, 30));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 580, 70));

        txtfacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfacomodacao.setBorder(null);
        jPanel1.add(txtfacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 241, 390, 30));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 570, 190, 50));

        txtnnumeroreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnnumeroreserva.setBorder(null);
        jPanel1.add(txtnnumeroreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 120, 30));

        lbleditandoreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbleditandoreserva.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Editando_Reserva.png")); // NOI18N
        jPanel1.add(lbleditandoreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    private void btnsalvaralteracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvaralteracoesMouseEntered
        btnsalvaralteracoes.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnsalvaralteracoesMouseEntered

    private void btnsalvaralteracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvaralteracoesMouseExited
        btnsalvaralteracoes.setBorder(null);
    }//GEN-LAST:event_btnsalvaralteracoesMouseExited

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
         btnmenu.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        btnmenu.setBorder(null);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnhospedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhospedeMouseEntered
        btnhospede.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnhospedeMouseEntered

    private void btnhospedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhospedeMouseExited
        btnhospede.setBorder(null);
    }//GEN-LAST:event_btnhospedeMouseExited

    private void btnmapaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmapaMouseEntered
        btnmapa.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnmapaMouseEntered

    private void btnmapaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmapaMouseExited
        btnmapa.setBorder(null);
    }//GEN-LAST:event_btnmapaMouseExited

    private void btnajustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnajustesMouseEntered
        btnajustes.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnajustesMouseEntered

    private void btnajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnajustesMouseExited
        btnajustes.setBorder(null);
    }//GEN-LAST:event_btnajustesMouseExited

    private void btnreservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseEntered
        btnreserva.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnreservaMouseEntered

    private void btnreservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseExited
        btnreserva.setBorder(null);
    }//GEN-LAST:event_btnreservaMouseExited

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Editando_Reserva.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Editando_Reserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Editando_Reserva.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Editando_Reserva.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Editando_Reserva.this.dispose();
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
            java.util.logging.Logger.getLogger(Editando_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editando_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnsalvaralteracoes;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdatafimreserva;
    private javax.swing.JFormattedTextField ftxtfdatainicioreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lbleditandoreserva;
    private javax.swing.JTextField txtfacomodacao;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfnomehospede;
    private javax.swing.JTextField txtfnumeroadutos;
    private javax.swing.JTextField txtfnumerocriancas;
    private javax.swing.JTextField txtfvalordiaria;
    private javax.swing.JTextField txtnnumeroreserva;
    // End of variables declaration//GEN-END:variables

    

    
}
