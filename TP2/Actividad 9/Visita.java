import java.util.Date;

public class Visita{
    private Date fechaDeVisita;
    private Persona persona;
    private Museo museoVisitado;
    private ObraDeArte obraDestacada;
    
    public Visita(int anio, int mes, int dia, Persona persona, Museo museo,
                  ObraDeArte obraDestacada){
        fechaDeVisita = new Date (anio - 1900, mes - 1, dia);
        this.persona = persona;
        museoVisitado = museo;
        this.obraDestacada = obraDestacada;
    }
}