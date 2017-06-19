/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.util;

import poo.aulas.banco.Teste;

/**
 *
 * @author aluno
 */
public class TesteStaticFinal {
    public static void main(String[] args){
        System.out.println("Testando final e static!");
        /*System.out.println("Acesso pela classe antes de criar os objetos: " + Teste.VALOR);
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        
        System.out.println("t1: " + t1.VALOR);
        System.out.println("t2: " + t2.VALOR);
        System.out.println("Acesso pela classe: " + Teste.VALOR);*/
        
        Teste t1 = new Teste(1);
        Teste t2 = new Teste(2);
        
        System.out.println("t1: " + t1.VALOR_FINAL);
        System.out.println("t2: " + t2.VALOR_FINAL);
        System.out.println("Acesso pela classe: " + Teste.VALOR);
    }
}
