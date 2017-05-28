package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Adocao;
import br.com.superpet.models.Pet;
import br.com.superpet.repositories.AdocaoRepository;

@Service("adocaoService")
public class AdocaoImpl implements AdocaoService {

	@Autowired
	private AdocaoRepository adocaoRep;
	
	@Override
	public Adocao buscar(long id) {
		return adocaoRep.findById(id);
	}

	@Override
	public List<Adocao> buscarTodos() {
		return adocaoRep.findAll();
	}

	@Override
	public Adocao salvar(Adocao adocao) {
		return adocaoRep.save(adocao);
	}

	@Override
	public List<Pet> buscarNaoAdotados() {
		// TODO Auto-generated method stub
		return adocaoRep.findNotAdopted();
	}

	@Override
	public List<Pet> buscarPorCuidador(Long id) {
		// TODO Auto-generated method stub
		return adocaoRep.findByCuidador(id);
	}

	@Override
	public Adocao buscarPorCuidadorPet(Long idCuidador, Long idPet) {
		// TODO Auto-generated method stub
		return adocaoRep.findByCuidadorAndPet(idCuidador, idPet);
	}
	
}
