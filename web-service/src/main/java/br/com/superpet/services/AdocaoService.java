package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Adocao;
import br.com.superpet.models.Pet;

public interface AdocaoService {
	public Adocao buscar(long id);
	public List<Pet> buscarNaoAdotados();
	public List<Pet> buscarPorCuidador(Long id);
	public List<Adocao> buscarTodos();
	public Adocao salvar(Adocao adocao);
	public Adocao buscarPorCuidadorPet(Long idCuidador, Long idPet);
}
