package com.dev.play.model;

	import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

	@Entity
	@Table(name = "tb_produto")
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		private String nome;
		
		@NotBlank
		private String genero;
		
		@NotBlank
		private String plataforma;
		
		@NotNull
		private BigDecimal preco;
		
		@ManyToOne
	    @JsonIgnoreProperties("Categoria")
		private Categoria categoria;
		
		
		
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getPlataforma() {
			return plataforma;
		}
		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}
		public BigDecimal getPreco() {
			return preco;
		}
		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}
		
		
	}



