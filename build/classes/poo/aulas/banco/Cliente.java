/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.banco;

public class Cliente {
  private String nome;
  private String endereco;
  private String cpf;

  /*
   *Construtores*
   */
  public Cliente(String nome, String endereco, String cpf) {
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
  }

  public Cliente(String nome) {
    this.nome = nome;
    this.cpf = "";
    this.endereco = "";
  }

  public Cliente() {
    this.nome = "";
    this.cpf = "";
    this.endereco = "";
  }

  /*
   *Getters*
   */
  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public String getCPF() {
    return this.cpf;
  }
}