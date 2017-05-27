package br.com.superpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Usuario;
import br.com.superpet.repositories.UsuarioRepository;

@Service("usuarioService")
public class UsuarioImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRep;
	@Override
	public Usuario buscar(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
