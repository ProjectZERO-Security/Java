package Prueba_270917;
    import java.util.Scanner;       // Importamos la clase Scanner a los diferentes parametros de ingreso de datos por teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ
 *  EXERCITE    : 01
 * 
 */

/**
 * 
 *  PREGUNTA
 *  --------
 *  Solicitar al usuario su edad por teclado. Luego, indicar a qué grupo de edad pertenece, según la siguiente
 *  clasificación:
 * 
 *  Entre 0 y 3 años        : bebé.
 *  Entre 4 y 11 años       : niño.
 *  Entre 12 y 17 años      : adolescente.
 *  Entre 18 y 39 años      : adulto joven
 *  Entre 40 y 59 años      : adulto.
 *  De 60 años hacia arriba : adulto mayor
 * 
 *  PROCEDIMIENTOS
 *  --------------
 *  [01] - Crear una variable que almacene el numero ingresado.                 [OK]
 *  [02] - Solicitar el numero para la edad.                                    [OK]
 *  [03] - Crear la opciones anidadas con if - else if - else para la edad      [OK]
 *  [04] - Mostrar la respuesta de la clasificación de edad                     [OK]
 *
 */
public class Ejercicio_01_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);                                           // Parametro para validar el ingreso de datos por teclado.
   
        int edad;                                                                           // Variable de tipo Int, para guardar el numero ingresado.
        
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("| Ejercicio 01.                                  |");       // Mostramos texto por consola | Ejercicio 01.                                  |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Solicitar al usuario su edad por teclado.      |");       // Mostramos texto por consola | Solicitar al usuario su edad por teclado.      |
            System.out.println("| Luego, a qué grupo de edad pertenece, según la |");       // Mostramos texto por consola | Luego, a qué grupo de edad pertenece, según la |
            System.out.println("| siguiente clasifiiación:                       |");       // Mostramos texto por consola | siguiente clasificación:                       |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Entre 0 y 3 años          : bebé.              |");       // Mostramos texto por consola | Entre 0 y 3 años           : bebé.             | 
            System.out.println("| Entre 4 y 11 años         : niño.              |");       // Mostramos texto por consola | Entre 4 y 11 años          : niño.             |
            System.out.println("| Entre 12 y 17 años        : adolescente.       |");       // Mostramos texto por consola | Entte 12 y 17 años         : adolescente.      |
            System.out.println("| Entre 18 y 39 años        : adulto joven.      |");       // Mostramos texto por consola | Entre 18 y 39 años         : adulto joven.     |
            System.out.println("| De 60 años hacia arriba   : adulto mayor.      |");       // Mostramos texto por consola | De 60 años hacia arriba    : adulto mayor.     |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.print  ("| Ingrese su edad, por favor: ");                           // Mostramos texto por consola | Ingrese su dad, por favor:
                edad = teclado.nextInt();                                                   // Numero ingresado se guardar en la variable de tipo int llamada edad
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            
        if(edad <=3){                                                                       // Mediante el if realizamos la comparación de edad por lo ingresado por teclado.
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Su Edad es            : " +edad                  );       // Mostramos texto por consola | Su Edad es +la variable de numero ingreso via teclado.
            System.out.println("| Su Clasificación es   : Bebé.                  |");       // Mostramos texto por consola | Su Clasificación es    : Bebé                  |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            }                                                                               // Final del ciclo else if de la edad <=3
        else if(edad <=11){                                                                 // Mediante el if realizamos la comparación de edad por lo ingresado por teclado.
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Su Edad es            : " +edad                  );       // Mostramos texto por consola | Su Edad es +la variable de numero ingreso via teclado.
            System.out.println("| Su Clasificación es   : Niño.                  |");       // Mostramos texto por consola | Su Clasificación es    : Niño.                 |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            }                                                                               // Final del ciclo else if de la edad <=11
        else if(edad <=17){                                                                 // Mediante el if realizamos la comparación de edad por lo ingresado por teclado.
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Su Edad es            : " +edad                  );       // Mostramos texto por consola | Su Edad es +la variable de numero ingreso via teclado.
            System.out.println("| Su Clasificación es   : Adolescente.           |");       // Mostramos texto por consola | Su Clasificación es    : Adolescente.          |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            }                                                                               // Final del ciclo else if de la edad <=17
            else if(edad <=39){                                                             // Mediante el if realizamos la comparación de edad por lo ingresado por teclado.
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Su Edad es            : " +edad                  );       // Mostramos texto por consola | Su Edad es +la variable de numero ingreso via teclado.
            System.out.println("| Su Clasificación es   : Adulto Joven.          |");       // Mostramos texto por consola | Su Clasificación es    : Adulto Joven.         |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            }                                                                               // Final del ciclo else if de la edad <=39
        else{                                                                               // else que nos indicar que las otras opciones no son validas para la clasificación.
            System.out.println("\n");                                                       // Salto de Linea.
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("| Su Edad es            : " +edad                  );       // Mostramos texto por consola | Su Edad es +la variable de numero ingreso via teclado.
            System.out.println("| Su Clasificación es   : Adulto Mayor.          |");       // Mostramos texto por consola | Su Clasificación es    : Adulto Mayor.         |
            System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
            System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
            }                                                                               // Final del ciclo else.                                                              
       }                                                                                    // Final del main.                             
}                                                                                           // Final de public static.
