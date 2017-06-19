/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aulas.banco.cliente;

/**
 *
 * @author aluno
 */
public class Cliente {
    private final String rg;
    
    public Cliente(String rg){
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }
}
