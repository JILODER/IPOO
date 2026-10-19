Ejercicio 8.
Especificar e implementar las clases Persona, Empleado, Administrativo y
Técnico. Los datos relevantes de una persona son: nombre, DNI, dirección, año de
nacimiento y sexo. Un empleado es una persona que desempeña una función en alguna
empresa y recibe un salario por ello.

Un técnico es un empleado que posee un título y trabaja por contrato. Es decir, cobra
siempre el mismo monto que establece el contrato (su salario se especifica en el contrato
y no cambia).
Los empleados administrativos reciben su salario de acuerdo a la categoría (valores
numéricos 1, 2, 3 y 4) y antigüedad que posean (en años) dividida 4.

salario = (basico * categoría) + ( (básico * antigüedad) / 4 )

La clase Empresa tiene una variable de instancia llamada empleados que es una
colección que contiene todos los empleados de la empresa.
Implementar el método montoTotal en la clase Empresa, que retorna el monto total que
la empresa debe pagar, en concepto de sueldos, a sus empleados.
