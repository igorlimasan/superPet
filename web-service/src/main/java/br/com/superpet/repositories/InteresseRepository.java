package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Interesse;
import br.com.superpet.models.InteresseId;
import br.com.superpet.models.Pet;
import br.com.superpet.models.Usuario;

public interface InteresseRepository extends CrudRepository<Interesse, InteresseId>{
	
	public List<Interesse> findAll();
	
	@Query("select i.interesseId.pet from Interesse i where i.interesseId.usuario.id=?1")
	public List<Pet> findByUsuario(Long id);
	
	@Query ("select i.interesseId.usuario from Interesse i where i.interesseId.pet.id=?1")
	public List<Usuario> findByPet(Long id);

}
