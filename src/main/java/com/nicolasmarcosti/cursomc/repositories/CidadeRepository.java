package com.nicolasmarcosti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolasmarcosti.cursomc.domain.Cidade;

//Declaração do repositório de cidades com JpaRepository, que dependerá do domínio Cidade para funcionar o mapeamento
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
