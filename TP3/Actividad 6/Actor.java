public class Actor{
    private String nombre;
    private Personaje interpretacion;
    
    public Actor(String nombre, Personaje interpretacion){
        this.nombre = nombre;
        this.interpretacion = interpretacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Personaje getInterpretacion(){
        return interpretacion;
    }
}