package com.nicolasmarcosti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolasmarcosti.cursomc.domain.Categoria;

//Declaração do repositório, com JpaRepository, que por sua vez dependerá da classe Categoria para o devido mapeamento funcionar
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
