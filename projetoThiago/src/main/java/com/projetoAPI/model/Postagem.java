package com.projetoAPI.model;

import java.util.Date;

import javax.persistence.Entity; //Essa classe sera uma entidade do nosso JPA Rebernate.
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table; // Essa entidade dentro do MySQL vai virar uma tabela
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//model é usada para criar as minhas tabelas e colunas dentro do MySQL, atravez de uma conexão local host. (Uma conexão local)
//Classe igual a tabela no MySQL

@Entity
@Table(name = "Postagem")
public class Postagem {

// todas os meus atributos (private......) são iguais as minha colunas dentro do meu MySQL.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) // private long id;
	 */// no banco de dados, todos esses comandos virara uma PK.

	@NotNull // NOT NULL é usado para que a coluna TITULO seja um campo obrigatorio
	@Size(min = 5, max = 100)
	private String titulo;

	@NotNull // NOT NULL é usado para que a coluna TITULO seja um campo obrigatorio
	@Size(min = 5, max = 500)
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("Postagem")
	private Tema tema;
	
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
