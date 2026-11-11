public class Auto{
    private String marca;
    private String modelo;
    private float valuacion;
    
    public Auto(String marca, String modelo, float valuacion){
        this.marca = marca;
        this.modelo = modelo;
        this.valuacion = valuacion;
    }
    
    public float getValuacion(){
        return this.valuacion;
    }
}