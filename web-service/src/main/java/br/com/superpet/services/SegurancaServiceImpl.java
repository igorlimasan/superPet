package br.com.superpet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.superpet.models.Usuario;
import br.com.superpet.repositories.UsuarioRepository;



@Service("segurancaService")
public class SegurancaServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findByLogin(login);
		if(usuario == null) throw new UsernameNotFoundException("Usuario não encptrado, login: " + login );
		return usuario;
	}

}
