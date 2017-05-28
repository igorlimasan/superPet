package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Idade;
import br.com.superpet.repositories.IdadeRepository;

@Service("idadeService")
public class IdadeImpl implements IdadeService {

	@Autowired
	private IdadeRepository idadeRep;
	@Override
	public Idade buscar(long id) {
		return idadeRep.find(id);
	}

	@Override
	public List<Idade> buscarTodos() {
		return idadeRep.findAll();
	}

	@Override
	public Idade salvar(Idade idade) {
		return idadeRep.save(idade);
	}

}
