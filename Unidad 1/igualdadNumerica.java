import java.util.Scanner;

public class igualdadNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero: ");
        float x = scanner.nextFloat();
        System.out.println("introduzca otro numero: ");
        float y = scanner.nextFloat();

        boolean z = (x == y);
        System.out.println(z);
    }

}