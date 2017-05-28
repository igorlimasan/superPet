package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Adocao;
import br.com.superpet.models.Pet;

public interface AdocaoRepository extends CrudRepository<Adocao, Long>{
	
	public List<Adocao> findAll();
	public Adocao findById(Long id);
	
	@Query("select pet from Adocao a where a.adotador is null")
	public List<Pet> findNotAdopted();
	
	@Query("select pet from Adocao a where a.cuidador.id=?1")
	public List<Pet> findByCuidador(Long id);
	
	@Query("from Adocao a where a.cuidador.id=?1 and a.pet.id=?2")
	public Adocao findByCuidadorAndPet(Long idCuidador,Long idPet);
	
}
