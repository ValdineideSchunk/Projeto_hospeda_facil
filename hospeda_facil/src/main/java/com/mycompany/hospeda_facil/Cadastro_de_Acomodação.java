/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Cadastro_de_Acomodação extends javax.swing.JFrame {
    public Cadastro_de_Acomodação() {
        initComponents();
        
        JButton[] buttons = { 
        btnfinalizarcadastro, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfcapacidade,txtfnumeroacomodacao,txtfnomeacomodacao,txtfdescricao,
        txtfmotivobloqueio,ftxtfdatafinal,ftxtfdatainicio};
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
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
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnfinalizarcadastro = new javax.swing.JButton();
        lblimagemcadastroacomodacao = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        txtfnumeroacomodacao.setEnabled(false);
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
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 306, 78, 67));

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
        jPanel1.add(btnfinalizarcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 210, 50));

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

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Cadastro_de_Acomodação.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Cadastro_de_Acomodação.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Cadastro_de_Acomodação.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Cadastro_de_Acomodação.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Cadastro_de_Acomodação.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnfinalizarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarcadastroActionPerformed
        try {
            
            String opcaoSelecionada = null;
            if (btnrindividual.isSelected()) {
                opcaoSelecionada = "Individual";
            }else if (btnrduplo.isSelected()) {
                opcaoSelecionada = "Duplo";
            }else if (btnrtriplo.isSelected()) {
                opcaoSelecionada ="Triplo";
            }else if (btnrsuite.isSelected()) {
                opcaoSelecionada ="Suite";
            }
            
            boolean wifi = cbxwifi.isSelected();
            boolean arCondicionado = cbxarcondicionado.isSelected();
            boolean tv = cbxtv.isSelected();
            boolean frigobar = cbxfrigibar.isSelected();
            boolean acessibilidade = cbxacessibilidade.isSelected();
            
            
            boolean bloqueio = btnrrestricao.isSelected();
            
            
            
            
            Connection conexao = null;
            PreparedStatement statement = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO acomodacoes(tipo_quarto,capacidade,nome_acomodacao,comodidade_wifi,"
                    + "comodidade_arcondicionado,comodidade_tv,comodidade_frigobar,comodidade_acessibilidade,descricao,"
                    + "bloqueio_acomodacao,periodo_bloqueio_inicio,periodo_bloqueio_fim,motivo_bloqueio,status_quarto)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conexao.prepareStatement(sql);

            statement.setString(1,opcaoSelecionada);
            statement.setString(2,txtfcapacidade.getText());
            statement.setString(3,txtfnomeacomodacao.getText());
            statement.setBoolean(4,wifi);
            statement.setBoolean(5,arCondicionado);
            statement.setBoolean(6,tv);
            statement.setBoolean(7,frigobar);
            statement.setBoolean(8,acessibilidade);
            statement.setString(9,txtfdescricao.getText());
            statement.setBoolean(10,bloqueio);
            
            if(btnrrestricao.isSelected()){
            String data = ftxtfdatainicio.getText();
            String datainicio = formatoData(data);
            
            data = ftxtfdatafinal.getText();
                String datafinal = formatoData(data);
                  
                statement.setString(11,datainicio);
                statement.setString(12,datafinal);
                statement.setString(13,txtfmotivobloqueio.getText());
                statement.setString(14,"Bloqueada");
            }else{
                statement.setString(11,null);
                statement.setString(12,null);
                statement.setString(13," ");
                statement.setString(14,"Disponivel");
                
            }

            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null,"Acomodação cadastrada com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Acomodação.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnfinalizarcadastroActionPerformed
    
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
