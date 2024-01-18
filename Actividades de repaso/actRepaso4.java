import java.util.Scanner;

public class actRepaso4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 3 numeros ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("qué divisor quiere saber?");
        int D = sc.nextInt();

        if (a % D == 0) {
            System.out.println("su numero " + D + " es divisor de " + a);
        } else {
            System.out.println("su numero " + D + " no es divisor de " + a);
        }
        if (b % D == 0) {
            System.out.println("su numero " + D + " es divisor de " + b);
        } else {
            System.out.println("su numero " + D + " no es divisor de " + b);
        }
        if (c % D == 0) {
            System.out.println("su numero " + D + " es divisor de " + c);
        } else {
            System.out.println("su numero " + D + " no es divisor de " + c);
        }
    }
}