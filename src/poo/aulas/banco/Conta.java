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
public class Conta {
  protected double saldo;
  protected double limite;
  protected Cliente titular;
  protected int numero;

  /*
   *Construtores*
   */
  public Conta(Cliente titular) {
    this.titular = titular;
    this.saldo = 0;
    this.limite = 0;
    this.numero = 0;
  }

  public Conta(Cliente titular, int numero) {
    this.titular = titular;
    this.saldo = 0;
    this.limite = 0;
    this.numero = numero;
  }

  public Conta(Cliente titular, int numero, double saldo, double limite) {
    this.titular = titular;
    this.saldo = saldo;
    this.limite = limite;
    this.numero = numero;
  }

    public Conta() {}

  public boolean saca (double valor) {
    if ((this.saldo + this.limite) - valor < 0) {
      return false;
    }

    this.saldo -= valor;
    return true;
  }

  public boolean deposita (double valor) {
    if (valor < 0) {
        return false;
    }
    
    this.saldo += valor;
    return true;
  }

  public boolean transfere (Conta destino, double valor) {
    boolean retirou = this.saca(valor);

    if (retirou == false) {
      return false;
    }

    destino.deposita(valor);
    return true;
  }

  public double getSaldo() {
    return this.saldo + this.limite;
  }

  public double getLimite() {
    return this.limite;
  }
  
  public String getCliente() {
      return "\nTitular: " + this.titular.getNome() + "\nCPF: " + this.titular.getCPF() + "\nEndereço: " + this.titular.getEndereco() + "\n";
  }
  
  public int getNumero(){
      return this.numero;
  }
  
  public void atualizaSaldo(double taxa) {
      this.saldo = (this.saldo) * (1 + (taxa / 100));
  }
}