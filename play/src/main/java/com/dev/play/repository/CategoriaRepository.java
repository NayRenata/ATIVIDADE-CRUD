package com.dev.play.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.play.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
