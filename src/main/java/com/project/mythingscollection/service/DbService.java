package com.project.mythingscollection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mythingscollection.domain.Jogo;
import com.project.mythingscollection.repository.JogoRepository;

@Service
public class DbService {
	
	@Autowired
	private JogoRepository repository;
	
	public void instanciaBaseDados() {
		Jogo jogo = new Jogo("Mario Kart 8", "Corrida", "Nintendo", 2020, 10.0);
		repository.save(jogo);
	}

}
