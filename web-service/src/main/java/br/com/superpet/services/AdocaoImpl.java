package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Adocao;
import br.com.superpet.repositories.AdocaoRepository;

@Service("AdocaoService")
public class AdocaoImpl implements AdocaoService {

	@Autowired
	private AdocaoRepository adocaoRep;
	@Override
	public Adocao buscar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adocao> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adocao salvar(Adocao idade) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
