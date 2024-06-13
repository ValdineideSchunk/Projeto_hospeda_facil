/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;


import static com.mycompany.hospeda_facil.Lista_de_AcomodaçõesReserva.ida;
import static com.mycompany.hospeda_facil.Lista_de_Hóspede_RealizandoReserva.idh;
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
public class Nova_Reserva extends javax.swing.JFrame {
        public static String salvandodatainicio;
        public static String salvandodatafim;
    
    public Nova_Reserva() {
        initComponents();

        JButton[] buttons = {
        btnfinalizarnovareserva, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnacomodação,
        btncpf,btnnovohospede,btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfcpfhospede,txtfnomehospede,txtfvalordiaria,txtfnumeroadultos,txtfnumerocriancas,
        txtfobservacoes,txtfdetalhesacomodacao,ftxtfdatafimreserva,ftxtfdatainicioreserva};
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

   public void prencherDadosHospede() {
        try {
            int hospede = Integer.parseInt(idh);
            Connection conexao = null;
            PreparedStatement declaracaoPreparada = null;
            ResultSet resultado = null;
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/hospedagem", "root", "");
            declaracaoPreparada = conexao.prepareStatement("SELECT * FROM hospedes WHERE id_hospede= ?");
            
            declaracaoPreparada.setLong(1,hospede);
            resultado = declaracaoPreparada.executeQuery();
            
            if (resultado.next()) {
                try {
                    txtfnomehospede.setText(resultado.getString("nome_hospede"));
                    txtfcpfhospede.setText(resultado.getString("cpf"));
                    if (ida != null) {
                    prencherdadosacomodacao();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
       
  public void prencherdadosacomodacao(){
             int idacomodacao = Integer.parseInt(ida);
             
        try {
            Connection conexao = null;
            PreparedStatement declaracaoPreparada = null;
            ResultSet resultado = null;
            
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            declaracaoPreparada = conexao.prepareStatement(
                    "SELECT * FROM acomodacoes WHERE id_acomodacao = ?");
            declaracaoPreparada.setInt(1, idacomodacao);
            resultado = declaracaoPreparada.executeQuery();
            
            
            if (resultado.next()) {
                try {
                    txtfdetalhesacomodacao.setText("Nº: " + resultado.getString("id_acomodacao") +
                               "\nNome: " + resultado.getString("nome_acomodacao") +
                               "\nTipo: " + resultado.getString("tipo_quarto"));
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ftxtfdatainicioreserva.setText(salvandodatainicio);
            ftxtfdatafimreserva.setText(salvandodatafim);
            
        } catch (SQLException ex) {
            Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ftxtfdatainicioreserva = new javax.swing.JFormattedTextField();
        ftxtfdatafimreserva = new javax.swing.JFormattedTextField();
        txtfcpfhospede = new javax.swing.JTextField();
        txtfnomehospede = new javax.swing.JTextField();
        txtfvalordiaria = new javax.swing.JTextField();
        txtfnumeroadultos = new javax.swing.JTextField();
        txtfnumerocriancas = new javax.swing.JTextField();
        txtfobservacoes = new javax.swing.JTextField();
        txtfdetalhesacomodacao = new javax.swing.JTextField();
        btncpf = new javax.swing.JButton();
        btnacomodação = new javax.swing.JButton();
        btnnovohospede = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnfinalizarnovareserva = new javax.swing.JButton();
        lblimagemnovareserva = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftxtfdatainicioreserva.setBorder(null);
        try {
            ftxtfdatainicioreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatainicioreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfdatainicioreserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfdatainicioreservaFocusLost(evt);
            }
        });
        ftxtfdatainicioreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ftxtfdatainicioreservaMouseExited(evt);
            }
        });
        jPanel1.add(ftxtfdatainicioreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 193, 120, 30));

        ftxtfdatafimreserva.setBorder(null);
        try {
            ftxtfdatafimreserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdatafimreserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ftxtfdatafimreserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfdatafimreservaFocusLost(evt);
            }
        });
        ftxtfdatafimreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ftxtfdatafimreservaMouseExited(evt);
            }
        });
        jPanel1.add(ftxtfdatafimreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 193, 120, 30));

        txtfcpfhospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfcpfhospede.setBorder(null);
        jPanel1.add(txtfcpfhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 240, 30));

        txtfnomehospede.setEditable(false);
        txtfnomehospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnomehospede.setBorder(null);
        jPanel1.add(txtfnomehospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 153, 290, 30));

        txtfvalordiaria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfvalordiaria.setBorder(null);
        jPanel1.add(txtfvalordiaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        txtfnumeroadultos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumeroadultos.setBorder(null);
        jPanel1.add(txtfnumeroadultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 357, 120, 30));

        txtfnumerocriancas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfnumerocriancas.setBorder(null);
        jPanel1.add(txtfnumerocriancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 130, 30));

        txtfobservacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfobservacoes.setBorder(null);
        jPanel1.add(txtfobservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 580, 70));

        txtfdetalhesacomodacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdetalhesacomodacao.setBorder(null);
        jPanel1.add(txtfdetalhesacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 241, 390, 30));

        btncpf.setBorder(null);
        btncpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncpfActionPerformed(evt);
            }
        });
        jPanel1.add(btncpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 103, 40, 40));

        btnacomodação.setBorder(null);
        btnacomodação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacomodaçãoActionPerformed(evt);
            }
        });
        jPanel1.add(btnacomodação, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 240, 40, 40));

        btnnovohospede.setBorder(null);
        btnnovohospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovohospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 200, 40));

        btnvoltar.setBorder(null);
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 570, 140, 50));

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

        btnfinalizarnovareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarnovareservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizarnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 570, 220, 50));

        lblimagemnovareserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemnovareserva.setIcon(new javax.swing.ImageIcon("D:\\Users\\vschunk\\Desktop\\GERENCIAMENTO_HOSPEDAGEM\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Nova_Reserva.png")); // NOI18N
        lblimagemnovareserva.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblimagemnovareservaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(lblimagemnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Nova_Reserva.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Nova_Reserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Nova_Reserva.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Nova_Reserva.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Nova_Reserva.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btncpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncpfActionPerformed
        Nova_Reserva.this.dispose();
        Lista_de_Hóspede_RealizandoReserva objeto2 = new Lista_de_Hóspede_RealizandoReserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btncpfActionPerformed

    private void btnacomodaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacomodaçãoActionPerformed
        this.setVisible(false);
        Lista_de_AcomodaçõesReserva objeto2 = new Lista_de_AcomodaçõesReserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnacomodaçãoActionPerformed

    private void lblimagemnovareservaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblimagemnovareservaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimagemnovareservaAncestorAdded

    private void btnfinalizarnovareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarnovareservaActionPerformed
        
            try {
    Connection conexao = null;
    PreparedStatement statement = null;
    String url = "jdbc:mysql://localhost/hospedagem";
    String usuario = "root";
    String senha = "";
    conexao = DriverManager.getConnection(url, usuario, senha);

    if (conexao != null) {
        try {
            String sql = "INSERT INTO reservas(fk_hospede,fk_acomodacao,data_checkin,data_checkout,"
                    + "valor_diaria,numero_adulto,numero_crianca,observacoes,status_reserva)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conexao.prepareStatement(sql);

            String data = ftxtfdatainicioreserva.getText();
            String datainicio = formatoData(data);

            data = ftxtfdatafimreserva.getText();
            String datafim = formatoData(data);

            statement.setString(1, idh);
            statement.setString(2, ida);
            statement.setString(3, datainicio);
            statement.setString(4, datafim);
            statement.setString(5, txtfvalordiaria.getText());
            statement.setString(6, txtfnumeroadultos.getText());
            statement.setString(7, txtfnumerocriancas.getText());
            statement.setString(8, txtfobservacoes.getText());
            String status = "Reservado";
            statement.setString(9, status);

            statement.executeUpdate();
            statement.close();

            sql = "UPDATE acomodacoes SET status_quarto = ?"
                    + "where id_acomodacao = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, status);
            statement.setString(2, ida);

            statement.executeUpdate();
            statement.close();

            conexao.close();

            JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso.");
            ida = null;
            Nova_Reserva.this.dispose();
            Menu_Principal objeto2 = new Menu_Principal();
            objeto2.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(Nova_Reserva.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_btnfinalizarnovareservaActionPerformed

    private void btnnovohospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovohospedeActionPerformed
        Nova_Reserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovohospedeActionPerformed

    private void ftxtfdatainicioreservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftxtfdatainicioreservaMouseExited
 
    }//GEN-LAST:event_ftxtfdatainicioreservaMouseExited

    private void ftxtfdatafimreservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftxtfdatafimreservaMouseExited
        
    }//GEN-LAST:event_ftxtfdatafimreservaMouseExited

    private void ftxtfdatainicioreservaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfdatainicioreservaFocusLost
        salvandodatainicio = ftxtfdatainicioreserva.getText();
        
    }//GEN-LAST:event_ftxtfdatainicioreservaFocusLost

    private void ftxtfdatafimreservaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfdatafimreservaFocusLost
        salvandodatafim = ftxtfdatafimreserva.getText();
        
    }//GEN-LAST:event_ftxtfdatafimreservaFocusLost
    
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
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nova_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nova_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacomodação;
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btncpf;
    private javax.swing.JButton btnfinalizarnovareserva;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovohospede;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdatafimreserva;
    private javax.swing.JFormattedTextField ftxtfdatainicioreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblimagemnovareserva;
    private javax.swing.JTextField txtfcpfhospede;
    private javax.swing.JTextField txtfdetalhesacomodacao;
    private javax.swing.JTextField txtfnomehospede;
    private javax.swing.JTextField txtfnumeroadultos;
    private javax.swing.JTextField txtfnumerocriancas;
    private javax.swing.JTextField txtfobservacoes;
    private javax.swing.JTextField txtfvalordiaria;
    // End of variables declaration//GEN-END:variables

    

    

    
}
