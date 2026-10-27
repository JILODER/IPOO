import java.util.Date;

public class Transaccion{
    private Date fecha;
    private double monto;
    private String tipo;
    
    public Transaccion(double monto, String tipo){
        this.fecha = new Date();
        this.monto = monto;
        this.tipo = tipo;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public String getTipo(){
        return tipo;
    }
}