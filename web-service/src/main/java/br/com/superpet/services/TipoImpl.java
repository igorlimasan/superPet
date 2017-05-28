package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Idade;
import br.com.superpet.models.Tipo;
import br.com.superpet.repositories.TipoRepository;

@Service("tipoService")
public class TipoImpl implements TipoService {

	@Autowired
	private TipoRepository tipoRep;
	@Override
	public Tipo buscar(long id) {
		return tipoRep.find(id);
	}

	@Override
	public List<Tipo> buscarTodos() {
		return tipoRep.findAll();
	}

	@Override
	public Idade salvar(Tipo tipo) {
		return tipoRep.save(tipo);
	}

}
