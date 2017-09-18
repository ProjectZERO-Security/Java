package Prueba_270917;
    import java.util.Scanner;       // Importamos la clase Scanner para validar los datos ingresados por teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 21/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 04
 * 
 */

/**
 * 
 *  PREGUNTA
 *  --------
 *  Escribir una aplicación que solicite su nombre y apellido paterno, nombre de asignatura cursada y 5 notas para dicha asignatura. Luego, imprima en pantalla 
 *  una tabla correctamente formateada para indicar sus datos personales, el nombre de la asignatura, las 5 notas ingresadas y el promedio aritmético de dichas
 *  notas
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear una variable de tipo String para guardar el nombre.                    [OK]
 *  [02] - Crear una variable de tipo String para guardar el apellido.                  [OK]
 *  [03] - Crear una variable de tipo String para guardar el nombre de la asignatura.   [OK]
 *  [04] - Crear una arreglo de 5 posiciones para guardar las notas ingresadas.         [OK]
 * 
 */

public class Ejercicio_04_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);                                                   // Parametro que nos permite ingresar los datos por teclado.
         
            String nombre;                                                                          // Variable de tipo String para guardar el nombre que ingresaremos por teclado.                                                                     
            String apellido;                                                                        // Variable de tipo String para guardar el apellido que ingresaremos por teclado.
            String asignatura;                                                                      // Variable de tipo String para guardar la asignatura que ingresaremos por teclado.
            float[] notas = new float[6];                                                           // Arreglo de tipo float con 5 posiciones para guardar las 5 notas que ingresaremos por teclado.
        
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("| Ejercicio 04.                                       |");      // Mostramos texto por consola | Ejercicio 04.                                       |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.println("| Aplicación que solicita su nombre y apellido        |");      // Mostramos texto por consola | Aplicación que solicita su nombre y apellido        |
                System.out.println("| paterno, nombre de asignatura cursada y 5 notas     |");      // Mostramos texto por consola | paterno, nombre de la asigntura cursada y 5 notas   | 
                System.out.println("| para dicha asignatura. Luego imprimir una tabla     |");      // Mostramos texto por consola | para dicha asigntura. Luego imprimir una tabla      |
                System.out.println("| correctamente formateada para indicar sus datos     |");      // Mostramos texto por consola | correctamente formateada para indicar sus datos     |
                System.out.println("| personales, el nombre de la asignatura, las 5 notas |");      // Mostramos texto por consola | personales, el nombre de la asignatura, las 5 notas |
                System.out.println("| ingresadas y el promedio aritmetico de dichas notas |");      // Mostramos texto por consola | ingresadas y el promedio aritmetica de dichas notas |
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("\n");                                                           // Salto de Linea.
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("| Ingresar los siguiente datos                        |");      // Mostramos texto por consola | Ingresar los siguiente datos                        |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.print  ("| Su Nombre\t: \t");                                            // Mostramos texto por consola | Su Nombre  \t=tabulador de 5 espacios
                    nombre = teclado.nextLine();                                                    // Variable de tipo String para guardar el nombre ingresado via teclado.
                System.out.print  ("| Su Apellido\t: \t");                                          // Mostramos texto por consola | Su Apelleido \t=tabulador de 5 espacios.
                    apellido = teclado.nextLine();                                                  // Variable de tipo String para guardar el apellido ingresado via teclado.
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("\n");                                                           // Salto de Linea.
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.print  ("| Ingrese el nombre de la Asignatura: ");                       // Mostramos texto por consola | Ingrese el nombre de la Asignatura:
                    asignatura=teclado.nextLine();                                                  // Variable de tipo String para guardar el nombre de la asignatura ingresada via teclado.
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
            
            for (int i=1 ; i<6 ; i++){                                                              // Ciclo for que nos permitira realizar el ingreso de las 5 notas
                System.out.print  ("| Ingrese nota " +i+ " : \t");                                  // Mostramos texto por consola | Ingrese nota: +variable i desde 0 y \t=tabulador de 5 espacios.
                notas[i] = teclado.nextFloat();                                                     // Arreglo notas, se inicio en la posicio 0 , se guarda el numero ingresado desde teclado.
                }                                                                                   // Fin del cilo for cuando ya no se cumple la condición.
                
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("\n");                                                           // Salto de Linea.
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("| Datos del Alumno                                    |");      // Mostramos texto por consola | Datos del Alumno                                    |
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +-----------------------------------------------------+
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                     |
                System.out.println("| Nombre \t: \t" +nombre);                                      // Mostramos texto por consola | Nombre : \t=tabulador de 5 espacios + la variable nombre del alumno
                System.out.println("| Apellido \t: \t" +apellido);                                  // Mostramos texto por consola | Apellido : \t=tabulador de 5 espacios + la variable apellido del alumno
                System.out.println("| Asignatura \t: \t" +asignatura);                              // Mostramos texto por consola | Asignatura : \t=tabulador de 5 espacios + la variable asignatura que curda el alumno
            
            float suma=notas[1]+notas[2]+notas[3]+notas[4]+notas[5];                                // Variable de tipo float que nos permitara realizar la suma de las notas guardadas.
            float promedio=suma/5;                                                                  // Variable de tipo float que nos permitira calcular el promedio, junto con la suma de las 5 notas.
            
            for (int i=1 ; i<6 ; i++){                                                              // Ciclo for que nos permite realizar el ciclo para mostrar las notas
                System.out.println("| Notas: ["+i+"]\t: \t" +notas[i]);                             // Mostramos texto por consola | Notas : \t=tabulador de 5 espacios + el arreglo notas en la posición [i]=0
                }                                                                                   // Fin del ciclo for cuando ya no se cumple la condición.
                System.out.printf ("| Promedio \t: \t%.1f\n" ,promedio);                            // Mostramos texto por consola | Promedio: \t=tabulador de 5 espacios.              |
                System.out.println("|                                                     |");      // Mostramos texto por consola |                                                    |    
                System.out.println("+-----------------------------------------------------+");      // Mostramos texto por consola +----------------------------------------------------+
        
    }                                                                                               // Fin del public static void main.
}                                                                                                   // Fin del public class.













