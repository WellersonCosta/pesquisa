package br.com.wellersoncosta.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellersoncosta.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	
}
