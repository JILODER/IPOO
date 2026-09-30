import java.util.Date;

public class Tarea{
    private String descripcion;
    private Date fechaVencimiento;
    private int prioridad;
    private Persona personaResponsable;
    
    public Tarea(String descrip, int anio, int mes, int dia,
             int priori, Persona unaPersona){
    descripcion = descrip;
    fechaVencimiento = new Date (anio - 1900, mes - 1, dia);
    prioridad = priori;
    personaResponsable = unaPersona;
    }
    
    public String getFechaVencimiento(){
        int dia = fechaVencimiento.getDate();
        int mes = fechaVencimiento.getMonth() + 1;
        int anio = fechaVencimiento.getYear() + 1900;
        return "Tarea: " + descripcion + " | Vence: " + dia + "/" + mes + "/" + anio;
    }
}