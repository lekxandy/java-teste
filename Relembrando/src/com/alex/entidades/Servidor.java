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
public class Servidor {
    
    private int Id;
    private Situacao Situacao;
    private String nome;
    private long Matricula;
    private Funcao Funcao;
    private Date Nascimento;
    private Date Admissao;
    private String RG;
    private String CPF;
    private String Email;
    private Contato Contatos[];
    private Dependente Dependentes[];
    private Endereco Enderecos[];
    private Lotacao Lotacoes[];
    private Licenca licencas[];

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Situacao getSituacao() {
        return Situacao;
    }

    public void setSituacao(Situacao Situacao) {
        this.Situacao = Situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return Matricula;
    }

    public void setMatricula(long Matricula) {
        this.Matricula = Matricula;
    }

    public Funcao getFuncao() {
        return Funcao;
    }

    public void setFuncao(Funcao Funcao) {
        this.Funcao = Funcao;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public Date getAdmissao() {
        return Admissao;
    }

    public void setAdmissao(Date Admissao) {
        this.Admissao = Admissao;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Contato[] getContatos() {
        return Contatos;
    }

    public void setContatos(Contato[] Contatos) {
        this.Contatos = Contatos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Endereco[] getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(Endereco[] Enderecos) {
        this.Enderecos = Enderecos;
    }

    public Lotacao[] getLotacoes() {
        return Lotacoes;
    }

    public void setLotacoes(Lotacao[] Lotacoes) {
        this.Lotacoes = Lotacoes;
    }

    public Licenca[] getLicencas() {
        return licencas;
    }

    public void setLicencas(Licenca[] licencas) {
        this.licencas = licencas;
    }
    
    
    
}
