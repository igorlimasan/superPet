package br.com.superpet.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;
@Table(name = "interesse")
@Embeddable
public class InteresseId implements Serializable{
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_pet")
	private Usuario pet;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_usuario")
	private Usuario usuario;

	public Usuario getPet() {
		return pet;
	}

	public void setPet(Usuario pet) {
		this.pet = pet;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
