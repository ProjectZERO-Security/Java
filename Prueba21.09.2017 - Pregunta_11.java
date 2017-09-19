package Prueba_270917;
    import java.util.Scanner;       // Importamos la clase Scanner para valida los datos via teclado.
    import java.lang.Math;          // Importamos la clase Math, para utilizar formulas matematicas complejas.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 11.
 * 
 */

/**
 * 
 *  PREGUNTA
 *  --------
 *  Dado un número de punto flotante ingresado por teclado, indique en la consola si es negativo, positivo o cero, e imprima
 *  luego el valor absoluto de dicho número.
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Importar la libreria math para utilizar la función matematica del valor absoluto.                                                        [OK]
 *  [02] - Creamos 1 variable de tipo double, llamada numero para guardar el numero ingresado via teclado.                                          [OK]
 *  [03] - Creamos 1 variable de tipo char, llamada repetirosalir la cual utilizaremos en el ciclo repetitivo whiel().                              [OK]
 *  [04] - Utilizar el ciclo if-elseif-else, dentro de la condición, dependiendo del numero ingreso (positivo, negativo o cero).                    [OK]
 *  [05] - Utiliza la formula Math.abs(numero para los numeros positivos) y Math.abs(-numero) para los numeros negativos, para el valor absoluto.   [OK]
 *  [06] - Finalizamos con la opción de realizar la repetición a la aplicación con el do{}while(repetirosalir).                                     [OK]
 * 
 */

public class Ejercicio_11_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);       // Parametro qus nos permite validar el ingreso de los datos via teclado.
        
            double numero;              // Variable de tipo double, llamada numero la cual guardara el numero ingresado por teclado.
            char repetirosalir;         // Variable de tipo char, llamada repetirosalir, la cual guardar el caracter a ingresar en while(repetirosalir)
        
            do{                                                                             // Inicio del while(repetirosalir), para el ciclo repetitivo.
                
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("| Ejercicio 11.                             |");        // Mostramos texto por consola | Ejercicio 11.                             |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("| Aplicación la cual debe de ingresar un    |");        // Mostramos texto por consola | Aplicación la cual debe de ingresar un    |
                System.out.println("| flotante, la cual debe indicar en la      |");        // Mostramos texto por consola | flotante, la cual debe indicar en la      |
                System.out.println("| consola si es negativo, positivo o cero e |");        // Mostramos texto por consola | consola si es negativo, positivo o cero e |
                System.out.println("| imprima luego el valor absoluto de dicho  |");        // Mostramos texto por consola | imprima luego el valor absoluto de dicho  |     
                System.out.println("| numero.                                   |");        // Mostramos texto por consola | numero.                                   |
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("\n");                                                   // Salto de Linea.
                
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+     
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.print  ("| Ingrese un numero: ");                                // Mostramos texto por consola | Ingrese un numero: 
                    numero = teclado.nextDouble();                                          // Variable de tipo double, llamada numero la cual guarda en numero ingresado por teclado.
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+

            if(numero<0){                                                                   // Ciclo if
                System.out.println("\n");                                                   // Salto de Linea.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("| Resultado.                                |");        // Mostramos texto por consola | Resultado.                                |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("| El Nº Ingresado es:\tNegativo.           |");         // Mostramos texto por consola | El Nº Ingresado es: \t=Tabulador de 5 espacios, Negativo.
                System.out.println("| El Nº Absoluto es :\t" +Math.abs(-numero));           // Mostramos texto por consola | El Nº Absoluto es : \t=Tabulador de 5 espacios + formula absoluta(-variablenumero)
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
            }                                                                               // Fin  del Ciclo if, de la condición numero<0. 
            
            else if(numero>0){
                System.out.println("\n");                                                   // Salto de Linea.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("| Resultado.                                |");        // Mostramos texto por consola | Resultado.                                |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("| El Nº Ingresado es:\tPositivo.           |");         // Mostramos texto por consola | El Nº Ingresado es: \t=Tabulador de 5 espacios, Positivo.
                System.out.println("| El Nº Absoluto es :\t" +Math.abs(numero));            // Mostramos texto por consola | El Nº Absoluto es : \t=Tabulador de 5 espacios + formula absoluta(variablenumero)
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
            }                                                                               // Fin  del Ciclo else if, de la condición numero>0.
            
            else{                                                                           // Inicio de else en el caso de no encontrarse la condición dentro de if y else if                                                            
                System.out.println("\n");                                                   // Salto de Linea.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("| Resultado.                                |");        // Mostramos texto por consola | Resultado.                                |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("| Numero es Cero.                           |");        // Mostramos texto por consola | Numero es Cero.                           |
                System.out.println("|                                           |");        // Mostramos texto por consola |                                           |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +-------------------------------------------+
            }                                                                               // Fin  del Ciclo else, si la condición no se encuentra dentro de if y else if.
           
                System.out.println("\n");                                                   // Salto de Linea.
                System.out.println("+-----------------------------------------+");          // Mostramos texto por consola +-------------------------------------------+
                System.out.print  ("| Repetir proceso? (S=Si / N=No): ");                   // Mostramos texto por consola | Repetir proceso? (S=Si / N=No) :
                    repetirosalir = teclado.next().charAt(0);                               // Variable de tipo char, llamada repetirosalir la cual guardara el caracter S o N.
            
            }while(repetirosalir == 'S' || repetirosalir == 's');                           // while(repetirosalir == 'S' || repetirosalir == 's'), || significa O, puede ser S en minuscula o mayuscula.
        
    }                                                                                       // Fin del public static void main.
}                                                                                           // Fin de public class.
