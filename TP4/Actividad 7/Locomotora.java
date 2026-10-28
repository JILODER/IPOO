public abstract class Locomotora{
    private double peso;
    private double velocidadMax;
    private double potenciaMax;
    
    public Locomotora(double peso, double velocidadMax, double potenciaMax){
        this.peso = peso;
        this.velocidadMax = velocidadMax;
        this.potenciaMax = potenciaMax;
    }
    
    protected abstract float cantidadDeLitrosNecesarios(int km);
    
    public double getPesoLocomotora(){
        return this.peso;
    }
    
    public double getVelocidadMax(){
        return this.velocidadMax;
    }
    
    public double getPotenciaMax(){
        return this.potenciaMax;
    }
}