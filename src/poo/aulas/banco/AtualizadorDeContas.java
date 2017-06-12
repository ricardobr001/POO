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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        double antes = 0, depois = 0;
        antes = c.getSaldo();
        
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualizaSaldo(this.selic);
        depois = c.getSaldo();
        
        /*Salvando o dinheiro modificado*/
        this.saldoTotal += (depois - antes);
        System.out.println("Saldo novo: " + c.getSaldo() + "\n");
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
}
