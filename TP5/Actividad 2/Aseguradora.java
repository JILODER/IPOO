import java.util.Vector;

public class Aseguradora{
    private Vector<Poliza> polizas = new Vector<>();
    
    public void asegurarAutoParcial(Auto auto, String nombre){
        PolizaParcial pParcial = new PolizaParcial(nombre, auto);
        polizas.add(pParcial);
    }
    
    public void asegurarAutoTotal(Auto auto, String nombre){
        PolizaTotal pTotal = new PolizaTotal(nombre, auto);
        polizas.add(pTotal);
    }
    
    public float montoAPagar(Poliza unaPoliza){
        return unaPoliza.valorPoliza();
    }
    
    public float montoTotalAsegurado(){
        float suma = 0;
        for(Poliza v : this.polizas){
            suma += v.getAuto().getValuacion();
        }
        return suma;
    }
    
    public float montoTotalACobrar(){
        float total = 0;
        for(Poliza m : this.polizas){
            total += m.valorPoliza();
        }
        return total;
    }
    
    public int cantidadDePolizas(){
        return polizas.size();
    }
}