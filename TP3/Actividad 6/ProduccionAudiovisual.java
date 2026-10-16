import java.util.List;
import java.util.ArrayList;

public class ProduccionAudiovisual{
    private String titulo;
    private int anio;
    private List<Actor> actores;
    private Director director;
    private List<Personaje> personajes;
    
    public ProduccionAudiovisual(String titulo, int anio, List<Actor> actores,
    Director director, List<Personaje> personajes){
        this.titulo = titulo;
        this.anio = anio;
        this.setActores(actores);
        this.setDirector(director);
        this.setPersonajes(personajes);
    }
    
    public void setActores(List<Actor> actores){
        if(actores == null){
            this.actores = new ArrayList<Actor>();
        } else{
            this.actores = new ArrayList<Actor>(actores);
        }
    }
    
    public void setDirector(Director director){
        if(director == null){
            throw new IllegalArgumentException(
            "La pelicula debe tener un director");
        }
        this.director = director;
    }
    
    public void setPersonajes(List<Personaje> personajes){
        if(personajes == null){
            throw new IllegalArgumentException(
            "Debe tener un personaje minimo");
        }
        this.personajes = new ArrayList<Personaje>(personajes);
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public List<Actor> getActores(){
        return new ArrayList<Actor>(actores);
    }
    
    public Director getDirector(){
        return director;
    }
    
    public List<Personaje> getPersonajes(){
        return new ArrayList<Personaje>(personajes);
    }
}