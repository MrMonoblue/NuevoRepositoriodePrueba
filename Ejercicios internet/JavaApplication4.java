package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el tamaño del array");
        int longitud = sc.nextInt();
        int array3[] = new int[longitud];

        int contador = 0;
        while (contador < longitud) {
            //System.out.println(" /while/ ");
            int x = 0;
            int finalista = esprimo(x);
            array3[contador] = finalista;
            contador++;

        }
        for (int i = 0; i < array3.length; i++) {
            //System.out.println(" /for/ ");
            System.out.println(array3[i]);
        }

        int mayor = array3[0];
        mayor = numeromayor(mayor, array3);

        System.out.println(mayor);
    }

    private static int esprimo(int finalista) {
        //System.out.println(" /esprimo/ ");
        finalista = 0;
        while (finalista == 0) {
            //System.out.println(" /while esprimo/ ");
            int candidato = (int) (Math.random() * (100 - 2) + 2);
            //System.out.println(candidato);
            boolean primo = true;
            for (int i = 2; i < candidato; i++) {
                //System.out.println(" /for esprimo/ ");
                if (candidato % i == 0) {
                    primo = false;
                    //System.out.println(" /falso/ ");
                    break;
                }
            }
            if (primo) {
                finalista += candidato;

            }
        }
        //System.out.print("tenemos un finalista:  " + finalista);
        return finalista;

    }

    private static int numeromayor(int mayor, int[] array3) {
        for (int i = 1; i < array3.length; i++) {
            mayor = array3[i] > mayor ? array3[i] : mayor;
        }
        return mayor;
    }
}
