package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Pet;
import br.com.superpet.repositories.PetRepository;

@Service("petService")
public class PetImpl implements PetService{

	@Autowired
	private PetRepository petRep;
	
	@Override
	public Pet buscar(long id) {
		return petRep.findById(id);
	}

	@Override
	public List<Pet> buscarTodos() {
		return petRep.findAll();
	}

	@Override
	public Pet salvar(Pet pet) {
		return petRep.save(pet);
	}

	
	
}
