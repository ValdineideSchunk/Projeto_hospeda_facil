/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author NEY SCHUNK
 */
public class TextFields_Transparentes {
    public static void TextFieldsTransparentes(JTextField[] textFields) {
        for (int i = 0; i < textFields.length; i++) {
            JTextField txtf = textFields[i];
            txtf.setOpaque(false);
            txtf.setBackground(new Color(0, 0, 0, 0));
        }
    }
}
