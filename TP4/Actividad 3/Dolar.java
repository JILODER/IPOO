public class Dolar extends Moneda{
    private double cotizacion;
    
    public Dolar(double cotizacion){
        super("USD");
        this.cotizacion = cotizacion;
    }
    
    public void setCotizacion(double nuevaCotizacion){
        this.cotizacion = nuevaCotizacion;
    }
    
    @Override
    public double convertirAPesos(double monto){
        return monto * this.cotizacion;
    }
}