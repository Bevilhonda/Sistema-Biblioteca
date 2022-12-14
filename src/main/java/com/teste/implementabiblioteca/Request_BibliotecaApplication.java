package com.teste.implementabiblioteca;

import com.teste.implementabiblioteca.repository.Query_Repository;
import com.teste.implementabiblioteca.repository.AutorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class Request_BibliotecaApplication {

    @Autowired
    private Query_Repository repository;

    public static void main(String[] args) {
        SpringApplication.run(Request_BibliotecaApplication.class, args);
    }

    @GetMapping("/Autor") // busca autor por id
    public String mostra_autor(@RequestParam(value = "id_autor") Integer id) {
        AutorEntity mostraautor = repository.getautor(id);
        return mostraautor.getId_autor() + " " +
                mostraautor.getNome() + " " +
                mostraautor.getSobrenome() + " " +
                mostraautor.getData_nascimento();
    }
    @GetMapping("/Todos_Autores") // busca todos autores
    public List<AutorEntity> Todos_autores() {
        return repository.autores();
    }

}
