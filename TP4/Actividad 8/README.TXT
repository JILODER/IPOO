Ejercicio 8.

ARBA (Agencia de Recaudación de la Provincia de Buenos Aires) nos está pidiendo un
sub-módulo para gestionar el cobro de impuestos de diferentes bienes personales.

La agencia cobra impuestos sobre todos los bienes de las personas, los cuales pueden ser
autos, motos, embarcaciones e inmuebles. De cada bien se conoce un número de
identificación, un valor fiscal (valor que le da ARBA) y el dueño de dicho bien.

Cada vez que se realiza un cobro, este se guarda en el sistema. Del cobro se conoce la
fecha y el bien por el cual se realizó el mismo. El cobro además puede ser anual o en
cuotas (la cantidad de cuotas es variable).

El cálculo del monto a pagar de cada impuesto se realiza según la siguiente tabla:

BIEN | Impuesto cuota | Impuesto anual

Moto | No aplica | No aplica
Auto | 5% valor fiscal | 5% valor fiscal - 10% dcto pago anual
Inmueble | 2% valor fiscal | 2% valor fiscal - 10% dcto pago anual
Embarcación | 3% valor fiscal | 3% valor fiscal - 10% dcto pago anual

Se pide que:

a) Realice el diagrama de clases en UML
b) Desarrolle en Java-Like todas las clases y métodos necesarios teniendo en cuenta
que el sistema debe tener como mínimo la siguiente funcionalidad:

i. /*Agrega un cobro a los cobros del sistema*/
public void agregarCobroAnual(Bien bien)

ii. /* Retorna el valor de cobro teniendo en cuenta los descuentos
pertinentes y porcentajes*/
public float valorCobro(Cobro cobro)

iii. /* Retorna la suma de todos los cobros*/
public float sumaCobros()

iv. /* Retorna el cobro de mayor importe de la colección de cobros */
public Cobro cobroMayor()

v. /* Retorna una colección con los cobros mayores al valor que se pasa por
parámetro */
public Vector<Cobro> cobroMayoresA(float valor)

vi. /* Retorna la suma de todos los valores fiscales */
public float valorFiscal()