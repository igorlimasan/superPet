package br.com.superpet.web.controllers;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.models.Adocao;
import br.com.superpet.models.Foto;
import br.com.superpet.models.Pet;
import br.com.superpet.services.AdocaoService;
import br.com.superpet.services.FavoritoService;
import br.com.superpet.services.FotoService;
import br.com.superpet.services.PetService;
import br.com.superpet.services.UsuarioService;
import br.com.superpet.views.View;

@RestController
@RequestMapping(value = "/pet")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@Autowired
	private FavoritoService favoritoService;
	
	@Autowired
	private AdocaoService adocaoService;
	
	@Autowired
	private FotoService fotoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/save/{codigo_usuario}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(View.All.class)
	@ResponseStatus(HttpStatus.CREATED)
	public Pet save(@RequestBody Pet pet, @PathVariable(value="codigo_usuario")  Long codigoUsuario,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("id"));
		for(Foto f:pet.getFotos()){
			/*Foto foto = new Foto();
			foto = f;*/
			fotoService.salvar(f);
		}
		pet = petService.salvar(pet);
		Long id = Long.valueOf(request.getParameter("id"));
		Adocao adocao = new Adocao();
		if (usuarioService.buscar(id) != null) {
			adocao.setCuidador(usuarioService.buscar(id));
		}
		adocao.setPet(pet);
		adocaoService.salvar(adocao);
		
		return pet;
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Pet>> buscarTodos(){
		System.out.println("1");
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarNaoAdotados(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list/{codigo_usuario}")
	public ResponseEntity<Collection<Pet>> buscarByUsuario(@PathVariable(value="codigo_usuario") Long codigoUsuario){
		System.out.println("2");
		List<Pet> pets = adocaoService.buscarPorCuidador(codigoUsuario);
		if(pets == null){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarPorCuidador(codigoUsuario), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/list/favoritos/{codigo_usuario}")
	public ResponseEntity<Collection<Pet>> buscarByUsuarioFavorito(@PathVariable(value="codigo_usuario") Long codigoUsuario){
		List<Pet> pets = favoritoService.buscarPorUsuario(codigoUsuario);
		if(pets == null){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarPorCuidador(codigoUsuario), HttpStatus.OK);
	}
	
	/* @RequestMapping(value = "/list/favoritos")
	public ResponseEntity<Collection<Pet>> buscarFavoritos(@RequestParam(value="codigo_usuario",defaultValue="1") Long codigo_usuario){
		return new  ResponseEntity<Collection<Pet>>(favoritoService.buscarPorUsuario(codigo_usuario), HttpStatus.OK);
	} */
	
	
	
	@RequestMapping(value = "/getById")
	public ResponseEntity<Pet> get(@RequestParam(value="id",defaultValue="1") Long id){
		Pet pet = petService.buscar(id);
		if(pet == null){
			return new ResponseEntity<Pet>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pet>(pet,HttpStatus.OK);
	
	}
	

}
