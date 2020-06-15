package com.generation.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.clinica.model.medicoModel;

@Repository
public interface MedicoRepository extends JpaRepository<medicoModel, String>{
	
	public List<medicoModel> findAllBynomeContainingIgnoreCase(String nome);

}
