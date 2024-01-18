
import java.util.Scanner;

public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int finalista = 0;
        while (finalista == 0) {
            int candidato = (int) (Math.random() * (9 - 2) + 2);
            System.out.println(candidato);
            boolean primo = true;
            for (int i = 2; i < candidato; i++) {
                if (candidato % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                finalista += candidato;
                System.out.println("el numero " + finalista + " es primo");
            }
        }

    }

}

/*
 * int n, i;
 * do {
 * System.out.print("Introduce un numero >0: ");
 * n = sc.nextInt();
 * } while (n <= 0);
 * 
 * if (n == 1) { //el 1 no es primo
 * System.out.println("No es primo");
 * } else {
 * i = 2; //i es el divisor
 * while (n % i != 0) { //mientras el número no sea divisible por el divisor
 * i++;
 * }
 * if (i == n) { //cuando sale del while, si el divisor es el propio número
 * System.out.println("Primo"); //el número es primo
 * } else {
 * System.out.println("No es primo"); //si no, no lo es
 * }
 * }
 */