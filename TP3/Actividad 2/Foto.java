public class Foto{
    private String nombre;
    
    public Foto(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString() {
        return "name: "+nombre;
    }
}