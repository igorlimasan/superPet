package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
	
	public List<Pet> findAll();
	
	public Pet findById(Long id);

}
