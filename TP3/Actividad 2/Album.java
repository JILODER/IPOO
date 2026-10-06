import java.util.List;
import java.util.ArrayList;

public class Album{
    private String nombre;
    private List<Foto> fotos;
    
    public Album(){
        this.fotos = new ArrayList<>();
    }
    
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarFoto(Foto f){
        if(f != null){
            fotos.add(f);
        }
    }
    
    public void agregarFotos(List<Foto> nuevasFotos){
        if(nuevasFotos != null){
            fotos.addAll(nuevasFotos);
        }
    }
    
    public void eliminarFoto(Foto f){
        fotos.remove(f);
    }
    
    public void limpiarAlbum(){
        fotos.clear();
    }
    
    public int cantidadFotos(){
        return fotos.size();
    }
    
    public List<Foto> getFotos(){
        return new ArrayList<>(fotos);
        //retorna copia para no exponer lista interna.
        //parámetro = otroAlbum.getFotos()
    }
    
    public String toString() {
        return "Album{nombre = "+nombre+", fotos = "+fotos+"}";
    }
}