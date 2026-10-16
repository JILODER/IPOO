import java.util.ArrayList;
import java.util.List;

public class Serie extends ProduccionAudiovisual{
    private List<Capitulo> capitulos;
    
    public Serie(String titulo, int anio, List<Actor> actores, Director director,
    List<Personaje> personajes, List<Capitulo> capitulos){
        super(titulo, anio, actores, director, personajes);
        this.setCapitulos(capitulos);
    }
    
    public void setCapitulos(List<Capitulo> capitulos){
        if(capitulos == null || capitulos.size() < 2){
            throw new IllegalArgumentException(
            "La serie debe tener al menos dos capitulos");
        }
        this.capitulos = new ArrayList<Capitulo>(capitulos);
    }
    
    public List<Capitulo> getCapitulos(){
        return new ArrayList<Capitulo>(capitulos);
    }
    
    public int getCantCapitulos(){
        return capitulos.size();
    }
}