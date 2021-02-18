package com.manoeljunior.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoeljunior.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> { //Herda uma outra interface, que é capaz de acessar os dados com base deum tipo que vc passar//
	
	
	
}
