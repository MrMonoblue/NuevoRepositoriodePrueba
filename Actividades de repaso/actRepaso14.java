package javaapplication1;

import java.util.Scanner;

public class actRepaso11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("que figura necesita? 1: esfera, 2 cilindro o 3 cubo:  ");
        int question = sc.nextInt();
        switch (question) {
            case 1 -> {
                System.out.println("ha elegido la esfera, introduzca el radio: ");
                double r = sc.nextDouble();
                double volumen = Volumen(r);
                System.out.println("cuantos cc de agua tienes?");
                double volUsuario = sc.nextDouble();
                if (volumen > volUsuario) {
                    System.out.println("esa cantidad de agua te cabe en esta esfera");
                } else {
                    System.out.println("no te cabe tanta agua.");
                }

            }
            case 2 -> {
                System.out.println("ha elegido el clindro, introduzca el radio seguido de la altura: ");
                double r = sc.nextDouble();
                double h = sc.nextInt();
                double volumen = Volumen(h, r);
                System.out.println("cuantos cc de agua tienes?");
                double volUsuario = sc.nextDouble();
                if (volumen > volUsuario) {
                    System.out.println("esa cantidad de agua te cabe en este cilindro.");
                } else {
                    System.out.println("no te cabe tanta agua.");
                }
            }
            case 3 -> {
                System.out.println("ha elegido el cubo, introduzca uno de sus lados: ");
                int c = sc.nextInt();
                int volumen = Volumen(c);
                System.out.println("cuantos cc de agua tienes?");
                int volUsuario = sc.nextInt();
                if (volumen > volUsuario) {
                    System.out.println("esa cantidad de agua te cabe en este cubo");
                } else {
                    System.out.println("no te cabe tanta agua.");
                }
            }
        }

    }

    static double Volumen(double r) {
        double volumen = (4 * Math.PI * Math.pow(r, 3)) / 3;
        return volumen;
    }

    static double Volumen(double h, double r) {
        double volumen = Math.PI * Math.pow(r, 2);
        return volumen;
    }

    static int Volumen(int c) {
        int volumen = (int) Math.pow(c, 3);
        return volumen;
    }
}