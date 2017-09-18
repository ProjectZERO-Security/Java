package Prueba_270917;
    import java.util.Scanner;

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 16.
 *  
 */

/**
 *
 *  PREGUNTA
 *  --------
 *  Escriba un programa que reciba dos números de punto flotante por teclado, más un 
 *  carácter (que puede ser +, -, * o /) y que, según el carácter, realice la operación indicada con 
 *  ambos números y muestre el resultado por consola
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear dos variables de tipo Double, para guardar los dos numeros ingresados por teclado.     [OK]
 *  [02] - Crear una varibla de tipo String para guardar el signo ingresado por teclado.                [OK]
 *  [03] - Condición if-else if para realizar el ciclo de la condición del signo (+, -, *, /).          [OK]
 *  [04] - do{}while para consultar si desea repetir la aplicación o salir.                             [OK]
 * 
 */

public class Ejercicio_16_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);       // Parametro que nos permite validar e ingresar datos via teclado.
    
            double numero1;     // Variable de tipo flotante que nos permitira guardar el primer numero ingresado por teclado.
            double numero2;     // Variable de tipo flotante que nos permitira guardar el segundo numero ingresado por teclado.
            String signo;       // Variable de tipo String para guardar el signo ingresado por teclado.
            byte opcion=1;      // Variable de tipo byte llamada opcion que nos permitira indicar si deseamos repetir o salir de la apicación.
            
            do{
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Ejercicio 16.                             |");        // Mostramos texto por consola | Ejercicio 16.                              |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                            |
                System.out.println("| Escriba un programa que reciba dos número |");        // Mostramos texto por consola | Escriba un programa que reciba dos números |
                System.out.println("| de punto flotante por teclado, màs un     |");        // Mostramos texto por consola | de punto flotante por teclado, más un      |
                System.out.println("| carácter ( + , -, * o /) y que según el   |");        // Mostramos texto por consola | carácter (+, -, *, o /) y que según el     |
                System.out.println("| caracter, realice la operación indicada   |");        // Mostramos texto por consola | caracter, realice la operación indicada    |
                System.out.println("| con ambos números y muestre el resultado  |");        // Mostramos texto por consola | con ambos números y muestre el resultado   |
                System.out.println("| por consola.                              |");        // Mostramos texto por consola | por consola.                               |
                System.out.println("|                                           |");        // Mostramos texto por consola |                                            |
                System.out.println("+-------------------------------------------+");        // Mottramos texto por consola +--------------------------------------------+
                System.out.println("\n");                                                   // Salto de Linea.
               
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Ingresar los siguientes datos:            |");        // Mostramos texto por consola | Ingresar los siguientes datos:             |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("|                                           |");        // Mostramos texto por consola |                                            |
                System.out.print  ("| Ingrese Nº1 : \t");                                   // Mostramos texto por consola | Ingrese Nº1 : \t=Tabulador de 5 espacios.
                    numero1 = teclado.nextDouble();                                            // Variable de tipo int llamada numero1 para guardar el primer numero ingresado por teclado.
                System.out.print  ("| Ingrese Nº2 : \t");                                   // Mostramos texto por consola | Ingresa Nº2 : \t=Tabulador de 5 espacios.
                    numero2 = teclado.nextDouble();                                            // Variable de tipo int llamada numero2 para guardar el segundo numero ingresado por teclado. 
                System.out.print  ("| Ingrese un signo: \t");                               // Mostramos texto por consola | Ingrese un signo: \t=Tabulador de 5 espacios.
                    signo = teclado.next();                                                 // Variable de tipo String para guardar el signo ingresado por teclado.
                System.out.println("|                                           |");        // Mostramos texto por consola |                                            |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("\n");                                                   // Salto de Linea.
            
            if(signo.equals("+")== true){                                                   // Condición if, que nos realiza la comparación del signo suma, con el parametro equals y true, Ej +==+ = verdadero                             
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Suma.                                     |");        // Mostramos texto por consola | Suma.                                      |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Nº 1: \t" +numero1);                                  // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Nº 2: \t" +numero2);                                  // Mostramos texto por consola | Nº 2: \t=Tabulador de 5 espacios +variable numero2, donde se guarda el segundo numero ingresado.
                System.out.println("| Suma: \t"+(numero1+numero2));                         // Mostramos texto por consola | Suma: \t=Tabulador de 5 espacios +(numero1+numeo2), la cual reaiza la suma de las 2 variables.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
            }                                                                               // Fin de la condición if del signo (+)
            
            else if(signo.equals("-") == true){                                             // Condición else if, que nos realiza la comparación del signo resta, con el parametro equals y true, Ej -==- = verdadero               
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Resta.                                    |");        // Mostramos texto por consola | Resta.                                     |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Nº 1: \t" +numero1);                                  // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Nº 2: \t" +numero2);                                  // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Resta: \t"+(numero1-numero2));                        // Mostramos texto por consola | Suma: \t=Tabulador de 5 espacios +(numero1-numeo2), la cual reaiza la resta de las 2 variables.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
            }                                                                               // Fin de la condición if del signo (-)
            
            else if(signo.equals("*") == true){                                             // Condición if, que nos realiza la comparación del signo multiplicación, con el parametro equals y true, Ej *==* = verdadero
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Multiplicación.                           |");        // Mostramos texto por consola | Multiplicación.                            |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Nº 1: \t\t" +numero1);                                // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Nº 2: \t\t" +numero2);                                // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Multiplicación: \t"+(numero1*numero2));               // Mostramos texto por consola | Suma: \t=Tabulador de 5 espacios +(numero1*numeo2), la cual reaiza la multiplicación de las 2 variables.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
            }                                                                               // Fin de la condición if del signo (*)
            
            else if(signo.equals("/") == true){                                             // Condición if, que nos realiza la comparación del división, con el parametro equals y true, Ej /==/ = verdadero
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| División.                                 |");        // Mostramos texto por consola | División.                                  |
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| Nº 1: \t" +numero1);                                  // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.println("| Nº 2: \t" +numero2);                                  // Mostramos texto por consola | Nº 1: \t=Tabulador de 5 espacios +variable numero1, donde se guarda el primer numero ingresado.
                System.out.printf ("| División: \t%.2f\n",(numero1/numero2));               // Mostramos texto por consola | Suma: \t=Tabulador de 5 espacios +(numero1/numeo2), la cual reaiza la división de las 2 variables.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
            }                                                                               // Fin de la condición if del signo (/).
                
                System.out.println("\n");
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
                System.out.println("| ¿Que Desea Hacer? 0=Salir o 1=Repetir     |");        // Mostramos texto por consola | ¿Que Desea Hacer? 0=Salir o 1=Repetir      |
                System.out.printf ("| Ingrese su Opción: ");                                // Mostramos texto por consola | Ingrese su Opción: 
                    opcion = teclado.nextByte();                                            // Variable de tipo byte llamada opcion que nos guardara el numero ingresado via teclado 0=Salir o 1=Repetir.
                System.out.println("+-------------------------------------------+");        // Mostramos texto por consola +--------------------------------------------+
     
            }while(opcion==1);                                                              // while(),mientras la condición sea verdadera generara una repetición. 
    }
}
