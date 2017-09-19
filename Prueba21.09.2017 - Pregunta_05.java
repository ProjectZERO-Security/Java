package Prueba_270917;
import java.io.PrintStream;
    import java.util.Scanner;       // Importamos la clase Scanner para validar los datos ingresador via teclado.

/**
 *
 *  AUTHOR      : Esteban Moises Aros Castillo
 *  DATE        : 27/09/2017
 *  CORPORATIVE : Inacap IQQ.
 *  EXERCISE    : 05 
 * 
 */

/**
 *
 *  PREGUNTA 
 *  --------
 *  Se necesita una aplicación que reciba el nombre y el valor de 5 productos (sin IVA). Luego, imprima una tabla en consola que muestre el nombre de los 
 *  productos junto a su valor sin IVA, su valor con IVA (recuerde que el IVA equivale al 19% del precio bruto del producto), la suma total de los precios 
 *  sin IVA y la suma total de los precios con IVA
 * 
 * 
 *  PROCEDIMIENTO
 *  -------------
 *  [01] - Crear 5 variables de tipo String para los 5 nombres de los productos.    [OK]
 *  [02] - Crear 5 variables de tipo double para los 5 precios de los productos.    [OK]
 *  [03] - Crear 2 variables de tipo double para sumasiniva y sumaconiva.           [OK]
 *  [04] - Crear 1 variable de tipo char, para realizar el ciclo repetitivo while.  [OK]
 * 
 */

public class Ejercicio_05_OK {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);       // Parametro que nos valida el ingreso de datos via teclado.
      
            String producto1;       // Variable de tipo String, llamada producto1 que guardar el nombre del producto ingresado por teclado.
            String producto2;       // Variable de tipo String, llamada producto2 que guardar el nombre del producto ingresado por teclado.
            String producto3;       // Variable de tipo String, llamada producto3 que guardar el nombre del producto ingresado por teclado.    
            String producto4;       // Variable de tipo String, llamada producto4 que guardar el nombre del producto ingresado por teclado.
            String producto5;       // Variable de tipo String, llamada producto5 que guardar el nombre del producto ingresado por teclado.
            double preciosiniva1;   // Variable de tipo double, llamada preciosiniva1 que guardara el precio para el primero producto.
            double preciosiniva2;   // Variable de tipo double, llamada preciosiniva1 que guardara el precio para el segundo producto.    
            double preciosiniva3;   // Variable de tipo double, llamada preciosiniva1 que guardara el precio para el tercer producto.
            double preciosiniva4;   // Variable de tipo double, llamada preciosiniva1 que guardara el precio para el cuarto producto.
            double preciosiniva5;   // Variable de tipo double, llamada preciosiniva1 que guardara el precio para el quinto producto.
            double sumasiniva;      // Variable de tipo double, llamada sumasiniva, la cual guardara la suma de los precios sin iva.
            double sumaconiva;      // Variable de tipo double, llamada sumaconiva, la cual guardara la suma de los precios con iva.
            char repetirosalir;     // Variable de tipo char, llamada repetirosalir, la cual guardara el caracter ingresado, para repetir o salir de la aplicación.
            
            do{                                                                                             // Inicio del do()while de la condición repetirosalir.
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("| Ejercicio 05.                                              |");       // Mostramos texto por consola | Ejercicio 05.                                              |
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("|                                                            |");       // Mostramos texto por consola |                                                            |
                System.out.println("| Aplicación que recibe el nombre y el valor de 5 productos  |");       // Mostramos texto por consola | Aplicación que recibe el nombre y el valor de 5 productos  |
                System.out.println("| (sin I.V.A). Luego, imprimia una tabla en consola que      |");       // Mostramos texto por consola | (sin I.V.A). Luego, imprimia una tabla en consola que      |
                System.out.println("| muestre el nombre de los producto junto a su valor sin     |");       // Mostramos texto por consola | muestre el nombre de los producto junto a su valor sin     |   
                System.out.println("| IVA, su valor con IVA (recuerde que el IVA equivale al 19% |");       // Mostramos texto por consola | IVA, su valor con IVA (recuerde que el IVA equivale al 19% |
                System.out.println("| del precio bruto del producto), la suma total de los       |");       // Mostramos texto por consola | del precio bruto del producto), la suma total de los       |
                System.out.println("| precios sin IVA y la suma total de los precios con IVA.    |");       // Mostramos texto por consola | precios sin IVA y la suma total de los precios con IVA.    |
                System.out.println("|                                                            |");       // Mostramos texto por consola |                                                            |
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("\n");                                                                   // Salto de Linea.
                
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("| Ingrese Nombre de Productos.                               |");       // Mostramos texto por consola | Ingrese Nombre de Productos.                               |   
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.print  ("| Ingrese Producto Nº 1    : "); producto1 = teclado.nextLine();        // Mostramos texto por consola | Ingrese Producto Nº 1    : +variable de tipo String, llamada producto1, guarda el nombre de producto via teclado.     
                System.out.print  ("| Ingrese Producto Nº 2    : "); producto2 = teclado.nextLine();        // Mostramos texto por consola | Ingrese Producto Nº 2    : +variable de tipo String, llamada producto2, guarda el nombre de producto via teclado. 
                System.out.print  ("| Ingrese Producto Nº 3    : "); producto3 = teclado.nextLine();        // Mostramos texto por consola | Ingrese Producto Nº 3    : +variable de tipo String, llamada producto3, guarda el nombre de producto via teclado.
                System.out.print  ("| Ingrese Producto Nº 4    : "); producto4 = teclado.nextLine();        // Mostramos texto por consola | Ingrese Producto Nº 4    : +variable de tipo String, llamada producto4, guarda el nombre de producto via teclado.
                System.out.print  ("| Ingrese Producto Nº 5    : "); producto5 = teclado.nextLine();        // Mostramos texto por consola | Ingrese Producto Nº 5    : +variable de tipo String, llamada producto5, guarda el nombre de producto via teclado.
                System.out.println("+------------------------------------------------------------+");       // Mostramos texto por consola +------------------------------------------------------------+
                System.out.println("\n");                                                                   // Salto de Linea.
                
                System.out.println("+------------------------------------------------------------+");                   // Mostramos texto por consola +----------------------------------------------------------+
                System.out.println("| Ingrese Precio de Productos (Sin IVA).                     |");                   // Mostramos texto por consola | Ingrese Precio de Productos (Sin IVA).                   |
                System.out.println("+------------------------------------------------------------+");                   // Mostramos texto por consola +----------------------------------------------------------+
                System.out.print  ("| Precio (Sin IVA) Producto Nº 1    : "); preciosiniva1 = teclado.nextDouble();     // Mostramos texto por consola | Precio (Sin IVA) Producto Nº 1    : +variable de tipo double, llamada preciosiniva1, guarda el nombre de producto via teclado
                System.out.print  ("| Precio (Sin IVA) Producto Nº 2    : "); preciosiniva2 = teclado.nextDouble();     // Mostramos texto por consola | Precio (Sin IVA) Producto Nº 2    : +variable de tipo double, llamada preciosiniva2, guarda el nombre de producto via teclado 
                System.out.print  ("| Precio (Sin IVA) Producto Nº 3    : "); preciosiniva3 = teclado.nextDouble();     // Mostramos texto por consola | Precio (Sin IVA) Producto Nº 3    : +variable de tipo double, llamada preciosiniva3, guarda el nombre de producto via teclado
                System.out.print  ("| Precio (Sin IVA) Producto Nº 4    : "); preciosiniva4 = teclado.nextDouble();     // Mostramos texto por consola | Precio (Sin IVA) Producto Nº 4    : +variable de tipo double, llamada preciosiniva4, guarda el nombre de producto via teclado
                System.out.print  ("| Precio (Sin IVA) Producto Nº 5    : "); preciosiniva5 = teclado.nextDouble();     // Mostramos texto por consola | Precio (Sin IVA) Producto Nº 5    : +variable de tipo double, llamada preciosiniva5, guarda el nombre de producto via teclado
                System.out.println("+------------------------------------------------------------+");                   // Mostramos texto por consola +----------------------------------------------------------+
                System.out.println("\n");                                                                               // Salto de Linea.
            
            sumasiniva=preciosiniva1+preciosiniva2+preciosiniva3+preciosiniva4+preciosiniva5;                           // asignación de valores a la variable sumasinvia.
            sumaconiva=(sumasiniva*1.19);                                                                               // asignación de valores a la variable sumaconiva.
                
                System.out.println("+-------------------------------------------------------------------------------+");                // Mostramos texto por consola +-------------------------------------------------------------------------------+
                System.out.println("|       Producto        |       Precio (S/IVA)      |       Precio (C/IVA)      |");                // Mostramos texto por consola |       Producto        |       Precio (S/IVA)      |       Precio (C/IVA)      |
                System.out.println("+-------------------------------------------------------------------------------+");                // Mostramos texto por consola +-------------------------------------------------------------------------------+
                System.out.printf ("| %13s         |\t%13s       | \t\t%10.2f\n" ,producto1, preciosiniva1, preciosiniva1*1.19);        // Mostramos texto por consola | %13s = formato para el String de las variales + variable preciosinvia1 + preciosiniva1*1.19 formula para calcular el iva.
                System.out.printf ("| %13s         |\t%13s       | \t\t%10.2f\n" ,producto2, preciosiniva2, preciosiniva2*1.19);        // Mostramos texto por consola | %13s = formato para el String de las variales + variable preciosinvia2 + preciosiniva2*1.19 formula para calcular el iva.
                System.out.printf ("| %13s         |\t%13s       | \t\t%10.2f\n" ,producto3, preciosiniva3, preciosiniva3*1.19);        // Mostramos texto por consola | %13s = formato para el String de las variales + variable preciosinvia3 + preciosiniva3*1.19 formula para calcular el iva.
                System.out.printf ("| %13s         |\t%13s       | \t\t%10.2f\n" ,producto4, preciosiniva4, preciosiniva4*1.19);        // Mostramos texto por consola | %13s = formato para el String de las variales + variable preciosinvia4 + preciosiniva4*1.19 formula para calcular el iva.
                System.out.printf ("| %13s         |\t%13s       | \t\t%10.2f\n" ,producto5, preciosiniva5, preciosiniva5*1.19);        // Mostramos texto por consola | %13s = formato para el String de las variales + variable preciosinvia5 + preciosiniva5*1.19 formula para calcular el iva.
                System.out.println("+-------------------------------------------------------------------------------+");                // Mostramos texto por consola +-------------------------------------------------------------------------------+
		System.out.printf ("|        TOTAL          |          %10.2f       |   \t%10.2f\n", sumasiniva, sumaconiva);           // Mostramos texto por consola |        TOTAL          |
                System.out.println("+-------------------------------------------------------------------------------+");                // Mostramos texto por consola +-------------------------------------------------------------------------------+
                System.out.println("\n");                                                                                               // Salto de Linea.
                
                System.out.println("+-------------------------------------------------------------------------------+");                // Mostramos texto por consola +-------------------------------------------------------------------------------+
                System.out.println("| Repetir proceso?: (S=Si / N=No) ");                                                               // Mostramos texto por consola | Repetir proceso?: (S=Si / N=No)  
                    repetirosalir = teclado.next().charAt(0);                                                                           // Variable de tipo char, llamada repetirosalir la cual 
                
            }while(repetirosalir == 'S' || repetirosalir == 's');                                                                       // ciclo repetivo, while la cual debe de cumplir con la condición para realizar la repetción en la variable repetirosalir == 'S' || repetirosalir == 's'
    }                                                                                                                                   // Fin del public static void main.
}                                                                                                                                       // Fin del public class.
