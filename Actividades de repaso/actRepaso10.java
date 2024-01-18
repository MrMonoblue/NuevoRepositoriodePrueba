package entornos.de.programación;

import java.util.Scanner;

public class actRepaso10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros");
        int n = sc.nextInt();

        for (int i = 1; i <= 60; i++) {
            if (n % i != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}