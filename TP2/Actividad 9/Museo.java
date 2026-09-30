public class Museo{
    private String nombre;
    private String direccion;
    private String ciudad;
    private Persona directorResponsable;
    
    public Museo(String nombre, String direccion, String ciudad,
                 Persona director) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        directorResponsable = director;
    }
}