package javaapplication1;

import java.util.Scanner;

public class actRepaso2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros"); //al no poder usar más que operadores básicos, pedimos la entrada de 5 variables.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int mayor = cual(a, b, c, d, e);                //llamamos a la función 'cual' con los parámetros de entrada en el orden correcto.
        System.out.println(mayor);                    // cuando acabemos de ejecutar la función 'cual' y se asigne el valor a la va mayor, imprimimos el valor de la variable.
    }

    static int cual(int a, int b, int c, int d, int e) {//creamos la funcion 'cual con los parámetros antes mencionados en la misma cantidad.
        int n = a > b ? a : b;                          // si a es mayor que b asignamos a, si no b
        int n1 = c > n ? c : n;                         // si c es mayor que el mayor de a y be asignamos c si no 'n'
        int n2 = d > n1 ? d : n1;                       //seguimos asi haciendo un minitorneo hasta que nos queda el mayor de los n introducidos.
        int mayor = e > n2 ? e : n2;
        return mayor;                                   // return nos asignará a la variable mayor que esta fuera de la función, el valor deseado.

    }
}