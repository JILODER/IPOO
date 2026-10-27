public class ColaDoble{
    //Creo las dos colas en base a la clase Cola
    private Cola cola1;
    private Cola cola2;
    
    //Creo las colas vacias con base de la clase Cola
    public ColaDoble(){
        this.cola1 = new Cola();
        this.cola2 = new Cola();
    }
    
    //Agrego elemento a la cola con menos objetos
    public void encolar(Object elemento){
        if(elemento != null){
            if(this.cola1.size() <= this.cola2.size()){
                this.cola1.encolar(elemento);
            } else{
                this.cola2.encolar(elemento);
            }
        }
    }
    
    //Desencolo de la cola que más objetos tenga
    public Object desencolar(){
        //Primero consulto si esta vacia con el metodo isEmpty()
        if(this.isEmpty()){
            System.out.println("Colas vacias");
            return null;
        }
        if(this.cola1.size() >= this.cola2.size()){
            return this.cola1.desencolar();
        } else{
            return this.cola2.desencolar();
        }
    }
    
    //Consulto si estan vacias
    public boolean isEmpty(){
        return this.cola1.isEmpty() && this.cola2.isEmpty();
    }
    
    //Retorno suma de ambas colas
    public int size(){
        return this.cola1.size() + this.cola2.size();
    }
    
    //Muestro primer elemento de la cola más larga
    public Object first(){
        if(this.isEmpty()){
            System.out.println("Colas vacias");
            return null;
        }
        if(this.cola1.size() >= this.cola2.size()){
            return this.cola1.first();  //Caso empate
        } else{
            return this.cola2.first();
        }
    }
    
    //Muestro último elemento de la cola más larga
    public Object last(){
        if(this.isEmpty()){
            System.out.println("Colas vacias");
            return null;
        }
        if(this.cola1.size() > this.cola2.size()){
            return this.cola1.last();
        } else{
            return this.cola2.last();  //Caso empate
        }
    }
}