public class Persona{
    private String nombreCompleto;
    private int dni;
    private String domicilio;
    private String email;
    private long telefono;
    
    public Persona(String nombreCompleto, int dni, String domicilio,
                   String email, long telefono){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
    }
}