1. Introducción.
	Al leer el enunciado del trabajo me parecía bastante claro cómo lo tenía que realizar, porque son nueve clientes de los que se intuye que son 9 hilos los que hay que crear pero al ver que sólo había 4 coches  disponibles ya me entraron las dudas, pensaba que tenía que hacer una especie de variable donde tenía los coches activos en cada momento, sumando un coche disponible cuando un cliente se bajaba y restando cuando un cliente se subía. Entonces fue cuando ví que había que hacerlo con la clase Semaphore, que no la había usado nunca pero después de buscar contenido en internet (incluido en la bibliografía) vi que era fácil ya que a esta clase se le puede pasar un numero que limita el numero de hilos que hacen uso del recurso y a partir de ahí fue saliendo poco a poco.
2. Contenido.
	Lo primero que hice fue la clase cliente que la tenía bastante clara desde el principio (menos la instancia de semaphore). Esta clase debía tener un nombre del cliente, un identificador del cliente (a lo mejor huebiese sido suficiente con el nombre del cliente), el tiempo de conducción y la instancia del semaforo.
	Esta clase debe heredar de Thread e implementar el método run. Dentro del método run lo primero que hago es adquirir un “uso” del semáforo. Después se muestra por pantalla cuando el usuario a cogido el coche junto a sus datos, incluido el tiempo por el cual coge el coche. Ahora se usa el método sleep con el parámetro del tiempo que se quiere dormir el hilo simulando el tiempo de conducción y cuando termina se muestra por pantalla que se ha terminado el uso junto con todos los datos. 
	Estas son los atributos que tiene la clase cliente:

![image](https://github.com/user-attachments/assets/3c0e0c31-b7cb-404c-ba59-f51f9fd88b71)


Su constructor:

![image](https://github.com/user-attachments/assets/5347c2e6-1d91-4b82-9690-2ef600ee8f4f)

Y la implementación del método run.

![image](https://github.com/user-attachments/assets/8523514b-36a6-44f2-8027-9fbb787170c2)

Por otra parte el método main de la clase principal consta de un array de String con los nombres de los usuarios, una variable que indica el numero de clientes simultáneos que es la que se le pasa al objeto semáforo y un bucle que va creando clientes hasta completar los nueve requeridos por el trabajo.

![image](https://github.com/user-attachments/assets/9216bfa6-ca4b-4765-b72f-2fba014b91c2)

3. Conclusión.
	Para documentar el caso de prueba voy a realizar una ejecución del programa y poner alguna captura:

![image](https://github.com/user-attachments/assets/ae1f5cb6-0c1e-4558-990a-e8346b9acb56)



