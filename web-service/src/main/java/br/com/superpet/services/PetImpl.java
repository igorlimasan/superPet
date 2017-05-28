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
	public Pet buscar(long Id) {
		return petRep.find(id);
	}

	@Override
	public List<Pet> buscarTodos() {
		return petRep.findAll();
	}

	@Override
	public Pet salvar(Pet pet) {
		return petRep.save(pet);
	}

	@Override
	public List<Pet> petsNaoAdotados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pet> petByUsuario(long IdUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pet> petByCuidador(long IdCuidador) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
