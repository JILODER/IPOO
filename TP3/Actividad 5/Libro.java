import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Libro{
    private String titulo;
    private String autor;
    private Date fechaPubli;
    private List<Personaje> personajes;
    private int copiasStock;
    
    public Libro(String titulo, String autor, int anio, int mes, int dia,
    List<Personaje> personas, int copiasStock){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setFechaPubli(anio, mes, dia);
        this.setPersonajes(personas);
        this.setCopias(copiasStock);
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setFechaPubli(int anio, int mes, int dia){
        this.fechaPubli = new Date(anio - 1900, mes - 1, dia);
    }
    
    public void setPersonajes(List<Personaje> personajes){
        if(personajes != null){
            this.personajes = new ArrayList<>(personajes);
        } else{
            throw new IllegalArgumentException("Lista vacia.");
        }
    }
    
    public void setCopias(int copias){
        this.copiasStock = copias;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void mostrarFechaPubli(){
        int dia = fechaPubli.getDate();
        int mes = fechaPubli.getMonth() + 1;
        int anio = fechaPubli.getYear() + 1900;
        System.out.println(dia+"/"+mes+"/"+anio);
    }
    
    public Date getFechaPubli(){
        return fechaPubli;
    }
    
    public List<Personaje> getPersonajes(){
        return new ArrayList<>(personajes);
    }
    
    public int getCopiasStock(){
        return copiasStock;
    }
}