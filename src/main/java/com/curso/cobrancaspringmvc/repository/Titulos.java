package com.curso.cobrancaspringmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cobrancaspringmvc.modelo.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

	List<Titulo> findByDescricaoContaining(String descricao);
	
}
