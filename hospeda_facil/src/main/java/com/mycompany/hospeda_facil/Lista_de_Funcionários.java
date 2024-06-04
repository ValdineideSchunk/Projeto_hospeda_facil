/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEY SCHUNK
 */
public class Lista_de_Funcionários extends javax.swing.JFrame {

    /**
     * Creates new form Lista_de_Funcionários
     */
    public Lista_de_Funcionários() {
        initComponents();
        
        JButton[] buttons = {
        btnmenu, btnhospede,btnpesquisarfuncionario,
        btnreserva, btnmapa, btnajustes,btnnovofuncionario};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
    }
    public void PopularTbllistafuncionarios(String sql) {
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
            
            DefaultTableModel model = (DefaultTableModel) tbllistafuncionarios.getModel();
            
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("id_funcionario"),
                    resultado.getString("nome_funcionario"),
                    resultado.getString("cpf"),
                    resultado.getString("celular"), 
                    resultado.getString("sexo"),
                    resultado.getString("cargo"),
                    resultado.getString("status_funcionario")
                });
            }
            
            conexao.close();
            banco.close();
        } catch (SQLException ex) {
            Logger.getLogger(Lista_de_Funcionários.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        tbllistafuncionarios = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnnovofuncionario = new javax.swing.JButton();
        btnpesquisarfuncionario = new javax.swing.JButton();
        lblLista_de_Funcionários = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbllistafuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tbllistafuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "CPF", "Telefone", "sexo", "Cargo", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbllistafuncionarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 890, 400));

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

        btnnovofuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovofuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 583, 240, 50));
        jPanel1.add(btnpesquisarfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 120, 50, 40));

        lblLista_de_Funcionários.setIcon(new javax.swing.ImageIcon("D:\\Users\\msantana\\Desktop\\Gerenciamento de Hospedagens\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Lista_de_Funcionários.png")); // NOI18N
        jPanel1.add(lblLista_de_Funcionários, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Lista_de_Funcionários.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Lista_de_Funcionários.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Lista_de_Funcionários.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Lista_de_Funcionários.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Lista_de_Funcionários.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void btnnovofuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovofuncionarioActionPerformed
        Lista_de_Funcionários.this.dispose();
        Cadastro_de_Funcionario objeto2 = new Cadastro_de_Funcionario();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovofuncionarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.PopularTbllistafuncionarios("SELECT * from funcionarios");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Lista_de_Funcionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Funcionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Funcionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Funcionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_de_Funcionários().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovofuncionario;
    private javax.swing.JButton btnpesquisarfuncionario;
    private javax.swing.JButton btnreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLista_de_Funcionários;
    private javax.swing.JTable tbllistafuncionarios;
    // End of variables declaration//GEN-END:variables
}
