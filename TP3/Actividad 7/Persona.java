public class Persona{
    private String nombre;
    private int nroID;
    
    public Persona(String nombre, int nroID){
        this.nombre = nombre;
        this.nroID = nroID;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNroID(){
        return nroID;
    }
    
    public String toString() {
        return String.valueOf(nroID);
    }
}