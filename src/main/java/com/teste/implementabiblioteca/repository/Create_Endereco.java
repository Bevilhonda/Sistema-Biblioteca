package com.teste.implementabiblioteca.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Create_Endereco {
    @Id
    @GeneratedValue

    Integer id_endereco;
    String rua;
    Integer numero;
    String bairro;
    String cidade;
    String estado;
}
