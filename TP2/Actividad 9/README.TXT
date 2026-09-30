Ejercicio 9.
El Ministerio de Cultura desea un sistema para registrar las visitas que las personas
realizan a distintos museos del país.
Debe modelarse lo siguiente:
● Persona: representa al visitante. Contiene nombre completo, DNI, domicilio,
email y teléfono.
● Museo: contiene nombre, dirección, ciudad y un director responsable (Persona).
ObraDeArte: representa una obra exhibida en el museo. Tiene título, autor
(Persona), año de creación y tipo de obra (pintura, escultura, etc).
● Visita: representa una visita puntual que una persona realiza a un museo.
Contiene: fecha de la visita, la persona que la realizó, el museo visitado, y una
obra específica que fue la más destacada para esa persona.
a) Realice el diagrama de dichas clases en UML
b) Implemente en JAVA-Like las clases necesarias.
c) Cree objetos Visita e inicialícelos con los datos necesarios.