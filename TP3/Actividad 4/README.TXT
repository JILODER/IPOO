Ejercicio 4.
Se desea modelar un Editor de Figuras. Un editor de figuras posee una colección de
figuras, las cuales pueden ser: cuadrado, círculo, triángulo, líneas. Todas ellas
tienen un color y los datos necesarios para calcular el área según qué figura es.
Todas entienden los mensajes:

i. void setColor(String color) -> Setea el color de la figura

ii. String getColor() -> Retorna el color de la figura

iii. double getArea() ->/ Retorna el área de la figura

iv. void pintar() -> Imprime en consola “Pintando FIGURA COLOR” por
ejemplo. “Pintando: círculo rojo”

El editor entiende los siguientes mensajes:

i. void pintar(); // Que pinta todas las figuras de la colección.

ii. double calcularArea(); //que retorna la suma de las áreas de todas las
figuras.

Además, entiende los mensajes para agregar y borrar figuras de su colección.
a) Realice el diagrama en UML
b) Implemente en JAVA-Like