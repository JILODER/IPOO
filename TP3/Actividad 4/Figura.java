public abstract class Figura{
    protected String color;
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public abstract double calcularArea();
    
    public void pintar(){
        System.out.println("Pintando: "+getClass().getSimpleName()+" "+getColor());
    }
}