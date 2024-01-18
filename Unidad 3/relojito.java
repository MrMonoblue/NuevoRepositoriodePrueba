import java.util.Scanner;

public class relojito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        int h = sc.nextInt();
        System.out.println("Introduzca los minutos");
        int m = sc.nextInt();
        System.out.println("Introduzca los segundos");
        int s = sc.nextInt();
        System.out.println("Introduzca los segundos que quiere incrementar");
        int aumento = sc.nextInt();

        for (int i = aumento; i > 0; i--) { /*
                                             * la condicion del for nos vacía la cantidad de segundos manteniendolos
                                             * sobre 0
                                             */
            s++; /* aumentamos al segundero en 1 */
            if (s > 59) { /* si el segundero sobrepasa 59 */
                s = 0; /* reiniciamos el segundero */
                m++; /* aumentamos el minutero en 1 */
            }
            if (m > 59) { /* si el minutero sobrepasa 59 */
                m = 0; /* reiniciamos el minutero */
                h++; /* aumentamos las horas en 1 */
            }
            if (h > 23) { /* por último, si las horas sobrepasan 23 */
                h = 0; // reiniciamos las horas.
            }
        }
        System.out.print(h + ":"); // imprimimos el resultado sin utilizar 'ln' para que se nos imprima en la misma
                                   // linea.
        System.out.print(m + ":");
        System.out.print(s + ".");
    }
}