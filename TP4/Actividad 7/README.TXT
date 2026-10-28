Ejercicio 7.

Un tren está compuesto por una locomotora y un conjunto de vagones. Las locomotoras
que pueden ser parte del tren son Eléctricas, Diesel o Fuel Oil. Cada locomotora tiene
una velocidad máxima y una potencia máxima, las cuales pueden variar de una
locomotora a otra. La potencia máxima indica el peso máximo que puede mover.

Además, cada locomotora tiene un consumo (en litros de combustible) que se mide en
kilómetros recorridos.
La siguiente tabla indica el consumo:

Electrica | 0 litros por km
Diesel    | 10 litros por km
Fueloil   | 15 litros por km

Por otro lado, los vagones pueden ser de pasajeros o de carga. Los vagones de carga no
pueden llevar pasajeros, en cambio los vagones de pasajeros pueden llevar X pasajeros.
En ambos casos, los vagones tienen un peso. En el caso de los vagones de carga es fijo
(en el mismo se incluye el peso específico del vagón y el de la carga que pueden llevar)
y en el caso de los vagones de pasajeros se calcula según el peso específico del vagón
más 80 kilos por cada una de las personas que puede llevar.

Las locomotoras tienen un peso específico que también se debe tener en cuenta. Y su
velocidad disminuye según la cantidad de vagones que tenga enganchados. Por cada
vagón de pasajeros la velocidad disminuye en un 3% y en el caso de los de carga en un
5%.

a) Modele en UML el diagrama de clases
b) Implemente en JAVA-LIKE todas las clases y métodos que se piden a
continuación. Como así todos los métodos necesarios que crea convenientes:

i. cantidadDeLitrosNecesarios(int km); //Este método
retorna la cantidad de litros, según cada locomotora, que son necesarios
para recorrer los kilómetros que se pasan como parámetro.

ii. pesoTotalDelTren(); //Este método retorna el peso total del tren
teniendo en cuenta que los trenes pueden tener vagones de carga y
vagones de pasajeros en la misma formación. Además se debe sumar el
peso de la locomotora.

iii. puedeMover(Vector<Vagon> vagones); //El tren retorna T/F en
el caso de que pueda mover o no la formación de vagones. Se tiene en
cuenta la potencia de la locomotora en cuestión.

iv. cantidadDePasajeros(); //Es la suma de todos los pasajeros que
contienen los vagones. Recuerde que la formación puede contener
vagones de carga que NO tienen pasajeros.

v. velocidadMaxima(); //Es la velocidad máxima que puede levantar
el tren según los vagones que tiene enganchados.