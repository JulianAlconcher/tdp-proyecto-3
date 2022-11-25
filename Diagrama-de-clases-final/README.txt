Hola Caro y Fede, algunas consideraciones:

-El Controlar Zombies lo continua llamando el run del hiloJuego, por que tenian tiempos de sleep diferentes.

-Igualmente con el check collision usamos un hilo aparte para que el chequeo de colisiones sea de forma correcta

-Por ultimo, al eliminar ciertas entidades de la clase Fila nos arrojaba una excepcion. Creemos que es por el recorrido del for-each.
El controlar zombies tambien se encarga de eliminarlos de la fila y la GUI. Lo intentamos plantear de la manera que nos indicaste pero nos tiraba esta excepcion. Preferimos dejar esa parte como antes y que el juego pueda ejecutarse de manera correcta. 

-Algunos de los integrantes les falla esporadicamente los clicks en la GUI. (Creemos que es por su version mas antigua de eclipse)
