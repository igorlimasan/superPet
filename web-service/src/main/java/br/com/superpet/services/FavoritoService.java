package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Favorito;
import br.com.superpet.models.Pet;

public interface FavoritoService {
	public Favorito buscar(long id);
	public List<Favorito> buscarTodos();
	public List<Pet> buscarPorUsuario(Long id);
	public Favorito salvar(Favorito idade);
}
