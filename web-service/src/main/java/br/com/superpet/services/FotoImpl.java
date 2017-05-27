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
		return fotoRep.find(id);
	}

	@Override
	public List<Foto> buscarTodos() {
		return fotoRep.findAll();
	}

	@Override
	public Foto salvar(Foto foto) {
		return fotoRep.save(foto);
	}

	

}
