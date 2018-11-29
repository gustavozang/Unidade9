/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavoz.dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Gustavo
 */
public class FuncionarioRelatorioDAO {
    public Connection conn;
    public JasperPrint relat;
    
    public FuncionarioRelatorioDAO(){
        conn = new ConnectionFactory().getConnection();
        
    }
    public JasperPrint gerar(){
        try{
            HashMap map = new HashMap();
            String arquivo = "ireport/RelatorioFuncionario.jasper";
            relat = JasperFillManager.fillReport(arquivo, map, conn);
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
        return relat;
    }
    
}
