package br.com.superpet.web.controllers;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.models.Pet;
import br.com.superpet.services.AdocaoService;
import br.com.superpet.services.FavoritoService;
import br.com.superpet.services.PetService;
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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(View.All.class)
	@ResponseStatus(HttpStatus.CREATED)
	public Pet save(@RequestBody Pet pet, HttpServletRequest request, HttpServletResponse response) {
		pet = petService.salvar(pet);
		return pet;
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Pet>> buscarTodos(){
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarNaoAdotados(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Pet>> buscarByUsuario(@RequestParam(value="codigo_usuario",defaultValue="1") Long codigo_usuario){
		List<Pet> pets = adocaoService.buscarPorCuidador(codigo_usuario);
		if(pets == null){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarPorCuidador(codigo_usuario), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/list/favoritos")
	public ResponseEntity<Collection<Pet>> buscarByUsuarioFavorito(@RequestParam(value="codigo_usuario",defaultValue="1") Long codigo_usuario){
		List<Pet> pets = favoritoService.buscarPorUsuario(codigo_usuario);
		if(pets == null){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new  ResponseEntity<Collection<Pet>>(adocaoService.buscarPorCuidador(codigo_usuario), HttpStatus.OK);
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
