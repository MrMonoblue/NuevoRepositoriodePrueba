package entornos.de.programación;

import java.util.Scanner;

public class array4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos números quiere introducir?: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("introduzca un numero: ");

            n = sc.nextInt();

            array[i] = n;

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
            }

             
        }
        System.out.print(mayor);
        
    }

}
