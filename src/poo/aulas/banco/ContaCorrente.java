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
public class ContaCorrente extends Conta implements Tributavel {
    public static int i;
    public ContaCorrente(Cliente titular, int numero, double saldo, double limite) {
        super(titular, numero, saldo, limite);
    }

    public ContaCorrente() {
        super();
        this.i = 0;
    }
    
    @Override
    public void atualizaSaldo(double taxa){
        //super.atualizaSaldo(taxa*2);
        this.saldo = ((this.saldo) * (1 + (taxa / 100))) * 2;
    }
    
    @Override
    public boolean deposita(double valor){
        return super.deposita(valor - 0.1);
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
    
    public static int metodo1(){
       // int static i;
        i++;
        return i;
    }
    
    public int getI(){
        return ContaCorrente.i;
    }
}
