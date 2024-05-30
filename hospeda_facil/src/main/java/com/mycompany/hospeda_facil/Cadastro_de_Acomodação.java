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
public class Cadastro_de_Acomodação extends javax.swing.JFrame {
    public Cadastro_de_Acomodação() {
        initComponents();
        transformarTextFieldstransparente();
        transformarButtostransparente();
        
        
        
    }
    private void transformarTextFieldstransparente() { //Deixando jTextFields trasparente
    JTextField[] textFields = {
        txtfcapacidade,txtfnumeroacomodacao,txtfnomeacomodacao,txtfdescricao,
        txtfmotivobloqueio,ftxtfdatafinal,ftxtfdatainicio
        };
        for (int i=0; i<textFields.length; i++) {
            JTextField txtf = textFields[i];
            txtf.setOpaque(false);
            txtf.setBackground(new Color(0, 0, 0, 0));
        }
    }
    private void transformarButtostransparente() { //Deixando jButtons trasparente
    JButton[] buttons = {
        btnfinalizarcadastro, btnmenu, btnhospede,
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
        btnfinalizarcadastro = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnrindividual = new javax.swing.JRadioButton();
        btnrduplo = new javax.swing.JRadioButton();
        btnrtriplo = new javax.swing.JRadioButton();
        btnrsuite = new javax.swing.JRadioButton();
        txtfcapacidade = new javax.swing.JTextField();
        txtfnumeroacomodacao = new javax.swing.JTextField();
        txtfnomeacomodacao = new javax.swing.JTextField();
        txtfdescricao = new javax.swing.JTextField();
        btnrrestricao = new javax.swing.JRadioButton();
        txtfmotivobloqueio = new javax.swing.JTextField();
        cbxwifi = new javax.swing.JCheckBox();
        cbxarcondicionado = new javax.swing.JCheckBox();
        cbxtv = new javax.swing.JCheckBox();
        cbxfrigibar = new javax.swing.JCheckBox();
        cbxacessibilidade = new javax.swing.JCheckBox();
        ftxtfdatainicio = new javax.swing.JFormattedTextField();
        ftxtfdatafinal = new javax.swing.JFormattedTextField();
        btnvoltar = new javax.swing.JButton();
        lblimagemcadastroacomodacao = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfinalizarcadastro.setBorder(null);
        btnfinalizarcadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnfinalizarcadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfinalizarcadastroMouseExited(evt);
            }
        });
        jPanel1.add(btnfinalizarcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 230, 50));

        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
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
        jPanel1.add(btnhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 162, 77, 87));

        btnmapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmapaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmapaMouseExited(evt);
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
        jPanel1.add(btnajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 531, 82, 90));

        btnreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnreservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnreservaMouseExited(evt);
            }
        });
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));

        btnrindividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrindividualActionPerformed(evt);
            }
        });
        jPanel1.add(btnrindividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 114, -1, -1));

        btnrduplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrduploActionPerformed(evt);
            }
        });
        jPanel1.add(btnrduplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 114, -1, -1));

        btnrtriplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrtriploActionPerformed(evt);
            }
        });
        jPanel1.add(btnrtriplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 114, -1, -1));

        btnrsuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrsuiteActionPerformed(evt);
            }
        });
        jPanel1.add(btnrsuite, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 114, -1, -1));

        txtfcapacidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcapacidade.setBorder(null);
        jPanel1.add(txtfcapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 142, 100, 30));

        txtfnumeroacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroacomodacao.setBorder(null);
        jPanel1.add(txtfnumeroacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 176, 70, 30));

        txtfnomeacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnomeacomodacao.setBorder(null);
        jPanel1.add(txtfnomeacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 210, 30));

        txtfdescricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdescricao.setBorder(null);
        jPanel1.add(txtfdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 550, 30));

        btnrrestricao.setBorder(null);
        jPanel1.add(btnrrestricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 367, -1, -1));

        txtfmotivobloqueio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfmotivobloqueio.setBorder(null);
        jPanel1.add(txtfmotivobloqueio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 630, 30));
        jPanel1.add(cbxwifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 250, -1, -1));
        jPanel1.add(cbxarcondicionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 249, -1, -1));
        jPanel1.add(cbxtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));
        jPanel1.add(cbxfrigibar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 250, -1, -1));
        jPanel1.add(cbxacessibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        ftxtfdatainicio.setBorder(null);
        try {
            ftxtfdatainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatainicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 438, 120, 30));

        ftxtfdatafinal.setBorder(null);
        try {
            ftxtfdatafinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatafinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 438, 120, 30));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 583, 150, 50));

        lblimagemcadastroacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemcadastroacomodacao.setIcon(new javax.swing.ImageIcon("D:\\Users\\vschunk\\Desktop\\GERENCIAMENTO_HOSPEDAGEM\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Cadastro_Acomodação.png")); // NOI18N
        jPanel1.add(lblimagemcadastroacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

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

    private void btnfinalizarcadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroMouseEntered
        btnfinalizarcadastro.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnfinalizarcadastroMouseEntered

    private void btnfinalizarcadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroMouseExited
        btnfinalizarcadastro.setBorder(null);
    }//GEN-LAST:event_btnfinalizarcadastroMouseExited

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

    private void btnrindividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrindividualActionPerformed
        // TODO add your handling code here:
        btnrduplo.setSelected(false);
        btnrtriplo.setSelected(false);
        btnrsuite.setSelected(false);
    }//GEN-LAST:event_btnrindividualActionPerformed

    private void btnrduploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrduploActionPerformed
        // TODO add your handling code here:
        btnrindividual.setSelected(false);
        btnrtriplo.setSelected(false);
        btnrsuite.setSelected(false);
    }//GEN-LAST:event_btnrduploActionPerformed

    private void btnrtriploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrtriploActionPerformed
        // TODO add your handling code here:
        btnrduplo.setSelected(false);
        btnrindividual.setSelected(false);
        btnrsuite.setSelected(false);
    }//GEN-LAST:event_btnrtriploActionPerformed

    private void btnrsuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrsuiteActionPerformed
        // TODO add your handling code here:
        btnrduplo.setSelected(false);
        btnrtriplo.setSelected(false);
        btnrindividual.setSelected(false);
    }//GEN-LAST:event_btnrsuiteActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cadastro_de_Acomodação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Acomodação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Acomodação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Acomodação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_de_Acomodação().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnfinalizarcadastro;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JRadioButton btnrduplo;
    private javax.swing.JButton btnreserva;
    private javax.swing.JRadioButton btnrindividual;
    private javax.swing.JRadioButton btnrrestricao;
    private javax.swing.JRadioButton btnrsuite;
    private javax.swing.JRadioButton btnrtriplo;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JCheckBox cbxacessibilidade;
    private javax.swing.JCheckBox cbxarcondicionado;
    private javax.swing.JCheckBox cbxfrigibar;
    private javax.swing.JCheckBox cbxtv;
    private javax.swing.JCheckBox cbxwifi;
    private javax.swing.JFormattedTextField ftxtfdatafinal;
    private javax.swing.JFormattedTextField ftxtfdatainicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblimagemcadastroacomodacao;
    private javax.swing.JTextField txtfcapacidade;
    private javax.swing.JTextField txtfdescricao;
    private javax.swing.JTextField txtfmotivobloqueio;
    private javax.swing.JTextField txtfnomeacomodacao;
    private javax.swing.JTextField txtfnumeroacomodacao;
    // End of variables declaration//GEN-END:variables

    

    
}
