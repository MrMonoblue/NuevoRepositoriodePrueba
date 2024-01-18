package entornos.de.programación;

import java.util.Scanner;

public class ecuacion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca las variables: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double d = ((b*b)-4*a*c);
        
        
        System.out.println((-b + (Math.sqrt(d))) / (2 *a));
        System.out.println((-b - (Math.sqrt(d))) / (2 *a));
    }
    
}
