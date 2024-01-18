package entornos.de.programación;

import java.util.Scanner;

public class distancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca los valores de x: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("introduzca los valores de y: ");
        double y1 = sc.nextInt();
        double y2 = sc.nextInt();
        double dist = distancia(x1, x2, y1, y2);
        System.out.println(dist);
    }

    static double distancia(double x1, double x2, double y1, double y2){
        double dist = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        return dist;
    }

}