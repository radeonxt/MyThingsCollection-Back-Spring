package com.project.mythingscollection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mythingscollection.domain.ProcedureDePara;
import com.project.mythingscollection.repository.ProcedureDeParaRepository;

@Service
public class ProcedureDeParaService {
	
	@Autowired
	private ProcedureDeParaRepository repository;
	
	public List<ProcedureDePara> findAll(){
		return repository.findAll();		
	}
	
	public ProcedureDePara findbyId(Integer id){
		Optional<ProcedureDePara> objeto = repository.findById(id);
		return objeto.orElseThrow();
	}
	
	public ProcedureDePara create(ProcedureDePara obj) {
		obj.setId(null);
		return repository.save(obj);
		
	}
	
	public ProcedureDePara update(Integer id, ProcedureDePara obj) {
		return obj;
//		ProcedureDePara ProcedureDePara = this.findbyId(id);
//		ProcedureDePara.setNome(obj.getNome());
//		ProcedureDePara.setAno(obj.getAno());
//		ProcedureDePara.setGenero(obj.getGenero());
//		ProcedureDePara.setNota(obj.getNota());
//		ProcedureDePara.setProdutora(obj.getProdutora());
//		return repository.save(ProcedureDePara);
		
	}
	
	public void delete(Integer id) {
		findbyId(id);
		repository.deleteById(id);
	}

}
