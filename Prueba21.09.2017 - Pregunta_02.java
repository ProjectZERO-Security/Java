package Prueba_270917;
    import java.util.Scanner;       // Importamos la clase Scanner a los diferentes parametros de ingreso de datos por teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ
 *  EXERCITE    : 02
 */

/**
 * 
 *  PREGUNTA
 *  --------
 *  Solicitar al usuario dos números enteros A y B por teclado. Luego, indicar a qué clase pertenecen ambos números, según la siguiente clasificación
 * 
 *  Si A es negativo y B es negativo: números de clase 1.
 *  Si A es negativo y B es positivo: números de clase 2.
 *  Si A es positivo y B está entre 1 y 3: números de clase 3.
 *  Si A es cero y B es cero: números de clase 4.
 *  En otro caso: no computables.
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear 2 variables para los dos numeros a ingresar por teclado.               [OK]
 *  [02] - Solicitar los dos numeros via teclado.                                       [OK]
 *  [03] - Realizar la comparacion anidada con if - else if - else.                     [OK]
 *  [04] - Mostrar respuesta via consola.                                               [OK]
 *  [05] - Realizar un do{}while para consultar si desea salir o repetir el ejercicio.  [OK]
 * 
 */

public class Ejercicio_02_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        
            int numero1;                                                                        // Variable de tipo int para guardar el primer numero ingresado por teclado.
            int numero2;                                                                        // Variable de tipo int para guardar el segundo numero ingresado por teclado.
            byte opcion;
            
            do{
            
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("| Ejercicio 02.                                  |");       // Mostramos texto por consola | Ejercicio 02.                                  |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Solicitar al usuario dos números enteros los   |");       // Mostramos texto por consola | Soliciitar al usuario dos números enteros los  |
                System.out.println("| cuales tendrán primer numero con la sigla A    |");       // Mostramos texto por consola | cuales tendrán primer numero con la sigla A    |
                System.out.println("| y el segundo numero B. Luego, indicar a qué    |");       // Mostramos texto por consola | y el segundo numero B. Luego, indicar a qué    |
                System.out.println("| clase pertenece ambos números, según la        |");       // Mostramos texto por consola | clase pertenece ambos nñumeros, según la       |
                System.out.println("| siguiente clasificación.                       |");       // Mostramos texto por consola | siguiente clasificación.                       |
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Si A es negativo y B es negativo:      Clase 1 |");       // Mostramos texto por consoal | Si A es negativo y B es negativo:      Clase 1 |
                System.out.println("| Si A es negativo y B es positivo:      Clase 2 |");       // Mostramos texto por consola | Si A es negativo y B es positivo:      Clase 2 |
                System.out.println("| Si A es positivo y B esta entre 1 y 3: Clase 3 |");       // Mostramos texto por consola | Si A es positivo y B esta entre 1 y 3: Clase 3 |
                System.out.println("| Si A es cero y B es cero:              Clase 4 |");       // Mostramos texto por consola | Si A es cero y B es cero:              Clase 4 |
                System.out.println("| En Otro caso:                    No computable |");       // Mostramos texto por consola | En Otro caso:                    No computable |
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.print  ("| Ingrese numero para la variable A: ");                    // Mostramos texto por consola | Ingrese numero para la variable A.
                    numero1 = teclado.nextInt();                                                // Variable de tipo int llamada numero1 para guardar el numero ingreso por teclado.
                System.out.print  ("| Ingrese numero para la variable B: ");                    // Mostramos texto por consola | Ingrese numero para la variable B.
                    numero2 = teclado.nextInt();                                                // Variable de tipo int llamada numero1 para guardar el numero ingreso por teclado. 
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                
            if(numero1 <0 & numero2 <0){                                                        // Comparador if, que realizar si los dos numero ingresa por teclado, es menor que 0.
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Los numeros pertenecen a la clase 1,");                   // Mostramos texto por consola | Los numeros pertenecen a la Clase 1.
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                }                                                                               // Fin del comparador if.
            else if(numero1 <0 & numero2 >0){                                                   // Comparador if, que realizar si los dos numero ingresa por teclado, numero1 es menor que 0 y numero2 mayor que 0.
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Los numeros pertenecen a la clase 2.");                   // Mostramos texto por consola | Los numeros pertenecen a la Clase 2.
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                }                                                                               // Fin del comparador if.
            else if(numero1 >0 & (numero2 >= 1 & numero2 <= 3)){                                // Comparador if, que realizar si los dos numero ingresa por teclado, numero1 es mayor que 0 y numero2 mayor 0 igual a 0 // numero3 menos 0 igual a 0.
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Los numeros pertenecen a la clase 3");                    // Mostramos texto por consola | Los numeros pertenecen a la Clase 3.
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                }                                                                               // Fin del comparador if.
            else if(numero1 ==0 & numero2 == 0){                                                // Comparador if, que realizar si los dos numero ingresa por teclado, numero1 es igual a 0 y numero2 es igual a 0.
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Los numeros pertenecen a la clase 4");                    // Mostramos texto por consola | Los numeros pertenecen a la Clase 4.
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                }                                                                               // Fin del comparador if.
            else{                                                                               // Dentro del ciclo comparador de if, si no encuentra un opción valida ingresa a else.
                System.out.println("\n");                                                       // Salto de Linea.
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Los numeros no son computables");                         // Mostramos texto por consola | Los numeros no son computables.
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                }                                                                               // Fin del comparador else.
            
                System.out.println("\n");
                System.out.println("+------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------+
                System.out.println("|                                                |");       // Mostramos texto por consola |                                                |
                System.out.println("| Que Desea realizar: 0=Salir y 1=Repetir:       |");       // Mostramos texto por consola | Que Desea realizar: 0=Salir o 1=Repetir        |
                System.out.print  ("| Ingrese su opción: "                             );       // Mostramos texto por consola | Ingrese su opción:
                    opcion = teclado.nextByte();                                                // Guardamos el numero ingresado por teclado en la variable opcion.
            
            }while(opcion == 1);                                                                // Se realiza la comparación de la condicion mientra opcio es == 1, en la cual 1 es repetir y 0 salir.
     }                                                                                          // Fin del public static void main.
}                                                                                               // Fin del public class.
