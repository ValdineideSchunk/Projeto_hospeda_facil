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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEY SCHUNK
 */
public class Lista_de_Reserva extends javax.swing.JFrame {
    String statusreserva;
    int pesquisa = 0;
    int filtrar = 0;
    public Lista_de_Reserva() {
        initComponents();
        
        JButton[] buttons = {
        btnnovareserva, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,btnpesquisareserva,
        btnreservado,btnhospedado,btnfinalizado,btncancelada,btntodos,btnpesquisarpornome,
        btnpesquisarnumeroreserva};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        
        JTextField[] textFields = {
        txtfdadopesquisa};
        TextFields_Transparentes.TextFieldsTransparentes(textFields);
         
    }
    public String formatoDatavoltando(String data) {
        String dateStr = data;//Data no formato DD/MM/YYYY
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatterInput); // Converte a string para LocalDate
        String formattedDate = date.format(formatterOutput); // Formata a data para o novo formato
        return formattedDate;// retorno -> YYYY/MM/DD
    }
    
    
    
    public void Populartbllistareserva(String sql){
    try {
        String url = "jdbc:mysql://localhost/hospedagem";
        String usuario = "root";
        String senha = "";
        
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement banco = conexao.prepareStatement(sql);
        ResultSet resultado = banco.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) tbllistareserva.getModel();
        model.setNumRows(0);
        
        while (resultado.next()) {
            String databancoCheckin = resultado.getString("data_checkin");
            String datacheckin = formatoDatavoltando(databancoCheckin);
            String databancoCheckout = resultado.getString("data_checkout");
            String datacheckout = formatoDatavoltando(databancoCheckout);
            statusreserva = resultado.getString("status_reserva");
            
            model.addRow(new Object[] {
                resultado.getString("id_reserva"),
                resultado.getString("fk_hospede"),
                resultado.getString("nome_hospede"),
                resultado.getString("data_criacao_reserva"), 
                datacheckin,
                datacheckout,
                resultado.getString("status_reserva"),
            });
        }
        resultado.close();
        banco.close();
        conexao.close();
    } catch (SQLException ex) {
        Logger.getLogger(Lista_de_Acomodações.class.getName()).log(Level.SEVERE, null, ex);
    }
}
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllistareserva = new javax.swing.JTable();
        btnpesquisareserva = new javax.swing.JButton();
        btnnovareserva = new javax.swing.JButton();
        btnreservado = new javax.swing.JButton();
        btnhospedado = new javax.swing.JButton();
        btnfinalizado = new javax.swing.JButton();
        btncancelada = new javax.swing.JButton();
        btntodos = new javax.swing.JButton();
        btnpesquisarpornome = new javax.swing.JButton();
        btnpesquisarnumeroreserva = new javax.swing.JButton();
        txtfdadopesquisa = new javax.swing.JTextField();
        lblimagemlistadereserva = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        tbllistareserva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbllistareserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero da Reserva", "Numero do Hóspede", "Nome do Hóspede", "Data Da Resesrva", "Data Check-in", "Data Check-out", "Status"
            }
        ));
        tbllistareserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllistareservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllistareserva);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 940, 370));

        btnpesquisareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisareservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 140, 47, 41));

        btnnovareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovareservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 230, 50));

        btnreservado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnreservado, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 90, 110, 40));

        btnhospedado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospedadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnhospedado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 120, 40));

        btnfinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 120, 40));

        btncancelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceladaActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 120, 40));

        btntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodosActionPerformed(evt);
            }
        });
        jPanel1.add(btntodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 90, 40));

        btnpesquisarpornome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarpornomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarpornome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 60, 40));

        btnpesquisarnumeroreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarnumeroreservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesquisarnumeroreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 200, 40));

        txtfdadopesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfdadopesquisa.setBorder(null);
        jPanel1.add(txtfdadopesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 142, 200, 30));

        lblimagemlistadereserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemlistadereserva.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Lista_de_Reservas.png")); // NOI18N
        lblimagemlistadereserva.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblimagemlistadereservaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(lblimagemlistadereserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    private void lblimagemlistadereservaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblimagemlistadereservaAncestorAdded
        
    }//GEN-LAST:event_lblimagemlistadereservaAncestorAdded

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Lista_de_Reserva.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Lista_de_Reserva.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Lista_de_Reserva.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed

    private void btnajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajustesActionPerformed
        Lista_de_Reserva.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnajustesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva");

    }//GEN-LAST:event_formWindowOpened

    private void btnnovareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovareservaActionPerformed
        Lista_de_Reserva.this.dispose();
        Nova_Reserva objeto2 = new Nova_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovareservaActionPerformed

    private void tbllistareservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistareservaMouseClicked
        int linha = tbllistareserva.getSelectedRow();
        id = tbllistareserva.getValueAt(linha, 0).toString();
        String status = tbllistareserva.getValueAt(linha, 6).toString();
   
        if("Reservado".equals(status)){
            Lista_de_Reserva.this.dispose();
            Visualizando_Reserva_Antes_Check_in objeto2 = new Visualizando_Reserva_Antes_Check_in();
            objeto2.setVisible(true);  
        }else if("Hospedado".equals(status)){
            Lista_de_Reserva.this.dispose();
            Visualizando_Reserva_Depois_Check_in objeto2 = new Visualizando_Reserva_Depois_Check_in();
            objeto2.setVisible(true);
        }else if("Finalizada".equals(status) || "Cancelada".equals(status)){
            Lista_de_Reserva.this.dispose();
            Visualizando_Reservas_Canceladas_Finalizadas objeto2 = new Visualizando_Reservas_Canceladas_Finalizadas();
            objeto2.setVisible(true);
        }
        
        
    }//GEN-LAST:event_tbllistareservaMouseClicked

    private void btnreservadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservadoActionPerformed
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE status_reserva = 'Reservado'");
    }//GEN-LAST:event_btnreservadoActionPerformed

    private void btntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodosActionPerformed
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva");
    }//GEN-LAST:event_btntodosActionPerformed

    private void btnhospedadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedadoActionPerformed
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE status_reserva = 'Hospedado'");
    }//GEN-LAST:event_btnhospedadoActionPerformed

    private void btnfinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizadoActionPerformed
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE status_reserva = 'Finalizada'");
    }//GEN-LAST:event_btnfinalizadoActionPerformed

    private void btncanceladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceladaActionPerformed
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE status_reserva = 'Cancelada'");
    }//GEN-LAST:event_btncanceladaActionPerformed

    private void btnpesquisarpornomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarpornomeActionPerformed
        pesquisa = 1;
        txtfdadopesquisa.requestFocus();
    }//GEN-LAST:event_btnpesquisarpornomeActionPerformed

    private void btnpesquisarnumeroreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarnumeroreservaActionPerformed
        pesquisa = 2;
        txtfdadopesquisa.requestFocus();
    }//GEN-LAST:event_btnpesquisarnumeroreservaActionPerformed

    private void btnpesquisareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisareservaActionPerformed
       String textoDoCampo = txtfdadopesquisa.getText();
        switch(pesquisa) {
    case 1:
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE nome_hospede LIKE '%" + textoDoCampo + "%'");
        break;
    case 2:
        this.Populartbllistareserva("SELECT * FROM view_informacoes_reserva WHERE id_reserva = '" + textoDoCampo + "'");
        break;
    default:
        JOptionPane.showMessageDialog(null, "Selecione como Deseja Pesquisar");
        break;
}
    }//GEN-LAST:event_btnpesquisareservaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Lista_de_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_de_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_de_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btncancelada;
    private javax.swing.JButton btnfinalizado;
    private javax.swing.JButton btnhospedado;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovareserva;
    private javax.swing.JButton btnpesquisareserva;
    private javax.swing.JButton btnpesquisarnumeroreserva;
    private javax.swing.JButton btnpesquisarpornome;
    private javax.swing.JButton btnreserva;
    private javax.swing.JButton btnreservado;
    private javax.swing.JButton btntodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagemlistadereserva;
    private javax.swing.JTable tbllistareserva;
    private javax.swing.JTextField txtfdadopesquisa;
    // End of variables declaration//GEN-END:variables

    

    
}
