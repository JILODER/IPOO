public class VagonCarga extends Vagon{
    public VagonCarga(double peso){
        super(peso);
    }
    
    @Override
    public int cantidadDePasajeros(){
        return 0;
    }
    
    @Override
    public double calcularPeso(){
        return super.calcularPeso();
    }
    
    @Override
    public double getPorcentajeReduccionVelocidad(){
        return 0.05;
    }
}