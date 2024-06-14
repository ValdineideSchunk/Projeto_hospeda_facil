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
 * @author NEY SCHUNK ok
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
        txtfnumerotelefone, txtfemail, ftxtfcep,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento, txtfobservacoes};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        cbxestados.setOpaque(false);
        cbxestados.setBackground(new Color(0, 0, 0, 0));
    }
    public String formatoData(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
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
        txtfnumerotelefone = new javax.swing.JTextField();
        txtfemail = new javax.swing.JTextField();
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
        lblerronumerotelefone = new javax.swing.JLabel();
        lblerroemail = new javax.swing.JLabel();
        lblerrocep = new javax.swing.JLabel();
        ftxtfcep = new javax.swing.JFormattedTextField();
        cbxestados = new javax.swing.JComboBox<>();
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
        txtfnumerotelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnumerotelefoneFocusLost(evt);
            }
        });
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 275, 226, 27));

        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        txtfemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfemailFocusLost(evt);
            }
        });
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 309, 540, 27));

        txtfcidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcidade.setBorder(null);
        jPanel1.add(txtfcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 392, 260, 27));

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

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
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

        lblerronumerotelefone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerronumerotelefone.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblerronumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 275, 80, 15));

        lblerroemail.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerroemail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerroemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 80, 15));

        lblerrocep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblerrocep.setForeground(new java.awt.Color(255, 0, 0));
        lblerrocep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblerrocepFocusLost(evt);
            }
        });
        jPanel1.add(lblerrocep, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 392, 50, 15));

        ftxtfcep.setBorder(null);
        try {
            ftxtfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfcep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(ftxtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 391, 100, 27));

        cbxestados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxestados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cbxestados.setBorder(null);
        cbxestados.setOpaque(true);
        jPanel1.add(cbxestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 260, 30));

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
            if (txtfnome.getText().isEmpty() || txtfrg.getText().isEmpty() || txtfcpf.getText().isEmpty() ||
                ftxtfdatanascimento.getText().isEmpty() || (!btnrmasculino.isSelected() && !btnrfeminino.isSelected() && !btnroutros.isSelected()) ||
                txtfnumerotelefone.getText().isEmpty() || txtfemail.getText().isEmpty() || ftxtfcep.getText().isEmpty() ||
                cbxestados.getSelectedIndex() == 0 || txtfcidade.getText().isEmpty() || txtfbairro.getText().isEmpty() ||
                txtfrua.getText().isEmpty() || txtfcomplemento.getText().isEmpty() || txtfobservacoes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtfnome.getText().matches("[a-zA-ZÀ-ÿ\\s]+")) {
                JOptionPane.showMessageDialog(null, "O campo de nome deve conter apenas letras e espaços.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!ValidarRG.validarRG(txtfrg.getText())) {
                JOptionPane.showMessageDialog(null, "RG inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!ValidarCPF.validarCPF(txtfcpf.getText())) {
                JOptionPane.showMessageDialog(null, "CPF inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (validarCPFExistenteBanco.validarCPFExistentehospede(txtfcpf.getText())) {
                JOptionPane.showMessageDialog(null, "Já existe um hóspede cadastrado com o CPF informado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ValidarData validarData = new ValidarData();
            if (!validarData.validardata(ftxtfdatanascimento.getText())) {
                JOptionPane.showMessageDialog(null, "Data inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtfnumerotelefone.getText().trim().matches("\\d{0,13}")) {
                JOptionPane.showMessageDialog(null, "Número de telefone inválido. Por favor, insira no Máximo 13 números.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            if (!txtfemail.getText().contains("@")) {
                JOptionPane.showMessageDialog(null, "E-mail inválido. Por favor, insira um e-mail válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            if (!ftxtfcep.getText().isEmpty() && !ftxtfcep.getText().matches("^[0-9]{5}-[0-9]{3}$")) {
                JOptionPane.showMessageDialog(null, "Formato de CEP inválido. Por favor, insira no formato 99999-999.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
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
                String estadoselecionado = (String) cbxestados.getSelectedItem();
                
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
                statement.setString(8,ftxtfcep.getText());
                statement.setString(9,estadoselecionado);
                statement.setString(10,txtfcidade.getText());
                statement.setString(11,txtfbairro.getText());
                statement.setString(12,txtfrua.getText());
                statement.setString(13,txtfcomplemento.getText());
                statement.setString(14,txtfobservacoes.getText());
                
                statement.executeUpdate();
                statement.close();
                conexao.close();
                JOptionPane.showMessageDialog(null,"Hospede Cadastrado Com Sucesso..");
                Cadastro_de_Hospede.this.dispose();
                Lista_de_Hóspede objeto2 = new Lista_de_Hóspede();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cadastro_de_Hospede.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            ValidarData validarData = new ValidarData();
            boolean valida = validarData.validardata(data); // Chama a função validardata passando a data
            if (valida) {
                ftxtfdatanascimento.setBorder(null);
                lblerrodatanascimento.setText("");
            } else {
                ftxtfdatanascimento.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                lblerrodatanascimento.setText("Data inválida");
            }
        }
    }//GEN-LAST:event_ftxtfdatanascimentoFocusLost

    private void txtfnumerotelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnumerotelefoneFocusLost
        String text = txtfnumerotelefone.getText().trim();
        if (!text.isEmpty() && (!text.matches("\\d{0,13}") || !text.matches("\\d+"))) {
            txtfnumerotelefone.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "Número inválido. Deve conter exatamente 13 dígitos.";
            lblerronumerotelefone.setText(mensagem);
        } else {
            txtfnumerotelefone.setBorder(null);
            String mensagem = "";
            lblerronumerotelefone.setText(mensagem);
        }   
    }//GEN-LAST:event_txtfnumerotelefoneFocusLost

    private void txtfemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfemailFocusLost
        String text = txtfemail.getText().trim();
        if (!text.isEmpty() && !text.contains("@")) {
            txtfemail.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "Email inválido";
            lblerroemail.setText(mensagem);
        } else {
            txtfemail.setBorder(null);
            String mensagem = "";
            lblerroemail.setText(mensagem);
        }
    }//GEN-LAST:event_txtfemailFocusLost

    private void lblerrocepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblerrocepFocusLost
        String text = ftxtfcep.getText().trim();
        if (!text.isEmpty() && !text.matches("^[0-9]{5}-[0-9]{3}$")) {
            ftxtfcep.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "cep inválido";
            lblerrocep.setText(mensagem); 
        } else {
            ftxtfcep.setBorder(null);
            String mensagem = "";
            lblerrocep.setText(mensagem);
        }
    }//GEN-LAST:event_lblerrocepFocusLost

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Cadastro_de_Hospede.this.dispose();
        Lista_de_Hóspede objeto2 = new Lista_de_Hóspede();
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
    private javax.swing.JComboBox<String> cbxestados;
    private javax.swing.JFormattedTextField ftxtfcep;
    private javax.swing.JFormattedTextField ftxtfdatanascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblerrocep;
    private javax.swing.JLabel lblerrocpf;
    private javax.swing.JLabel lblerrodatanascimento;
    private javax.swing.JLabel lblerroemail;
    private javax.swing.JLabel lblerronome;
    private javax.swing.JLabel lblerronumerotelefone;
    private javax.swing.JLabel lblerrorg;
    private javax.swing.JLabel lblimagemcadastrohospede;
    private javax.swing.JTextField txtfbairro;
    private javax.swing.JTextField txtfcidade;
    private javax.swing.JTextField txtfcomplemento;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    // End of variables declaration//GEN-END:variables

    

    
}
