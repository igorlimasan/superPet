package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Interesse;
import br.com.superpet.models.Pet;
import br.com.superpet.models.Usuario;

public interface InteresseService {
	
	public List<Interesse> buscarTodos();
	public Interesse salvar(Interesse idade);
	public List<Pet> buscarPorUsuario(Long id);
	public List<Usuario> buscarPorPet(Long id);
}
