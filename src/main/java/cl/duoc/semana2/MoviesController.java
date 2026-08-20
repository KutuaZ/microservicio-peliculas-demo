package cl.duoc.semana2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MoviesController {
    private List<Movies> movies = new ArrayList<>();

    public MoviesController() {
        // Agregar películas de ejemplo
        movies.add(new Movies(1, "Inception", 2010, "Christopher Nolan", "Ciencia ficción", "Un ladrón que roba secretos a través del uso de la tecnología de compartir sueños."));
        movies.add(new Movies(2, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama", "Dos hombres forman un vínculo mientras cumplen condena en la prisión de Shawshank."));
        movies.add(new Movies(3, "The Godfather", 1972, "Francis Ford Coppola", "Crimen", "La historia de la familia mafiosa Corleone."));
        movies.add(new Movies(4, "The Dark Knight", 2008, "Christopher Nolan", "Acción", "Batman se enfrenta al Joker, un criminal que busca sumir a Gotham en el caos."));
        movies.add(new Movies(5, "Pulp Fiction", 1994, "Quentin Tarantino", "Crimen", "Historias entrelazadas de criminales en Los Ángeles."));
        movies.add(new Movies(6, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La vida de Forrest Gump, un hombre con un coeficiente intelectual bajo que presencia y participa en eventos históricos."));
    }

    @GetMapping("/movies")
    public List<Movies> getAllMovies() {
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movies getMovieById(@PathVariable int id) {
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null; // Retorna null si no se encuentra la película
    }

}

