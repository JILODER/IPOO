public class Embarcacion extends Bien{
    public Embarcacion(int numeroID, float valorFiscal, Persona duenio){
        super(numeroID, valorFiscal, duenio);
    }
    
    @Override
    public float calcularImpuesto(){
        return super.getValorFiscal() * 0.03f;
    }
}