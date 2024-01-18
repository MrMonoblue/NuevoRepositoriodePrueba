package programaciodaw;

import java.util.Scanner;

public class calculadoraIVA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca la base imponible: ");
        float n = scanner.nextFloat();

        System.out.println("base imponible0 " + n);
        System.out.println("IVA= " + (n * 0.21));
        System.out.println("Total= " + (n * 1.21));
    }

}