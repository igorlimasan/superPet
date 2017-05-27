package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Foto;
import br.com.superpet.repositories.FotoRepository;

@Service("fotoService")
public class FotoImpl implements FotoService {

	@Autowired
	private FotoRepository fotoRep;
	@Override
	public Foto buscar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Foto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Foto salvar(Foto idade) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
