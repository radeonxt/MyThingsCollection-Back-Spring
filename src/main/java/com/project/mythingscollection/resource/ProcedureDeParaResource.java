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

import com.project.mythingscollection.domain.ProcedureDePara;
import com.project.mythingscollection.service.ProcedureDeParaService;

@RestController
@RequestMapping(value = "/jogos")
public class ProcedureDeParaResource {
	@Autowired
	private ProcedureDeParaService ProcedureDeParaservice;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <ProcedureDePara> findById(@PathVariable Integer id){
		ProcedureDePara obj = ProcedureDeParaservice.findbyId(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping
	public ResponseEntity <List<ProcedureDePara>> findAll(){
		List<ProcedureDePara> list = ProcedureDeParaservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<ProcedureDePara> create(@Valid @RequestBody ProcedureDePara obj){
		ProcedureDePara retorno = ProcedureDeParaservice.create(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProcedureDePara> update(@Valid @PathVariable Integer id, @RequestBody ProcedureDePara obj){
		ProcedureDePara retorno = ProcedureDeParaservice.update(id, obj);
		return ResponseEntity.ok().body(retorno);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ProcedureDePara> delete(@PathVariable Integer id){
		ProcedureDeParaservice.delete(id);
		return ResponseEntity.noContent().build();
		
	}
}
