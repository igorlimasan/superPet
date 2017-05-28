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
	public Usuario buscar(String login) {
		return usuarioRep.findByLogin(login);
	}

	@Override
	public List<Usuario> buscarTodos() {
		return usuarioRep.findAll();
	}

	@Override
	public Usuario salvar(Usuario usuario) {
		return usuarioRep.save(usuario);
	}

	@Override
	public Usuario buscar(Long id) {
		// TODO Auto-generated method stub
		return usuarioRep.findById(id);
	}
	
}
