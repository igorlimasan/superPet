package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Pet;

public interface PetService {
	public Pet buscar(long Id);
	public List<Pet> buscarTodos();
	public Pet salvar(Pet pet);
	public List<Pet> petsNaoAdotados();
	public List<Pet> petByUsuario(long IdUsuario);
	public List<Pet> petByCuidador(long IdCuidador);	
}
