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
public class Cadastro_de_Funcionario extends javax.swing.JFrame {
    public Cadastro_de_Funcionario() {
        initComponents();
        
        JButton[] buttons = {          // chamando função para transformar botões tranparente
        btnfinalizarcadastro, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {                      // chamando função para transformar TextField tranparente
        txtfnome, txtfrg, txtfcpf, ftxtfdatanascimento,
        txtfnumerotelefone, txtfemail, ftxtfcep,
        txtfcidade, txtfbairro, txtfrua, txtfcomplemento, 
        txtfobservacoes,ftxtfdataadimisao,ftxtfdataemissaocarteira,
        txtfbanco,txtfagencia,txtfconta,txtnnumerofuncionario};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        cbxestados.setOpaque(false);
        cbxestados.setBackground(new Color(0, 0, 0, 0));
        cbxcargos.setOpaque(false);
        cbxcargos.setBackground(new Color(0, 0, 0, 0));
    }
 
    public String formatoData(String data) { // formatar data
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }
    
public boolean validardata(String data) {  // validando data
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
        txtfrg = new javax.swing.JTextField();
        txtfcpf = new javax.swing.JTextField();
        txtfnome = new javax.swing.JTextField();
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
        txtfbanco = new javax.swing.JTextField();
        txtfagencia = new javax.swing.JTextField();
        txtfconta = new javax.swing.JTextField();
        rbtnstatus = new javax.swing.JRadioButton();
        txtnnumerofuncionario = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        ftxtfdataadimisao = new javax.swing.JFormattedTextField();
        ftxtfdataemissaocarteira = new javax.swing.JFormattedTextField();
        ftxtfdatanascimento = new javax.swing.JFormattedTextField();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnfinalizarcadastro = new javax.swing.JButton();
        lblerronome = new javax.swing.JLabel();
        lblerrorg = new javax.swing.JLabel();
        lblerrocpf = new javax.swing.JLabel();
        lblerrodatanascimento = new javax.swing.JLabel();
        cbxestados = new javax.swing.JComboBox<>();
        ftxtfcep = new javax.swing.JFormattedTextField();
        lblerronumerotelefone = new javax.swing.JLabel();
        lblerroemail = new javax.swing.JLabel();
        lblerrocep = new javax.swing.JLabel();
        lblerrodataadimisao = new javax.swing.JLabel();
        lblerrodataemissaocarteira = new javax.swing.JLabel();
        cbxcargos = new javax.swing.JComboBox<>();
        lblimagemcadastrofuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfrg.setBorder(null);
        txtfrg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfrgFocusLost(evt);
            }
        });
        jPanel1.add(txtfrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 108, 140, 28));

        txtfcpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpf.setBorder(null);
        txtfcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcpfFocusLost(evt);
            }
        });
        jPanel1.add(txtfcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 310, 30));

        txtfnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnome.setBorder(null);
        txtfnome.setVerifyInputWhenFocusTarget(false);
        txtfnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnomeFocusLost(evt);
            }
        });
        jPanel1.add(txtfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 109, 446, 28));

        txtfnumerotelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerotelefone.setBorder(null);
        txtfnumerotelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnumerotelefoneFocusLost(evt);
            }
        });
        jPanel1.add(txtfnumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 231, 170, 30));

        txtfemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfemail.setBorder(null);
        txtfemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfemailFocusLost(evt);
            }
        });
        jPanel1.add(txtfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 231, 420, 30));

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

        txtfbanco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfbanco.setBorder(null);
        jPanel1.add(txtfbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 475, 120, 30));

        txtfagencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfagencia.setBorder(null);
        jPanel1.add(txtfagencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 475, 110, 30));

        txtfconta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfconta.setBorder(null);
        jPanel1.add(txtfconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 475, 240, 30));
        jPanel1.add(rbtnstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        txtnnumerofuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnnumerofuncionario.setBorder(null);
        txtnnumerofuncionario.setEnabled(false);
        jPanel1.add(txtnnumerofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 172, 110, 30));

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 613, 170, 50));

        ftxtfdataadimisao.setBorder(null);
        try {
            ftxtfdataadimisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdataadimisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfdataadimisao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfdataadimisaoFocusLost(evt);
            }
        });
        jPanel1.add(ftxtfdataadimisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 150, 30));

        ftxtfdataemissaocarteira.setBorder(null);
        try {
            ftxtfdataemissaocarteira.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdataemissaocarteira.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfdataemissaocarteira.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfdataemissaocarteiraFocusLost(evt);
            }
        });
        jPanel1.add(ftxtfdataemissaocarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 130, 30));

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
        ftxtfdatanascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtfdatanascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(ftxtfdatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 210, 30));

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

        btnfinalizarcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarcadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizarcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 220, 50));

        lblerronome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerronome.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerronome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 70, 15));

        lblerrorg.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrorg.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 109, 54, 15));

        lblerrocpf.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel1.add(lblerrocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 141, 70, 15));

        lblerrodatanascimento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrodatanascimento.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrodatanascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 140, 70, 15));

        cbxestados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxestados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cbxestados.setBorder(null);
        jPanel1.add(cbxestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 240, 30));

        ftxtfcep.setBorder(null);
        try {
            ftxtfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfcep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfcepFocusLost(evt);
            }
        });
        jPanel1.add(ftxtfcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 150, 30));

        lblerronumerotelefone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerronumerotelefone.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerronumerotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 231, 80, 15));

        lblerroemail.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerroemail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerroemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 231, 80, 15));

        lblerrocep.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrocep.setForeground(new java.awt.Color(255, 0, 0));
        lblerrocep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblerrocepFocusLost(evt);
            }
        });
        jPanel1.add(lblerrocep, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 60, 15));

        lblerrodataadimisao.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrodataadimisao.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrodataadimisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 70, 15));

        lblerrodataemissaocarteira.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblerrodataemissaocarteira.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblerrodataemissaocarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 440, 70, 15));

        cbxcargos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxcargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Gerente", "Recepcionista", "Camareira" }));
        jPanel1.add(cbxcargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 160, 30));

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
        if (cpf.isEmpty()){                         
            txtfcpf.setBorder(null);    // chamando função para verificar se CPF é valido
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
        Cadastro_de_Funcionario.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Cadastro_de_Funcionario.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Cadastro_de_Funcionario.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Cadastro_de_Funcionario.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Cadastro_de_Funcionario.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnfinalizarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroActionPerformed
        
            // evento rsponsavel por fazer as validações dos dados inserido e posteriomete salvara essa informações no banco de dados
        try {                                                     
            if (txtfnome.getText().isEmpty() || txtfrg.getText().isEmpty() || txtfcpf.getText().isEmpty() ||
                ftxtfdatanascimento.getText().isEmpty() || (!btnrmasculino.isSelected() && !btnrfeminino.isSelected() && !btnroutros.isSelected()) ||
                txtfnumerotelefone.getText().isEmpty() || txtfemail.getText().isEmpty() || ftxtfcep.getText().isEmpty() ||
                cbxestados.getSelectedIndex() == 0 || txtfcidade.getText().isEmpty() || txtfbairro.getText().isEmpty() ||
                txtfrua.getText().isEmpty() || txtfcomplemento.getText().isEmpty() ||
                ftxtfdataadimisao.getText().isEmpty() || cbxcargos.getSelectedIndex() == 0 || txtfbanco.getText().isEmpty() ||
                txtfconta.getText().isEmpty() || txtfagencia.getText().isEmpty() || ftxtfdataemissaocarteira.getText().isEmpty() )
            {
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
            if (validarCPFExistenteBanco.validarCPFExistentefuncionario(txtfcpf.getText())) {
                JOptionPane.showMessageDialog(null, "Já existe um funcionario cadastrado com o CPF informado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ValidarData validarData = new ValidarData();
            if (!validarData.validardata(ftxtfdatanascimento.getText())) {
                JOptionPane.showMessageDialog(null, "Data de Nascimento inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtfnumerotelefone.getText().trim().matches("\\d{0,13}")) {
                JOptionPane.showMessageDialog(null, "Número de telefone inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
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
            if (!validarData.validardata(ftxtfdataadimisao.getText())) {
                JOptionPane.showMessageDialog(null, "Data de Adimisao inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!validarData.validardata(ftxtfdataemissaocarteira.getText())) {
                JOptionPane.showMessageDialog(null, "Data de Emissão da Carteira inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtfagencia.getText().trim().matches("\\d{0,13}")) {
                JOptionPane.showMessageDialog(null, "Número da agência inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtfconta.getText().trim().matches("\\d{0,13}")) {
                JOptionPane.showMessageDialog(null, "Número da conta inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtfobservacoes.getText().trim().isEmpty()) {
            txtfobservacoes.setText(" ");
            }

            try {
                String data = ftxtfdatanascimento.getText();
                String datanascimento = formatoData(data);
                
                data = ftxtfdataadimisao.getText();
                String dataadimisao = formatoData(data);
                
                data = ftxtfdataemissaocarteira.getText();
                String dataemissaocarteira = formatoData(data);
                
                String opcaoSelecionada = null;
                if (btnrmasculino.isSelected()) {
                    opcaoSelecionada = "Masculino";
                }else if (btnrfeminino.isSelected()) {
                    opcaoSelecionada = "Feminino";
                }else if (btnroutros.isSelected()) {
                    opcaoSelecionada ="Outro";
                }
                String cargo = (String) cbxcargos.getSelectedItem();
                String estadoselecionado = (String) cbxestados.getSelectedItem();
                
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario ="root";
                String senha ="";
                conexao =DriverManager.getConnection(url,usuario,senha);
                String sql = "INSERT INTO funcionarios(nome_funcionario,rg,cpf,data_nascimento,sexo,celular,email,cep,Estado,cidade,"
                        + "bairro,rua,complemento,cargo,data_admissao,data_emissao_carteira,banco,agencia,conta,status_funcionario,observacoes)"
                        + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                statement.setString(14,cargo);
                statement.setString(15,dataadimisao);
                statement.setString(16,dataemissaocarteira);
                statement.setString(17,txtfbanco.getText());
                statement.setString(18,txtfagencia.getText());
                statement.setString(19,txtfconta.getText());
                statement.setBoolean(20,rbtnstatus.isSelected());
                statement.setString(21,txtfobservacoes.getText());
                statement.executeUpdate();
                statement.close();
                conexao.close();
                JOptionPane.showMessageDialog(null,"Funcionario cadastrado com sucesso.");
                Cadastro_de_Funcionario.this.dispose();
                Lista_de_Funcionários objeto2 = new Lista_de_Funcionários();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnfinalizarcadastroActionPerformed

    private void txtfnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnomeFocusLost
        String text = txtfnome.getText().trim();
        if (!text.isEmpty() && !text.matches("[a-zA-Z\\s]+")){
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

    private void txtfnumerotelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnumerotelefoneFocusLost
        String text = txtfnumerotelefone.getText().trim();
        if (!text.isEmpty() && !text.matches("\\d+")) {
            txtfnumerotelefone.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            String mensagem = "Número inválido";
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

    private void ftxtfcepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfcepFocusLost
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
    }//GEN-LAST:event_ftxtfcepFocusLost

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

    private void ftxtfdataadimisaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfdataadimisaoFocusLost
        String data = ftxtfdataadimisao.getText().trim();
        if (data.equals("  /  /    ") || data.isEmpty()) {    // Verifica se o campo está vazio
            ftxtfdataadimisao.setBorder(null);
            lblerrodataadimisao.setText("");
        } else {
            ValidarData validarData = new ValidarData();
            boolean valida = validarData.validardata(data); // Chama a função validardata passando a data
            if (valida) {
                ftxtfdataadimisao.setBorder(null);
                lblerrodataadimisao.setText("");
            } else {
                ftxtfdataadimisao.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                lblerrodataadimisao.setText("Data inválida");
            }
        }
    }//GEN-LAST:event_ftxtfdataadimisaoFocusLost

    private void ftxtfdataemissaocarteiraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfdataemissaocarteiraFocusLost
        String data = ftxtfdataemissaocarteira.getText().trim();
        if (data.equals("  /  /    ") || data.isEmpty()) {    // Verifica se o campo está vazio
            ftxtfdataemissaocarteira.setBorder(null);
            lblerrodataemissaocarteira.setText("");
        } else {
            ValidarData validarData = new ValidarData();
            boolean valida = validarData.validardata(data); // Chama a função validardata passando a data
            if (valida) {
                ftxtfdataemissaocarteira.setBorder(null);
                lblerrodataemissaocarteira.setText("");
            } else {
                ftxtfdataemissaocarteira.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                lblerrodataemissaocarteira.setText("Data inválida");
            }
        }
    }//GEN-LAST:event_ftxtfdataemissaocarteiraFocusLost

    private void ftxtfdatanascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtfdatanascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtfdatanascimentoActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Cadastro_de_Funcionario.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
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
            java.util.logging.Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Cadastro_de_Funcionario().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxcargos;
    private javax.swing.JComboBox<String> cbxestados;
    private javax.swing.JFormattedTextField ftxtfcep;
    private javax.swing.JFormattedTextField ftxtfdataadimisao;
    private javax.swing.JFormattedTextField ftxtfdataemissaocarteira;
    private javax.swing.JFormattedTextField ftxtfdatanascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblerrocep;
    private javax.swing.JLabel lblerrocpf;
    private javax.swing.JLabel lblerrodataadimisao;
    private javax.swing.JLabel lblerrodataemissaocarteira;
    private javax.swing.JLabel lblerrodatanascimento;
    private javax.swing.JLabel lblerroemail;
    private javax.swing.JLabel lblerronome;
    private javax.swing.JLabel lblerronumerotelefone;
    private javax.swing.JLabel lblerrorg;
    private javax.swing.JLabel lblimagemcadastrofuncionario;
    private javax.swing.JRadioButton rbtnstatus;
    private javax.swing.JTextField txtfagencia;
    private javax.swing.JTextField txtfbairro;
    private javax.swing.JTextField txtfbanco;
    private javax.swing.JTextField txtfcidade;
    private javax.swing.JTextField txtfcomplemento;
    private javax.swing.JTextField txtfconta;
    private javax.swing.JTextField txtfcpf;
    private javax.swing.JTextField txtfemail;
    private javax.swing.JTextField txtfnome;
    private javax.swing.JTextField txtfnumerotelefone;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfrg;
    private javax.swing.JTextField txtfrua;
    private javax.swing.JTextField txtnnumerofuncionario;
    // End of variables declaration//GEN-END:variables
//
    
}
