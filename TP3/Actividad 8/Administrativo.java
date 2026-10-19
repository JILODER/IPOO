public class Administrativo extends Empleado{
    private int categoria;
    private int antiguedad;
    private double basico;
    
    public Administrativo(String nombre, String dni, String direccion, int anioNacimiento,
    String sexo, int categoria, int antiguedad, double basico){
        super(nombre, dni, direccion, anioNacimiento, sexo);
        this.categoria = categoria;
        this.antiguedad = antiguedad;
        this.basico = basico;
    }
    
    @Override
    public double calcularSalario(){
        double salario = (this.basico * this.categoria) + ((this.basico * this.antiguedad) / 4);
        return salario;
    }
}