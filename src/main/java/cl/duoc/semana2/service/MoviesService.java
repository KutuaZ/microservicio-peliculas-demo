package cl.duoc.semana2.service;

import java.util.List;
import java.util.Optional;

import cl.duoc.semana2.model.Movies;

public interface MoviesService {
    
    List<Movies> getAllMovies();
    Optional<Movies> getMovieById(long id);
    Movies createMovie(Movies movie);
    Movies updateMovie(Long id,Movies movie);
    void deleteMovie(Long id);



}