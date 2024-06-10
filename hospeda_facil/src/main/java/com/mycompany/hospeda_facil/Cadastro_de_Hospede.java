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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class Cadastro_de_Hospede extends javax.swing.JFrame {
    public Cadastro_de_Hospede() {
        initComponents();
        
        JButton[] buttons = {
        btnfinalizarcadastro, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfnome, txtfrg, txtfcpf, ftxtfdatanascimento,
        txtfnumerotelefone, txtfemail, txtfcep, txtfestado,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento, txtfobservacoes};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        

    }
    
    public String formatoData(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }
    public boolean validardata(String data) {
        if (data == null || data.trim().isEmpty()) {// Verifica se a string de data está no formato correto
            return false;
        }
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) { // Verifica se a data está no formato DD/MM/YYYY
            return false;
        }
        String[] partes = data.split("/"); // Data no formato DD/MM/YYYY
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12) {    // Verifica se o mês é válido
            return false;
        }
        if (dia < 1 || dia > 31) {   // Verifica se o dia é válido para o mês
            return false;
        }
        if (ano > 2024) {    // Verifica se o ano é válido
            return false;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {    // Verifica o número de dias em cada mês
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (anobissexto(ano)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }
        return true;// Data válida
    }
    public static boolean anobissexto(int year) {// Função auxiliar para verificar se um ano é bissexto
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
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
        btnrmasculino = new javax.swing.JRadioButton();
        btnrfeminino = new javax.swing.JRadioButton();
        btnroutros = new javax.swing.JRadioButton();
        btnvoltar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        ftxtfdatanascimento = new javax.swing.JFormattedTextField();
        btnfinalizarcadastro = new javax.swing.JButton();
        lblerronome = new javax.swing.JLabel();
        lblerrorg = new javax.swing.JLabel();
        lblerrocpf = new javax.swing.JLabel();
        lblerrodatanascimento = new javax.swing.JLabel();
        lblimagemcadastrohospede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnome.setBorder(null);
        txtfnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnomeFocusLost(evt);
            }
        });
        jPanel1.add(txtfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 133, 430, 27));

        txtfrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrg.setBorder(null);
        txtfrg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfrgFocusLost(evt);
            }
        });
        jPanel1.add(txtfrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 134, 120, 27));

        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        txtfcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcpfFocusLost(evt);
            }
        });
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 169, 280, 27));

        txtfnumerotelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerotelefone.setBorder(null);
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 274, 226, 27));

        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 308, 540, 27));

        txtfcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcep.setBorder(null);
        jPanel1.add(txtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 390, 100, 27));

        txtfestado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfestado.setBorder(null);
        jPanel1.add(txtfestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 390, 260, 27));

        txtfcidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcidade.setBorder(null);
        jPanel1.add(txtfcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 390, 260, 27));

        txtfbairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbairro.setBorder(null);
        jPanel1.add(txtfbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 427, 280, 27));

        txtfrua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrua.setBorder(null);
        jPanel1.add(txtfrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 427, 430, 27));

        txtfcomplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcomplemento.setBorder(null);
        jPanel1.add(txtfcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 462, 420, 27));

        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 720, 60));

        btnrmasculino.setBorder(null);
        btnrmasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrmasculinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 212, -1, -1));

        btnrfeminino.setBorder(null);
        btnrfeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrfemininoMouseClicked(evt);
            }
        });
        jPanel1.add(btnrfeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 212, -1, -1));

        btnroutros.setBorder(null);
        btnroutros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnroutrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnroutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 212, -1, -1));
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 597, 160, 50));

        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 29, 81, 82));
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
        jPanel1.add(btnajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 531, 82, 90));

        ftxtfdatanascimento.setBorder(null);
        try {
            ftxtfdatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatanascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfdatanascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfdatanascimentoFocusLost(evt);
            }
        });
        jPanel1.add(ftxtfdatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 180, 27));

        btnfinalizarcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarcadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizarcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 593, 230, 50));

        lblerronome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerronome.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerronome, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 73, 15));

        lblerrorg.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrorg.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblerrorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 134, 60, 15));

        lblerrocpf.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblerrocpf.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 70, 15));

        lblerrodatanascimento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrodatanascimento.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrodatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 70, 15));

        lblimagemcadastrohospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemcadastrohospede.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Cadastro_Hóspede.png")); // NOI18N
        jPanel1.add(lblimagemcadastrohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        btnrmasculino.setSelected(false);
        btnroutros.setSelected(false);
    }//GEN-LAST:event_btnrfemininoMouseClicked

    private void btnroutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroutrosMouseClicked
        btnrmasculino.setSelected(false);
        btnrfeminino.setSelected(false);
    }//GEN-LAST:event_btnroutrosMouseClicked

    private void txtfcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfcpfFocusLost
        
        String cpf = txtfcpf.getText().trim();
        
         if (cpf.isEmpty()) {
            txtfcpf.setBorder(null);
            lblerrocpf.setText("");  
            return;                  
        }
        cpf = cpf.replaceAll("[^0-9]", "");
        if (!ValidarCPF.validarCPF(cpf)) {
            txtfcpf.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "CPF invalido";
            lblerrocpf.setText(mensagem);
        } else {
            txtfcpf.setBorder(null);
            String mensagem = "";
            lblerrocpf.setText(mensagem);
        }
    }//GEN-LAST:event_txtfcpfFocusLost

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Cadastro_de_Hospede.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Cadastro_de_Hospede.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Cadastro_de_Hospede.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Cadastro_de_Hospede.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnfinalizarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroActionPerformed
        try {
            String data = ftxtfdatanascimento.getText();
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
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO hospedes(nome_hospede,rg,cpf,data_nascimento,sexo,celular,email,cep,Estado,cidade,"
                    + "bairro,rua,complemento,observacoes)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfinalizarcadastroActionPerformed

    private void txtfnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnomeFocusLost
        String text = txtfnome.getText().trim();
        if (!text.isEmpty() && !text.matches("[a-zA-Z\\s]+"))  {
                txtfnome.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                String mensagem = "Nome invalido";
                lblerronome.setText(mensagem);
                }else{
                    txtfnome.setBorder(null);
                    String mensagem = "";
                    lblerronome.setText(mensagem);
        }
    }//GEN-LAST:event_txtfnomeFocusLost

    private void txtfrgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfrgFocusLost
        String rg = txtfrg.getText().trim();
        if (!ValidarRG.validarRG(rg)) {
            txtfrg.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "RG invalido";
            lblerrorg.setText(mensagem); 
        }else{
            txtfrg.setBorder(null);
            String mensagem = "";
            lblerrorg.setText(mensagem);
        
    }
    }//GEN-LAST:event_txtfrgFocusLost

    private void ftxtfdatanascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfdatanascimentoFocusLost
        String data = ftxtfdatanascimento.getText().trim();
        if (data.equals("  /  /    ") || data.isEmpty()) {    // Verifica se o campo está vazio
            ftxtfdatanascimento.setBorder(null);
            lblerrodatanascimento.setText("");
        } else {
            boolean isValid = validardata(data); // Chama a função validardata passando a data
            if (isValid) {
                ftxtfdatanascimento.setBorder(null);
                lblerrodatanascimento.setText("");
                 String datanascimento = formatoData(data); // Chame formatoData apenas se a data for válida
        } else {
            ftxtfdatanascimento.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            lblerrodatanascimento.setText("Data inválida");
        }
    }
    }//GEN-LAST:event_ftxtfdatanascimentoFocusLost
    
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
            java.util.logging.Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_de_Hospede().setVisible(true);
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
    private javax.swing.JFormattedTextField ftxtfdatanascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblerrocpf;
    private javax.swing.JLabel lblerrodatanascimento;
    private javax.swing.JLabel lblerronome;
    private javax.swing.JLabel lblerrorg;
    private javax.swing.JLabel lblimagemcadastrohospede;
    private javax.swing.JTextField txtfbairro;
    private javax.swing.JTextField txtfcep;
    private javax.swing.JTextField txtfcidade;
    private javax.swing.JTextField txtfcomplemento;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfestado;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    // End of variables declaration//GEN-END:variables

    

    
}
