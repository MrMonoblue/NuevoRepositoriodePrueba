import java.util.Scanner;

public class esfera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dos valores: ");
        int menor = sc.nextInt();
        int mayor = sc.nextInt();
        System.out.println("ñsadlkfjasdl");
        int cantidad = sc.nextInt();
        orden(menor, mayor, cantidad);
    }

    static void orden(int menor, int mayor, int cantidad) {
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(random(menor, mayor));
        }
    }

    static int random(int menor, int mayor) {
        return (int) (Math.random() * (mayor - menor) + menor);

    }

}
