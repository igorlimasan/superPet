package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Favorito;
import br.com.superpet.models.Pet;
import br.com.superpet.repositories.FavoritoRepository;

@Service("favoritoService")
public class FavoritoImpl implements FavoritoService {

	@Autowired
	private FavoritoRepository favoritoRep;

	@Override
	public List<Favorito> buscarTodos() {
		return favoritoRep.findAll();
	}

	@Override
	public Favorito salvar(Favorito favorito) {
		return favoritoRep.save(favorito);
	}

	@Override
	public List<Pet> buscarPorUsuario(Long id) {
		
		return favoritoRep.findByUsuario(id);
	}

}
