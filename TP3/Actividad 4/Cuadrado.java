public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double lado, String color){
        this.setLado(lado);
        this.setColor(color);
    }
    
    @Override
    public double calcularArea(){
        return getLado() * getLado();
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
}