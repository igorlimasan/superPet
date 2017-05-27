package br.com.superpet.models;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Embeddable
public class AdocaoId {
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_pet")
	private Usuario pet;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_usuario_cuidador")
	private Usuario usuarioCuidador;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_usuario_adotador")
	private Usuario usuarioAdotador;

	public Usuario getPet() {
		return pet;
	}

	public void setPet(Usuario pet) {
		this.pet = pet;
	}

	public Usuario getUsuarioCuidador() {
		return usuarioCuidador;
	}

	public void setUsuarioCuidador(Usuario usuarioCuidador) {
		this.usuarioCuidador = usuarioCuidador;
	}

	public Usuario getUsuarioAdotador() {
		return usuarioAdotador;
	}

	public void setUsuarioAdotador(Usuario usuarioAdotador) {
		this.usuarioAdotador = usuarioAdotador;
	}

}
