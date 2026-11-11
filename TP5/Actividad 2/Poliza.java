import java.time.LocalDate;

public abstract class Poliza{
    private String nombreAsegurado;
    private LocalDate fechaAlta;
    private LocalDate fechaValidez;
    private Auto auto;
    
    public Poliza(String nombreAsegurado, Auto auto){
        this.nombreAsegurado = nombreAsegurado;
        this.auto = auto;
        this.fechaAlta = LocalDate.now();
        this.fechaValidez = this.fechaAlta.plusYears(1);
    }
    
    public Auto getAuto(){
        return this.auto;
    }
    
    public abstract float valorPoliza();
}