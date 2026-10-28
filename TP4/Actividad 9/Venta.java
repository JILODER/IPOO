import java.util.Date;

public class Venta{
    private Libro libro;
    private Cliente comprador;
    private Persona vendedor;
    private Date fechaVenta;
    
    public Venta(Libro libro, Cliente comprador, Persona vendedor){
        this.libro = libro;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.fechaVenta = new Date();
    }
    
    public Libro getLibro(){
        return libro;
    }
    
    public Cliente getComprador(){
        return comprador;
    }
    
    public Persona getVendedor(){
        return vendedor;
    }
    
    public Date getFechaVenta(){
        return fechaVenta;
    }
}