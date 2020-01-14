package br.com.hero.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hero.cursomc.domain.Categoria;
import br.com.hero.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired 													//O Spring cria a instacia
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
