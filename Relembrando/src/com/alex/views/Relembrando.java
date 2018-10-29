package com.alex.views;

import com.alex.entidades.*;
import java.util.Date;

public class Relembrando {


    public static void main(String[] args) {
        
        Servidor alex = new Servidor();
        
        alex.setNome("Alexander Roberto dos Santos");
        alex.setCPF("05581327904");
        alex.setRG("96585454");
        alex.setEmail("lekxandy@gmail.com");
        alex.setMatricula(992013);
        
        Funcao funcao = new Funcao();
        funcao.setId(1);
        funcao.setDescricao("Agente administrativo escolar");
        funcao.setHorasSemanais(40);
           
        Contato contato = new Contato();
        contato.setId(1);
        contato.setNumero("41987138561");
        Contato contatos[] = {contato};
        
        Lotacao lotacao = new Lotacao();
        lotacao.setId(1);
        lotacao.setDataInicial(new Date(2016, 4, 1));
        lotacao.setDataFinal(new Date(2017, 12, 31));
        Lotacao lotacoes[] = {lotacao};
       
        Endereco endereco = new Endereco();
        Bairro bairro = new Bairro();
        bairro.setId(2);
        bairro.setDescricao("Planta Deodoro");
        Cidade cidade = new Cidade();
        cidade.setId(1);
        cidade.setDescricao("Piraquara");
        UF uf = new UF();
        uf.setId(1);
        uf.setDescricao("Paraná");
        uf.setSigla("PR");
        
        endereco.setId(1);
        endereco.setCEP("83304270");
        endereco.setNumero(519);
        endereco.setRua("Rua da Paz");
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setUF(uf);
        
        Endereco enderecos[] = {endereco};
        
        alex.setEnderecos(enderecos);
        alex.setContatos(contatos);
        alex.setAdmissao(new Date(4,1,2016));
        alex.setLotacoes(lotacoes);
        alex.setFuncao(funcao);
        
        System.out.println(alex.getEnderecos()[0].getBairro().getDescricao());
    }
    
}
