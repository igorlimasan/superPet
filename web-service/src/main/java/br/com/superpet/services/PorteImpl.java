package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Idade;
import br.com.superpet.models.Porte;
import br.com.superpet.repositories.PorteRepository;

@Service("porteService")
public class PorteImpl implements PorteService {

	@Autowired
	private PorteRepository porteRep;
	@Override
	public Porte buscar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Porte> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Idade salvar(Porte idade) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
