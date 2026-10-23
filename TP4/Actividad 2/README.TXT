Ejercicio 2.
Se desea modelar Cajas de Ahorro y Cuentas Corrientes. En ambos casos se tienen
como atributos un titular, un saldo, un máximo de extracciones y una fecha de creación.

En ambos casos las cuentas pueden:
○ extraer(double unMonto);
○ depositar(double unMonto);
○ saldo();
○ nombreTitular(); //Retorna el nombre y apellido del titular.

Pero hay ciertas restricciones según la cuenta que sea:
● Las cajas de ahorro no pueden extraer más dinero que el saldo que poseen.
● Las cuentas corrientes pueden extraer más dinero que el saldo, pero tienen un
límite en la cantidad de extracciones.

Por otro lado, se desea llevar un control de las transacciones realizadas, es por ello que
cada vez que se realice una transacción, la misma se debe guardar en la cuenta. De cada
transacción se conoce la fecha, el monto y el tipo de transacción (Un String simple)

a) Realice el diagrama de clases en UML.
b) Implemente en JAVA-Like

Nota: Tenga en cuenta que el extraer de la caja de ahorro y de la cuenta corriente deben
utilizar el extraer de cuenta bancaria.