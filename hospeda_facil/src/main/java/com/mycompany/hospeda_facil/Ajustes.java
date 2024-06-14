/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author NEY SCHUNK ok
 */
public class Ajustes extends javax.swing.JFrame {
    public Ajustes() {
        initComponents();
        
        JButton[] buttons = {
        btnlistadeacomodacoes,btncadastrodeacomodacoes,btnlistadefuncinarios,btncadastrodefuncionarios,btnlistadehospede,btncadastrodehospede,
        btnlistadereserva,btnnovareserva,btnsair};
        Efeitos_Botoes.EfeitosBotoes(buttons);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnlistadeacomodacoes = new javax.swing.JButton();
        btncadastrodeacomodacoes = new javax.swing.JButton();
        btnlistadefuncinarios = new javax.swing.JButton();
        btncadastrodefuncionarios = new javax.swing.JButton();
        btnlistadehospede = new javax.swing.JButton();
        btncadastrodehospede = new javax.swing.JButton();
        btnlistadereserva = new javax.swing.JButton();
        btnnovareserva = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        lblajustes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlistadeacomodacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadeacomodacoesActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistadeacomodacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 80, 230, 44));

        btncadastrodeacomodacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrodeacomodacoesActionPerformed(evt);
            }
        });
        jPanel1.add(btncadastrodeacomodacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 130, 270, 44));

        btnlistadefuncinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadefuncinariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistadefuncinarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 181, 215, 44));

        btncadastrodefuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrodefuncionariosActionPerformed(evt);
            }
        });
        jPanel1.add(btncadastrodefuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 230, 237, 44));

        btnlistadehospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadehospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistadehospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 283, 176, 44));

        btncadastrodehospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrodehospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btncadastrodehospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 333, 220, 44));

        btnlistadereserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadereservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistadereserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 383, 170, 44));

        btnnovareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovareservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 433, 140, 44));

        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        jPanel1.add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 480, 100, 44));

        lblajustes.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Ajustes.png")); // NOI18N
        jPanel1.add(lblajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1200, 665));

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

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnlistadeacomodacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadeacomodacoesActionPerformed
        Ajustes.this.dispose();
        Lista_de_Acomodações objeto2 = new Lista_de_Acomodações();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnlistadeacomodacoesActionPerformed

    private void btncadastrodeacomodacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrodeacomodacoesActionPerformed
        Ajustes.this.dispose();
        Cadastro_de_Acomodação objeto2 = new Cadastro_de_Acomodação();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btncadastrodeacomodacoesActionPerformed

    private void btnlistadefuncinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadefuncinariosActionPerformed
        Ajustes.this.dispose();
        Lista_de_Funcionários objeto2 = new Lista_de_Funcionários();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnlistadefuncinariosActionPerformed

    private void btncadastrodefuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrodefuncionariosActionPerformed
        Ajustes.this.dispose();
        Cadastro_de_Funcionario objeto2 = new Cadastro_de_Funcionario();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btncadastrodefuncionariosActionPerformed

    private void btnlistadehospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadehospedeActionPerformed
        Ajustes.this.dispose();
        Lista_de_Hóspede objeto2 = new Lista_de_Hóspede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnlistadehospedeActionPerformed

    private void btncadastrodehospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrodehospedeActionPerformed
        Ajustes.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btncadastrodehospedeActionPerformed

    private void btnlistadereservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadereservaActionPerformed
        Ajustes.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnlistadereservaActionPerformed

    private void btnnovareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovareservaActionPerformed
        Ajustes.this.dispose();
        Nova_Reserva objeto2 = new Nova_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovareservaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajustes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrodeacomodacoes;
    private javax.swing.JButton btncadastrodefuncionarios;
    private javax.swing.JButton btncadastrodehospede;
    private javax.swing.JButton btnlistadeacomodacoes;
    private javax.swing.JButton btnlistadefuncinarios;
    private javax.swing.JButton btnlistadehospede;
    private javax.swing.JButton btnlistadereserva;
    private javax.swing.JButton btnnovareserva;
    private javax.swing.JButton btnsair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblajustes;
    // End of variables declaration//GEN-END:variables
}
