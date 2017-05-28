package br.com.superpet.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.models.Favorito;
import br.com.superpet.services.FavoritoService;
import br.com.superpet.views.View;

@RestController
@RequestMapping(value = "/favorito")
public class FavoritoController {
	
	@Autowired
	private FavoritoService favoritoService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonView(View.All.class)
	@ResponseStatus(HttpStatus.CREATED)
	public Favorito save(@RequestBody Favorito favorito, HttpServletRequest request, HttpServletResponse response) {
		favorito = favoritoService.salvar(favorito);
		return favorito;
	}

}
