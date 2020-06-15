package com.generation.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.clinica.model.medicoModel;
import com.generation.clinica.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repository;
	
	@GetMapping("/{crm}")
	public ResponseEntity<medicoModel> GetById(@PathVariable String crm){
		return repository.findById(crm).map(resp->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<medicoModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/medico/{nomeMedico}")
	public ResponseEntity <List<medicoModel>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllBynomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity <medicoModel> Post (@RequestBody medicoModel medico){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(medico));
	}
	
	@PutMapping
	public ResponseEntity <medicoModel> Put (@RequestBody medicoModel medico){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(medico));
	}
	
	@DeleteMapping("/{crm}")
	public void delete (@PathVariable String crm) {
		repository.deleteById(crm);
	}
	
}
