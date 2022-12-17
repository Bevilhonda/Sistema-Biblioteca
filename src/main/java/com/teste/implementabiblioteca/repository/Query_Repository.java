package com.teste.implementabiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Repository
@Service
public interface Query_Repository extends JpaRepository<AutorEntity, Integer> {

    @Query(value = "SELECT * from Autor where id_autor = :id_autor ", nativeQuery = true)
    AutorEntity getautor(Integer id_autor);

    @Query(value = "SELECT * from Autor ", nativeQuery = true)
    List<AutorEntity> autores();

    @Modifying
    @Query(value = "UPDATE " +
            "Autor  " +
            "set nome = :nome , sobrenome = :sobrenome , data_nascimento = :data_nascimento " +
            " where id_autor = :id_autor", nativeQuery = true)
    AutorEntity Update_Autor(String nome, String sobrenome, Instant data_nascimento, Integer id_autor);

    @Modifying
    @Query(value = "Insert into Autor " +
            "(nome, sobrenome, data_nascimento)" +
            " values (:nome , :sobrenome,:data_nascimento)", nativeQuery = true)
    public void inserir_autor(@Param("nome") String nome, @Param("sobrenome") String sobrenome, @Param("data_nascimento") Instant data_nascimento);

}
