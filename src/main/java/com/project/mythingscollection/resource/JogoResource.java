package com.project.mythingscollection.resource;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.mythingscollection.domain.Jogo;
import com.project.mythingscollection.service.JogoService;

@RestController
@RequestMapping(value = "/jogos")
public class JogoResource {
	@Autowired
	private JogoService jogoservice;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <Jogo> findById(@PathVariable Integer id){
		Jogo obj = jogoservice.findbyId(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping
	public ResponseEntity <List<Jogo>> findAll(){
		List<Jogo> list = jogoservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Jogo> create(@Valid @RequestBody Jogo obj){
		Jogo retorno = jogoservice.create(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Jogo> update(@Valid @PathVariable Integer id, @RequestBody Jogo obj){
		Jogo retorno = jogoservice.update(id, obj);
		return ResponseEntity.ok().body(retorno);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Jogo> delete(@PathVariable Integer id){
		jogoservice.delete(id);
		return ResponseEntity.noContent().build();
		
	}
}
