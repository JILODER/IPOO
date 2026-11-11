Ejercicio 2.

Una empresa de seguros para autos vende pólizas de seguros para autos de cualquier
tipo. Las pólizas que vende la aseguradora pueden ser de dos tipos, pólizas con
cobertura parcial y pólizas con coberturas totales. Cada póliza contiene los siguientes
datos: nombre del asegurado, fecha de alta y fecha de validez de la póliza (es decir, la
fecha de cuando caduca la misma, la cual es de un año a partir de la fecha de alta) y el
auto en cuestión asegurado.

Del auto se conoce la marca, el modelo y la valuación (es decir, el valor que le asigna la
aseguradora).

El valor de cada una de las pólizas (el total de lo que el asegurado debe pagar) es 
diferente en cada caso y se calcula de la siguiente manera:

● Para las pólizas totales el valor es de 18000 pesos más el 10% del valor del auto.
P.e. Si tenemos un auto que vale 20.000.000 pesos, el valor total de la póliza es
de 218000 pesos.

● En cambio, para las pólizas parciales el valor es de 10000 pesos más el 7% del
valor del auto.

Realice el diagrama de clases en UML e implemente en JAVA-LIKE al menos los
siguientes mensajes:

a) montoAPagarDe(Poliza unaPoliza) “Retorna el monto que debe pagar el auto según la póliza”

b) montoTotalAsegurado() “Retorna la suma de los valores de valuación”

c) montoTotalACobrar() “Retorna el monto que la aseguradora debe cobrar según las pólizas 
que tiene vendidas”

d) asegurarAutoTotal(Auto unAuto, String unNombre) “Asegura un auto con una póliza completa”

e) cantidadDePolizas() “retorna la cantidad de pólizas vendidas”