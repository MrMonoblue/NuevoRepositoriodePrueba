package entornos.de.programación;

import java.util.Scanner;

public class valorAbsoluto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero negativo o positivo: ");
        int n = sc.nextInt();
        
        System.out.println((int) n >= 0 ? n : (n * -1));

    }

}
