public class LocomotoraDiesel extends Locomotora{
    public LocomotoraDiesel(double peso, double velocidadMax, double potenciaMax){
        super(peso, velocidadMax, potenciaMax);
    }
    
    @Override
    protected float cantidadDeLitrosNecesarios(int km){
        return 10.0f * km;
    }
}