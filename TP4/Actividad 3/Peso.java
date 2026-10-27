public class Peso extends Moneda{
    public Peso(){
        super("ARS");
    }
    
    @Override
    public double convertirAPesos(double unMonto){
        return unMonto;
    }
}