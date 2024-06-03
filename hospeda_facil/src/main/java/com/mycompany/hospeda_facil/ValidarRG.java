/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

import javax.swing.JOptionPane;

/**
 *
 * @author NEY SCHUNK
 */
public class ValidarRG {
    public static boolean validarRG(String rg) {
        if (rg == null || rg.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo RG não pode estar vazio.");
            return false;
        }

        String rgLimpo = rg.replaceAll("[^0-9A-Za-z]", "");

        if (rgLimpo.length() < 7 || rgLimpo.length() > 9) {
            JOptionPane.showMessageDialog(null, "O RG deve ter entre 7 e 9 caracteres.");
            return false;
        }

        if (!rgLimpo.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "O RG contém caracteres inválidos.");
            return false;
        }
        return true;
    }
    
    
    
}
