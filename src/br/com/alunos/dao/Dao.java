/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alunos.dao;

import br.com.alunos.util.ConnectionFactory;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author lucas
 */
public abstract class Dao<Entity> {
    
    protected Connection obterConexao() throws SQLException{
        return ConnectionFactory.getConexao();
    }
    
    public abstract boolean cadastrar(Entity pojo) throws SQLException;
    public abstract boolean atualizar(Entity pojo) throws SQLException;
    public abstract boolean excluir(Entity pojo) throws SQLException;
    public abstract Integer getCodigo(Entity pojo) throws SQLException;
    
}
