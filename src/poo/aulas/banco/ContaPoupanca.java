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
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente titular, int numero, double saldo, double limite) {
        super(titular, numero, saldo, limite);
    }   

    public ContaPoupanca() {
        super();
    }
    
    @Override
    public void atualizaSaldo(double taxa){
        super.atualizaSaldo(taxa*3);
    }
}
