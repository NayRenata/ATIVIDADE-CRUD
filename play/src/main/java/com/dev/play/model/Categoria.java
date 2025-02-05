package com.dev.play.model;

	import java.math.BigDecimal;

	import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		 
		@NotBlank
		private String nome;
		
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
		
		
	}



