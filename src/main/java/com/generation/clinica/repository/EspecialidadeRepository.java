package com.generation.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.clinica.model.especialidadeModel;

@Repository
public interface EspecialidadeRepository extends JpaRepository<especialidadeModel, Long> {

}
