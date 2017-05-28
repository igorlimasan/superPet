package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Sexo;

public interface SexoService {
	public Sexo buscar(long id);
	public List<Sexo> buscarTodos();
	public Sexo salvar(Sexo idade);
}
