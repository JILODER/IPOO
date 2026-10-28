public class ClienteInstitucional extends Cliente{
    private String entidad;
    
    public ClienteInstitucional(String nombre, String dni, String entidad){
        super(nombre, dni);
        this.entidad = entidad;
    }
    
    @Override
    public double calcularDescuento(){
        return 25 / 100;
    }
}