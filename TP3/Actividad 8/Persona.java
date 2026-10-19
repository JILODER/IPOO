public class Persona{
    private String nombre;
    private String dni;
    private String direccion;
    private int anioNacimiento;
    private String sexo;
    
    public Persona(String nombre, String dni, String direccion, int anioNacimiento, String sexo){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    public String getSexo(){
        return sexo;
    }
}