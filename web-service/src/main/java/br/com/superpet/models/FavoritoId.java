package br.com.superpet.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Embeddable

public class FavoritoId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonView({View.All.class,View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_pet")
	
	private Pet pet;
	
	@JsonView({View.All.class,View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_usuario")
	private Usuario usuario;

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
