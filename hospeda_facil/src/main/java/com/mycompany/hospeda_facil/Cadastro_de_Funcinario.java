/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Cadastro_de_Funcinario extends javax.swing.JFrame {
    public Cadastro_de_Funcinario() {
        initComponents();
        transformarTextFieldstransparente();
        transformarButtostransparente();

    }
    private void transformarTextFieldstransparente() {
    JTextField[] textFields = {
        txtfnome, txtfrg, txtfcpf, ftxtfdatanascimento,
        txtfnumerotelefone, txtfemail, txtfcep, txtfestado,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento, txtfobservacoes,
        txtfcargo,ftxtfdataadimisão,ftxtfdataemissaocarteira,
        txtfbanco,txtfagencia,txtfconta,txtnnumerofuncionario
        };
        for (int i=0; i<textFields.length; i++) {
            JTextField txtf = textFields[i];
            txtf.setOpaque(false);
            txtf.setBackground(new Color(0, 0, 0, 0));
        }
    }
    private void transformarButtostransparente() {
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

        jPanel1 = new javax.swing.JPanel();
        txtfnome = new javax.swing.JTextField();
        txtfrg = new javax.swing.JTextField();
        txtfcpf = new javax.swing.JTextField();
        txtfnumerotelefone = new javax.swing.JTextField();
        txtfemail = new javax.swing.JTextField();
        txtfcep = new javax.swing.JTextField();
        txtfestado = new javax.swing.JTextField();
        txtfcidade = new javax.swing.JTextField();
        txtfbairro = new javax.swing.JTextField();
        txtfrua = new javax.swing.JTextField();
        txtfcomplemento = new javax.swing.JTextField();
        txtfobservacoes = new javax.swing.JTextField();
        btnfinalizarcadastro = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnrmasculino = new javax.swing.JRadioButton();
        btnrfeminino = new javax.swing.JRadioButton();
        btnroutros = new javax.swing.JRadioButton();
        txtfcargo = new javax.swing.JTextField();
        txtfbanco = new javax.swing.JTextField();
        txtfagencia = new javax.swing.JTextField();
        txtfconta = new javax.swing.JTextField();
        btnreserva = new javax.swing.JButton();
        rbtnstatus = new javax.swing.JRadioButton();
        txtnnumerofuncionario = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        ftxtfdataadimisão = new javax.swing.JFormattedTextField();
        ftxtfdataemissaocarteira = new javax.swing.JFormattedTextField();
        ftxtfdatanascimento = new javax.swing.JFormattedTextField();
        lblimagemcadastrofuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnome.setBorder(null);
        jPanel1.add(txtfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 109, 450, 30));

        txtfrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrg.setBorder(null);
        jPanel1.add(txtfrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 108, 140, 30));

        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        txtfcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcpfFocusLost(evt);
            }
        });
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 30));

        txtfnumerotelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerotelefone.setBorder(null);
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 231, 170, 30));

        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 231, 420, 30));

        txtfcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcep.setBorder(null);
        jPanel1.add(txtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 300, 150, 30));

        txtfestado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfestado.setBorder(null);
        jPanel1.add(txtfestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 298, 250, 30));

        txtfcidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcidade.setBorder(null);
        jPanel1.add(txtfcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 297, 250, 30));

        txtfbairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbairro.setBorder(null);
        jPanel1.add(txtfbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 333, 290, 30));

        txtfrua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrua.setBorder(null);
        jPanel1.add(txtfrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 331, 460, 30));

        txtfcomplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcomplemento.setBorder(null);
        jPanel1.add(txtfcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 369, 610, 30));

        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 740, 60));

        btnfinalizarcadastro.setBorder(null);
        btnfinalizarcadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnfinalizarcadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfinalizarcadastroMouseExited(evt);
            }
        });
        btnfinalizarcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarcadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizarcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 230, 50));

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

        btnrmasculino.setBorder(null);
        btnrmasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrmasculinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 180, 20, -1));

        btnrfeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrfemininoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrfeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 179, -1, -1));

        btnroutros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnroutrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnroutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 179, -1, -1));

        txtfcargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcargo.setBorder(null);
        jPanel1.add(txtfcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 440, 140, 30));

        txtfbanco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbanco.setBorder(null);
        jPanel1.add(txtfbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 475, 120, 30));

        txtfagencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfagencia.setBorder(null);
        jPanel1.add(txtfagencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 475, 110, 30));

        txtfconta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfconta.setBorder(null);
        jPanel1.add(txtfconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 475, 240, 30));

        btnreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnreservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnreservaMouseExited(evt);
            }
        });
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));
        jPanel1.add(rbtnstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        txtnnumerofuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnnumerofuncionario.setBorder(null);
        txtnnumerofuncionario.setEnabled(false);
        jPanel1.add(txtnnumerofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 172, 110, 30));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 613, 170, 50));

        ftxtfdataadimisão.setBorder(null);
        try {
            ftxtfdataadimisão.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdataadimisão.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdataadimisão, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 140, 30));

        ftxtfdataemissaocarteira.setBorder(null);
        ftxtfdataemissaocarteira.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdataemissaocarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 130, 30));
        jPanel1.add(ftxtfdatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 180, 30));

        lblimagemcadastrofuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemcadastrofuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Cadastro_Funcionario.png")); // NOI18N
        jPanel1.add(lblimagemcadastrofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnrmasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrmasculinoMouseClicked
        btnrfeminino.setSelected(false);
        btnroutros.setSelected(false);
    }//GEN-LAST:event_btnrmasculinoMouseClicked

    private void btnrfemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrfemininoMouseClicked
        btnrmasculino.setSelected(false);
        btnroutros.setSelected(false);
    }//GEN-LAST:event_btnrfemininoMouseClicked

    private void btnroutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroutrosMouseClicked
        btnrmasculino.setSelected(false);
        btnrfeminino.setSelected(false);
    }//GEN-LAST:event_btnroutrosMouseClicked

    private void txtfcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfcpfFocusLost
        String cpf = txtfcpf.getText();
        cpf = cpf.replaceAll("[^0-9]", "");
        if (validarCPF(cpf)) {
        } else {
            JOptionPane.showMessageDialog(null,"ERRO: CPF invalido, Digite um numero valido!");
        }
    }//GEN-LAST:event_txtfcpfFocusLost

    private void btnreservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseEntered
        btnreserva.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnreservaMouseEntered

    private void btnreservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseExited
        btnreserva.setBorder(null);
    }//GEN-LAST:event_btnreservaMouseExited

    private void btnfinalizarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroActionPerformed
        try {
            
                String opcaoSelecionada = null;
            if (btnrmasculino.isSelected()) {
                opcaoSelecionada = "M";
            }else if (btnrfeminino.isSelected()) {
                opcaoSelecionada = "F";
            }else if (btnroutros.isSelected()) {
                opcaoSelecionada ="O";
            }
            String status = null;
            if (rbtnstatus.isSelected()) {
                status = "1";
            }else{status = "0";}
                
            
            
            Connection conexao = null;
            PreparedStatement statement = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO funcionarios(nome_funcionario,rg,cpf,data_nascimento,sexo,celular,email,cep,Estado,cidade,"
                    + "bairro,rua,complemento,cargo,data_admissao,data_emissao_carteira,banco,agencia,conta,status_funcionario,observecoes)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1,txtfnome.getText());
            statement.setString(2,txtfrg.getText());
            statement.setString(3,txtfcpf.getText());
            statement.setString(4,ftxtfdatanascimento.getText());
            statement.setString(5,opcaoSelecionada);
            statement.setString(6,txtfnumerotelefone.getText());
            statement.setString(7,txtfemail.getText());
            statement.setString(8,txtfcep.getText());
            statement.setString(9,txtfestado.getText());
            statement.setString(10,txtfcidade.getText());
            statement.setString(11,txtfbairro.getText());
            statement.setString(12,txtfrua.getText());
            statement.setString(13,txtfcomplemento.getText());
            statement.setString(14,txtfcargo.getText());
            statement.setString(15,ftxtfdataadimisão.getText());
            statement.setString(16,ftxtfdataemissaocarteira.getText());
            statement.setString(17,txtfbanco.getText());
            statement.setString(18,txtfagencia.getText());
            statement.setString(19,txtfconta.getText());
            statement.setString(20,status);
            statement.setString(21,txtfobservacoes.getText());
            
            
            
            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Funcinario.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btnfinalizarcadastroActionPerformed
    private boolean  validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        boolean digitosIguais = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                digitosIguais = false;
                break;
            }
        }
        if (digitosIguais) {
            return false;
        }
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 == 10 || digito1 == 11) {
            digito1 = 0;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 == 10 || digito2 == 11) {
            digito2 = 0;
        }
        return Character.getNumericValue(cpf.charAt(9)) == digito1 && Character.getNumericValue(cpf.charAt(10)) == digito2;
 }
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
            java.util.logging.Logger.getLogger(Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_de_Funcinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnfinalizarcadastro;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnreserva;
    private javax.swing.JRadioButton btnrfeminino;
    private javax.swing.JRadioButton btnrmasculino;
    private javax.swing.JRadioButton btnroutros;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdataadimisão;
    private javax.swing.JFormattedTextField ftxtfdataemissaocarteira;
    private javax.swing.JFormattedTextField ftxtfdatanascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagemcadastrofuncionario;
    private javax.swing.JRadioButton rbtnstatus;
    private javax.swing.JTextField txtfagencia;
    private javax.swing.JTextField txtfbairro;
    private javax.swing.JTextField txtfbanco;
    private javax.swing.JTextField txtfcargo;
    private javax.swing.JTextField txtfcep;
    private javax.swing.JTextField txtfcidade;
    private javax.swing.JTextField txtfcomplemento;
    private javax.swing.JTextField txtfconta;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfestado;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    private javax.swing.JTextField txtnnumerofuncionario;
    // End of variables declaration//GEN-END:variables

    
}
