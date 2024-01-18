package entornos.de.programación;

import java.util.Scanner;

public class actRepaso6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros");
        int b = sc.nextInt();
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {                   //el primer bucle inicia en i= 0 va hasta i= altura incrementando de a 1, en cada ciclo nos ejecuta el for interno
            for (int j = 0; j < b; j++) {               // el for interno nos imprime * en cada iteración desde j= 0 hasta j< b
                System.out.print("*");
            }

            System.out.println("");                   // cada b ciclos del for interno nos imprime un salto de linea  
        }
    }

}