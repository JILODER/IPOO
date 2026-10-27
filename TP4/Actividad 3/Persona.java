public class Persona{
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private String dni;
    
    public Persona(String nombre, String apellido, int anioNacimiento, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    public String getDni(){
        return dni;
    }
}