package br.com.superpet.services;

import java.util.List;

import br.com.superpet.models.Usuario;

public interface UsuarioService {
	public Usuario buscar(String login, String senha);
	public List<Usuario> buscarTodos();
	public Usuario salvar(Usuario usuario);	

}
