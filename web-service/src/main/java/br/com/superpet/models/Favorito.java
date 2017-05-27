package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favorito")
public class Favorito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@EmbeddedId
	private FavoritoId favoritoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FavoritoId getFavoritoId() {
		return favoritoId;
	}

	public void setFavoritoId(FavoritoId favoritoId) {
		this.favoritoId = favoritoId;
	}

}
