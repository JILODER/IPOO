public abstract class Moneda{
    private String tipo;
    protected double saldoMoneda;
    
    public Moneda(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    protected abstract double convertirAPesos(double unMonto);
}