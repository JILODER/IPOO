import java.util.Date;
import java.util.Vector;

public abstract class CuentaBancaria{
    protected Persona titular;
    protected double saldo;
    protected Date fechaCreacion;
    private Vector<Transaccion> transacciones;
    
    public CuentaBancaria(Persona titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.fechaCreacion = new Date();
    }
    
    public void extraer(double unMonto){
        if(puedeExtraer(unMonto)){
            saldo -= unMonto;
            registrarTransaccion(unMonto, "Extraccion");
        } else{
            throw new IllegalArgumentException(
            "No se puede extraer.");
        }
    }
    
    public void depositar(double unMonto){
        saldo += unMonto;
        registrarTransaccion(unMonto, "Deposito");
    }
    
    public double saldo(){
        return saldo;
    }
    
    public Persona nombreTitular(){
        return titular;
    }
    
    protected abstract boolean puedeExtraer(double unMonto);
    
    private void registrarTransaccion(double monto, String tipo){
        this.transacciones.add(new Transaccion(monto, tipo));
    }
}