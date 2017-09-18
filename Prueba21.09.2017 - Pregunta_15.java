package Prueba_270917;
    import java.util.Scanner;

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 15.
 * 
 */

/**
 *
 *  PREGUNTA
 *  --------
 *  Cree un programa que calcule la suma de los N prmeros enteros, donde el número N es ingresado 
 *  por el usuario a través del teclado.
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear 2 variables de tipo int, para numero y suma.                                                                       [OK]
 *  [02] - Crear 1 variable de tipo char, para while si deseamos repetir o salir de la aplicación.                                  [OK]
 *  [03] - Ciclo for que nos permitira realizar el proceso aumento de la suma de los numero de 1 al numero ingreso por teclado.     [OK]
 *  [04] - Ciclo do{}while (repetirosalir), quien permitira dar la repetición o salir de la aplicación si se cumple la condición.   [OK]
 * 
 */

public class Ejercicio_15_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);       // Parametro que nos permite validar el ingreso de datos por teclado.
            
            int numero;             // Variable de tipo int, llamada numeros que nos guardara el numero ingresado por teclado.
            int suma=0;             // variable de tipo int, llamada suma que realizara la acumulación y suma, del numero ingresado por teclado.
            char repetirosalir;     // Variable de tipo char, llamada repetirosalir, que realizara la función de repetir o salir de la aplicación dentro de while.

            do{                                                                         // Inicio del ciclo repetitivo while, de while(repetirosalir).
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.println("| Ejercicio 15.                           |");      // Mostramos texto por consola | Ejercicio 15.                           |
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.println("|                                         |");      // Mostramos texto por consola |                                         |
                System.out.println("| Aplicación que permite calcular la suma |");      // Mostramos texto por consola | Aplicación que permite calcular la suma |
                System.out.println("| de los N primeros enteros, donde el     |");      // Mostramos texto por consola | de los N primeros enteros, donde el     |
                System.out.println("| número N es ingresado por el usuario a  |");      // Mostramos texto por consola | número N es ingresado por el usuario a  |
                System.out.println("| trarvés del teclado.                     |");     // Mostramos texto por consola | través del teclado.                    |
                System.out.println("|                                         |");      // Mostramos texto por consola |                                         |
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.println("\n");                                               // Salto de Linea.
            
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.print  ("| Ingrese su numero: ");                            // Mostramos texto por consola | Ingrese su numero:
                    numero = teclado.nextInt();                                         // Variable de tipo Int, llamada numeros, que almacenara el numero ingresado por teclado.
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                    
            for(int i = 1; i <= numero; i++){                                           // Ciclo for que realiza el proceso de suma de 1 al numero ingresado por teclado.
                suma += i;                                                              // Variable nos permite ir acumulando la suma en la variable llamada suma.
            }                                                                           // Fin del ciclo for de la suma de los enteros.
            
                System.out.println("\n");                                               // Salto de Linea.
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.println("|                                         |");      // Mostramos texto por consola |                                         |
                System.out.println("| Nº Ingresado: \t\t" +numero);                     // Mostramos texto por consola | Nº Ingresado: \t=Tabulador de 5 espacios +variable numeros.    
                System.out.println("| Suma de Entero de 1 a " +numero+ ": \t" +suma);   // Mostramos texto por consola | Suma de Entero de 1 a +la variable numero+ y +lavariable suma+
                System.out.println("|                                         |");      // Mostramos texto por consola |                                         |
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                
                System.out.println("\n");                                               // Salto de Linea.
                System.out.println("+-----------------------------------------+");      // Mostramos texto por consola +-----------------------------------------+
                System.out.println("| Repetir proceso? (S=Si / N=No) ");                // Mostramos texto por consola | Repetir proceso? (Si=Si / N=No)
                    repetirosalir = teclado.next().charAt(0);                           // Variable de tipo Char, llamada repetirosalir que guarda el caracter ingresado por teclado S=Si o N=No.
            
            }while(repetirosalir == 'S' || repetirosalir == 's');                       // Ciclo repetitivo, se debe de cumplir la condición para realizar la repetición.
    
    }                                                                                   // Fin del public static void main.
}                                                                                       // Fin del public class.
