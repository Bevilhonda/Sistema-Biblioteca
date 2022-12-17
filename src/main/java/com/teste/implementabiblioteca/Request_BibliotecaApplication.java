package com.teste.implementabiblioteca;

import com.teste.implementabiblioteca.repository.Autor_Entidade;
import com.teste.implementabiblioteca.repository.Query_Repository;
import com.teste.implementabiblioteca.repository.AutorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
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


    @PostMapping("Incluir_Autor") // inclui um novo autor no banco
        public String insere_autor(AutorEntity novo_autor){
        Integer id_autor = novo_autor.getId_autor();
        String nome = novo_autor.getNome();
        String sobrenome = novo_autor.getSobrenome();
        Instant data_nascimento = novo_autor.getData_nascimento();
        repository.inserir_autor(nome,sobrenome,data_nascimento);
        return "Inserido com sucesso";
    }
    @PostMapping("Novo_contato")
    public AutorEntity create(@RequestBody AutorEntity novo){
        return  repository.save(novo);
    }
    }

