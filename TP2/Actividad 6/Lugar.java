public class Lugar{
    private String provincia;
    private String localidad;
    private String calle;
    private int numeroCalle;
    
    public Lugar(String provincia, String localidad, String calle, int numeroCalle){
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }
    
    public String getDireccion(){
        return calle + " " + numeroCalle + ", " + localidad + ", " + provincia + ".";
    }
    
    public String getProvincia(){return provincia;}
    public String getLocalidad(){return localidad;}
    public String getCalle(){return calle;}
    public int getNumeroCalle(){return numeroCalle;}
}