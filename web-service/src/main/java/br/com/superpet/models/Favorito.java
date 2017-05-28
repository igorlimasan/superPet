package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Favorito {
	
	@EmbeddedId
	private FavoritoId favoritoId;

	
	

	public FavoritoId getFavoritoId() {
		return favoritoId;
	}

	public void setFavoritoId(FavoritoId favoritoId) {
		this.favoritoId = favoritoId;
	}

}
