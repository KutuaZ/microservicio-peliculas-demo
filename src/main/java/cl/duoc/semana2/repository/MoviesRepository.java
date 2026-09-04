package cl.duoc.semana2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.semana2.model.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
    
}
