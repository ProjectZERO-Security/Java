package Prueba_270917;
    import java.util.Scanner;

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 14.
 * 
 */

/**
 *
 *  PREGUNTA
 *  --------
 *  Cree un programa con un menú de selección que le permita elegir convertir una temperatura de:
 * 
 *      Grados Celsius a Farhenheit.
 *      Grados Farhenheit a Celsius.
 *      Grados Celsius a Kelvin.
 *      Grados Kelvin a Celsius.
 * 
 *  FORMULA
 *  -------
 *  Celsius a Fahrenheit: F =   (C*9/5)+32
 *  Fahrenheit a Celsius: C =   (F–32)/1.8
 *  Celsius a Kelvin        =    C+273.15
 *  Kelvin a Celsius        =    C-273.15
 *
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Creamos 3 variables de tipo double para guardar los grados ingresado por teclado.                        [OK]
 *  [02] - Creamos 1 variable de tipo byte para la opción, de los grados dentro de switch(opcion).                  [OK]
 *  [03] - Creamos 1 variable de tipo char para realizar el ciclo while de repetició o salir de la aplicación.      [OK]
 *  [04] - Realizar la formula de Grados Celsius a Fahrenheit: (C*9/5)+32.                                          [OK]
 *  [05] - Realizar la formula de Grados Fahrenheit a Celsius: (F–32)/1.8.                                          [OK]
 *  [06] - Realizar la formula de Grados Celsius a Kelvin: C+273.15.                                                [OK]
 *  [07] - Realizar la formula de Grados Kelvin a Celsius: C-273.15.                                                [OK]
 * 
 */

public class Ejercicio_14_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);       // Parametro que nos permite validar el ingreso de datos via teclado.
        
            double gradoscelsius = 0;       // Variable de tipo double llamada gradoscelsius, que guardara los datos que se ingresan via teclado.
            double gradosfarhenheit;        // Variable de tipo double llamada gradosfarhenheit, que guardara los datos que se ingresan via teclado.
            double gradoskelvin;            // Variable de tipo double llamada gradoskelvin, que guardara los datos que se ingresan via teclado.
            byte opcion;                    // Variable de tipo byte llamada opcion, que nos permitira seleccionar los grados que deseamos convertir.
            char repetirosalir;             // Variable de tipo char llamada repetirosalir, que realiza la función de repetir o salir de la aplicación.
            
            do{
                System.out.println("+-------------------------------------------+");            // Mostramos texto por consola +-------------------------------------------+
                System.out.println("| Ejercicio 14.                             |");            // Mostramos texto por consola | Ejercicio 14.                             |
                System.out.println("+-------------------------------------------+");            // Mostramos texto por consola +-------------------------------------------+
                System.out.println("|                                           |");            // Mostramos texto por consola |                                           |
                System.out.println("| Aplicación que nos permite realizar la    |");            // Mostramos texto por consola | Aplicación que nos permite realizar la    |
                System.out.println("| conversión de grados de temperatura de:   |");            // Mostramos texto por consola | conversión de grados de temperatura de:   |
                System.out.println("|                                           |");            // Mostramos texto por consola |                                           |
                System.out.println("|  [Opcion]  [Grados]                       |");            // Mostramos texto por consola |  [Opción]  [Grados]                       |
                System.out.println("|  [1]        Grados Celsius a Fahrenheit.  |");            // Mostramos texto por consola |  [1]       Grados Celsius a Fahrenheit.   |
                System.out.println("|  [2]        Grados Farhenheit a Celsius.  |");            // Mostramos texto por consola |  [2]       Grados Fahrenheit a Celsius.   |   
                System.out.println("|  [3]        Grados Celsius a Kelvin.      |");            // Mostramos texto por consola |  [3]       Grados Celsius a Kelvin.       |
                System.out.println("|  [4]        Grados Kelvin a Celsius.      |");            // Mostramos texto por consola |  [4]       Grados Kelvin a Celsius.       |
                System.out.println("|                                           |");            // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");            // Mostramos texto por consola +-------------------------------------------+
                System.out.println("\n");                                                       // Salto de Linea.
                
                System.out.println("+-------------------------------------------+");            // Mostramos texto por consola +-------------------------------------------+
                System.out.print  ("| Ingrese su Opción: ");                                    // Mostramos texto por consola | Ingrese su Opción:
                    opcion = teclado.nextByte();                                                // Variable de tipo Byte, llamada opcion que valida el ingreso de switch.
                System.out.println("+-------------------------------------------+");            // Mostramos texto por consola +-------------------------------------------+
                System.out.println("\n");                                                       // Salto de Linea.
                    
            switch(opcion){                                                                     // Condición switch con su parametro de opcion.
                case 1:                                                                         // opcion 1, en el caso de haber ingresado en el numero 1 por teclado.
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("| Opción 1: Grados Celsius a Fahrenheit.    |");        // Mostramos texto por consola | Opción 1: Grados Celsius a Fahrenheit.    |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                    System.out.print  ("| Grados Celcius: \t");                                 // Mostramos texto por consola | Grados Celcius: \t=Tabulador de 5 espacios.
                        gradoscelsius = teclado.nextDouble();                                   // Variable de tipo Double, llamada gradoscelsius, que guardara los grados Celsius ingresados por teclado.
                    System.out.print  ("| Grados Fahrenheit: \t"+(gradoscelsius * 9/5 + 32));   // Mostramos texto por consola | Grados Fahrenheit: \t=Tabulador + formula de Grados Celcius a Fahrenheit.
                    System.out.println("\n|                                           |");      // Mostramos texto por consola |                                           |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    break;                                                                      // Fin del case 1.
                case 2:                                                                         // opcion 2, en el caso de haber ingresado en el numero 2 por teclado.      
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("| Opción 1: Grados Fahrenheit a Celsius.    |");        // Mostramos texto por consola | Opción 2: Grados Fahrenheit a Celsius.    |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                    System.out.print  ("| Grados Fahrenheit: \t");                              // Mostramos texto por consola | Grados Fahrenheit: \T=Tabulador de 5 espacios.
                        gradosfarhenheit = teclado.nextDouble();                                // Variable de tipo Double, llamada gradosfarhenheit, que guardara los grados Fahrenheit ingresados por teclado.
                    System.out.print  ("| Grados Celsius: \t"+(gradosfarhenheit-32)/1.8);       // Mostramos texto por consola | Grados Celsius: \t=Tabulador + formula de Grados Fahrenheit a Celsius.
                    System.out.println("\n|                                           |");      // Mostramos texto por consola |                                           |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    break;                                                                      // Fin del case 2.
                case 3:                                                                         // opcion 3, en el caso de haber ingresado en el numero 2 por teclado.
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("| Opción 1: Grados Celsius a Kelvin.        |");        // Mostramos texto por consola | Opción 3: Grados Celsius a Kelvin.        |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                    System.out.print  ("| Grados Celsius: \t");                                 // Mostramos texto por consola | Grados Celcius: \t=Tabulación de 5 espacios.
                        gradoscelsius = teclado.nextDouble();                                   // Variable de tipo Double, llamada gradoscelsius, que guardara los grados Celsius ingresados por teclado.
                    System.out.print  ("| Grados Kelvin: \t" +(gradoscelsius+273.15));          // Mostramos texto por consola | Grados Kelvin: \t=Tabulador + formula de Grados Celsius a Kelvin.
                    System.out.println("\n|                                           |");      // Mostramos texto por consola |                                           |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    break;                                                                      // Fin del case 3.
                case 4:                                                                         // opcion 4, en el caso de haber ingresado en el numero 2 por teclado.
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("| Opción 1: Grados Kelvin a Celsius.        |");        // Mostramos texto por consola | Opción 4: Grados Kelvin a Celsius.        |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                    System.out.print  ("| Grados Kelvin: \t");                                  // Mostramos texto por consola | Grados Kelvin: \t=Tabulación de 5 espacios.
                        gradoskelvin = teclado.nextDouble();                                    // Variable de tipo Double, llamada gradoskelvin, que guardara los grados Kelvin ingresados por teclado.
                    System.out.print  ("| Grados Celsius: \t" +(gradoscelsius-273.15));         // Mostramos texto por consola | Grados Celsius: \t=Tabulador + formula de Grados Kelvin a Celsius.
                    System.out.println("\n|                                           |");      // Mostramos texto por consola |                                           |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    break;                                                                      // Fin del case 4.                               
                default:                                                                        // Parametros que los variable si se ingresa una opción invalida, Ej 1 hasta 4, se ingresa 5 es invalida.
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                    System.out.println("| Opción Incorrecta.                        |");        // Mostramos texto por consola | Opción Incorrecta.                        |
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                }
            
                    System.out.println("\n");                                                   // Salto de Linea.
                    System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+      
                    System.out.print  ("| Repetir proceso? (S=Si / N=No): " );                  // Mostramos texto por consola | Repetir proceso? (S=Si / N=No):
                        repetirosalir = teclado.next().charAt(0);                               // Variable de tipo char, llamada repetirosalir, que guardara el caracter ingresado, para repetir o salir.
                        
            }while(repetirosalir =='S' || repetirosalir == 's');                                // While que valida si deseamos repetir o salir, se debe de validar con S o s.
    }                                                                                           // Fin del public static void main.
}                                                                                               // Fin del public class.
