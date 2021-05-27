package br.com.wellersoncosta.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellersoncosta.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
