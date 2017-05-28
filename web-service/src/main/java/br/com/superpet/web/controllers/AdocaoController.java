package br.com.superpet.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.superpet.services.AdocaoService;

@RestController
@RequestMapping(value = "/adocao")
public class AdocaoController {
	
	@Autowired
	private AdocaoService adocaoService;
	


}
