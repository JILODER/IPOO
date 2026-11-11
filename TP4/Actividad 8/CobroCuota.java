public class CobroCuota extends Cobro{
    private int cantCuotas;
    
    public CobroCuota(Bien bien, int cantCuotas){
        super(bien);
        this.cantCuotas = cantCuotas;
    }
    
    @Override
    public float calcularImporte(){
        return bien.calcularImpuesto();
    }
}