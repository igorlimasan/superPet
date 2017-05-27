package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Favorito;

public interface FavoritoService {
	public Favorito buscar(long id);
	public List<Favorito> buscarTodos();
	public Favorito salvar(Favorito idade);
}
