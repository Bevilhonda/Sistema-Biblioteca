package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface AutorRepository extends JpaRepository<AutorEntity, Integer> {

    @Query(value = "SELECT idt_autor, val_name, val_last_name, dat_birth FROM autor where idt_autor = :idAutor", nativeQuery = true)
    AutorEntity getAutor(Integer idAutor);
}
