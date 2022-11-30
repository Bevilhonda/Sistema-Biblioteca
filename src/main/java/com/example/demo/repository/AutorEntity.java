package com.example.demo.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "autor")
public class AutorEntity {
    @Id
    @GeneratedValue
    Integer idt_autor;

    String val_name;

    String val_last_name;

    Instant dat_birth;

    public AutorEntity(String name, String lastName, Instant datBirth) {
        val_name = name;
        dat_birth = datBirth;
        val_last_name = lastName;
    }
}
