/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.util;

import poo.aulas.banco.ContaCorrente;
import poo.aulas.banco.Tributavel;

/**
 *
 * @author aluno
 */
public class TestaTributavel {
    public static void main(String[] args){
        /*Testando o contrato tributavel*/
        System.out.println("Testando tributavel");

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        /*Gera um erro de execução*/
        //System.out.println(t.getSaldo());
        
        /*Usar cc para getSaldo()*/
        System.out.println(cc.getSaldo());
    }    
}
