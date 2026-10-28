public class Libro{
    private String titulo;
    private Persona autor;
    private String genero;
    private double precioBase;
    
    public Libro(String titulo, Persona autor, String genero, double precioBase){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precioBase = precioBase;
    }
    
    public double getPrecioBase(){
        return this.precioBase;
    }
}