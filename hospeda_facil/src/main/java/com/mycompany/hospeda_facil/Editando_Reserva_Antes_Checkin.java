/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import static com.mycompany.hospeda_facil.Lista_de_AcomodaçõesReserva.ida;
import static com.mycompany.hospeda_facil.Lista_de_Funcionários.id;
import static com.mycompany.hospeda_facil.Lista_de_Hóspede_RealizandoReserva.idh;
import static com.mycompany.hospeda_facil.Nova_Reserva.salvandodatafim;
import static com.mycompany.hospeda_facil.Nova_Reserva.salvandodatainicio;
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
public class Editando_Reserva_Antes_Checkin extends javax.swing.JFrame {
    String  idhospede,idacomodacao;
    public int idreserva = Integer.parseInt(id);
    public static String salvandodatainicio;
    public static String salvandodatafim;
    public static String salvandocpf;    
    public static String salvandonome;   
        
        
        
    public Editando_Reserva_Antes_Checkin() {
        initComponents();
        
        JButton[] buttons = {
            btnsalvaralteracoes, btnmenu, btnhospede,btnpesquisaracomodação,
            btnreserva, btnmapa, btnajustes,btnvoltar};
            Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
            txtfcpfhospede, txtfnomehospede, txtfnumeroadutos, txtfnumeroreserva,
            txtfnumerocriancas, txtfdetalhesacomodacao,txtfvalordiaria,txtfobservacoes,
            ftxtfdatainicioreserva, ftxtfdatafimreserva, txtfstatus
        };
            TextFields_Transparentes.TextFieldsTransparentes(textFields);
        
        PopulandoReservas(); 
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
    
     public void PopulandoReservas(){        //Função responsavel por polular a tela
        try {
            Connection conexao = null;
            PreparedStatement declaracaoPreparada = null;
            ResultSet resultado = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
            declaracaoPreparada = conexao.prepareStatement(
                    "SELECT * FROM view_informacoes_reserva WHERE id_reserva = ?");
            declaracaoPreparada.setInt(1, idreserva);
            resultado = declaracaoPreparada.executeQuery();
            if (resultado.next()) {
                try {
                    String databanco = resultado.getString("data_checkin");
                    String datacheckin = formatoDatavoltando(databanco);
                    ftxtfdatainicioreserva.setText(datacheckin);
                    salvandodatainicio = datacheckin;
                    
                    idhospede = resultado.getString("fk_hospede");
                    idacomodacao = resultado.getString("fk_acomodacao");
                    databanco = resultado.getString("data_checkout");
                    String datacheckout = formatoDatavoltando(databanco);
                    ftxtfdatafimreserva.setText(datacheckout);
                    salvandodatafim = datacheckout;
                    txtfcpfhospede.setText(resultado.getString("cpf"));
                    txtfnumeroreserva.setText(resultado.getString("id_reserva"));
                    txtfstatus.setText(resultado.getString("status_reserva"));
                    txtfnomehospede.setText(resultado.getString("nome_hospede"));
                    txtfdetalhesacomodacao.setText("N°: " + resultado.getString("fk_acomodacao") +
                               "\nNome: " + resultado.getString("nome_acomodacao") +
                               "\nTipo: " + resultado.getString("tipo_quarto"));
                    txtfvalordiaria.setText(resultado.getString("valor_diaria"));
                    txtfnumeroadutos.setText(resultado.getString("numero_adulto"));
                    txtfnumerocriancas.setText(resultado.getString("numero_crianca"));
                    txtfobservacoes.setText(resultado.getString("observacoes"));
                } catch (SQLException ex) {
                    Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(Level.SEVERE, null, ex);
                }
   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Visualizando_Reserva_Antes_Check_in.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnsalvaralteracoes = new javax.swing.JButton();
        txtfcpfhospede = new javax.swing.JTextField();
        txtfnomehospede = new javax.swing.JTextField();
        txtfstatus = new javax.swing.JTextField();
        txtfnumeroadutos = new javax.swing.JTextField();
        txtfnumerocriancas = new javax.swing.JTextField();
        txtfdetalhesacomodacao = new javax.swing.JTextField();
        txtfvalordiaria = new javax.swing.JTextField();
        btnpesquisaracomodação = new javax.swing.JButton();
        ftxtfdatainicioreserva = new javax.swing.JFormattedTextField();
        ftxtfdatafimreserva = new javax.swing.JFormattedTextField();
        txtfnumeroreserva = new javax.swing.JTextField();
        txtfobservacoes = new javax.swing.JTextField();
        lblimagemEditando_REserva_Antes_Checkin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 150, 50));

        btnsalvaralteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvaralteracoesActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvaralteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 210, 50));

        txtfcpfhospede.setEditable(false);
        txtfcpfhospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpfhospede.setBorder(null);
        jPanel1.add(txtfcpfhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, 30));

        txtfnomehospede.setEditable(false);
        txtfnomehospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnomehospede.setBorder(null);
        jPanel1.add(txtfnomehospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 290, 30));

        txtfstatus.setEditable(false);
        txtfstatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfstatus.setBorder(null);
        jPanel1.add(txtfstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 150, 30));

        txtfnumeroadutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroadutos.setBorder(null);
        jPanel1.add(txtfnumeroadutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 120, 30));

        txtfnumerocriancas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerocriancas.setBorder(null);
        jPanel1.add(txtfnumerocriancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 130, 30));

        txtfdetalhesacomodacao.setEditable(false);
        txtfdetalhesacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdetalhesacomodacao.setBorder(null);
        jPanel1.add(txtfdetalhesacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 390, 30));

        txtfvalordiaria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfvalordiaria.setBorder(null);
        jPanel1.add(txtfvalordiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 120, 30));

        btnpesquisaracomodação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaracomodaçãoActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisaracomodação, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 50, 40));

        ftxtfdatainicioreserva.setBorder(null);
        try {
            ftxtfdatainicioreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatainicioreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatainicioreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, 30));

        ftxtfdatafimreserva.setBorder(null);
        try {
            ftxtfdatafimreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatafimreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdatafimreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 150, 30));

        txtfnumeroreserva.setEditable(false);
        txtfnumeroreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroreserva.setBorder(null);
        jPanel1.add(txtfnumeroreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 120, 30));

        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 580, 70));

        lblimagemEditando_REserva_Antes_Checkin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemEditando_REserva_Antes_Checkin.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Editando Reserva Antes do Chech-in.png")); // NOI18N
        jPanel1.add(lblimagemEditando_REserva_Antes_Checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnsalvaralteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvaralteracoesActionPerformed
        
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "UPDATE reservas SET fk_acomodacao = ?, data_checkin = ?, data_checkout = ?, valor_diaria = ?,"
                    + " numero_adulto = ?, numero_crianca = ?, observacoes = ? WHERE id_reserva = ?";
            statement = conexao.prepareStatement(sql);
            String data = ftxtfdatainicioreserva.getText();
            String datainicio = formatoData(data);
            data = ftxtfdatafimreserva.getText();
            String datafim = formatoData(data);
            statement.setString(1,idacomodacao);
            statement.setString(2,datainicio);
            statement.setString(3,datafim);
            statement.setString(4,txtfvalordiaria.getText());
            statement.setString(5,txtfnumeroadutos.getText());
            statement.setString(6,txtfnumerocriancas.getText());
            statement.setString(7,txtfobservacoes.getText());
            statement.setString(8,id);
            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados atualizados com Sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(Editando_Reserva_Antes_Checkin.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnsalvaralteracoesActionPerformed

    private void btnpesquisaracomodaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaracomodaçãoActionPerformed
        this.setVisible(false);
        Lista_de_AcomodaçõesReserva objeto2 = new Lista_de_AcomodaçõesReserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnpesquisaracomodaçãoActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Editando_Reserva_Antes_Checkin.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Editando_Reserva_Antes_Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva_Antes_Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva_Antes_Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editando_Reserva_Antes_Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editando_Reserva_Antes_Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnpesquisaracomodação;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnsalvaralteracoes;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdatafimreserva;
    private javax.swing.JFormattedTextField ftxtfdatainicioreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagemEditando_REserva_Antes_Checkin;
    private javax.swing.JTextField txtfcpfhospede;
    private javax.swing.JTextField txtfdetalhesacomodacao;
    private javax.swing.JTextField txtfnomehospede;
    private javax.swing.JTextField txtfnumeroadutos;
    private javax.swing.JTextField txtfnumerocriancas;
    private javax.swing.JTextField txtfnumeroreserva;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfstatus;
    private javax.swing.JTextField txtfvalordiaria;
    // End of variables declaration//GEN-END:variables
}
