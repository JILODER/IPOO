public abstract class Cliente extends Persona{
    public Cliente(String nombre, String dni){
        super(nombre, dni);
    }
    
    public abstract double calcularDescuento();
}