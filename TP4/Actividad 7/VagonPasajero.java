public class VagonPasajero extends Vagon{
    private int cantPasajeros;
    
    public VagonPasajero(double peso, int cantPasajeros){
        super(peso);
        this.cantPasajeros = cantPasajeros;
    }
    
    @Override
    public int cantidadDePasajeros(){
        return this.cantPasajeros;
    }
    
    @Override
    public double calcularPeso(){
        return super.calcularPeso() + (this.cantPasajeros * 80);
    }
    
    @Override
    public double getPorcentajeReduccionVelocidad(){
        return 0.03;
    }
}