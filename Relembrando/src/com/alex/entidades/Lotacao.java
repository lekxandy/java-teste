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
public class Lotacao {
    
    private int Id;
    private Instituicao Instituicao;
    private Date DataInicial;
    private Date DataFinal;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getDataInicial() {
        return DataInicial;
    }

    public void setDataInicial(Date DataInicial) {
        this.DataInicial = DataInicial;
    }

    public Date getDataFinal() {
        return DataFinal;
    }

    public void setDataFinal(Date DataFinal) {
        this.DataFinal = DataFinal;
    }
    
    
}
