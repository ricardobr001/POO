/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.banco;

public class Banco {
  private String nome;
  private int n_contas;
  private int qtdd_contas;
  public Conta[] contas;

  /*
   *Construtor*
   */
  public Banco(String nome, int n_contas) {
    this.nome = nome;
    this.n_contas = n_contas;
    this.contas = new Conta[n_contas];
    this.qtdd_contas = 0;
  }

  public boolean adicionaConta(Conta conta) {
    if (n_contas == qtdd_contas) {    //O banco já tem o máximo de contas que ele suporta
      return false;
    }

    this.contas[qtdd_contas] = conta;
    this.qtdd_contas++;
    return true;
  }
  
  public String mostraContas(){
      String retorno = "";
      for (int i = 0 ; i < this.qtdd_contas ; i++){
          retorno = retorno + this.contas[i].getCliente() + "Saldo: " + this.contas[i].getSaldo() + "\n";
      }
      
      return retorno;
  }

  public String getNome() {
    return this.nome;
  }
  
  public boolean contem(Conta c){
      for (int i = 0 ; i < this.qtdd_contas ; i++){
          if (this.contas[i] == c){
              return true;
          }
      }
      
      return false;
  }
}