package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Interesse;
import br.com.superpet.models.InteresseId;
import br.com.superpet.models.Pet;

public interface InteresseRepository extends CrudRepository<Interesse, InteresseId>{
	
	public List<Interesse> findAll();
	
	@Query("select pet from Interesse i where i.interesseId.usuario.id=?1")
	public List<Pet> findByUsuario(Long id);
	

}
