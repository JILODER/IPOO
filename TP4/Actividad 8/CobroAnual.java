public class CobroAnual extends Cobro{
    public CobroAnual(Bien bien){
        super(bien);
    }
    
    @Override
    public float calcularImporte(){
        return bien.calcularImpuesto() * 0.90f;
    }
}