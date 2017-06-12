/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.util;
import poo.aulas.banco.*;

public class TesteDoBanco {
  public static void main(String[] args) {
    /*System.out.println("Bem vindo ao banco!");

    /*Criando os clientes
    Cliente cl1 = new Cliente("Ricardo", "Av. Armando Pannunzio", "721.451.110-00");
    Cliente cl2 = new Cliente("Leonardo", "Av. Armando Pannunzio", "399.745.830-80");
    Cliente cl3 = new Cliente("Vitor", "Av. Armando Pannunzio", "628.251.410-03");
    Cliente cl4 = new Cliente("Gustavo", "Av. General Carneiro", "836.601.930-62");
    Cliente cl5 = new Cliente("Chady", "Av. General Carneiro", "237.969.590-32");
    Cliente cl6 = new Cliente("Lucas", "Av. Armando Pannunzio", "428.298.740-56");
    
    Conta co1 = new Conta(cl1, 1, 1000, 1500);
    Conta co2 = new Conta(cl2, 2, 1200, 1300);
    Conta co3 = new Conta(cl3, 3, 10000, 15000);
    Conta co4 = new Conta(cl4, 4, 1478, 900);
    Conta co5 = new Conta(cl5, 5, 1250, 1400);
    Conta co6 = new Conta(cl6, 1, 1000, 1600);
    Banco b1 = new Banco("Banco do Brasil", 5);
    Banco b2 = new Banco("Santander", 5);
    
    /*Populando o banco
    if (b1.adicionaConta(co1)){
        System.out.println("Cliente 1 inserido com sucesso!");
    }
    if (b1.adicionaConta(co2)) {
        System.out.println("Cliente 2 inserido com sucesso!");
    }
    if (b1.adicionaConta(co3)) {
        System.out.println("Cliente 3 inserido com sucesso!");
    }
    if (b1.adicionaConta(co4)) {
        System.out.println("Cliente 4 inserido com sucesso!");
    }    
    if (b1.adicionaConta(co5)){
        System.out.println("Cliente 5 inserido com sucesso!");
    }
    
    System.out.println("\n\n");
    
    /*Caso que dará erro
    if (b1.adicionaConta(co6)) {
        System.out.println("Cliente inserido com sucesso!");
    }
    else {
        System.out.println("Banco cheio!!\n");
    }
    
    if (b2.adicionaConta(co6)) {
        System.out.println("Cliente inserido com sucesso!");
    }
    
    System.out.println("Verificando os dados inseridos\n");
    System.out.println(b1.mostraContas());
    
    /*Efetuando um saque
    System.out.println("Sacando R$ 1500 do Lucas!");
    
    if (b2.saca(0, 1500)) {
        System.out.println("Saque efetuado com sucesso!");
    }
    else {
        System.out.println("Saldo indisponível!");
    }
    
    System.out.println(b2.mostraContas());
    
    /*Efetuando um saque que gera erro
    System.out.println("Sacando R$ 1500 do Lucas novamente!");
    
    if (b2.saca(0, 2700)) {
        System.out.println("Saque efetuado com sucesso!");
    }
    else {
        System.out.println("Saldo indisponível!");
    }
    
    /*Depositando valor negativo
    System.out.println("\nDepositando R$ -100");
    
    if (b2.deposita(0, -100)){
        System.out.println("Depositado com sucesso!");
    }
    else {
        System.out.println("Depósito inválido!! Valor negativo!");
    }
    
    /*Criando mais um banco
    System.out.println("Banco itáu sendo criado!\n");
    Banco b3 = new Banco("Itaú", 10);
    
    for (int i = 0 ; i < 10 ; i++){
        Cliente clN = new Cliente("Arthurzinho", "Av. Armando Pannunzio", "428.298.740-56");
        Conta coN = new Conta(clN, 1, 1000, 1500);
        b3.adicionaConta(coN);
    }
    
    System.out.println("Verificando os dados inseridos em itaú\n");
    System.out.println(b3.mostraContas());
    
    /*Verificando se o metodo contem funciona corretamente
    System.out.println("Verificando se o método contém funciona!");
    if (b3.contem(co6)){
        System.out.println("Contem a conta co6");
    }
    else {
        System.out.println("Não contém a conta co6");
    }
    
    if (b2.contem(co6)){
        System.out.println("Contem a conta co6");
    }*/

    /*Exercicio 3 - aula 5*/
    /*Conta c = new Conta();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
    
    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);
    
    /*c.atualizaSaldo(0.01);
    cc.atualizaSaldo(0.01);
    cp.atualizaSaldo(0.01);
    
    System.out.println("Conta: " + c.getSaldo());
    System.out.println("Conta Corrente: " + cc.getSaldo());
    System.out.println("Conta Poupança: " + cp.getSaldo() + "\n");
    
    AtualizadorDeContas a = new AtualizadorDeContas(2);
    a.roda(c);
    a.roda(cc);
    a.roda(cp);
    System.out.println("Saldo Total: " + a.getSaldoTotal());*/
    
    /*Banco b = new Banco("Banco do Brasil", 10);
    char letra = 'A';
    String nome = "";
    nome += letra;
    
    for (int i = 0 ; i < 10 ; i++){
        Cliente cl = new Cliente(nome, "Av. Armando Pannunzio", "428.298.740-56");
        Conta co = new Conta(cl, 1, 1000, 1500);
        b.adicionaConta(co);
        letra++;
        nome += letra;
    }
    
    System.out.println(b.mostraContas());*/
  }
}
