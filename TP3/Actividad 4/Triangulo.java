public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura, String color){
        this.setBase(base);
        this.setAltura(altura);
        this.setColor(color);
    }
    
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
}