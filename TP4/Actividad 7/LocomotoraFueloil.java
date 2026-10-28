public class LocomotoraFueloil extends Locomotora{
    public LocomotoraFueloil(double peso, double velocidadMax, double potenciaMax){
        super(peso, velocidadMax, potenciaMax);
    }
    
    @Override
    protected float cantidadDeLitrosNecesarios(int km){
        return 15.0f * km;
    }
}