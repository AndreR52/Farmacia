package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo nome deve possuir no mínimo 3 e no máximo 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo descrição deve possuir no mínimo 5 e no máximo 100 caracteres.")
	private String descricao;	
	
	@NotNull(message = "O atributo quantidade é obrigatório!")
	private int quantidade;
	
	@NotBlank(message = "O atributo laboratorio é obrigatório!")
	@Size(min = 2, max = 100, message = "O atributo laboratorio deve possuir no mínimo 3 e no máximo 100 caracteres.")
	private String laboratorio;
	
	@NotNull(message = "O atributo preço é obrigatório!")
	private double preco;
	
	@NotBlank(message = "O atributo foto é obrigatório!")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
