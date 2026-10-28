import java.util.Vector;

public class SistemaGestorVentas{
    private Vector<Venta> ventas;
    
    public void addVenta(Libro libro, Cliente comprador, Persona vendedor){
        Venta venta = new Venta(libro, comprador, vendedor);
        ventas.add(venta);
    }
    
    public double precioDe(Venta venta){
        double precioBase = venta.getLibro().getPrecioBase();
        double descuento = venta.getComprador().calcularDescuento();
        
        return precioBase - (precioBase * descuento);
    }
    
    public double totalVentas(){
        double total = 0;
        for(Venta venta : ventas){
            total = total + precioDe(venta);
        }
        
        return total;
    }
    
    public Venta ventaMasCara(){
        if(ventas.isEmpty()){
            return null;
        }
        Venta mayor = ventas.firstElement();
        for(Venta venta : ventas){
            if(precioDe(venta) > precioDe(mayor)){
                mayor = venta;
            }
        }
        
        return mayor;
    }
}