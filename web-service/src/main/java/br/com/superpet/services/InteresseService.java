package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Interesse;

public interface InteresseService {
	public Interesse buscar(long id);
	public List<Interesse> buscarTodos();
	public Interesse salvar(Interesse idade);
}
