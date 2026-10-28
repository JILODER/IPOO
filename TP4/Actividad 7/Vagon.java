public abstract class Vagon{
    private double peso;
    
    public Vagon(double peso){
        this.peso = peso;
    }
    
    public abstract int cantidadDePasajeros();
    
    public double calcularPeso(){
        return this.peso;
    }
    
    public abstract double getPorcentajeReduccionVelocidad();
}