package javaapplication1;

import java.util.Scanner;

public class actRepaso11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quiere saber los impares (1) o los pares(2)");
        int question = sc.nextInt();
        switch (question) {
            case 1 -> {
                System.out.println("introduzca sus numeros");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a < b) {
                    senar(a, b);
                } else {
                    senar(b, a);
                }
            }
            case 2 -> {
                System.out.println("introduzca sus numeros");
                float a = sc.nextInt();
                float b = sc.nextInt();
                if (a < b) {
                    senar(a, b);
                } else {
                    senar(b, a);
                }
            }
        }

    }

    static void senar(int menor, int mayor) {
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 != 0) {
                System.out.print( i + " ");
            }
        }
    }

    static void senar(float menor, float mayor) {
       for (float i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
    }
}