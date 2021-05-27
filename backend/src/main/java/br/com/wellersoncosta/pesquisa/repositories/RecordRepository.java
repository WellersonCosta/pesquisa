package br.com.wellersoncosta.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wellersoncosta.pesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
	
}
