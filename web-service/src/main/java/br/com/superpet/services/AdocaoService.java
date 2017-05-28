package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Adocao;

public interface AdocaoService {
	public Adocao buscar(long id);
	public List<Adocao> buscarTodos();
	public Adocao salvar(Adocao idade);
}
