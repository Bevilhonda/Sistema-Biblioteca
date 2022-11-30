package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.Instant;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class AutorRepositoryTest {

    @Autowired
    AutorRepository repository;

    @Test
    public void testSave() {
        Instant now = Instant.now();

        AutorEntity entity = new AutorEntity("Test Autor", "Last Name", now);

        repository.save(entity);

        List<AutorEntity> autorList = repository.findAll();

        assertThat(autorList).isNotNull();

        assertThat(autorList.size()).isEqualTo(1);

        AutorEntity actual = autorList.get(0);

        assertThat(actual.dat_birth).isEqualTo(now);
        assertThat(actual.idt_autor).isEqualTo(1);
        assertThat(actual.val_name).isEqualTo("Test Autor");
        assertThat(actual.val_last_name).isEqualTo("Last Name");
    }
}
