public class Capitulo{
    private String nombre;
    private float duracion;
    private int numero;
    
    public Capitulo(String nombre, float duracion, int numero){
        this.nombre = nombre;
        this.duracion = duracion;
        this.numero = numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getDuracion(){
        return duracion;
    }
    
    public int getNumero(){
        return numero;
    }
}