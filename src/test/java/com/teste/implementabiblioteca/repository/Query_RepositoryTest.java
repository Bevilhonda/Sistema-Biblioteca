package com.teste.implementabiblioteca.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.Instant;
import java.util.List;

import static java.time.Instant.now;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class Query_RepositoryTest {
    @Autowired
    Query_Repository repository;

    @Test
    public void testSaveAutor() {
        Instant now = Instant.now();

        AutorEntity entity =  new AutorEntity("Teste Autor","Juca",now);

        repository.save(entity);

        List<AutorEntity> autorlist = repository.findAll();

        assertThat(autorlist).isNotNull();

        assertThat(autorlist.size()).isEqualTo(1);

        AutorEntity atual = autorlist.get(0);

        assertThat(atual.data_nascimento).isEqualTo(now);
        assertThat(atual.id_autor).isEqualTo(1);
        assertThat(atual.nome).isEqualTo("Teste Autor");
        assertThat(atual.sobrenome).isEqualTo("Juca");
    }
}