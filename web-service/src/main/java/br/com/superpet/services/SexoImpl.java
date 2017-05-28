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
		return sexoRep.findById(id);
	}

	@Override
	public List<Sexo> buscarTodos() {
		return sexoRep.findAll();
	}

	

}
