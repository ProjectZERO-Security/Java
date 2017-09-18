package Prueba_270917;
    import java.util.Scanner;       // Importamos la clase Scanner para validar los datos via teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 10
 * 
 */

/**
 * 
 *  PREGUNTA
 *  --------
 *  Sabiendo que un dólar equivale a 494,5 pesos chilenos, un peso mexicano equivale a 38,4 pesos chileno, un euro equivale a 636,6 pesos chilenos, 
 *  un yen equivole a 5,9 pesos chilenos y una libra esterlina equivale a 759,13 pesos chilenos, cree una aplicación para convertir la cantidad 
 *  ingresada por el usuario de cada una de esas monedas a moneda nacional.
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear 5 variable de tipo float para guardar los valores ingresados.      [OK]
 *  [02] - Solicitar en 5 preguntas las cantidad de las monedas extranjeras.        [OK]
 *  [03] - Mostrar la converción de moneda extranjera a moneda nacional.            [OK] 
 * 
 */

public class Ejercicio_10_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);                                       // Permite validar los datos ingresados por teclado.
         
            float dolar;            // Variable de tipo float llamada dolar que nos permitira guardar la cantidad a convertir (Ej US$10, US$20).
            float pesomexicano;     // Variable de tipo float llamada dolar que nos permitira guardar la cantidad a convertir (Ej MX$4, MX$15).
            float euro;             // Variable de tipo float llamada dolar que nos permitira guardar la cantidad a convertir (Ej €100, €500).
            float yen;              // Variable de tipo float llamada dolar que nos permitira guardar la cantidad a convertir (Ej ¥100000, ¥45000000).
            float libraesterlina;   // Variable de tipo float llamada dolar que nos permitira guardar la cantidad a convertir (Ej £1500, £6000).
            byte opcion=1;
        
            do{                     // Inicio de un ciclo de repetición.
                
                System.out.println("+------------------------------------------------------------+");   // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("| Ejercicio 10.                                              |");   // Mostramos texto por consola | Ejercicio 10.                                              |
                System.out.println("+------------------------------------------------------------+");   // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("\n");                                                               // Salto de Linea.
                
                
                System.out.println("+---------------------------+--------------------------------+");   // Mostramos texto por consola +------------------------+-----------------------------------+
                System.out.println("|           MONEDAS         |           CANTIDAD             |");   // Mostramos texto por consola |        MONEDAS         |           CANTIDAD                |
                System.out.println("+---------------------------+--------------------------------+");   // Mostramos texto por consola +------------------------+-----------------------------------+
                System.out.print  ("|         (Dolar US$)       | \t\t");                               // Mostramos texto por consola |       (Dolar US$)      | \t=Tabulación de 5 espacios.
                    dolar = teclado.nextFloat();                                                        // Variable de tipo float llamada dolar, que nos guardara la cantidad ingresada via teclado.
                System.out.print  ("|         (Peso MX$ )       | \t\t");                               // Mostramos texto por consola |       (Peso MX$ )      | \t=Tabulación de 5 espacios.
                    pesomexicano = teclado.nextFloat();                                                 // Variable de tipo float llamada pesomexicano, que nos guardara la cantidad ingresada via teclado.
                System.out.print  ("|         ( Euro €  )       | \t\t");                               // Mostramos texto por consola |       ( Euro €  )      | \t=Tabulación de 5 espacios.                        
                    euro = teclado.nextFloat();                                                         // Variable de tipo float llamada euro, que nos guardara la cantidad ingresada via teclado.
                System.out.print  ("|         (  Yen ¥  )       | \t\t");                               // Mostramos texto por consola |       (  Yen ¥  )      | \t=Tabulación de 5 espacios.
                    yen = teclado.nextFloat();                                                          // Variable de tipo float llamada yen, que nos guardara la cantidad ingresada via teclado. 
                System.out.print  ("|         ( Libra £ )       | \t\t");                               // Mostramos texto por consola |       ( Libra £ )      | \t=Tabulación de 5 espacios.
                    libraesterlina = teclado.nextFloat();                                               // Variable de tipo float llamada libraesterlina, que nos guardara la cantidad ingresada via teclado.
                System.out.println("+---------------------------+--------------------------------+");   // Mostramos texto por consola +------------------------+-----------------------------------+
                System.out.println("\n");                                                               // Salto de Linea.
                
                
                System.out.println("+------------------------------------------------------------+");                           // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("|   Convertidor de Moneda Internacional a Moneda Nacional    |");                           // Mostramos texto por consola |   Convertidor de Moneda Internacional a Moneda Nacional    |
                System.out.println("+------------------------------------------------------------+");                           // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("|    MONEDA EXTRANJERA    |    MONTO    |    PESOS CHILENO   |");                           // Mostramos texto por consola |     MONEDA EXTRANJERA    |   MONTO   |    PESO CHILENO     |
                System.out.println("+-------------------------+-------------+--------------------+");                           // Mostramos texto por consola +--------------------------+-----------+---------------------+
                System.out.printf ("|      (Dolar US$)        |%10.2f   |%12.2f\n", dolar, 494.5*dolar);                        // Mostramos texto por consola |        (Dolar US$)       | +variable dolar + 494.5*variabledolar
                System.out.printf ("|      (Peso MX$ )        |%10.2f   |%12.2f\n", pesomexicano, 38.4*pesomexicano);           // Mostramos texto por consola |        (Peso MX$ )       | +variable dolar + 38.4*variablepesomexicano
                System.out.printf ("|      (  Euro € )        |%10.2f   |%12.2f\n", euro, 636.3*euro);                          // Mostramos texto por consola |        (  Euro € )       | +variable dolar + 636.3*variableeuro
                System.out.printf ("|      (  Yen ¥  )        |%10.2f   |%12.2f\n", yen, 5.9*yen);                              // Mostramos texto por consola |        (  Yen ¥  )       | +variable dolar + 5.9*variableyen
                System.out.printf ("|      ( Libra £ )        |%10.2f   |%12.2f\n", libraesterlina, 759.13*libraesterlina);     // Mostramos texto por consola |        ( Libra £ )       | +variable dolar + 759.13*variablelibraesterlina
                System.out.println("+-------------------------+-------------+--------------------+");                           // Mostramos texto por consola +--------------------------+-----------+---------------------+
                System.out.println("\n");                                                                                       // Salto de Linea.

                System.out.println("+------------------------------------------------------------+");                           // Mostramos texto por consola +------------------------------------------------------------+
                System.out.print  ("| ¿Que Desea Hacer? - 0=Salir o 1=Repetir: ");                                              // Mostramos texto por consola | ¿Que Desea Hacer? - 0=Salir o 1=Repetir:
                    opcion = teclado.nextByte();                                                                                // Variable de tipo Byte que guardara la opcion de Salir o Repetir la aplicación.
                
            }while(opcion==1);                                                                                                  // Función while para repetir el ciclo, debe de cumplir con la condición para su repetición == 1
    }                                                                                                   // Fin del public static void main.
}                                                                                                       // Fin del public class.
