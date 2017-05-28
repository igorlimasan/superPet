package br.com.superpet.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Embeddable
@Table(name = "favorito")
public class FavoritoId {
	@JsonView({View.All.class,View.Alternative.class})
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
