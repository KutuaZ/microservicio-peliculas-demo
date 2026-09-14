package cl.duoc.semana2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.semana2.model.Movies;
import cl.duoc.semana2.repository.MoviesRepository;

@Service 
public class MoviesServiceImpl implements MoviesService {

    @Autowired 
    private MoviesRepository moviesRepository;

    @Override
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Optional<Movies> getMovieById(long id) {
        return moviesRepository.findById(id);
    }

    @Override
    public Movies createMovie(Movies movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public Movies updateMovie(Long id, Movies movie) {
        if(moviesRepository.existsById(id)){
            movie.setId(id);
            return moviesRepository.save(movie);
        } else {
            return null;
        }
    }

    @Override
    public void deleteMovie(Long id) {
        moviesRepository.deleteById(id);
    }

}
