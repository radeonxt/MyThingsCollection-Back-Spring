package com.project.mythingscollection.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Campo NOME é requerido")
	@Length(max = 100, message = "O campo NOME deve ter no máximo 100 caracteres")
	private String nome;

	@NotEmpty(message = "Campo GÊNERO é requerido")
	@Length(max = 50, message = "O campo GÊNERO deve ter no máximo 50 caracteres")
	private String genero;

	@NotEmpty(message = "Campo PRODUTORA é requerido")
	@Length(max = 50, message = "O campo PRODUTORA deve ter no máximo 50 caracteres")
	private String produtora;

	@NotNull(message = "Campo Ano é requerido")
	private Integer ano;
	
	public Jogo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Jogo(String nome, String genero, String produtora, Integer ano, Double nota) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.produtora = produtora;
		this.ano = ano;
		this.nota = nota;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	private Double nota;


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		return Objects.equals(id, other.id);
	}
}
