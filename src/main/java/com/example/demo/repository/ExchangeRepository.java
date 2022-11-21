package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface ExchangeRepository extends JpaRepository<Tutorial, Integer> {

    @Query(value = "SELECT idt_currency_exchange, idt_currency_initial, idt_currency_final, exchange FROM currency_exchange where idt_currency_exchange = :idCurrencyExchange", nativeQuery = true)
    Tutorial getTutorial(Integer idCurrencyExchange);
}
