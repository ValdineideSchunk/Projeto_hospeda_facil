/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospeda_facil;

import static com.mycompany.hospeda_facil.Lista_de_Funcionários.id;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author NEY SCHUNK 
 */
public class Menu_Principal extends javax.swing.JFrame {

    static void fechartela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public  String idacomod;
        
        Color disponivel = new Color(0, 153, 51); 
        Color reservado = new Color(51, 102, 255);
        Color ocupado = new Color(0, 0, 204);
        Color prontolimpeza = new Color(255, 153, 0);
        Color emlimpeza = new Color(255, 204, 51);
        Color bloqueado = new Color(255, 0, 0);
    
    /**
     * Creates new form testetrocarcor
     */
    public Menu_Principal() {
        initComponents();
        
        verificarEAlterarCores();
       JButton[] buttons = { // chamando função para transformar botões tranparente
        jButton9, jButton10,jButton11,jButton12,jButton13,jButton14};
        Efeitos_Botoes.EfeitosBotoes(buttons);
        
        
        
        
    }


    
    public static boolean checkAcomodacaoExists(int idAcomodacao) {
        boolean exists = false;
        Connection conexao = null;
        PreparedStatement declaracaoPreparada = null;
        ResultSet resultado = null;
        
        try {
            // Conexão com o banco de dados
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            // Consulta para verificar a existência da acomodação
            String query = "SELECT id_acomodacao FROM acomodacoes WHERE id_acomodacao = ?";
            declaracaoPreparada = conexao.prepareStatement(query);
            declaracaoPreparada.setInt(1, idAcomodacao);
            resultado = declaracaoPreparada.executeQuery();
            
            // Verifica se a consulta retornou algum resultado
            if (resultado.next()) {
                exists = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (declaracaoPreparada != null) declaracaoPreparada.close();
                if (conexao != null) conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return exists;
    }
    
    public String getStatusAcomodacao(int idAcomodacao) {
    String status = "";
    Connection conexao = null;
    PreparedStatement declaracaoPreparada = null;
    ResultSet resultado = null;

    try {
        // Conexão com o banco de dados
        String url = "jdbc:mysql://localhost/hospedagem";
        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection(url, usuario, senha);

        // Consulta para obter o status da acomodação
        String query = "SELECT status_quarto FROM acomodacoes WHERE id_acomodacao = ?";
        declaracaoPreparada = conexao.prepareStatement(query);
        declaracaoPreparada.setInt(1, idAcomodacao);
        resultado = declaracaoPreparada.executeQuery();

        // Verifica se a consulta retornou algum resultado
        if (resultado.next()) {
            status = resultado.getString("status_quarto");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultado != null) resultado.close();
            if (declaracaoPreparada != null) declaracaoPreparada.close();
            if (conexao != null) conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    return status;
}
    public JButton getButtonByld(int id){
        switch(id){
            case 1:
                return jButton1;
            case 2:
                return jButton2;
            case 3:
                return jButton3;
            case 4:
                return jButton4;
            case 5:
                return jButton5;
            case 6:
                return jButton6;
            case 7:
                return jButton7;
            case 8:
                return jButton8;
            default:
                return null; 
        }
    }
    public String getNomeHospede(int idAcomodacao) {
    String nomeHospede = "";
    Connection conexao = null;
    PreparedStatement declaracaoPreparada = null;
    ResultSet resultado = null;

    try {
        // Conexão com o banco de dados
        String url = "jdbc:mysql://localhost/hospedagem";
        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection(url, usuario, senha);

        // Consulta para obter o nome do hóspede
        String query = "SELECT nome_hospede FROM view_informacoes_reserva " +
                       "WHERE fk_acomodacao = ? AND (status_reserva = 'Reservado' OR status_reserva = 'Hospedado')";
        declaracaoPreparada = conexao.prepareStatement(query);
        declaracaoPreparada.setInt(1, idAcomodacao);
        resultado = declaracaoPreparada.executeQuery();

        // Verifica se a consulta retornou algum resultado
        if (resultado.next()) {
            nomeHospede = resultado.getString("nome_hospede");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultado != null) resultado.close();
            if (declaracaoPreparada != null) declaracaoPreparada.close();
            if (conexao != null) conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    return nomeHospede;
    
}
   
    
    public void verificarEAlterarCores() {
    for (int idAcomodacao = 1; idAcomodacao <= 8; idAcomodacao++) {
        JPanel panel = getPanelById(idAcomodacao); // Método que retorna o JPanel correspondente ao ID
        JButton button = getButtonByld(idAcomodacao);
        JLabel label = getLabelById(idAcomodacao);
        
        if(panel != null && button!= null) {
            String status = getStatusAcomodacao(idAcomodacao);
            if (checkAcomodacaoExists(idAcomodacao)) {
                Color cor;
                String textobotao = "";
                
                switch(status){
                    case "Disponivel":
                        cor = new Color(0, 153, 51);
                        textobotao = "Nova Reserva";
                        if (label != null) label.setText("");
                        break;
                    case "Reservado":
                        cor = new Color(51, 102, 255);
                        textobotao = "Fazer Check-in";
                        if (label != null) label.setText(getNomeHospede(idAcomodacao));
                        break;
                    case "Ocupado":
                        cor = new Color(0, 0, 204);
                        textobotao = "Fazer Check-out";
                        if (label != null) label.setText(getNomeHospede(idAcomodacao));;
                        break;
                    case "Pronto p/ Limpeza":
                        cor = new Color(255, 153, 0);
                        textobotao = "Mudar Status";
                        if (label != null) label.setText("");
                        break;
                    case "Em Limpeza":
                        cor = new Color(255, 204, 51);
                        textobotao = "Mudar Status";
                        if (label != null) label.setText(""); 
                        break;
                    case "Bloqueada":
                        cor = new Color(255, 0, 0);
                        textobotao = "Desbloquear";
                        if (label != null) label.setText(""); 
                        break;
                    default:
                        cor = Color.WHITE;
                        textobotao = "";
                        break;
                }   
                panel.setBackground(cor);
                button.setBackground(cor);
                button.setText(textobotao);
                
               
            }
        }
    }
}
 

   public JLabel getLabelById(int id) {
    switch (id) {
        case 1:
            return labelHospede1;
        case 2:
            return labelHospede2;
        case 3:
            return labelHospede3;
        case 4:
            return labelHospede4;
        case 5:
            return labelHospede5;
        case 6:
            return labelHospede6;
        case 7:
            return labelHospede7;
        case 8:
            return labelHospede8;
        default:
            return null;
    }
}

public JPanel getPanelById(int id) {
    switch (id) {
        case 1:
            return Panelid1;
        case 2:
            return Panelid2;
        case 3:
            return Panelid3;
        case 4:
            return Panelid4;
        case 5:
            return Panelid5;
        case 6:
            return Panelid6;
        case 7:
            return Panelid7;
        case 8:
            return Panelid8;
        default:
            return null;
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

        jPanel6 = new javax.swing.JPanel();
        jPanelprincipal = new javax.swing.JPanel();
        Panelid1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelHospede1 = new javax.swing.JLabel();
        Panelid2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelHospede2 = new javax.swing.JLabel();
        Panelid4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelHospede4 = new javax.swing.JLabel();
        Panelid5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelHospede5 = new javax.swing.JLabel();
        Panelid6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelHospede6 = new javax.swing.JLabel();
        Panelid7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelHospede7 = new javax.swing.JLabel();
        Panelid8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        labelHospede8 = new javax.swing.JLabel();
        Panelid3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labelHospede3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        lblImagemMenu_principal = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelprincipal.setBackground(new java.awt.Color(204, 204, 255));
        jPanelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelid1.setBackground(new java.awt.Color(204, 204, 204));
        Panelid1.setPreferredSize(new java.awt.Dimension(140, 130));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Acomodação 01");

        labelHospede1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid1Layout = new javax.swing.GroupLayout(Panelid1);
        Panelid1.setLayout(Panelid1Layout);
        Panelid1Layout.setHorizontalGroup(
            Panelid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid1Layout.createSequentialGroup()
                .addGroup(Panelid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panelid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panelid1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelHospede1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(Panelid1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panelid1Layout.setVerticalGroup(
            Panelid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHospede1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 190));

        Panelid2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acomodação 02");

        labelHospede2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid2Layout = new javax.swing.GroupLayout(Panelid2);
        Panelid2.setLayout(Panelid2Layout);
        Panelid2Layout.setHorizontalGroup(
            Panelid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panelid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHospede2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panelid2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(29, 29, 29))
        );
        Panelid2Layout.setVerticalGroup(
            Panelid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHospede2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 190, 190));

        Panelid4.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acomodação 04");

        labelHospede4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid4Layout = new javax.swing.GroupLayout(Panelid4);
        Panelid4.setLayout(Panelid4Layout);
        Panelid4Layout.setHorizontalGroup(
            Panelid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Panelid4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Panelid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHospede4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panelid4Layout.setVerticalGroup(
            Panelid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHospede4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 190, 190));

        Panelid5.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acomodação 05");

        labelHospede5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid5Layout = new javax.swing.GroupLayout(Panelid5);
        Panelid5.setLayout(Panelid5Layout);
        Panelid5Layout.setHorizontalGroup(
            Panelid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid5Layout.createSequentialGroup()
                .addGroup(Panelid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(Panelid5Layout.createSequentialGroup()
                        .addGroup(Panelid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panelid5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panelid5Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(labelHospede5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panelid5Layout.setVerticalGroup(
            Panelid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHospede5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 190, 190));

        Panelid6.setBackground(new java.awt.Color(204, 204, 204));

        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Acomodação 06");

        labelHospede6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid6Layout = new javax.swing.GroupLayout(Panelid6);
        Panelid6.setLayout(Panelid6Layout);
        Panelid6Layout.setHorizontalGroup(
            Panelid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(Panelid6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panelid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelHospede6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panelid6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        Panelid6Layout.setVerticalGroup(
            Panelid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHospede6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 190, 190));

        Panelid7.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Acomodação 07");

        labelHospede7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid7Layout = new javax.swing.GroupLayout(Panelid7);
        Panelid7.setLayout(Panelid7Layout);
        Panelid7Layout.setHorizontalGroup(
            Panelid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid7Layout.createSequentialGroup()
                .addGroup(Panelid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(Panelid7Layout.createSequentialGroup()
                        .addGroup(Panelid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panelid7Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panelid7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelHospede7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panelid7Layout.setVerticalGroup(
            Panelid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHospede7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 190, 190));

        Panelid8.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Acomodação 08");

        labelHospede8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid8Layout = new javax.swing.GroupLayout(Panelid8);
        Panelid8.setLayout(Panelid8Layout);
        Panelid8Layout.setHorizontalGroup(
            Panelid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid8Layout.createSequentialGroup()
                .addGroup(Panelid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(Panelid8Layout.createSequentialGroup()
                        .addGroup(Panelid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panelid8Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panelid8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelHospede8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panelid8Layout.setVerticalGroup(
            Panelid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHospede8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 190, 190));

        Panelid3.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Acomodação 03");

        labelHospede3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHospede3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panelid3Layout = new javax.swing.GroupLayout(Panelid3);
        Panelid3.setLayout(Panelid3Layout);
        Panelid3Layout.setHorizontalGroup(
            Panelid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelid3Layout.createSequentialGroup()
                .addGroup(Panelid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panelid3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(Panelid3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Panelid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHospede3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panelid3Layout.setVerticalGroup(
            Panelid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelid3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHospede3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelprincipal.add(Panelid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 190, 190));

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 29, 81, 82));

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 162, 77, 87));

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 306, 78, 67));

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 82, 64));

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 531, 82, 90));

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 600, 210, 50));

        lblImagemMenu_principal.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\Projeto_hospeda_facil\\hospeda_facil\\src\\main\\java\\com\\mycompany\\hospeda_facil\\imagens_telas\\Menu_Principal.png")); // NOI18N
        jPanelprincipal.add(lblImagemMenu_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Color panelColor = Panelid2.getBackground();
         
         if (panelColor.equals(disponivel)) {
             
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "2";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
         }else if (panelColor.equals(ocupado)) {
            id = "2";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="2";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="2";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="2";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } 

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Color panelColor = Panelid1.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "1";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "1";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="1";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="1";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="1";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Color panelColor = Panelid3.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "3";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "3";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="3";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="3";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="3";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Color panelColor = Panelid4.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "4";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "4";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="4";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="4";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="4";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Color panelColor = Panelid5.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "5";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "5";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="5";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="5";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="5";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Color panelColor = Panelid6.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "6";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "6";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="6";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="6";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="6";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Color panelColor = Panelid7.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "7";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "7";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="7";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="7";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="7";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Color panelColor = Panelid8.getBackground();
         
         if (panelColor.equals(disponivel)) {
            Menu_Principal.this.dispose();
            Nova_Reserva objeto2 = new Nova_Reserva();
            objeto2.setVisible(true);

         }else if (panelColor.equals(reservado)) {
            id = "8";
            Check_in_menu objeto2 = new Check_in_menu();
            objeto2.setVisible(true); 
            
         }else if (panelColor.equals(ocupado)) {
            id = "8";
            Check_out_menu objeto2 = new Check_out_menu();
            objeto2.setVisible(true); 
 
        }else if (panelColor.equals(prontolimpeza)) {
            try {
                idacomod ="8";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Em Limpeza";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if (panelColor.equals(emlimpeza)) {
            try {
                idacomod ="8";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (panelColor.equals(bloqueado)) {
            try {
                idacomod ="8";
                Connection conexao = null;
                PreparedStatement statement = null;
                String url = "jdbc:mysql://localhost/hospedagem";
                String usuario = "root";
                String senha = "";
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "UPDATE reservas SET status_reserva = ? WHERE fk_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String status ="Hospedado";
                statement.setString(1,status);
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                sql = "UPDATE acomodacoes SET status_quarto = ?"
                        + "where id_acomodacao = ?";
                statement = conexao.prepareStatement(sql);
                String statusacomodação ="Disponivel";
                statement.setString(1, statusacomodação );
                statement.setString(2,idacomod);
                statement.executeUpdate();
                statement.close();
                conexao.close();
                Menu_Principal.this.dispose();
                Menu_Principal objeto2 = new Menu_Principal();
                objeto2.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Menu_Principal.this.dispose();
        Menu_Principal objeto2 = new Menu_Principal();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Menu_Principal.this.dispose();
        Cadastro_de_Hospede objeto2 = new Cadastro_de_Hospede();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Menu_Principal.this.dispose();
        Lista_de_Reserva objeto2 = new Lista_de_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Menu_Principal.this.dispose();
        Mapa_de_Reservas objeto2 = new Mapa_de_Reservas();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Menu_Principal.this.dispose();
        Ajustes objeto2 = new Ajustes();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Menu_Principal.this.dispose();
        Nova_Reserva objeto2 = new Nova_Reserva();
        objeto2.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelid1;
    private javax.swing.JPanel Panelid2;
    private javax.swing.JPanel Panelid3;
    private javax.swing.JPanel Panelid4;
    private javax.swing.JPanel Panelid5;
    private javax.swing.JPanel Panelid6;
    private javax.swing.JPanel Panelid7;
    private javax.swing.JPanel Panelid8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JLabel labelHospede1;
    private javax.swing.JLabel labelHospede2;
    private javax.swing.JLabel labelHospede3;
    private javax.swing.JLabel labelHospede4;
    private javax.swing.JLabel labelHospede5;
    private javax.swing.JLabel labelHospede6;
    private javax.swing.JLabel labelHospede7;
    private javax.swing.JLabel labelHospede8;
    private javax.swing.JLabel lblImagemMenu_principal;
    // End of variables declaration//GEN-END:variables

    private JPanel findPanelById(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JButton getButtonById(int idAcomodacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    

    private static class color {

        public color() {
        }
    }
}
