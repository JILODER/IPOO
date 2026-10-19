import java.util.Set;
import java.util.HashSet;

public class Conjunto{
    private Set<Persona> elementos;
    
    public Conjunto(){
        this.elementos = new HashSet();
    }
    
    public void add(Persona p){
        if(p != null){
            this.elementos.add(p);
        }
    }
    
    public void remove(Persona p){
        if(p != null){
            this.elementos.remove(p);
        }
    }
    
    public Conjunto union(Set<Persona> aSet){
        // Creamos un nuevo conjunto como copia
        Conjunto nuevoConjunto = new Conjunto();
        // Añadimos todo el conjunto de elementos actuales (this) al nuevo conjunto
        nuevoConjunto.elementos.addAll(this.elementos);
        // Por último añadimos el conjunto pasado por parámetro al nuevo conjunto
        nuevoConjunto.elementos.addAll(aSet);
        return nuevoConjunto;
    }
    
    public Conjunto interseccion(Set<Persona> aSet){
        Conjunto nuevoConjunto = new Conjunto();
        //Copiamos los elementos actuales
        nuevoConjunto.elementos.addAll(this.elementos);
        // retainAll borra todos los elementos que NO estén en aSet
        nuevoConjunto.elementos.retainAll(aSet);
        return nuevoConjunto;
    }
    
    public Conjunto diferencia(Set<Persona> aSet){
        Conjunto nuevoConjunto = new Conjunto();
        nuevoConjunto.elementos.addAll(this.elementos);
        // removeAll borra todos los elementos que SÍ estén en aSet
        nuevoConjunto.elementos.removeAll(aSet);
        return nuevoConjunto;
    }
    
    public Conjunto diferenciaSimetrica(Set<Persona> aSet){
        // Diferencia simétrica: (A - B) U (B - A)
        // Calculo (A - B)
        Conjunto diferenciaAB = this.diferencia(aSet);
        
        // Calculo (B - A)
        // Creo el conjunto B vacío y agrego los elementos
        Conjunto conjuntoB = new Conjunto();
        conjuntoB.elementos.addAll(aSet);
        
        // Realizo la diferencia
        Conjunto diferenciaBA = conjuntoB.diferencia(this.elementos);
        
        // Uno los resultados
        return diferenciaAB.union(diferenciaBA.elementos);
    }
    
    public Set<Persona> getElementos(){
        return new HashSet<>(this.elementos);
    }
    
    public int getSize(){
        return this.elementos.size();
    }
    
    // toString para imprimir fácilmente el conjunto en consola
    @Override
    public String toString(){
        return elementos.toString();
    }
}