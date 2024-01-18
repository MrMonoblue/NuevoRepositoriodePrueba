import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hasta que numero quieres contar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++ ) {
            System.out.println(i);
        }

    }
    
}