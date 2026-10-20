public class Tecnico extends Empleado{
    private String titulo;
    private double contrato;
    
    public Tecnico(String nombre, String dni, String direccion, int anioNacimiento, String sexo,
    String titulo, double contrato){
        super(nombre, dni, direccion, anioNacimiento, sexo);
        this.titulo = titulo;
        this.contrato = contrato;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    @Override
    public double calcularSalario(){
        return contrato;
    }
}