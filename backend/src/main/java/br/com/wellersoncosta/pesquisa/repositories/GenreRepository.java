package br.com.wellersoncosta.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wellersoncosta.pesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	
}
