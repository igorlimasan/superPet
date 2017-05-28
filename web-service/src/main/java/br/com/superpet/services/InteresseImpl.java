package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Interesse;
import br.com.superpet.models.Pet;
import br.com.superpet.repositories.InteresseRepository;

@Service("interesseService")
public class InteresseImpl implements InteresseService{
	
	@Autowired
	private InteresseRepository interesseRep;
	
	@Override
	public List<Interesse> buscarTodos() {
		return interesseRep.findAll();
	}

	@Override
	public Interesse salvar(Interesse interesse) {
		return interesseRep.save(interesse);
	}

	@Override
	public List<Pet> buscarPorUsuario(Long id) {
		// TODO Auto-generated method stub
		return interesseRep.findByUsuario(id);
	}

}
