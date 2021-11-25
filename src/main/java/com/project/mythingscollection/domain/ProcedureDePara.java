package com.project.mythingscollection.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "procedurecode")
public class ProcedureDePara implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cd_exam_lab;
    private String nm_exam_lab;
    private String procedure_code;
    private String sigla;
    private String ativo;
    private String nm_operator;
    private String operator_description;


    public ProcedureDePara(Long id, String cd_exam_lab, String nm_exam_lab, String procedure_code, String sigla, String ativo, String nm_operator, String operator_description) {
    	super();
    	this.id = id;
        this.cd_exam_lab = cd_exam_lab;
        this.nm_exam_lab = nm_exam_lab;
        this.procedure_code = procedure_code;
        this.sigla = sigla;
        this.ativo = ativo;
        this.nm_operator = nm_operator;
        this.operator_description = operator_description;
    }

    public ProcedureDePara() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCd_exam_lab() {
        return cd_exam_lab;
    }

    public void setCd_exam_lab(String cd_exam_lab) {
        this.cd_exam_lab = cd_exam_lab;
    }

    public String getNm_exam_lab() {
        return nm_exam_lab;
    }

    public void setNm_exam_lab(String nm_exam_lab) {
        this.nm_exam_lab = nm_exam_lab;
    }

    public String getProcedure_code() {
        return procedure_code;
    }

    public void setProcedure_code(String procedure_code) {
        this.procedure_code = procedure_code;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getNm_operator() {
        return nm_operator;
    }

    public void setNm_operator(String nm_operator) {
        this.nm_operator = nm_operator;
    }

    public String getOperator_description() {
        return operator_description;
    }

    public void setOperator_description(String operator_description) {
        this.operator_description = operator_description;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcedureDePara other = (ProcedureDePara) obj;
		return Objects.equals(id, other.id);
	}
}
