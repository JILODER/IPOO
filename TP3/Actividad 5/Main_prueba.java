import java.util.ArrayList;
import java.util.List;

public class Main_prueba {
    public static void main(String[] args) {
        // Crear personajes
        Personaje p1 = new Personaje("Harry", 17);
        Personaje p2 = new Personaje("Hermione", 17);

        // Armar lista
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(p1);
        personajes.add(p2);

        // Crear libro
        Libro libro = new Libro("Harry Potter", "Rowling", 1997, 6, 26, personajes, 5);

        // Crear librería y agregar libro
        Libreria libreria = new Libreria();
        libreria.agregarLibro(libro);

        // Probar métodos
        System.out.println("Libros: " + libreria.cantidadDeLibros());
        System.out.println("Copias: " + libreria.cantidadTotalDeCopias());
    }
}