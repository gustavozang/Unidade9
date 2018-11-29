/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavoz.dao;

/**
 *
 * @author gustavoz
 */
public class DAOFactory {
private static DaoFornecedor Daofornecedor = new DaoFornecedor();
 private static final DaoFuncionario Daofuncionario = new DaoFuncionario();
    
    public static DaoFuncionario getDaoFuncionario(){
        return Daofuncionario;
      }//fecha método

    public static DaoFornecedor getDaoFornecedor() {
        return Daofornecedor;
    }
    
}   
