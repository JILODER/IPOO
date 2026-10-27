import java.util.Date;

public class CajaAhorro extends CuentaBancaria{
    public CajaAhorro(Persona titular, double saldo, Moneda moneda){
        super(titular, saldo, moneda);
    }
    
    @Override
    protected boolean puedeExtraer(double monto){
        return monto <= this.saldo;
    }
}