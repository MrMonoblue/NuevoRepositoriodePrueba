package javaapplication1;

import java.util.Scanner;

public class campoGravitatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que pesaba andré cuando se rompio la cara en el patinete?");
        double d  = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m1 = sc.nextDouble();
        
        double G = 6.673E-11;
        
        double g = G * m1 * m2 /(Math.pow(d,2));
        System.out.println("La fuerza de atracción entre los 2 cuerpos es de " + g + " Nn^2/kg^2");
    }
}
