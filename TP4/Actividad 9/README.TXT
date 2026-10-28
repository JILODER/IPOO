Ejercicio 9.

La librería “BookWorld” desea mejorar su sistema de gestión de ventas implementando
descuentos especiales para distintos tipos de clientes.

El sistema debe permitir registrar las ventas de libros, aplicar descuentos según el tipo de
cliente y obtener información sobre las ventas realizadas.

La librería ofrece una amplia variedad de libros, tales como novelas, ensayos, cómics y
manuales técnicos.De cada libro se conoce: Título, Autor, Género y Precio base.

Existen tres tipos de clientes:
Nuevos: realizan su primera compra. Frecuentes: ya han realizado compras anteriores
e Institucionales: compran libros en cantidad (por ejemplo, bibliotecas o escuelas).

Según el tipo de cliente, se aplican los siguientes descuentos sobre el precio base del libro:
Nuevos: 0%
Frecuentes: 10%
Institucionales: 25%

El sistema debe registrar las ventas realizadas, donde cada venta incluye: El libro vendido, el
cliente que lo compró, el vendedor responsable y la fecha de la venta

1. Diseñe una solución al enunciado, identifique las clases involucradas, atributos, y
relaciones en UML.

2. En Java-Like se pide que implemente al menos los siguientes métodos (y todos los
métodos necesarios para resolver los mismos):

a. //Registrar la venta de un libro a un cliente..
public void addVentat(Libro libro, Cliente comprdr, Persona vendedor)

b. //Calcular el precio final de un libro después de aplicar los descuentos.
public double precioDe(Venta venta)

c. //Retorna la suma de todos las ventas
public double totalVentas()

d. //Retorna la venta de mayor importe
public Venta ventaMasCara()