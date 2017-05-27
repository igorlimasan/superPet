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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Interesse> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interesse salvar(Interesse idade) {
		// TODO Auto-generated method stub
		return null;
	}

}
