package br.com.superpet.web.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.superpet.models.Adocao;
import br.com.superpet.models.Usuario;
import br.com.superpet.services.AdocaoService;
import br.com.superpet.services.UsuarioService;

//@RestController
//@RequestMapping(value = "/adocao")
public class AdocaoController {
	
	@Autowired
	private AdocaoService adocaoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(value = "/adocao/{codigo_cuidador}/{codigo_adotador}/{codigo_pet}")
	public ResponseEntity<Adocao> adotado(@PathVariable(value = "codigo_cuidador") Long idCuidador, @PathVariable(value = "codigo_adotador") Long idAdotador, @PathVariable(value = "codigo_pet") Long idPet){
		Adocao adocao = adocaoService.buscarPorCuidadorPet(idCuidador, idPet);
		if(adocao == null){
			return new ResponseEntity<Adocao>(HttpStatus.NOT_FOUND);
		}
		else{
			Usuario usuario = usuarioService.buscar(idAdotador);
			adocao.setAdotador(usuario);
			adocao.setData(new Date());
		}
		return new ResponseEntity<Adocao>(adocao,HttpStatus.OK);
	}
}
