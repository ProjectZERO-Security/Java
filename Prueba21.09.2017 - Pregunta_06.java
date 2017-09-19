package Prueba_270917;
    import java.util.Scanner;           // Importamos la clase Scanner para validar los datos via teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 06.
 * 
 */

/**
 *
 *  PREGUNTA
 *  --------
 *  Solicitar al usuario un número flotante cualaquiera. Luego, genere la secuencia de números de punto flotante siguiente (que comienza con dos
 *  valores 2.0 y que genera un nuevo valor sumando los dos últimos) mientras que la suma sea menor que el número ingresado. Por ejemplo, la secuencia
 *  hasta 20.0 está representada por la secuencia: 2.0 2.0 4.0 6.0 10.0 16.0.
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Creamos 3 variables, una de ellas sin valor y dos de ellas con un valor inicial, numero2=2.0f y numero3=2.0f.                [OK]
 *  [02] - Ciclo while, para repetir el ciclo mientras la condición sea verdadera, el numero2 sea mayor que numero se sale del ciclo.   [OK]
 * 
 */

public class Ejercicio_06_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        
            double numero;           // Variable de tipo float, llamada numero la cual guardara el numero ingresado por teclado.
            double numero2=2.0f;     // Variable de tipo float, llamada numero2 que se inicia en 2.0f para iniciar la cuenta.
            double numero3=2.0f;     // Variable de tipo float. llamada numero3 que generara la suma entre numero2+numero3.
            
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+
                System.out.println("| Ejercicio 06.                             |");    // Mostramos texto por pantalla | Ejercicio 06.                             |
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+
                System.out.println("|                                           |");    // Mostramos texto por pantalla |                                           |
                System.out.println("| Aplicación que solicita al usuario un     |");    // Mostramos texto por pantalla | Aplicación que solicita al usuario un     |
                System.out.println("| número flotante cualquiera. Luego, genera |");    // Mostramos texto por pantalla | número flotante cualquiera. Luego, genera |
                System.out.println("| la secuencia de números de punto flotante |");    // Mostramos texto por pantalla | la secuencia de números de punto flotante |
                System.out.println("| siguiente (que comienza con dos valores   |");    // Mostramos texto por pantalla | siguiente (que comienza con dos valores   |
                System.out.println("| 2.0 y que genera un nuevo valor sumando   |");    // Mostramos texto por pantalla | 2.0 y que genera un nuevo valor sumando   |
                System.out.println("| los dos últimos) mientras que la suma sea |");    // Mostramos texto por pantalla | los dos últimos) mientras que la suma sea |
                System.out.println("| menor que el número ingresado.            |");    // Mostramos texto por pantalla | menor que el número ingresado.            |
                System.out.println("|                                           |");    // Mostramos texto por pantalla |                                           |
                System.out.println("| Por ejemplo, la secuencia hasta 20.0 está |");    // Mostramos texto por pantalla | Por ejemplo, la secuencia hasta 20.0 está |
                System.out.println("| representada por la secuencia:            |");    // Mostramos texto por pantalla | representada por la secuencia:            |
                System.out.println("| 2.0 2.0 4.0 6.0 10.0 16.0.                |");    // Mostramos texto por pantalla | 2.0 2.0 4.0 6.0 10.0 16.0.                |
                System.out.println("|                                           |");    // Mostramos texto por pantalla |                                           |
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+
                System.out.println("\n");                                               // Salto de Linea.
                
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+
                System.out.println("|                                           |");    // Mostramos texto por pantalla |                                           |
                System.out.print  ("| Ingrese un numero: ");                            // Mostramos texto por pantalla | Ingrese un numero:
                    numero = teclado.nextFloat();                                       // Variable de tipo float, llamada numero el cual guarda en numero ingresado por teclado.
                System.out.println("|                                           |");    // Mostramos texto por pantalla |                                           |
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+  
                
                System.out.println("\n");                                               // Salto de Linea.
                System.out.println("+-------------------------------------------+");    // Mostramos texto por pantalla +-------------------------------------------+
                System.out.print("| " +numero3);                                        // Mostramos el primer numero por pantalla (2.0f) ya que se encuentra con una variable con un valor de inicio.
                        
            while(numero2 <= numero){                                                   // Mientras el numero2 que es 2.0 sea menor que el numero ingresado por teclado se valida
                
                System.out.print(" " +numero2);                                         // Mostramos texto por consola " " + el valor de la variable2
                
            double aux = numero2;                                                       // El valor de la variable numero2, se asigna a la variable float aux  
            numero2 = numero3 + numero2;                                                // La suma entre la variable numer3+numero2, la suma se asigna a la variable numero2.
            numero3 = aux;                                                              // el valor de la variable aux, se le asigna a la variable numero3.
            }                                                                           // Fin del ciclo while.
    }                                                                                   // Fin del public static void main.
}                                                                                       // Fin del public class.