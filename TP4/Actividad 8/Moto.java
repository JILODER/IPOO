public class Moto extends Bien{
    public Moto(int numeroID, float valorFiscal, Persona duenio){
        super(numeroID, valorFiscal, duenio);
    }
    
    @Override
    public float calcularImpuesto(){
        return 0.0f;
    }
}