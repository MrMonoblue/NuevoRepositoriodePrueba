import java.util.Scanner;

public class sobrecarga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("si quiere entre 0 y 1 pulse 1, si quiere entre 0 y 100 pulse 2");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("introduzca dos valores: ");
                int cantidad = sc.nextInt();
                orden(cantidad);
            }
            case 2 -> {
                System.out.println("introduzca dos valores: ");
                int menor = sc.nextInt();
                int mayor = sc.nextInt();
                System.out.println("introduzca la cantidad de numeros que desea");
                int cantidad = sc.nextInt();
                orden(menor, mayor, cantidad);
            }
        }

    }

    static void orden(int menor, int mayor, int cantidad) {
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(random(menor, mayor));
        }
    }

    static void orden(double cantidad) {
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(random());
        }
    }

    static int random(int menor, int mayor) {
        return (int) (Math.random() * (mayor - menor) + menor);

    }

    static double random() {
        return Math.random();
    }

}