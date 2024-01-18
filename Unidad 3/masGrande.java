import java.util.Scanner;

public class masGrande {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor para a");
        int a = sc.nextInt();
        System.out.println("Introduce un valor para b");
        int b = sc.nextInt();
        int nMayor = mayor(a, b);
        System.out.println(nMayor);
    }
    static int mayor(int a, int b) {
        return a < b ? b : a;
    }
}