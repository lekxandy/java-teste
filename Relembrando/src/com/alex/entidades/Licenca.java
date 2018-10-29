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
class Licenca {
    private int Id;
    private String Descricao;
    private Tipo Tipo;
    private Date DataInicio;
    private Date DataFim;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo Tipo) {
        this.Tipo = Tipo;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }
    
    
}
