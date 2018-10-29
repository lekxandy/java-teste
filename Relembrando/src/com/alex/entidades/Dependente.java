/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.entidades;

import java.util.Date;

/**
 *
 * @author xandao
 */
class Dependente {
    private int Id;
    private String Nome;
    private Date Nascimento;
    private TipoDependente TipoDependente;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public TipoDependente getTipoDependente() {
        return TipoDependente;
    }

    public void setTipoDependente(TipoDependente TipoDependente) {
        this.TipoDependente = TipoDependente;
    }
    
    
}
