package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Interesse;
import br.com.superpet.models.Pet;

public interface InteresseService {
	
	public List<Interesse> buscarTodos();
	public Interesse salvar(Interesse idade);
	public List<Pet> buscarPorUsuario(Long id);
}
