package com.project.mythingscollection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mythingscollection.domain.ProcedureDePara;
import com.project.mythingscollection.repository.ProcedureDeParaRepository;

@Service
public class DbService {
	
	@Autowired
	private ProcedureDeParaRepository repository;
	
	public void instanciaBaseDados() {
		ProcedureDePara procedureDePara = new ProcedureDePara(2L,"teste", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2");
		repository.save(procedureDePara);
		
		procedureDePara = repository.findByProcedureCodeAndCodApresMnemonico("teste2","teste2");
		System.out.println(procedureDePara.getNm_operator());
	}

}
