import java.util.List;
import java.util.ArrayList;

public class Personaje{
    private String nombre;
    private int edad;
    private List<Personaje> persona = new ArrayList<>();
    
    public Personaje(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
}