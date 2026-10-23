public class CuentaCorriente extends CuentaBancaria{
    private int maxExtracciones;
    private int extraccionesRealizadas;
    
    public CuentaCorriente(Persona titular, double saldo, int maxExtracciones){
        super(titular, saldo);
        this.maxExtracciones = maxExtracciones;
        this.extraccionesRealizadas = 0;
    }
    
    public int getMaxExtracciones(){
        return maxExtracciones;
    }
    
    public int getExtraccionesRealizadas(){
        return extraccionesRealizadas;
    }
    
    @Override
    protected boolean puedeExtraer(double monto){
        if(this.getExtraccionesRealizadas() < this.getMaxExtracciones()){
            this.extraccionesRealizadas++;
            return true;
        }
        return false;
    }
}