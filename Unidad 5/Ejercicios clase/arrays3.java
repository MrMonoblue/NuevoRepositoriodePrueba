package entornos.de.programación;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos números quiere introducir?: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("introduzca un numero: ");

            n = sc.nextInt();

            array[i] = n;

        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "  ");

        }

    }

}