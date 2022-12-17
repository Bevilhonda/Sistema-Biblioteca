package com.teste.implementabiblioteca.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
@Entity
@Table( name = "Autor")
public class Autor_Entidade {


    @GeneratedValue
    @Id
    Integer id_autor;
    String nome_autor;
    String sobrenome_autor;
    Instant nascimento_autor;

    public Autor_Entidade() {
    }

    public Autor_Entidade(Integer id_autor ,String inclui_nome, String inclui_sobrenome, Instant inclui_data_nascimento){
        this.id_autor = id_autor;
        this.nome_autor = inclui_nome;
        this.sobrenome_autor = inclui_sobrenome;
        this.nascimento_autor = inclui_data_nascimento;
    }

    public Integer getId_autor() {return id_autor; }
    public String getNome_autor() {
        return nome_autor;
    }
    public String getSobrenome_autor() {
        return sobrenome_autor;
    }
    public Instant getNascimento_autor() {
        return nascimento_autor;
    }
}
