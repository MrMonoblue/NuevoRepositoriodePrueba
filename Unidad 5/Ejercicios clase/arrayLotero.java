package entornos.de.programación;

import java.util.Scanner;

public class arrayLotero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posibles[] = new int[6];
        int ganadores[] = { 25, 12, 14, 78, 88, 99 };
        int nAciertos = 0;

        for (int i = 0; i < posibles.length; i++) {
            int n = (int) (Math.random() * 100 - 1);
            posibles[i] = n;
            for (int j = 0; j < ganadores.length; j++) {
                if (ganadores[j] == posibles[i]) {
                    nAciertos += 1;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.print("posibles son: " + posibles[i]);
            System.out.println("ganadores: " + ganadores[i]);
        }
        System.out.println(nAciertos);
    }

}
/*
 * para llamar arrays como parametros: static int funcion(int[] nombreLista,
 * int[] array2)
 */