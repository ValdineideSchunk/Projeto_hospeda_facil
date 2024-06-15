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
public class Lista_de_Hóspede extends javax.swing.JFrame {

    int pesquisa = 0;
    public Lista_de_Hóspede() {
        initComponents();
        
        JButton[] buttons = {// chamando função para transformar botões transparente
        btnmenu, btnhospede,btnpesquisarhospede,
        btnreserva, btnmapa, btnajustes,btnnovohospede,
        btnpesquisarporcpf, btnpesquisarpornome};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        JTextField[] textFields = {// chamando função para transformar TextField transparente
        txtfpesquisahospede};
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
        tbllistahospede = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnnovohospede = new javax.swing.JButton();
        btnpesquisarhospede = new javax.swing.JButton();
        btnpesquisarporcpf = new javax.swing.JButton();
        btnpesquisarpornome = new javax.swing.JButton();
        txtfpesquisahospede = new javax.swing.JTextField();
        Lista_de_Hóspede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbllistahospede.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbllistahospede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "CPF", "Telefone", "Sexo"
            }
        ));
        tbllistahospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllistahospedeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllistahospede);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 710, 400));

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

        btnnovohospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovohospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovohospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 230, 50));

        btnpesquisarhospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarhospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 50, 50));

        btnpesquisarporcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarporcpfActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarporcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 128, 60, 36));

        btnpesquisarpornome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarpornomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarpornome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 125, 80, 40));

        txtfpesquisahospede.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfpesquisahospede.setBorder(null);
        jPanel1.add(txtfpesquisahospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 310, 30));

        Lista_de_Hóspede.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Lista_de_Hóspede.png")); // NOI18N
        jPanel1.add(Lista_de_Hóspede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void PopularTbllistahospede(String sql){        // função responsavel por popular alista de funcionario
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
            DefaultTableModel model = (DefaultTableModel) tbllistahospede.getModel();
            model.setNumRows(0);
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("id_hospede"),
                    resultado.getString("nome_hospede"),
                    resultado.getString("cpf"),
                    resultado.getString("celular"), 
                    resultado.getString("sexo"),
                });
            }
            conexao.close();
            banco.close();        
        } catch (SQLException ex) {
            Logger.getLogger(Lista_de_Hóspede.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Lista_de_Hóspede.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Lista_de_Hóspede.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Lista_de_Hóspede.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Lista_de_Hóspede.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Lista_de_Hóspede.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnnovohospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovohospedeActionPerformed
        Lista_de_Hóspede.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovohospedeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.PopularTbllistahospede("SELECT * from hospedes");
    }//GEN-LAST:event_formWindowOpened

    private void tbllistahospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistahospedeMouseClicked
        int linha = tbllistahospede.getSelectedRow();
        id = tbllistahospede.getValueAt(linha, 0).toString();
        Lista_de_Hóspede.this.dispose();
        Visualizando_Cadastro_de_Hospede objeto2 = new Visualizando_Cadastro_de_Hospede();
        objeto2.setVisible(true);                                           
    }//GEN-LAST:event_tbllistahospedeMouseClicked

    private void btnpesquisarporcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarporcpfActionPerformed
        pesquisa = 1;
        txtfpesquisahospede.requestFocus();
    }//GEN-LAST:event_btnpesquisarporcpfActionPerformed

    private void btnpesquisarpornomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarpornomeActionPerformed
        pesquisa = 2;
        txtfpesquisahospede.requestFocus();
    }//GEN-LAST:event_btnpesquisarpornomeActionPerformed

    private void btnpesquisarhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarhospedeActionPerformed
        String textoDoCampo = txtfpesquisahospede.getText(); // evento responsavel por pesquisar hospedes de acordo com o filtro selecionado
        switch(pesquisa) {
            case 1:
        this.PopularTbllistahospede("SELECT * FROM hospedes WHERE cpf = '" + textoDoCampo + "'");
        break;
            case 2:
        this.PopularTbllistahospede("SELECT * FROM hospedes WHERE nome_hospede LIKE '%" + textoDoCampo + "%'");
        break;
            default:
        JOptionPane.showMessageDialog(null, "Selecione como Deseja Pesquisar");
            break;
        }
    }//GEN-LAST:event_btnpesquisarhospedeActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_de_Hóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Hóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Hóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Hóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_de_Hóspede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lista_de_Hóspede;
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovohospede;
    private javax.swing.JButton btnpesquisarhospede;
    private javax.swing.JButton btnpesquisarporcpf;
    private javax.swing.JButton btnpesquisarpornome;
    private javax.swing.JButton btnreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllistahospede;
    private javax.swing.JTextField txtfpesquisahospede;
    // End of variables declaration//GEN-END:variables
}
