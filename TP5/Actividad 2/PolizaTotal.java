public class PolizaTotal extends Poliza{
    public PolizaTotal(String nombreAsegurado, Auto auto){
        super(nombreAsegurado, auto);
    }
    
    @Override
    public float valorPoliza(){
        return 18000 + (getAuto().getValuacion() * 0.1f);
    }
}