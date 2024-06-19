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
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Visualizando_Cadastro_de_Funcinario extends javax.swing.JFrame {
    int idFuncionario = Integer.parseInt(id);
    public Visualizando_Cadastro_de_Funcinario() {
        initComponents();
        DetalhesFuncionario();
    JButton[] buttons = {// chamando função para transformar botões transparente
        btneditar, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
    JTextField[] textFields = {// chamando função para transformar TextField transparente
        txtfnome, txtfrg, txtfcpf, txtfdatanascimento,
        txtfnumerotelefone, txtfemail, txtfcep, txtfestado,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento, txtfobservacoes,
        txtfcargo,txtfdataadimisão,txtfdataadimisão,txtfdataemissaocarteira,
        txtfbanco,txtfagencia,txtfconta,txtfnumerofuncionario};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
    }
    public String formatoData(String data) {// formatar data
        String dateStr = data;//Data no formato DD/MM/YYYY           
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;
    }
    public void DetalhesFuncionario(){    //Função responsavel por polular a tela
        try {
            Connection conexao = null;
            PreparedStatement declaracaoPreparada = null;
            ResultSet resultado = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
            declaracaoPreparada = conexao.prepareStatement(
                "SELECT * FROM funcionarios WHERE id_funcionario = ?");
            declaracaoPreparada.setInt(1, idFuncionario);
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
                    boolean ativo = resultado.getBoolean("status_funcionario");
                    rbtnstatus.setSelected(ativo);
                    txtfnumerofuncionario.setText(resultado.getString("id_funcionario"));
                    txtfnome.setText(resultado.getString("nome_funcionario"));
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
                    txtfcargo.setText(resultado.getString("cargo"));                    
                    txtfbanco.setText(resultado.getString("banco"));
                    txtfagencia.setText(resultado.getString("agencia"));
                    txtfconta.setText(resultado.getString("conta"));
                    txtfobservacoes.setText(resultado.getString("observacoes"));
                    String databanco = resultado.getString("data_nascimento");
                    String datanascimento = formatoData(databanco);
                    txtfdatanascimento.setText(datanascimento);
                    databanco = resultado.getString("data_admissao");
                    datanascimento = formatoData(databanco);
                    txtfdataadimisão.setText(datanascimento);
                    databanco = resultado.getString("data_emissao_carteira");
                    datanascimento = formatoData(databanco);
                    txtfdataemissaocarteira.setText(datanascimento);                  
                } catch (SQLException ex) {
                    Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        txtfcargo = new javax.swing.JTextField();
        txtfdataadimisão = new javax.swing.JTextField();
        txtfdataemissaocarteira = new javax.swing.JTextField();
        txtfbanco = new javax.swing.JTextField();
        txtfagencia = new javax.swing.JTextField();
        txtfconta = new javax.swing.JTextField();
        rbtnstatus = new javax.swing.JRadioButton();
        txtfnumerofuncionario = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        lblimagemVISUALIZANDOcadastrofuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfnome.setEditable(false);
        txtfnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnome.setBorder(null);
        jPanel1.add(txtfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 109, 450, 30));

        txtfrg.setEditable(false);
        txtfrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrg.setBorder(null);
        jPanel1.add(txtfrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 108, 140, 30));

        txtfcpf.setEditable(false);
        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        txtfcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcpfFocusLost(evt);
            }
        });
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 30));

        txtfdatanascimento.setEditable(false);
        txtfdatanascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdatanascimento.setBorder(null);
        jPanel1.add(txtfdatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 210, 30));

        txtfnumerotelefone.setEditable(false);
        txtfnumerotelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerotelefone.setBorder(null);
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 231, 170, 30));

        txtfemail.setEditable(false);
        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 231, 420, 30));

        txtfcep.setEditable(false);
        txtfcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcep.setBorder(null);
        jPanel1.add(txtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 300, 150, 30));

        txtfestado.setEditable(false);
        txtfestado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfestado.setBorder(null);
        jPanel1.add(txtfestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 298, 250, 30));

        txtfcidade.setEditable(false);
        txtfcidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcidade.setBorder(null);
        jPanel1.add(txtfcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 297, 250, 30));

        txtfbairro.setEditable(false);
        txtfbairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbairro.setBorder(null);
        jPanel1.add(txtfbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 333, 290, 30));

        txtfrua.setEditable(false);
        txtfrua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrua.setBorder(null);
        jPanel1.add(txtfrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 331, 460, 30));

        txtfcomplemento.setEditable(false);
        txtfcomplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcomplemento.setBorder(null);
        jPanel1.add(txtfcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 369, 610, 30));

        txtfobservacoes.setEditable(false);
        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 740, 60));

        btnrmasculino.setBorder(null);
        btnrmasculino.setEnabled(false);
        btnrmasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrmasculinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 180, 20, -1));

        btnrfeminino.setEnabled(false);
        btnrfeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrfemininoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrfeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 179, -1, -1));

        btnroutros.setEnabled(false);
        btnroutros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnroutrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnroutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 179, -1, -1));

        txtfcargo.setEditable(false);
        txtfcargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcargo.setBorder(null);
        jPanel1.add(txtfcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 440, 140, 30));

        txtfdataadimisão.setEditable(false);
        txtfdataadimisão.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdataadimisão.setBorder(null);
        jPanel1.add(txtfdataadimisão, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 440, 150, 30));

        txtfdataemissaocarteira.setEditable(false);
        txtfdataemissaocarteira.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdataemissaocarteira.setBorder(null);
        jPanel1.add(txtfdataemissaocarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 441, 129, 30));

        txtfbanco.setEditable(false);
        txtfbanco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbanco.setBorder(null);
        jPanel1.add(txtfbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 475, 120, 30));

        txtfagencia.setEditable(false);
        txtfagencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfagencia.setBorder(null);
        jPanel1.add(txtfagencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 475, 110, 30));

        txtfconta.setEditable(false);
        txtfconta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfconta.setBorder(null);
        jPanel1.add(txtfconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 475, 240, 30));

        rbtnstatus.setEnabled(false);
        jPanel1.add(rbtnstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        txtfnumerofuncionario.setEditable(false);
        txtfnumerofuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerofuncionario.setBorder(null);
        jPanel1.add(txtfnumerofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 172, 110, 30));

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 160, 50));

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

        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditarMouseClicked(evt);
            }
        });
        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 160, 50));

        lblimagemVISUALIZANDOcadastrofuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemVISUALIZANDOcadastrofuncionario.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Visualizando cadastro funcionário.png")); // NOI18N
        jPanel1.add(lblimagemVISUALIZANDOcadastrofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    }//GEN-LAST:event_txtfcpfFocusLost

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseClicked
  
    Visualizando_Cadastro_de_Funcinario.this.dispose();
    Editando_Cadastro_de_Funcinario objeto2 = new Editando_Cadastro_de_Funcinario();
    objeto2.setVisible(true);
    }//GEN-LAST:event_btneditarMouseClicked

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Visualizando_Cadastro_de_Funcinario.this.dispose();
        Lista_de_Funcionários objeto2 = new Lista_de_Funcionários();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizando_Cadastro_de_Funcinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Visualizando_Cadastro_de_Funcinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnreserva;
    private javax.swing.JRadioButton btnrfeminino;
    private javax.swing.JRadioButton btnrmasculino;
    private javax.swing.JRadioButton btnroutros;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagemVISUALIZANDOcadastrofuncionario;
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
    private javax.swing.JTextField txtfdataadimisão;
    private javax.swing.JTextField txtfdataemissaocarteira;
    private javax.swing.JTextField txtfdatanascimento;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfestado;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerofuncionario;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    // End of variables declaration//GEN-END:variables

    

    
}
