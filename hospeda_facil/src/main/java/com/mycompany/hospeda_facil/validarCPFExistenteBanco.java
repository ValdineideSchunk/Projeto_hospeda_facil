/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospeda_facil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NEY SCHUNK
 */
public class validarCPFExistenteBanco {
    public static boolean validarCPFExistentehospede(String cpf) throws SQLException {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            String sql = "SELECT COUNT(*) AS total FROM hospedes WHERE cpf = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, cpf);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int total = resultSet.getInt("total");
                return total > 0; // Retorna true se o CPF já existir no banco de dados
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }

        return false;
    }
    public static boolean validarCPFExistentefuncionario(String cpf) throws SQLException {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String url = "jdbc:mysql://localhost/hospedagem";
            String usuario ="root";
            String senha ="";
            conexao =DriverManager.getConnection(url,usuario,senha);
            String sql = "SELECT COUNT(*) AS total FROM funcionarios WHERE cpf = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, cpf);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int total = resultSet.getInt("total");
                return total > 0; // Retorna true se o CPF já existir no banco de dados
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }

        return false;
    }
    
    
    
    
    
    
}
