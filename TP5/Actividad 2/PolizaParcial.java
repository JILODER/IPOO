public class PolizaParcial extends Poliza{
    public PolizaParcial(String nombreAsegurado, Auto auto){
        super(nombreAsegurado, auto);
    }
    
    @Override
    public float valorPoliza(){
        return 10000 + (getAuto().getValuacion() * 0.07f);
    }
}