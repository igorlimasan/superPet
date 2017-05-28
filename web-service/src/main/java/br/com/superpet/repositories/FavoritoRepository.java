package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Favorito;
import br.com.superpet.models.FavoritoId;

public interface FavoritoRepository extends CrudRepository<Favorito, Long> {
	
	@Query("select pet from Favorito f where f.favoritoId.usuario.id=?1")
	public Favorito findByUsuario(Long id);
	public List<Favorito> findAll();

}
