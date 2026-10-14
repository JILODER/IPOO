import java.util.ArrayList;
import java.util.List;

public class Libreria{
    private List<Libro> libros;
    
    public Libreria(){
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro unLibro){
        if(unLibro != null){
            libros.add(unLibro);
        }
    }
    
    public void eliminarLibro(Libro unLibro){
        libros.remove(unLibro);
    }
    
    public int cantidadDeLibros(){
        return libros.size();
    }
    
    public int cantidadTotalDeCopias(){
        int total = 0;
        
        for(Libro libro : libros){
            total += libro.getCopiasStock();
        }
        
        return total;
    }
}