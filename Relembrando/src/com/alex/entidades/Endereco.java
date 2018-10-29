/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.entidades;

/**
 *
 * @author xandao
 */
public class Endereco {
    private int Id;
    private String Rua;
    private int Numero;
    private Bairro Bairro;
    private Cidade Cidade;
    private String CEP;
    private UF UF;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Bairro getBairro() {
        return Bairro;
    }

    public void setBairro(Bairro Bairro) {
        this.Bairro = Bairro;
    }

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade Cidade) {
        this.Cidade = Cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public UF getUF() {
        return UF;
    }

    public void setUF(UF UF) {
        this.UF = UF;
    }
    
    
}
