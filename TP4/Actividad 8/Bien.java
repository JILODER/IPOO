public abstract class Bien{
    private int numeroID;
    private float valorFiscal;
    private Persona duenio;
    
    public Bien(int numeroID, float valorFiscal, Persona duenio){
        this.numeroID = numeroID;
        this.valorFiscal = valorFiscal;
        this.duenio = duenio;
    }
    
    public float getValorFiscal(){
        return valorFiscal;
    }
    
    public abstract float calcularImpuesto();
}