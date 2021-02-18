package com.manoeljunior.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoeljunior.cursomc.domain.Categoria;
import com.manoeljunior.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //Anotação//
	private CategoriaRepository repo; //Essa dependência dentro de uma classe (Autowired), vai ser automáticamente instânciada pelo spring//  
	
	public Categoria buscar (Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	

}
