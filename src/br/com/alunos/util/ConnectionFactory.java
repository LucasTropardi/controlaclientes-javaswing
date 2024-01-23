/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alunos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    
    private static final String urlBase = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String usuario = "system";
    private static final String senha = "senh@123";
    
    public static Connection getConexao() throws SQLException {
        
        Connection conexao = null;
        
        try {
            conexao = DriverManager.getConnection(urlBase, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na : "+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE );
        }
        
        return conexao;
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws StandardException {
        close(conn, ps, rs);
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps) throws StandardException {
        close(conn, ps, null);
    }
    
    public static void closeConnection(Connection conn) throws StandardException {
        close(conn, null, null);
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws StandardException {
        try {
            if (conn != null)
                conn.close();
            if (ps != null)
                ps.close();
            if (rs != null)
                rs.close();
        } catch (Exception e) {
            throw new StandardException(e.getMessage());
        }
    }
}