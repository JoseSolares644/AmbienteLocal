            /* NOMBRE: José Roberto Solares Lara.
            * CARNE: 0900-24-2718.
            * CURSO: Programación 1.
            * SECCIÓN Y AULA: "B" / CS-3.
            */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Aquí se hace el llamado de los métodos.
public class AmbienteLocal {
    public static void main(String[] args) {
    /*  "MÉTODO IF"  */ 
        //ejercicio1();
        //ejercicio2();
    /*  "MÉTODO SELECT"  */
        //ejercicio21();
        ejercicio22();
    /*  "MÉTODO WHILE"   */
        //ejercicio31();
        //ejercicio32();
    /*  "MÉTODO FOR"   */
        //ejercicio41();
        //ejercicio42();
    }

                /*  "MÉTODO IF"  */ 

// Ejercicio 1:
    /* Este método le pide al usuario un número entero y a base del 
    mismo determina si es positivo, negativo o cero.*/
    public static void ejercicio1(){
      Scanner nu = new Scanner(System.in); 
      System.out.println("Ingresa un número: ");
     int numeroEn = nu.nextInt();
    //En esta parte se hacen las validaciones del número ingresado por el usuario.
      if (numeroEn > 0) {
            System.out.println("Número Positivo!");
       } else if (numeroEn < 0) {
            System.out.println("Número Negativo!");
        } else {
            System.out.println("El Número Es Cero!");
        }
    }

// Ejercico 2:
    /* Este método le pide al usuario que ingrese un año y determina 
    si es bisiesto o no. */
    public static void ejercicio2(){
        Scanner añ = new Scanner(System.in);
        System.out.println("Ingresa el año: ");
        int año = añ.nextInt();
    //En esta parte se hacen las validaciones del año ingresado por el usuario.
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
            System.out.println("Es un año bisiestro!");
        } else {
            System.out.println("No es un año bisiestro!");
        }
    }

            /*  "MÉTODO SELECT"   */

// Ejercicio 1:
    /* Este método le pide al usuario ingresar un número del 1 al 7 y 
    determina el día; ejemplo: 1 = Lunes o 7 = Domingo */
    public static void ejercicio21(){
        Scanner di = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 - 7: ");
        int dia = di.nextInt();
    // Aquí el programa valida y elige que imprimir según el número ingresado.
        switch(dia){
            case 1:
                System.out.println("Lunes!");
            break;
            case 2:
                System.out.println("Martes!");
            break;
            case 3:
                System.out.println("Miercoles!");
            break;
            case 4:
                System.out.println("Jueves!");
            break;
            case 5:
                System.out.println("Viernes!");
            break;
            case 6:
                System.out.println("Sábado!");
            break;
            case 7:
                System.out.println("Domingo!");
            break;
            default:
                System.out.println("Opción incorrecta, ingresa un rango de 1 a 7.");
            break;
        }
    }

// Ejercicio 2:
    /* Este método presenta un menú en el que el usuario elige la acción 
    que quiere que el programa haga. */
    public static void ejercicio22(){
        Scanner me = new Scanner(System.in);
    // Aquí se imprime el menú.
        System.out.println("*********M E N Ú********");
        System.out.println("1.-Imprimir Mensaje De Bienvenida.");
        System.out.println("2.- Imprimir Fecha Actual.");
        System.out.println("3.- Salir. ");
        System.out.println("Ingresa el número de la opción: ");
        int menu = me.nextInt();
    // Aquí el programa valida y elige que imprimir según el número ingresado.
        switch(menu){
            case 1:
                System.out.println("Bienvenid@ Al Curso De Programación!");
            break;
            case 2:
    // En esta parte se ejecuta e imprime la fecha actual.
                String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.println("La fecha actual es: " + fechaActual);
            break;
            case 3:
                System.out.println("Saliste Del Menú :(");
            break;
            default: 
                System.out.println("Opción inválida, ingresa un número de 1 a 3.");
            break;
        }
    }

            /*  "MÉTODO WHILE"   */

// Ejercicio 1:
    /* Este método le pide al usuario ingresar un número y repetir la acción 
    hasta que el usuario ingrese un número negativo, como respuesta del número 
    negativo se detiene la suma y se imprime la suma total de los números ingresados 
    con anterioridad.*/
    public static void ejercicio31(){
        Scanner su = new Scanner(System.in);
        int suma = 0;
        int no;

        System.out.println("*******INSTRUCCIÓN*******");
        System.out.println("# Ingresa un número mayor a 0.");
        System.out.println("# Ingresa un número menor a 0 para terminar y sumar.");
// Validación con el ciclo WHILE siendo verdadero.
        while(true){
            System.out.println("Ingresa un número: ");
            no = su.nextInt();
// Validación del número negativo y suma total.
            if (no < 0){
                break;
            }
            suma = suma + no;
        }

        System.out.println("La suma total es: " + suma);
    }

// Ejercicio 2:
    /* Este método es exactamente igual al anterior, solo que, en lugar de 
    contar los números, cuenta la cantidad de veces que el usuario repite 
    el enunciado. */
    public static void ejercicio32(){
        Scanner co = new Scanner(System.in);
        int conteo = 0;
        int respuesta;
    
        System.out.println("*******INSTRUCCIÓN*******");
        System.out.println("# Ingresa 1 para continuar.");
        System.out.println("# Ingresa 0 para terminar y contar las repeticiones.");
// Validación con el ciclo WHILE siendo verdadero y contestando "si" a la repetición del enunciado.
        while(true){
            System.out.println("Que Tengas Un Excelente Día!");
            System.out.println("Desea repetir el anunciado? (Si = 1 / No = 0) : ");
            respuesta = co.nextInt();
// Validación de la respuesta "No" y el número de veces que se repitió el enunciado por el usuario.
            if (respuesta == 0){
                break;
            }
            conteo = conteo + respuesta;
        }

        System.out.println("El mensaje se repitió {" + conteo + "} veces.");
    }

            /*  "MÉTODO FOR"   */

// Ejercicio 1:
    /* Este método imprime los número enteros naturales del 1 al 10, solo si,
    el usuario lo desea. */
    public static void ejercicio41(){
        Scanner na = new Scanner(System.in);
        System.out.println("Contar Números Naturales Del 1 - 10 (Si = 1 / No = 0): ");
        int numeroNa = na.nextInt();
        int i;
// Valida si la respuesta es "Si", entonces lanza los números del 1 al 10, de 
//lo contrario muestra un mensaje.
        if (numeroNa == 1){
            for (i = 1; i < 11; i++){
                System.out.println("No. " + i);
            }
        } else {
            System.out.println("Omitiste El Conteo :(");
        }
    }
// Ejercicio 2:
    /* Este método le pide al usuario ingresar un número y en base a ese número, 
    hace una suma de sus 5 números anteriores incluyendolo.  */
    public static void ejercicio42(){
        Scanner cal = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int calNum = cal.nextInt();
        int suma2 = 0;
// En está parte el -4 indica la cantidad de digitos que se quieren tomar en cuenta, sin contar el espacio del número ingresado.
        for (int i = calNum - 4; i <= calNum; i++){
            suma2 = suma2 + i;
        }

        System.out.println("La suma de los primeros números del {" + calNum + "} es: " + suma2);
    }
}
