public class Inmueble extends Bien{
    public Inmueble(int numeroID, float valorFiscal, Persona duenio){
        super(numeroID, valorFiscal, duenio);
    }
    
    public float calcularImpuesto(){
        return super.getValorFiscal() * 0.02f;
    }
}