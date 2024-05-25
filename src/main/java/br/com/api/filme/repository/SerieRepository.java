package br.com.api.filme.repository;

import br.com.api.filme.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {


}
