package com.nicolasmarcosti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolasmarcosti.cursomc.domain.Estado;

//Declaração do Repository de Estado, com JPARepository, que por sua vez dependerá da classe de domínio Estado para o mapeamento funcionar
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
