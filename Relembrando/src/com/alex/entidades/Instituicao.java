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
class Instituicao {
    
    private int Id;
    private String Nome;
    private Contato Contatos[];
    private String Email;
    private Servidor Diretor;
    private Servidor Servidores[];

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

    public Servidor getDiretor() {
        return Diretor;
    }

    public void setDiretor(Servidor Diretor) {
        this.Diretor = Diretor;
    }

    public Servidor[] getServidores() {
        return Servidores;
    }

    public void setServidores(Servidor[] Servidores) {
        this.Servidores = Servidores;
    }
    
    
}
