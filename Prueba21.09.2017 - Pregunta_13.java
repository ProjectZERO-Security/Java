package Prueba_270917;
    import java.util.Scanner;

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 13
 * 
 */

/**
 *
 *  PREGUNTA
 *  --------
 *  Cree una aplicación que tome un número entero y muestre por consola el conjunto de todos sus
 *  divisores entre 1 y el número (pista: un número es divisible por otro si el resto de la división
 *  entero es cero).
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Creamos 2 variables, 1 variable para guardar el numero ingresado por teclado y la segunda variable para la divisor.          [OK]
 *  [02] - Ciclo for para realizar el recorrido del numero ingresado por pantalla, respecto al divisor.                                 [OK]
 *  [03] - Dentro del ciclo for, se utilizara un ciclo if para realizar la división si el resto de la división es == 0.                 [OK]
 *          
 */

public class Ejercicio_13_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);   // Parametro que validar los datos via teclado.
        
            int numero;             // Variable de tipo int, llamada numero la cual guardara el numero ingresado por teclado.
            int div;                // Variable de tipo int, llamada div la cual genera la división dentro del ciclo if.
            char repetirosalir;     // Variable de tipo char, llamada repetirosalir la cual guardara el caracter para repetir o salir de la aplicación dentro de while(repetirosalir).
        
        do{                                                                         // Inicio del ciclo repetitivo do()while(repetirosalir).
            
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.println("| Ejercicio 13.                         |");    // Mostramos texto por consola | Ejercicio 13.                         |
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.println("|                                       |");    // Mostramos texto por consola |                                       |
                System.out.println("| Aplicación que toma un número entero  |");    // Mostramos texto por consola | Aplicación que toma un número entero  |
                System.out.println("| y muestra por consola el conjunto de  |");    // Mostramos texto por consola | y muestra por consola el conjunto de  |
                System.out.println("| de todos sus divisores entre 1 y el   |");    // Mostramos texto por consola | de todos sus divisores entre 1 y el   |
                System.out.println("| número.                               |");    // Mostramos texto por consola | número.                               |
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.println("\n");                                           // Salto de Linea.
                
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.print  ("| Ingrese un numero: ");                        // Mostramos texto por consola | Ingrese un numero:
                    numero = teclado.nextInt();                                     // Variable de tipo Int, llamada numero para guardar el numero ingresado por teclado.
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+    
                System.out.println("\n");                                           // Salto de Linea.
                
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.println("| Los Números Divisores de: ["+numero+"]");     // Mostramos texto por consola | los Números Divisores de: +variable numero del numero ingresado por teclado.
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                
        for(div= 1; div< numero; div++){                                            // ciclo for, div=1    
            if(numero % div == 0)                                                   // if (+variable numero, luego el % resto de la divición, si es == 0, lo muestra en pantalla, si es 1 no lo muestra.
                System.out.print("["+div+"]");                                      // Mostramos texto por consola, el valor dentro de la variable div.
        }                                                                           // Fin del cilclo for.
        
                System.out.println("\n");                                           // Salto de Linea.
                System.out.println("+---------------------------------------+");    // Mostramos texto por consola +---------------------------------------+
                System.out.print  ("| Repetir proceso? (S=Si / N=No): ");           // Mostramos texto por consola | Repetir proceso? (S=Si / N=No):
                    repetirosalir = teclado.next().charAt(0);                       // Variable de tipo char, llamada repetirosalir, para validar dentro del ciclo while para repetir o salir de la aplicación.
                  
        }while(repetirosalir == 'S' || repetirosalir == 's');                       // Ciclo repetitivo while, debe de cumplirse la condición de su parametr repetirosalir == 'S' || repetirosalir == 's'.
    }                                                                               // Fin del public static void main.
}                                                                                   // Fin del public class.
