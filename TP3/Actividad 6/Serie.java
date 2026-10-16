import java.util.ArrayList;
import java.util.List;

public class Serie{
    private String titulo;
    private int anio;
    private List<Actor> actores;
    private Director director;
    private List<Personaje> personajes;
    private List<Capitulo> capitulos;
    private int cantCapitulos;
    private String genero;
    
    public Serie(String titulo, int anio, List<Actor> actores, Director director,
    List<Personaje> personajes, List<Capitulo> capitulos, int cantCapitulos,
    String genero){
        this.titulo = titulo;
        this.anio = anio;
        this.setActores(actores);
        this.setDirector(director);
        this.setPersonajes(personajes);
        this.setCapitulos(capitulos);
        
        if(cantCapitulos != this.cantCapitulos){
            throw new IllegalArgumentException(
            "La cantidad debe coincidir con la lista de capitulos");
        }
        
        this.genero = genero;
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
            "La serie debe tener un director");
        }
        this.director = director;
    }
    
    public void setPersonajes(List<Personaje> personajes){
        if(personajes == null || personajes.isEmpty()){
            throw new IllegalArgumentException(
            "La serie debe tener al menos un personaje");
        }
        this.personajes = new ArrayList<Personaje>(personajes);
    }
    
    public void setCapitulos(List<Capitulo> capitulos){
        if(capitulos == null || capitulos.size() < 2){
            throw new IllegalArgumentException(
            "La serie debe tener al menos dos capitulos");
        }
        this.capitulos = new ArrayList<Capitulo>(capitulos);
        this.cantCapitulos = this.capitulos.size();
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
    
    public List<Capitulo> getCapitulos(){
        return new ArrayList<Capitulo>(capitulos);
    }
    
    public int getCantCapitulos(){
        return cantCapitulos;
    }
    
    public String getGenero(){
        return genero;
    }
}