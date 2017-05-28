package br.com.superpet.web.controllers;

import java.util.Collection;

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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(View.All.class)
	@ResponseStatus(HttpStatus.CREATED)
	public Pet save(@RequestBody Pet pet, HttpServletRequest request, HttpServletResponse response) {
		pet = petService.salvar(pet);
		return pet;
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Pet>> buscarTodos(){
		return new  ResponseEntity<Collection<Pet>>(petService.buscarTodos(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Pet>> buscarByUsuario(@RequestParam(value="codigo_usuario",defaultValue="1") Long codigo_usuario){
		return new  ResponseEntity<Collection<Pet>>(petService.petByUsuario(codigo_usuario), HttpStatus.OK);
	}
	
	/* @RequestMapping(value = "/list/favoritos")
	public ResponseEntity<Collection<Pet>> buscarFavoritos(@RequestParam(value="codigo_usuario",defaultValue="1") Long codigo_usuario){
		return new  ResponseEntity<Collection<Pet>>(favoritoService.buscarPorUsuario(codigo_usuario), HttpStatus.OK);
	} */
	
	
	
	@RequestMapping(value = "/pet")
	public ResponseEntity<Pet> get(@RequestParam(value="id",defaultValue="1") Long id){
		Pet aluno = petService.buscar(id);
		if(aluno == null){
			return new ResponseEntity<Pet>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pet>(pet,HttpStatus.OK);
	
	}
	

}
