package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Foto;

public interface FotoService {
	public Foto buscar(long id);
	public List<Foto> buscarTodos();
	public Foto salvar(Foto idade);
}
