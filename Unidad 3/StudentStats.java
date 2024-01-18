import java.util.Scanner;

public class Contanum_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorNumeros = 0;
        int numero;
        int mayor = Integer.MIN_VALUE;

        System.out.println("Ingresa números. Para finalizar, ingresa 0.");

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                contadorNumeros++;

                if (numero > mayor) {
                    mayor = numero;
                }
            }

        } while (numero != 0);

        if (contadorNumeros > 0) {
            System.out.println("Se introdujeron " + contadorNumeros + " números.");
            System.out.println("El número más grande fue: " + mayor);
        } else {
            System.out.println("No se introdujeron números.");
        }
    }
}