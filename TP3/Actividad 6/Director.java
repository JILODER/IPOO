public class Director{
    private String nombre;
    private String dirige;
    
    public Director(String nombre, String dirige){
        this.nombre = nombre;
        this.dirige = dirige;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDirige(){
        return dirige;
    }
}