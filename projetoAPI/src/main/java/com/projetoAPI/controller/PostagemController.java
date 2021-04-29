package com.projetoAPI.controller;

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

import com.projetoAPI.model.Postagem;
import com.projetoAPI.repository.PostagemRepositery;

@RestController // responsavel pela Comunicação com o Client (Postiman, Angular etc)
@RequestMapping("/postagens") // Denifição de Rota ou URL
@CrossOrigin("*") // o sinal de * representa a aceitação de cada origem
public class PostagemController {

	@Autowired
	private PostagemRepositery repositoty;

	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repositoty.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Postagem> getById(@PathVariable long id) {
		return repositoty.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repositoty.findAllByTituContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem Postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoty.save(Postagem));
	}

	@PutMapping
	public ResponseEntity<Postagem> put (@RequestBody Postagem Postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repositoty.save(Postagem));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoty.deleteById(id);
	}
}
