package cl.duoc.semana2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.semana2.model.Movies;
import cl.duoc.semana2.service.MoviesService;





@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService; 


    @GetMapping
    public List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movies> getMovieById(@PathVariable Long id) {
        return moviesService.getMovieById(id);
    }

    @PostMapping
    public Movies createMovie(@RequestBody Movies movie) {
        return moviesService.createMovie(movie);
    }

    @PutMapping("/{id}")
    public Movies updateMovie(@PathVariable Long id, @RequestBody Movies movie) {
        return moviesService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        moviesService.deleteMovie(id);
    }

}

