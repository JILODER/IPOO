import java.util.Date;

public class CajaAhorro extends CuentaBancaria{
    public CajaAhorro(Persona titular, double saldo){
        super(titular, saldo);
    }
    
    @Override
    protected boolean puedeExtraer(double monto){
        return monto <= this.saldo;
    }
}