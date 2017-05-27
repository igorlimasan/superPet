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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tipo> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Idade salvar(Tipo idade) {
		// TODO Auto-generated method stub
		return null;
	}

}
