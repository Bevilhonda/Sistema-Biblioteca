package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import static org.junit.jupiter.api.Assertions.*;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
@Rollback(value = false)
class ExchangeRepositoryTest {
    @Autowired ExchangeRepository repository;

    @Test
    public void test() {
        Tutorial tutorial = repository.getTutorial(2);

        assertEquals(tutorial.idt_currency_exchange, 2);
        assertEquals(tutorial.idt_currency_initial, "ARS");
        assertEquals(tutorial.idt_currency_final, "BOB");
        assertEquals(tutorial.exchange, 0.04374089);
    }
}
