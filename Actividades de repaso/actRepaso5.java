import java.util.Scanner;

public class actRepaso5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 2 numeros ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a < b ? suma(a, b) : suma(b, a);
        System.out.println(c);
    }

    static int suma(int menor, int mayor) {
        int c = 0;
        for (int i = menor; i <= mayor; i++) {
            c += i;
            
        }
        return c;
    }
}