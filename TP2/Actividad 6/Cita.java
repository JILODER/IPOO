import java.util.Date;

public class Cita{
    private Date fecha;
    private int importancia;
    private Persona contacto;
    private Lugar direccion;
    private String fechas;
    
    public Cita(String nombre, int edad, String sexo,
                String provincia, String localidad, String calle, int numeroCalle,
                int fechaCompacta, int importancia){
        this.contacto = new Persona(nombre, edad, sexo);
        this.direccion = new Lugar(provincia, localidad, calle, numeroCalle);
        
        //Ejemplo con 20261108
        int anio = fechaCompacta / 10000; //2026
        int mes = (fechaCompacta / 100) % 100; //11
        int dia = fechaCompacta % 100; //08
        
        this.fecha = new Date(anio - 1900, mes - 1, dia);
        if (importancia < 1 || importancia > 5){
            System.out.println("Importancia invalida. Se asigna 1 por defecto.");
            this.importancia = 1;
        } else{
            this.importancia = importancia;
        }
    }
    
    public void cambiarPriori(int n){
        if(n >= 1 && n <= 5){
            importancia = n;
        }
    }
    
    public void cambiarFecha(int fechaCompacta){
        int anio = fechaCompacta / 10000; //2026
        int mes = (fechaCompacta / 100) % 100; //11
        int dia = fechaCompacta % 100; //08
        
        this.fecha = new Date(anio - 1900, mes - 1, dia);
    }
    
    public Persona getContacto(){return contacto;}
    public Lugar getDireccion(){return direccion;}
    public String getFecha(){
        int dia  = fecha.getDate();
        int mes  = fecha.getMonth() + 1;
        int anio = fecha.getYear() + 1900;

        return anio + "/" + mes + "/" + dia;
    }
    public int getImportancia(){return importancia;}
}