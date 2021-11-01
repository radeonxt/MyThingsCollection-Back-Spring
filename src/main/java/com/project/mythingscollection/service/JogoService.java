package com.project.mythingscollection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mythingscollection.domain.Jogo;
import com.project.mythingscollection.repository.JogoRepository;

@Service
public class JogoService {
	
	@Autowired
	private JogoRepository repository;
	
	public List<Jogo> findAll(){
		return repository.findAll();		
	}
	
	public Jogo findbyId(Integer id){
		Optional<Jogo> objeto = repository.findById(id);
		return objeto.orElseThrow();
	}
	
	public Jogo create(Jogo obj) {
		obj.setId(null);
		return repository.save(obj);
		
	}
	
	public Jogo update(Integer id, Jogo obj) {
		Jogo jogo = this.findbyId(id);
		jogo.setNome(obj.getNome());
		jogo.setAno(obj.getAno());
		jogo.setGenero(obj.getGenero());
		jogo.setNota(obj.getNota());
		jogo.setProdutora(obj.getProdutora());
		return repository.save(jogo);
		
	}
	
	public void delete(Integer id) {
		findbyId(id);
		repository.deleteById(id);
	}

}
