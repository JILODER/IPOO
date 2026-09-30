public class ObraDeArte{
    private String titulo;
    private Persona autor;
    private int anioCreacion;
    private String tipoObra;
    
    public ObraDeArte(String titulo, Persona autor,
                      int anioCreacion, String tipoObra) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
        this.tipoObra = tipoObra;
    }
}