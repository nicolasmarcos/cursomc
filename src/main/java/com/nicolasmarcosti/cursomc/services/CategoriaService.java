package com.nicolasmarcosti.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolasmarcosti.cursomc.domain.Categoria;
import com.nicolasmarcosti.cursomc.repositories.CategoriaRepository;
import com.nicolasmarcosti.cursomc.services.exceptions.ObjectNotFoundException;

//Declaração do serviço que será consumido pelo controlador REST e se comunicará com o repositório
@Service
public class CategoriaService {
	
	//Instancia o repositório
	@Autowired
	private CategoriaRepository repo;
	
	//Cria o método de busca passando ID
	public Categoria find(Integer id) throws ObjectNotFoundException {
		
		//O Optional permitirá que também seja esperado um retorno null caso o id não exista
		Optional<Categoria> obj = repo.findById(id);
		
		//Retorna o objeto ou se não encontrar, null
		return obj.orElseThrow(
							() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Categoria.class.getName())
						);
	}
	
}
