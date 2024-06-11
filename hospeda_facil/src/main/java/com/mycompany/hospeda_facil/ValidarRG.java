/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

/**
 *
 * @author NEY SCHUNK
 */
public class ValidarRG {
    public static boolean validarRG(String rg) {
        if (rg == null || rg.trim().isEmpty()) {// verifica se o camo esta vazio
        return true;
        }
        
        String rgLimpo = rg.replaceAll("[^0-9A-Za-z]", "");// Remove todos os caracteres que não são dígitos

        if (rgLimpo.length() < 7 || rgLimpo.length() > 9) {// Verifica se o comprimento está entre 7 e 9 caracteres
            return false;
        }

        if (!rgLimpo.matches("[0-9]+")) {// Verifica se contém apenas dígitos
            return false;
        }
        return true;
    }
    
    
    
}
