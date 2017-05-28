package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Entity
@Table(name = "favoritos")
public class Favorito {
	
	@EmbeddedId
	@JsonView({View.All.class,View.Alternative.class})
	private FavoritoId favoritoId;

	
	

	public FavoritoId getFavoritoId() {
		return favoritoId;
	}

	public void setFavoritoId(FavoritoId favoritoId) {
		this.favoritoId = favoritoId;
	}

}
