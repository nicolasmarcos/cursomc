package com.nicolasmarcosti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolasmarcosti.cursomc.domain.Produto;

//Declaração do repositório, com JpaRepository, que por sua vez dependerá da classe Produto para o devido mapeamento funcionar
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

}
