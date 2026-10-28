public class ClienteFrecuente extends Cliente{
    public ClienteFrecuente(String nombre, String dni){
        super(nombre, dni);
    }
    
    @Override
    public double calcularDescuento(){
        return 10 / 100;
    }
}