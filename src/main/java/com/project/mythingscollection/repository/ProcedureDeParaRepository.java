package com.project.mythingscollection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.mythingscollection.domain.ProcedureDePara;

@Repository
public interface ProcedureDeParaRepository extends JpaRepository<ProcedureDePara, Integer> {
	
	@Query("select p from ProcedureDePara p where p.procedure_code = :procedureCode and p.sigla = :sigla")
    ProcedureDePara findByProcedureCodeAndCodApresMnemonico(@Param("procedureCode") String procedureCode, @Param("sigla") String sigla);

}
