package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Idade;
import br.com.superpet.models.Porte;

public interface PorteService {
	public Porte buscar(long id);
	public List<Porte> buscarTodos();

}
