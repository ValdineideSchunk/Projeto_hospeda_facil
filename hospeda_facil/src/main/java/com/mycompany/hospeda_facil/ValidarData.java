/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

/**
 *
 * @author NEY SCHUNK
 */
public class ValidarData {
    public boolean validardata(String data) { // classe responsavel por validar a data
        if (data == null || data.trim().isEmpty()) {// Verifica se a string de data está no formato correto
            return false;
        }
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) { // Verifica se a data está no formato DD/MM/YYYY
            return false;
        }
        String[] partes = data.split("/"); // Data no formato DD/MM/YYYY
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12) {    // Verifica se o mês é válido
            return false;
        }
        if (dia < 1 || dia > 31) {   // Verifica se o dia é válido para o mês
            return false;
        }
        if (ano > 2024) {    // Verifica se o ano é válido
            return false;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {    // Verifica o número de dias em cada mês
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (anobissexto(ano)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }
        return true;// Data válida
    }
    public static boolean anobissexto(int year) {// Função auxiliar para verificar se um ano é bissexto
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
