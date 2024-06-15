/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author NEY SCHUNK
 */
public class Efeitos_Botoes {
    
    public static void EfeitosBotoes(JButton[] buttons) {// class responsavel por transformar a aparencia dos botões transparentes
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            button.setContentAreaFilled(false);
            button.setOpaque(false); 
            button.setBorder(BorderFactory.createEmptyBorder());
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) { // criar borda quando mouse estiver sobre o botão
                    button.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
                }

                @Override
                public void mouseExited(MouseEvent e) { // retirar a borda quando o mouse sair do botão
                    button.setBorder(BorderFactory.createEmptyBorder());
                }
            });
        }
    }
    
}
