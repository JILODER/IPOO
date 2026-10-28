public class ClienteNuevo extends Cliente{
    public ClienteNuevo(String nombre, String dni){
        super(nombre, dni);
    }
    
    @Override
    public double calcularDescuento(){
        return 0.0 / 100;
    }
}