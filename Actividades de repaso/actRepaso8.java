package entornos.de.programación;

import java.util.Scanner;

public class actRepaso8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros");
        int h = sc.nextInt();
        for (int i = 0; i <= h; i++) {
            for (int j = h; j > i ; j -= 1) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

}
