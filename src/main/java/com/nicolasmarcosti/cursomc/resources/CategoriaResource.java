package com.nicolasmarcosti.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nicolasmarcosti.cursomc.domain.Categoria;
import com.nicolasmarcosti.cursomc.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

//Começa a declaração da classe que será o controlador REST que se comunicará com o serviço
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//Instancia-se a classe do serviço com o @Autowired
	@Autowired
	private CategoriaService service;
	
	//Faço um RequestMapping, similar a action do struts que receberá em seu get um ID
	//e retornará este ID
	//O ResponseEntity<?> é um tipo mais genérico, entendendo que a resposta pode ser mais complexa 
	//Com coisas do HTTP
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		
		Categoria obj = service.find(id);
		
		//Sendo ok, retorna o objeto correspondente ao ID procurado
		return ResponseEntity.ok().body(obj);
		
		//O controlador rest deve ser pequeno e não devem haver tratativas de exceções nele
		
		/*
		
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;*/
		
	}
	
}
