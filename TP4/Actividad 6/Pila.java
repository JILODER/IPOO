import java.util.Vector;

public class Pila{
    private Vector<Object> elementos;
    
    //Creo la Pila vacia usando Vector
    public Pila(){
        this.elementos = new Vector<>();
    }
    
    //Agrego elemento arriba de la pila
    public void apilar(Object elemento){
        if(elemento != null){
            this.elementos.add(elemento);
        }
    }
    
    //Saco el ulimo elemento y lo muestro
    public Object desapilar(){
        //Primero consulto si esta vacia con el metodo isEmpty()
        if(this.isEmpty()){
            System.out.println("Pila vacia");
            return null;
        }
        //Elimino el ultimo elemento y lo retorno
        return this.elementos.remove(this.elementos.size() - 1);
    }
    
    //Muestro el ultimo elemento
    public Object top(){
        if(this.isEmpty()){
            System.out.println("Pila vacia");
            return null;
        }
        return this.elementos.lastElement();
    }
    
    //Es lo mismo que desapilar
    public Object pop(){
        return this.desapilar();
    }
    
    //Muestro cantidad de elementos
    public int size(){
        return this.elementos.size();
    }
    
    //Consulto si esta vacia
    public boolean isEmpty(){
        return this.elementos.isEmpty();
    }
}