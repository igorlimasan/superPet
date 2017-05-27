package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Favorito;
import br.com.superpet.repositories.FavoritoRepository;

@Service("favoritoService")
public class FavoritoImpl implements FavoritoService {

	@Autowired
	private FavoritoRepository favoritoRep;
	@Override
	public Favorito buscar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Favorito> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Favorito salvar(Favorito idade) {
		// TODO Auto-generated method stub
		return null;
	}

}
