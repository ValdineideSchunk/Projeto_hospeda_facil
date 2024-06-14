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
 * @author vschunk ok
 */
public class Check_out extends javax.swing.JFrame {

    int idreserva = Integer.parseInt(id);
    
    public Check_out() {
        initComponents();
        
        JButton[] buttons = {
        btnfinalizarreserva, btnvoltar};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        ftxtfdataentrada, txtfacomodacao, txtfhospede};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
 
        PopulandoRCheckin(); 
    }
    public String formatoDatavoltando(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }
    
     public void PopulandoRCheckin(){    
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
                    String databanco = resultado.getString("data_checkout");
                    String datacheckin = formatoDatavoltando(databanco);
                    ftxtfdataentrada.setText(datacheckin);

                    txtfhospede.setText(resultado.getString("nome_hospede"));
                    txtfacomodacao.setText("N°: " + resultado.getString("fk_acomodacao") +
                                         "\nNome: " + resultado.getString("nome_acomodacao"));
                    
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
        btnfinalizarreserva = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        ftxtfdataentrada = new javax.swing.JFormattedTextField();
        txtfacomodacao = new javax.swing.JTextField();
        txtfhospede = new javax.swing.JTextField();
        lblImagem_Check_out = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfinalizarreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarreservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizarreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 191, 240, 39));

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 192, 127, 39));

        ftxtfdataentrada.setEditable(false);
        ftxtfdataentrada.setBorder(null);
        try {
            ftxtfdataentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtfdataentrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ftxtfdataentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 75, 100, 22));

        txtfacomodacao.setEditable(false);
        txtfacomodacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfacomodacao.setBorder(null);
        jPanel1.add(txtfacomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 200, 23));

        txtfhospede.setEditable(false);
        txtfhospede.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfhospede.setBorder(null);
        jPanel1.add(txtfhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 23));

        lblImagem_Check_out.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImagem_Check_out.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Chech_out.png")); // NOI18N
        jPanel1.add(lblImagem_Check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Check_out.this.dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnfinalizarreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarreservaActionPerformed
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "UPDATE reservas SET status_reserva = ? WHERE id_reserva = ?";
            statement = conexao.prepareStatement(sql);
            String status ="Finalizada";
            statement.setString(1,status);
            statement.setString(2,id);
            statement.executeUpdate();
            statement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Check-out Realizado com Sucesso!!!");
            Check_out.this.dispose();
            Visualizando_Reserva_Antes_Check_in.fechartela();
        } catch (SQLException ex) {
            Logger.getLogger(Check_out.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfinalizarreservaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Visualizando_Reserva_Antes_Check_in.fechartela();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinalizarreserva;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JFormattedTextField ftxtfdataentrada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagem_Check_out;
    private javax.swing.JTextField txtfacomodacao;
    private javax.swing.JTextField txtfhospede;
    // End of variables declaration//GEN-END:variables
}
