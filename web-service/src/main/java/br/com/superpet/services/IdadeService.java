package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Idade;

public interface IdadeService {
	public Idade buscar(long id);
	public List<Idade> buscarTodos();
	public Idade salvar(Idade idade);
}
