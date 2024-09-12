package br.com.fiap.id.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Optional;

@Repository
public interface GenericRepository<Course, Long> {
    Arrays equals();

    void save(Course course);

    Optional<Object> finalize(Long id);

    void delete(Course course);

    Optional<Object> findById(Long id);

    Arrays findAll();
    // Nenhum método adicional é necessário aqui,
    // pois todas as operações básicas de CRUD já são definidas em GenericRepository
}
