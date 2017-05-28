package br.com.superpet.web.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.superpet.models.Usuario;
import br.com.superpet.security.JwtUtils;
import br.com.superpet.security.Login;

@RestController
//@RequestMapping(value = "/")
public class LoginController {
	
	@RequestMapping(value = "/")
	public String hello() {
		return "É GLACIAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\n\"CLÁUDIO, VAI TOMA NO CÚ\nPAU NO SEU CÚ,MINEDA\"\n-Lispector,João 2k17";
	}
	
	@Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager auth;
	
	@RequestMapping(value="/login" , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario login(@RequestBody Login login, HttpServletResponse response) throws JsonProcessingException {
        Authentication credentials = new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword());
        Usuario usuario = (Usuario) auth.authenticate(credentials).getPrincipal();
        usuario.setSenha(null);
           response.setHeader("Token", JwtUtils.generateToken(usuario));
           return usuario;
    }
	

}
