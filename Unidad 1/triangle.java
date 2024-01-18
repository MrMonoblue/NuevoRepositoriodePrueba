package entornos.de.programación;

import java.util.Scanner;

public class triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la base y despues la altura: ");
        int base = sc.nextInt();
        int altura = sc.nextInt();
        
        System.out.print((base * altura) / 2);
        
    }
    
}