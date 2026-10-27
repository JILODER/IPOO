import java.util.Vector;

public class Cola{
    private Vector<Object> elementos;
    
    //Creo la Cola vacia usando Vector
    public Cola(){
        this.elementos = new Vector<>();
    }
    
    //Agrego elemento a la Cola
    public void encolar(Object elemento){
        if(elemento != null){
            this.elementos.add(elemento);
        }
    }
    
    //Saco el primer elemento y lo muestro
    public Object desencolar(){
        //Primero consulto si esta vacia con el metodo isEmpty()
        if(this.isEmpty()){
            System.out.println("Cola vacia");
            return null;
        }
        //Elimino el ultimo elemento y lo retorno
        return this.elementos.remove(0);
    }
    
    //Consulto si esta vacia
    public boolean isEmpty(){
        return this.elementos.isEmpty();
    }
    
    //Muestro cantidad de elementos
    public int size(){
        return this.elementos.size();
    }
    
    //Muestro primer elemento
    public Object first(){
        if(this.isEmpty()){
            System.out.println("Cola vacia");
            return null;
        }
        return this.elementos.firstElement(); //o .get(0);
    }
    
    //Muestro ultimo elemento
    public Object last(){
        if(this.isEmpty()){
            System.out.println("Cola vacia");
            return null;
        }
        return this.elementos.lastElement(); //o .get(size - 1);
    }
}