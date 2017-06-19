/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.banco;

/**
 *
 * @author aluno
 */
public class Teste {
    public final static int VALOR = 5;
    public final int VALOR_FINAL;
    
    public Teste(int n){
        this.VALOR_FINAL = n;
    }
    
    /*public void setValorFinal(int n){
       this.VALOR_FINAL = n;
    }*/
    
    public int getValor(){
        return VALOR;
    }
    
    public int getValorFinal(){
        return VALOR_FINAL;
    }
    
    /*public Teste(int i){
        Teste.VALOR = i;
    }*/
}
