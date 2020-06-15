package com.generation.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbPaciente")
public class pacienteModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codPaciente;
	
	@Column(name="nome", nullable=false)
	@Size(min=2, max=80)
	private String nome;
	
	@Column(name="endereco", nullable=false)
	private String endereco;
	
	@Column(name="cep", nullable=false)
	private String cep;
	
	@Column(name="telefone", nullable=false)
	private String telefone;
	
}
