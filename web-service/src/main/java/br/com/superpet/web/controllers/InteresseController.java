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

import br.com.superpet.models.Interesse;
import br.com.superpet.models.Usuario;
import br.com.superpet.services.InteresseService;
import br.com.superpet.views.View;

@RestController
@RequestMapping(value = "/interesse")
public class InteresseController {

	@Autowired
	private InteresseService interesseService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(View.All.class)
	@ResponseStatus(HttpStatus.CREATED)
	public Interesse save(@RequestBody Interesse intersse, HttpServletRequest request, HttpServletResponse response) {
		intersse = interesseService.salvar(intersse);
		return intersse;
	}
	
	@RequestMapping(value = "/list")
	public ResponseEntity<Collection<Usuario>> buscarByPet(@RequestParam(value="codigo_pet",defaultValue="1") Long codigo_pet){
		return new  ResponseEntity<Collection<Usuario>>(interesseService.buscarPorPet(codigo_pet), HttpStatus.OK);
	}
}
