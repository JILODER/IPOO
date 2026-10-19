import java.util.HashSet;
import java.util.Set;

public class Main_prueba {
    public static void main(String[] args) {
        // 1. Creamos las personas
        Persona p2 = new Persona("Dos", 2);
        Persona p4 = new Persona("Cuatro", 4);
        Persona p6 = new Persona("Seis", 6);
        Persona p8 = new Persona("Ocho", 8);
        Persona p10 = new Persona("Diez", 10);
        Persona p14 = new Persona("Catorce", 14);
        Persona p16 = new Persona("Dieciseis", 16);
        Persona p26 = new Persona("Veintiseis", 26);

        // 2. Armamos los Sets de Java
        Set<Persona> setA = new HashSet<>();
        setA.add(p2); setA.add(p4); setA.add(p6);

        Set<Persona> setB = new HashSet<>();
        setB.add(p4); setB.add(p6); setB.add(p8); setB.add(p10);

        Set<Persona> setC = new HashSet<>();
        setC.add(p10); setC.add(p14); setC.add(p16); setC.add(p26);

        // 3. Armamos el objeto Conjunto A
        Conjunto A = new Conjunto();
        A.add(p2); A.add(p4); A.add(p6);

        // 4. Mostramos resultados en consola
        System.out.println("--- PRUEBAS DEL EJERCICIO 7 ---");
        System.out.println("Conjunto A: " + A.getElementos());
        
        System.out.println("\nA. Unión A U B: " + A.union(setB).getElementos());
        System.out.println("B. Unión A U C: " + A.union(setC).getElementos());
        
        System.out.println("\nC. Intersección A ∩ B: " + A.interseccion(setB).getElementos());
        System.out.println("D. Intersección A ∩ C: " + A.interseccion(setC).getElementos());
        
        System.out.println("\nE. Diferencia A - B: " + A.diferencia(setB).getElementos());
        System.out.println("F. Diferencia Simétrica A Δ B: " + A.diferenciaSimetrica(setB).getElementos());
    }
}