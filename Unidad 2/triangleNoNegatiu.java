package entornos.de.programación;

import java.util.Scanner;

public class triangleNoNegatiu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la base seguido de la altura: ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (b < 0 || h < 0) {
            System.out.println("introduzca la base seguido de la altura: ");
            b = sc.nextInt();
            h = sc.nextInt();

        }
        if (b > 0 || h > 0) {
            int a = (b * h) / 2;
            System.out.println(a);
        }

    }

}