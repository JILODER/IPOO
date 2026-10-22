Ejercicio 11.

Se desea modelar un sistema de gestión de documentos online, similar a Google Drive. El sistema está compuesto por muchos
documentos. De momento solo maneja un solo tipo de documentos. Del sistema se conoce el dueño (una persona), el idioma y
la fecha de creación del mismo.

De cada documento se conoce el nombre, el texto, la fecha de creación, el dueño y una colección de editores (estos son
personas que pueden editar el documento). Los documentos se pueden compartir entre varios editores.
El sistema de gestión de documentos tiene la siguiente funcionalidad:

i. Cantidad de documentos -> retorna la cantidad total de documentos
ii. Cantidad de editores(Documento unDocumento) -> retorna la cantidad total de editores del documento.
iii. Cantidad total de editores - > retorna la cantidad total de editores de todos los documentos.
iv. agregarDocumento(Documento unDocumento) -> Agrega un documento a la colección de documentos.
v. agregarEditor(Documento unDocumento, Editor unEditor) -> Agrega un editor al documento.

a) Diseñe en UML una solución al enunciado, identifique las clases involucradas, atributos, responsabilidades y relaciones.
