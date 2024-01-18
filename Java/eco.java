import java.util.Scanner;

public class Eco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        eco(n);
    }

    static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("eco");
        }
    }
}
