package entornos.de.programación;

import java.util.Scanner;

public class esfera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el radio de su esfera: ");
        double radio = sc.nextDouble();
        System.out.println("pulse 1 para la superficie, pulse 2 para el volumen: ");
        int choice = sc.nextInt();

        if (choice == 1) {                                              /* utilizamos un if para que nos ejecute la funcion deseada*/
            superficie(radio);
        } else if (choice == 2) {
            volumen(radio);
        }

    }

    static void superficie(double radio) {                              /* utilizamos una funcion void para imprimir de una vez el resultado sin tener que devolverlo a ninguna funcion preestablecida*/ 
        double n = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println(n);
    }

    static void volumen(double radio) {
        double n = (4 / 3) * Math.PI * Math.pow(radio, 3);
        System.out.println(n);
    }

}
