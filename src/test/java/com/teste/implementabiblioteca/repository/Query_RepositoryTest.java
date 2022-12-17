package com.teste.implementabiblioteca.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import static java.time.Instant.now;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class Query_RepositoryTest {
    @Autowired
    Query_Repository repository;

    @Test
    public void testSaveAutor() {

        Instant data_nascimento_autor1 = LocalDateTime.parse("1975-03-10t20:30:00").toInstant(ZoneOffset.UTC);

        repository.inserir_autor("Jorge" , "lucas", data_nascimento_autor1 );

        List<AutorEntity> autorlist = repository.autores();

        assertThat(autorlist).isNotNull();

        assertThat(autorlist.size()).isEqualTo(1);

        AutorEntity atual = autorlist.get(0);

        assertThat(atual.data_nascimento).isEqualTo(data_nascimento_autor1);
        assertThat(atual.id_autor).isEqualTo(1);
        assertThat(atual.nome).isEqualTo("Teste Autor");
        assertThat(atual.sobrenome).isEqualTo("Juca");
    }
}