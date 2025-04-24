# Tarea Sesión 2 - Tipos de datos e instrucciones condicionales y ciclicas

##### Nombre Del Proyecto
AmienteLocal


##### Autor
José Roberto Solares Lara.

##### Descripción

Este proyecto contiene ocho ejercicios en total, entre los cuales se puede encontrar: 

- Dos ejercicios sobre el condicional if, else if y else.
- Dos ejercicios sobre el switch select.
- Dos ejercicios sobre el bucle de repetición while.
- Dos ejercicios sobre el bucle con el contador for.

Todos estos ejercicios realizados en lenguaje java, utilizando el IDE visual studio code.

##### Requisitos Para Abrir El Archivo .java
Para el buen funcionamiento del proyecto se necesita:

- Descargado lo que es el IDE visual studio code, versión más reciente.
- Kit o pack de java, el cual se encuentra en la parte de extención del IDE de visual studio code. (Se encuentra por lo general como primera opción, impartido  por microsoft)
- Contar con el JDK versión 17 como mínimo (Tengo la versión 21).

##### Etructura Del Proyecto
- El proyecto está dividido en métodos de manera ordenada, el main se encuentra en la parte inicial del código como preferencia personal y para evitar confuciones.
- En cada uno de los métodos hay un comentario para una mayor explicación sobre lo que hace cada uno.
- También hay comentario en cada parte inteiror de los métodos para saber que es lo que hace en específico esa parte de código.

##### Observaciones
En algunas líneas de código como estas:

- Scanner nu = new Scanner(System.in); 
- Scanner añ = new Scanner(System.in);
- Scanner di = new Scanner(System.in);

En los objetos específicos (nu, añ, di) se encuentra una línea de forma de onda de color amarilla en la parte de abajo de la misma, lo que significa que no se le ha dado cierre al final del método [nu.close(), añ.close(), di.()] esto debido a que no me dejaba correr todos los ejercicios de manera continua.

##### Recomendaciones
- Comentar todos los ejercicios, menos el que se dará "Run", ya que se ahorra tiempo y se evitan confuciones.
- Al comentar los ejercicios también es porque en la parte donde están los switch no hay un bucle, lo que hace que nos dirijamos a la parte del "Run" para cada prueba que se desea y sería molesto llenar los anteriores métodos.
- Ejemplo [

    public static void main(String[] args) {
    /*  "MÉTODO IF"  */ 
        ejercicio1(); 
        //ejercicio2();
    /*  "MÉTODO SELECT"  */
        //ejercicio21();
        //ejercicio22();
    /*  "MÉTODO WHILE"   */
        //ejercicio31();
        //ejercicio32();
    /*  "MÉTODO FOR"   */
        //ejercicio41();
        //ejercicio42();
    }
]
Como se puede ver, se ha comentado todos los métodos y se ha dejado el método llamado "ejercicio1();" esto para poder correr solo ese método.
