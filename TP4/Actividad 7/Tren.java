import java.util.Vector;

public class Tren{
   private Locomotora locomotora;
   private Vector<Vagon> vagones;
   
   public Tren(Locomotora locomotora){
       this.locomotora = locomotora;
       this.vagones = new Vector<>();
   }
   
   public void engancharVagon(Vagon v){
       if(v != null){
           this.vagones.add(v);
       }
   }
   
   public float cantidadDeLitrosNecesarios(int km){
       return this.locomotora.cantidadDeLitrosNecesarios(km);
   }
   
   public double pesoTotalTren(){
       double pesoTotal = this.locomotora.getPesoLocomotora();
       for(Vagon v : this.vagones){
           pesoTotal += v.calcularPeso();
       }
       return pesoTotal;
   }
   
   public boolean puedeMover(Vector<Vagon> vagones){
       double pesoAnalizar = this.locomotora.getPesoLocomotora();
       for(Vagon v : vagones){
           pesoAnalizar += v.calcularPeso();
       }
       return pesoAnalizar <= this.locomotora.getPotenciaMax();
   }
   
   public int cantidadDePasajeros(){
       int totalPasajeros = 0;
       for(Vagon v : this.vagones){
           totalPasajeros += v.cantidadDePasajeros();
       }
       return totalPasajeros;
   }
   
   public double velocidadMaxima(){
       double velocidadActual = this.locomotora.getVelocidadMax();
       for(Vagon v : this.vagones){
           double porcentajeReduccion = v.getPorcentajeReduccionVelocidad();
           velocidadActual -= velocidadActual * porcentajeReduccion;
       }
       return velocidadActual;
   }
}