package entornos.de.programación;

import java.util.Scanner;

public class primos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cuantos primos quieres saber: ");
        int n = sc.nextInt();										//input 5
        int cant = 0;												

        for (int i = 0; cant <= n; i++) {							//loop 1 (inicio i = 0; 0 < 5) loop 4
            boolean primo = true;									//loop 1 (0 = true)
            for (int j = i - 1 ; j >= 2; j--) {						//loop 1 (j = 0 -1; -1 >= 2 = false, salimos del bucle)
                if (i % j == 0) {									
                    primo = false;														
                    break;											
                }
            }
            if (primo) {											//loop 1(al ser 0 true porque no paso el if del inner for)
                cant++;												//cant
                System.out.println(i);								//imprimimos el valor de i (0)
            }
            

        }
        
    }

}