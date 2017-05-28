package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Entity
@Table(name = "sexo")
public class Sexo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonView({View.All.class,View.Alternative.class})
	private Long id;
	
	@Column(name = "sexo")
	@JsonView({View.All.class,View.Alternative.class})
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSexo() {
		return nome;
	}

	public void setSexo(String sexo) {
		this.nome = nome;
	}
}
