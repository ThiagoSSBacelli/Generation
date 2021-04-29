package com.projetoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetoAPI.model.Postagem;

@Repository
public interface PostagemRepositery extends JpaRepository<Postagem, Long>{

	public List <Postagem> findAllByTituContainingIgnoreCase (String titulo);
	
	// findAllByTitu = Buscar todos pelo titulo.(nome do atributo da minha entidade)
	// Containing = like do meu MySQL
	// IgnoreCase = Ele nao leva em concideração o que é minusculo ou maiusculo, o IgnoreCase vai tranformar tudo seja maiusculo ou minusculo
	
}
