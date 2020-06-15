package com.generation.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.clinica.model.pacienteModel;

@Repository
public interface PacienteRepository extends JpaRepository<pacienteModel, Long>{
	
	public List<pacienteModel> findAllBynomeContainingIgnoreCase(String nome);

}
