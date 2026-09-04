package cl.duoc.semana2.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private long id;

    @Column(name = "titulo")
    private String titulo;

    @Column (name = "año")
    private int año;

    @Column (name = "director")
    private String director;

    @Column (name = "genero")
    private String genero;

    @Column (name = "sinopsis")
    private String sinopsis;
    

    // Getters and Setters
    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

}