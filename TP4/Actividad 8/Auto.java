public class Auto extends Bien{
    public Auto(int numeroID, float valorFiscal, Persona duenio){
        super(numeroID, valorFiscal, duenio);
    }
    
    public float calcularImpuesto(){
        return super.getValorFiscal() * 0.05f;
    }
}