package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Idade;
import br.com.superpet.models.Tipo;

public interface TipoService {
	public Tipo buscar(long id);
	public List<Tipo> buscarTodos();
	public Idade salvar(Tipo idade);
}
