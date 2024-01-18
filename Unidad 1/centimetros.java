package entornos.de.programación;

import java.util.Scanner;

public class centimetro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca las distancias en milimetros centimetros y metros: ");
        double mm = sc.nextDouble();
        double cm = sc.nextDouble();
        double m = sc.nextDouble();
        
        
     
        System.out.println((mm / 10)+(cm)+(m*100));
        
    }
    
}