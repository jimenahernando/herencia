### Herencia

En este macro proyecto hay 3 implementaciones de herencia:

- **MappedSuperClass**: donde la clase padre es Producto y las clases hijas Lupulo y Cereal. Producto no tiene la anotación @Entity por lo cual no se creará una tabla en base de datos para ella. Las clases hijas lupulo y cereal se crearán y tendrán los campos que heredan de Producto
- **SingleTable**: donde la clase padre es Animales y las clases hijas Mamifero y Ave. Se creará una sola tabla animales con los campos de ambos hijos, de esta manera cuando se cree un ave los campos propios de mamifero estarán todos a null y viceversa. En la clase animales hay una anotacion (tipoAnimal) que indica que al crear un objeto desde postman de tipo ave o mamifero a que clase apuntará (osea que campos escribirá)  
- **Joined**: donde la clase padre es Instrumentos y las clases hijas Viento, Percusion y Cuerda. Al igual que la implementacion anterior, existe un campo en la anotacion de Instrumentos (tipoInstrumento) que indica cuando se crea un instrumento a que clase tiene que apuntar. Con la diferencia que Joined, crea una tabla tanto para el padre (con los campos compartidos) como para los hijos, y en cada una de los hijos una clave foranea que apunta al padre.

Incluye:
- Script de base de datos para crear las tablas
- Colección de postman para probar los servicios
- Esquemas de drawio para entender la relación entre las clases Java y las tablas creadas en base de datos

Nota: Las tablas no se autogenerar, es necesario ejecutar script.
