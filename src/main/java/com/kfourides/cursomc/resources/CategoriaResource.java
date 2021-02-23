package com.kfourides.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	public CategoriaResource() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}
