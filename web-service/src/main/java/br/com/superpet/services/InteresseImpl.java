package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Interesse;
import br.com.superpet.repositories.InteresseRepository;

@Service("interesseService")
public class InteresseImpl implements InteresseService{
	
	@Autowired
	private InteresseRepository interesseRep;
	@Override
	public Interesse buscar(long id) {
		return interesseRep.find(id);
	}

	@Override
	public List<Interesse> buscarTodos() {
		return interesseRep.findAll();
	}

	@Override
	public Interesse salvar(Interesse interesse) {
		return interesseRep.save(interesse);
	}

}
