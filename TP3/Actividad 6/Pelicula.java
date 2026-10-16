import java.util.List;

public class Pelicula extends ProduccionAudiovisual{
    
    public Pelicula(String titulo, int anio, List<Actor> actores,
    Director director, List<Personaje> personajes){
        super(titulo, anio, actores, director, personajes);
    }
}