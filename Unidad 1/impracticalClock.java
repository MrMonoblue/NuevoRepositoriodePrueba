package entornos.de.programación;

import java.util.Scanner;

public class impracticalClock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos segundos?: ");
        int s = sc.nextInt();
        int m = s / 60;
        s %= 60; 
        int h = m / 60;
        m %= 60;
        int d = h / 24;
        h %= 24;

    
        System.out.println(d +" dias " + h + " horas " + m + " minutos " + s + " segundos ");

    }

}
