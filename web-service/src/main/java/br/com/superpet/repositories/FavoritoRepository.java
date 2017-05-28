package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Favorito;
import br.com.superpet.models.FavoritoId;
import br.com.superpet.models.Pet;

public interface FavoritoRepository extends CrudRepository<Favorito, Long> {
	
	//public Favorito findById(Long id);
	@Query("select f.favoritoId.pet from Favorito f where f.favoritoId.usuario.id=?1")
	public List<Pet> findByUsuario(Long id);
	public List<Favorito> findAll();

}
