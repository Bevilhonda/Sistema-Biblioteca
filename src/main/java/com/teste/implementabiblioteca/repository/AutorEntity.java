package com.teste.implementabiblioteca.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table( name = "Autor")
public class AutorEntity {

    public AutorEntity() {
    }

    public AutorEntity(String nome, String sobrenome, Instant data_nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
    }
    @Id
    @GeneratedValue
    Integer id_autor;

    String nome;

    String sobrenome;

    Instant data_nascimento;


    public Integer getId_autor() {
        return id_autor;
    }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public Instant getData_nascimento() {
        return data_nascimento;
    }

}
