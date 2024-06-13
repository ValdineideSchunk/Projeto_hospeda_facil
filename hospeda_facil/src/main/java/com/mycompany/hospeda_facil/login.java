/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class login extends javax.swing.JFrame {

    String usuario = "1234";
    String senha = "1234";
    public login() {
        initComponents();
        
        JButton[] buttons = {
        btnfazerlogin};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfusuario,ptxtfsenha};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnfazerlogin = new javax.swing.JButton();
        txtfusuario = new javax.swing.JTextField();
        ptxtfsenha = new javax.swing.JPasswordField();
        lbllogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfazerlogin.setBorder(null);
        btnfazerlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfazerloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnfazerlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 130, 50));

        txtfusuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfusuario.setBorder(null);
        jPanel1.add(txtfusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 275, 360, 40));

        ptxtfsenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ptxtfsenha.setBorder(null);
        jPanel1.add(ptxtfsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 383, 360, 30));

        lbllogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbllogin.setIcon(new javax.swing.ImageIcon("D:\\Users\\vschunk\\Desktop\\GERENCIAMENTO_HOSPEDAGEM\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Login.png")); // NOI18N
        jPanel1.add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnfazerloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfazerloginActionPerformed
        try {
            String campousuario = txtfusuario.getText();
            String camposenha = ptxtfsenha.getText();
            
            if (!validarCPFExistenteBanco.validarCPFExistentefuncionario(txtfusuario.getText())) {
                JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            if(campousuario.equals(camposenha)){
                login.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            }else{
                 JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfazerloginActionPerformed

    
    
    
    
    
    

    // Código a ser executado se os valores não forem iguais
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfazerlogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JPasswordField ptxtfsenha;
    private javax.swing.JTextField txtfusuario;
    // End of variables declaration//GEN-END:variables
}
