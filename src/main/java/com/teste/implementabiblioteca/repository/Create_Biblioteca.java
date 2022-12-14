package com.teste.implementabiblioteca.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Create_Biblioteca {

    @Id
    @GeneratedValue

    Integer id_biblioteca;
    String nome_da_biblioteca;
    Integer fk_endereco;
}
