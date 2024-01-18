import java.util.Scanner;

public class DeMenorAMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdusca un numero: ");
        int n1 = scanner.nextInt();
        System.out.println("introdusca otro numro: ");
        int n2 = scanner.nextInt();
        if (n1 > n2){
            orden(n1, n2);
        } else if ( n2 > n1){
            orden(n2, n1);
        }
        
    }

    static void orden(int mayor, int menor) {
        for (int i = mayor -1 ; i > menor ; i--) {
            System.out.println(i);
        }
    }
}