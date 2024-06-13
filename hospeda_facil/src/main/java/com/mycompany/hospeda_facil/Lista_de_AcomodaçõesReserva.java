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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEY SCHUNK
 */
public class Lista_de_AcomodaçõesReserva extends javax.swing.JFrame {
    public static  String ida;
    int pesquisa = 0;
    
    public Lista_de_AcomodaçõesReserva() {
        initComponents();
        
        JButton[] buttons = {
        btnmenu, btnhospede,btnpesquisaracomodacao,
        btnreserva, btnmapa, btnajustes,btnnovaacomodação,
        btnpesquisarporcpf,btnpesquisarpornome};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {
        txtfpesquisaacomodação};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllistaacomodacoes = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnnovaacomodação = new javax.swing.JButton();
        btnpesquisarporcpf = new javax.swing.JButton();
        btnpesquisarpornome = new javax.swing.JButton();
        txtfpesquisaacomodação = new javax.swing.JTextField();
        btnpesquisaracomodacao = new javax.swing.JButton();
        lblLista_de_Acomodações = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbllistaacomodacoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbllistaacomodacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Tipo", "Capacidade", "Status"
            }
        ));
        tbllistaacomodacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllistaacomodacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllistaacomodacoes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 720, 410));

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

        btnnovaacomodação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovaacomodaçãoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovaacomodação, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 596, 280, 50));
        btnnovaacomodação.getAccessibleContext().setAccessibleDescription("");

        btnpesquisarporcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarporcpfActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarporcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, 38));

        btnpesquisarpornome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarpornomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarpornome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 80, 40));

        txtfpesquisaacomodação.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfpesquisaacomodação.setBorder(null);
        jPanel1.add(txtfpesquisaacomodação, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 128, 200, 30));

        btnpesquisaracomodacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaracomodacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisaracomodacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 48, 48));

        lblLista_de_Acomodações.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Lista_de_Acomodações.png")); // NOI18N
        jPanel1.add(lblLista_de_Acomodações, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    public void PopularTbllistaacomodacoes(String sql){
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            
            PreparedStatement banco = (PreparedStatement)conexao.prepareStatement(sql);
            
            banco.execute();
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) tbllistaacomodacoes.getModel();
            
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("id_acomodacao"),
                    resultado.getString("nome_acomodacao"),
                    resultado.getString("tipo_quarto"),
                    resultado.getString("capacidade"), 
                    resultado.getString("status_quarto"),
                });
            }
            
            conexao.close();
            banco.close();
        } catch (SQLException ex) {
            Logger.getLogger(Lista_de_AcomodaçõesReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnnovaacomodaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovaacomodaçãoActionPerformed
        Lista_de_AcomodaçõesReserva.this.dispose();
        Cadastro_de_Acomodação objeto2 = new Cadastro_de_Acomodação();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovaacomodaçãoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.PopularTbllistaacomodacoes("SELECT * FROM acomodacoes");
    }//GEN-LAST:event_formWindowOpened

    private void tbllistaacomodacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistaacomodacoesMouseClicked
        
        int linha = tbllistaacomodacoes.getSelectedRow();
        ida = tbllistaacomodacoes.getValueAt(linha, 0).toString();
        
        Lista_de_AcomodaçõesReserva.this.dispose();
        Nova_Reserva objeto2 = new Nova_Reserva();
        objeto2.setVisible(true);
        objeto2.prencherDadosHospede(); 
        
    }//GEN-LAST:event_tbllistaacomodacoesMouseClicked

    private void btnpesquisarporcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarporcpfActionPerformed
        pesquisa = 1;
        txtfpesquisaacomodação.requestFocus();
    }//GEN-LAST:event_btnpesquisarporcpfActionPerformed

    private void btnpesquisarpornomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarpornomeActionPerformed
        pesquisa = 2;
        txtfpesquisaacomodação.requestFocus();
    }//GEN-LAST:event_btnpesquisarpornomeActionPerformed

    private void btnpesquisaracomodacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaracomodacaoActionPerformed
        String textoDoCampo = txtfpesquisaacomodação.getText();
        switch(pesquisa) {
            case 1:
            this.PopularTbllistaacomodacoes("SELECT * FROM acomodacoes WHERE nome_acomodacao LIKE '%" + textoDoCampo + "%'");

            break;
            case 2:
            this.PopularTbllistaacomodacoes("SELECT * FROM acomodacoes WHERE id_acomodacao = '" + textoDoCampo + "'");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Selecione como Deseja Pesquisar");
            break;
        }
    }//GEN-LAST:event_btnpesquisaracomodacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_de_AcomodaçõesReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_de_AcomodaçõesReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_de_AcomodaçõesReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_de_AcomodaçõesReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_de_AcomodaçõesReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovaacomodação;
    private javax.swing.JButton btnpesquisaracomodacao;
    private javax.swing.JButton btnpesquisarporcpf;
    private javax.swing.JButton btnpesquisarpornome;
    private javax.swing.JButton btnreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLista_de_Acomodações;
    private javax.swing.JTable tbllistaacomodacoes;
    private javax.swing.JTextField txtfpesquisaacomodação;
    // End of variables declaration//GEN-END:variables
}
