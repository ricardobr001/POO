/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.banco.funcionarios;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario{
    protected int senha;
    
    public boolean autentica(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!!");
            return true;
        } else {
            System.out.println("Acesso Negado!!");
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
