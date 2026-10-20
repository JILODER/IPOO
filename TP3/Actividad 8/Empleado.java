public abstract class Empleado extends Persona{
    public Empleado(String nombre, String dni, String direccion, int anioNacimiento, String sexo){
        super(nombre, dni, direccion, anioNacimiento, sexo);
    }
    
    public abstract double calcularSalario();
}