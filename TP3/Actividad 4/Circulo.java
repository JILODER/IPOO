public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String color){
        this.setRadio(radio);
        this.setColor(color);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*getRadio()*getRadio();
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
}