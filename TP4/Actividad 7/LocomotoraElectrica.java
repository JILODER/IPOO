public class LocomotoraElectrica extends Locomotora{
    public LocomotoraElectrica(double peso, double velocidadMax, double potenciaMax){
        super(peso, velocidadMax, potenciaMax);
    }
    
    @Override
    protected float cantidadDeLitrosNecesarios(int km){
        return 0.0f;
    }
}