package entornos.de.programación;

import java.util.Scanner;

public class descuento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas entradas infantiles? cuantas adultas? : ");
        double i = sc.nextDouble();
        double a = sc.nextDouble();
        double total = i * 12 + a * 18;
        
        double descuento = total > 60 ? total * 0.9 : total;
        
        
        System.out.println(descuento);

    }

}