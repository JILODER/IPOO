import java.util.Date;

public abstract class Cobro{
    private Date fecha;
    protected Bien bien;
    
    public Cobro(Bien bien){
        this.fecha = new Date();
        this.bien = bien;
    }
    
    public Bien getBien(){
        return bien;
    }
    
    public abstract float calcularImporte();
}