package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Sexo;
import br.com.superpet.repositories.SexoRepository;

@Service("sexoService")
public class SexoImpl implements SexoService {
	
	@Autowired
	private SexoRepository sexoRep;
	
	@Override
	public Sexo buscar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sexo> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sexo salvar(Sexo idade) {
		// TODO Auto-generated method stub
		return null;
	}

}
