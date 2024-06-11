package com.farmacia.farmaco.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O nome da categoria é obrigatório")
	@Size(max = 255, message = "O nome da categoria deve ter no máximo 255 caracteres")
	private String nome;
	
	@Size(max = 3000, message = "A descrição da categoria deve ter no máximo 3000 caracteres")
	private String descricao;
	
	@NotBlank(message = "O status da categoria é obrigatório")
	@Size(max = 255, message = "O status da categoria deve ter no máximo 255 caracteres")
	private String status;
	
	@ManyToOne
	//@JsonIgnoreProperties("categoria")
	private Categoria categoria;
	
	//@ManyToOne
	//@JsonIgnoreProperties("produto")
	private String produto;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	

	
}
