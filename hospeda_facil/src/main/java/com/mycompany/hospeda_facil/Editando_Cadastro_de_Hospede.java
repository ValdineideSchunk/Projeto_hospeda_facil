/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import static com.mycompany.hospeda_facil.Lista_de_Funcionários.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Editando_Cadastro_de_Hospede extends javax.swing.JFrame {
    int idHospede = Integer.parseInt(id);
    public Editando_Cadastro_de_Hospede() {
        initComponents();
        DetalhesHospede();
        JButton[] buttons = {
        btnsalvaralteracoes, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfnome, txtfrg, txtfcpf, txtfdatanascimento,
        txtfnumerotelefone, txtfemail, txtfcep, txtfestado,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento,
        txtfobservacoes,txtfnumerohospede};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        
        
        
        
    }
    public void DetalhesHospede(){
        
        try {
            Connection conexao = null;
            PreparedStatement declaracaoPreparada = null;
            ResultSet resultado = null;

            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);

            declaracaoPreparada = conexao.prepareStatement(
                    "SELECT * FROM hospedes WHERE id_hospede = ?");
            declaracaoPreparada.setInt(1, idHospede);
            resultado = declaracaoPreparada.executeQuery();

            if (resultado.next()) {
                
                try {
                    String sexo = resultado.getString("sexo");
                    if("Masculino".equals(sexo)){
                        btnrmasculino.setSelected(true);
                    }else if("Feminino".equals(sexo)){
                        btnrfeminino.setSelected(true);
                    }else if("Outro".equals(sexo)){
                        btnroutros.setSelected(true);
                    }
                    
                    txtfnumerohospede.setText(resultado.getString("id_hospede"));
                    txtfnome.setText(resultado.getString("nome_hospede"));
                    txtfrg.setText(resultado.getString("rg"));
                    txtfcpf.setText(resultado.getString("cpf"));
                    txtfnumerotelefone.setText(resultado.getString("celular"));
                    txtfemail.setText(resultado.getString("email"));
                    txtfcep.setText(resultado.getString("cep"));
                    txtfestado.setText(resultado.getString("estado"));
                    txtfcidade.setText(resultado.getString("cidade"));
                    txtfbairro.setText(resultado.getString("bairro"));
                    txtfrua.setText(resultado.getString("rua"));
                    txtfcomplemento.setText(resultado.getString("complemento"));
                    txtfobservacoes.setText(resultado.getString("observacoes"));
                    
                    
                    
                    String databanco = resultado.getString("data_nascimento");
                    String datanascimento = formatoDatavoltando(databanco);
                    txtfdatanascimento.setText(datanascimento);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Visualizando_Cadastro_de_Hospede.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Visualizando_Cadastro_de_Hospede.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String formatoData(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }    
    public String formatoDatavoltando(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfnome = new javax.swing.JTextField();
        txtfrg = new javax.swing.JTextField();
        txtfcpf = new javax.swing.JTextField();
        txtfdatanascimento = new javax.swing.JTextField();
        txtfnumerotelefone = new javax.swing.JTextField();
        txtfemail = new javax.swing.JTextField();
        txtfcep = new javax.swing.JTextField();
        txtfestado = new javax.swing.JTextField();
        txtfcidade = new javax.swing.JTextField();
        txtfbairro = new javax.swing.JTextField();
        txtfrua = new javax.swing.JTextField();
        txtfcomplemento = new javax.swing.JTextField();
        txtfobservacoes = new javax.swing.JTextField();
        btnrmasculino = new javax.swing.JRadioButton();
        btnrfeminino = new javax.swing.JRadioButton();
        btnroutros = new javax.swing.JRadioButton();
        btnvoltar = new javax.swing.JButton();
        txtfnumerohospede = new javax.swing.JTextField();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnsalvaralteracoes = new javax.swing.JButton();
        lblimagemEDITANDOcadastrohospede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnome.setBorder(null);
        jPanel1.add(txtfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 132, 430, 30));

        txtfrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrg.setBorder(null);
        jPanel1.add(txtfrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 132, 120, 30));

        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        txtfcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcpfFocusLost(evt);
            }
        });
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 168, 280, 30));

        txtfdatanascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdatanascimento.setBorder(null);
        jPanel1.add(txtfdatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 169, 180, 30));

        txtfnumerotelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerotelefone.setBorder(null);
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 274, 226, 30));

        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 308, 540, 30));

        txtfcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcep.setBorder(null);
        jPanel1.add(txtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 390, 100, 30));

        txtfestado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfestado.setBorder(null);
        jPanel1.add(txtfestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 390, 260, 30));

        txtfcidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcidade.setBorder(null);
        jPanel1.add(txtfcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 390, 260, 30));

        txtfbairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbairro.setBorder(null);
        jPanel1.add(txtfbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 427, 280, 30));

        txtfrua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrua.setBorder(null);
        jPanel1.add(txtfrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 427, 430, 30));

        txtfcomplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcomplemento.setBorder(null);
        jPanel1.add(txtfcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 462, 420, 30));

        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 720, 60));

        btnrmasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrmasculinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 212, -1, -1));

        btnrfeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrfemininoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrfeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 212, -1, -1));

        btnroutros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnroutrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnroutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 212, -1, -1));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 594, 160, 50));

        txtfnumerohospede.setEditable(false);
        txtfnumerohospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerohospede.setBorder(null);
        txtfnumerohospede.setEnabled(false);
        jPanel1.add(txtfnumerohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 207, 100, 30));

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

        btnsalvaralteracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalvaralteracoesMouseClicked(evt);
            }
        });
        btnsalvaralteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvaralteracoesActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvaralteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 220, 50));

        lblimagemEDITANDOcadastrohospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemEDITANDOcadastrohospede.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Editando_cadastro_Hospede.png")); // NOI18N
        jPanel1.add(lblimagemEDITANDOcadastrohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnrmasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrmasculinoMouseClicked
        btnrfeminino.setSelected(false);
        btnroutros.setSelected(false);
    }//GEN-LAST:event_btnrmasculinoMouseClicked

    private void btnrfemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrfemininoMouseClicked
        // TODO add your handling code here:
        btnrmasculino.setSelected(false);
        btnroutros.setSelected(false);
    }//GEN-LAST:event_btnrfemininoMouseClicked

    private void btnroutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroutrosMouseClicked
        // TODO add your handling code here:
        btnrmasculino.setSelected(false);
        btnrfeminino.setSelected(false);
    }//GEN-LAST:event_btnroutrosMouseClicked

    private void txtfcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfcpfFocusLost
        // TODO add your handling code here:
        String cpf = txtfcpf.getText();
        cpf = cpf.replaceAll("[^0-9]", "");
        if (validarCPF(cpf)) {
        } else {
            JOptionPane.showMessageDialog(null,"ERRO: CPF invalido, Digite um numero valido!");
        }
    }//GEN-LAST:event_txtfcpfFocusLost

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Editando_Cadastro_de_Hospede.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Editando_Cadastro_de_Hospede.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Editando_Cadastro_de_Hospede.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Editando_Cadastro_de_Hospede.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Editando_Cadastro_de_Hospede.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnsalvaralteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvaralteracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalvaralteracoesActionPerformed

    private void btnsalvaralteracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvaralteracoesMouseClicked

        try {
            
            String data = txtfdatanascimento.getText();
            String datanascimento = formatoData(data);
            

            String opcaoSelecionada = null;
            if (btnrmasculino.isSelected()) {
                opcaoSelecionada = "Masculino";
            }else if (btnrfeminino.isSelected()) {
                opcaoSelecionada = "Feminino";
            }else if (btnroutros.isSelected()) {
                opcaoSelecionada ="Outros";
            }
            
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql = "UPDATE hospedes SET nome_hospede = ?, rg = ?, cpf = ?, data_nascimento = ?, sexo = ?, celular = ?, "
                    + "email = ?, cep = ?, Estado = ?, cidade = ?, bairro = ?, rua = ?, complemento = ?, observacoes = ? "
                    + "WHERE id_hospede = ?";
            
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1,txtfnome.getText());
            statement.setString(2,txtfrg.getText());
            statement.setString(3,txtfcpf.getText());
            statement.setString(4,datanascimento);
            statement.setString(5,opcaoSelecionada);
            statement.setString(6,txtfnumerotelefone.getText());
            statement.setString(7,txtfemail.getText());
            statement.setString(8,txtfcep.getText());
            statement.setString(9,txtfestado.getText());
            statement.setString(10,txtfcidade.getText());
            statement.setString(11,txtfbairro.getText());
            statement.setString(12,txtfrua.getText());
            statement.setString(13,txtfcomplemento.getText());
            statement.setString(14,txtfobservacoes.getText());
            statement.setString(15,txtfnumerohospede.getText());
            
            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados atualizados com Sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(Editando_Cadastro_de_Hospede.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsalvaralteracoesMouseClicked
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
            java.util.logging.Logger.getLogger(Editando_Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editando_Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editando_Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editando_Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editando_Cadastro_de_Hospede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnreserva;
    private javax.swing.JRadioButton btnrfeminino;
    private javax.swing.JRadioButton btnrmasculino;
    private javax.swing.JRadioButton btnroutros;
    private javax.swing.JButton btnsalvaralteracoes;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagemEDITANDOcadastrohospede;
    private javax.swing.JTextField txtfbairro;
    private javax.swing.JTextField txtfcep;
    private javax.swing.JTextField txtfcidade;
    private javax.swing.JTextField txtfcomplemento;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfdatanascimento;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfestado;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerohospede;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    // End of variables declaration//GEN-END:variables

    

    
}
