package entornos.de.programación;


import java.util.Scanner;



public class array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 5 números: ");
        int array[] = new int[5];
        
        for (int i = 0; i < array.length; i++){         /* inicializamos el bucle desde el indice 0 del array hasta el mañimo de su longitud, desde abajo acia arriba */
            int n = sc.nextInt();                       /*declaramos la variable de introducción de datos*/
            array[i] = n;                               /* iteramos el array, por cada indice 'i' se introduce un numero 'n' */
           
        }
        for (int i = 0; i < array.length; i++){         /*repetimos el bucle de arriba*/
            System.out.println(array[i]);               /*imprimimos el valor que hemos asignado a cada parte del indice i*/
        }
        
    }

}