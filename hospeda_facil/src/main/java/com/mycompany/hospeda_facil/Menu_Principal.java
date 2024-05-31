/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class Menu_Principal extends javax.swing.JFrame {
    public Menu_Principal() {
        initComponents();
        
        transformarButtostransparente();
        
         
    }
   
    private void transformarButtostransparente() { //Deixando jButtons trasparente
    JButton[] buttons = {
        btnnovareserva, btnmenu, btnhospede,
        btnreserva, btnmapa, btnajustes,
        
    };
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];                
            button.setOpaque(false);                    
            button.setBackground(new Color(0, 0, 0, 0));                       
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnnovareserva = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnhospede = new javax.swing.JButton();
        btnmapa = new javax.swing.JButton();
        btnajustes = new javax.swing.JButton();
        btnreserva = new javax.swing.JButton();
        lblimagemMenuprincipal = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnovareserva.setBorder(null);
        btnnovareserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnovareservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnovareservaMouseExited(evt);
            }
        });
        btnnovareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovareservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnnovareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 230, 50));

        btnmenu.setBorder(null);
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
            }
        });
        jPanel1.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 29, 81, 82));

        btnhospede.setBorder(null);
        btnhospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhospedeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhospedeMouseExited(evt);
            }
        });
        btnhospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 162, 77, 87));

        btnmapa.setBorder(null);
        btnmapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmapaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmapaMouseExited(evt);
            }
        });
        btnmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmapaActionPerformed(evt);
            }
        });
        jPanel1.add(btnmapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 82, 64));

        btnajustes.setBorder(null);
        btnajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnajustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnajustesMouseExited(evt);
            }
        });
        jPanel1.add(btnajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 531, 82, 90));

        btnreserva.setBorder(null);
        btnreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnreservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnreservaMouseExited(evt);
            }
        });
        btnreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));

        lblimagemMenuprincipal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblimagemMenuprincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\NEY SCHUNK\\Desktop\\HOSPEDA_FACIL\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Menu_Principal.png")); // NOI18N
        jPanel1.add(lblimagemMenuprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    private void btnnovareservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovareservaMouseEntered
        btnnovareserva.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnnovareservaMouseEntered

    private void btnnovareservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovareservaMouseExited
        btnnovareserva.setBorder(null);
    }//GEN-LAST:event_btnnovareservaMouseExited

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
         btnmenu.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        btnmenu.setBorder(null);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnhospedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhospedeMouseEntered
        btnhospede.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnhospedeMouseEntered

    private void btnhospedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhospedeMouseExited
        btnhospede.setBorder(null);
    }//GEN-LAST:event_btnhospedeMouseExited

    private void btnmapaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmapaMouseEntered
        btnmapa.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnmapaMouseEntered

    private void btnmapaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmapaMouseExited
        btnmapa.setBorder(null);
    }//GEN-LAST:event_btnmapaMouseExited

    private void btnajustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnajustesMouseEntered
        btnajustes.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnajustesMouseEntered

    private void btnajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnajustesMouseExited
        btnajustes.setBorder(null);
    }//GEN-LAST:event_btnajustesMouseExited

    private void btnreservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseEntered
        btnreserva.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnreservaMouseEntered

    private void btnreservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservaMouseExited
        btnreserva.setBorder(null);
    }//GEN-LAST:event_btnreservaMouseExited

    private void btnnovareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovareservaActionPerformed
        Menu_Principal.this.dispose();
        Nova_Reserva objeto2 = new Nova_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnnovareservaActionPerformed

    private void btnhospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospedeActionPerformed
        Menu_Principal.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnhospedeActionPerformed

    private void btnreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservaActionPerformed
        Menu_Principal.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnreservaActionPerformed

    private void btnmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmapaActionPerformed
        Menu_Principal.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_btnmapaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajustes;
    private javax.swing.JButton btnhospede;
    private javax.swing.JButton btnmapa;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnovareserva;
    private javax.swing.JButton btnreserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblimagemMenuprincipal;
    // End of variables declaration//GEN-END:variables

    

    
}
