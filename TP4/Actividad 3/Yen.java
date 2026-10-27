public class Yen extends Moneda{
    private double cotizacion;
    
    public Yen(double cotizacion){
        super("YEN");
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