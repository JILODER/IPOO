public class Vehiculo{
    private float velocidadActual;
    private float velocidadMaxima;
    private int cantRuedas;
    private String marca;
    private String modelo;
    private Persona duenio;
    
    public float getVelocidad(){
        return velocidadActual;
    }
    
    public void acelerar(float velocidadExtra){
        velocidadActual = velocidadActual + velocidadExtra;
    }
    
    public void frenar(float velocidadMenos){
        velocidadActual = velocidadActual - velocidadMenos;
    }
    
    public float getVelocidadMax(){
        return velocidadMaxima;
    }
    
    public int getCantRuedas(){
        return cantRuedas;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
}