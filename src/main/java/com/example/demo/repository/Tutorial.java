package com.example.demo.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency_exchange")
public class Tutorial {
    @Id
    @GeneratedValue
    Integer idt_currency_exchange;

    String idt_currency_initial;

    String idt_currency_final;

    Double exchange;

    public String toString() {
        return "ID: " + idt_currency_exchange + "\n" + "CURRENCY_INITIAL: " + idt_currency_initial + "\n" + "CURRENCY_FINAL: " + idt_currency_final + "\n" + "EXCHANGE: " + exchange;
    }
}
