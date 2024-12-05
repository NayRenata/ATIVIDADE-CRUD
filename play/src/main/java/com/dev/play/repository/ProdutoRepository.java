package com.dev.play.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.play.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
