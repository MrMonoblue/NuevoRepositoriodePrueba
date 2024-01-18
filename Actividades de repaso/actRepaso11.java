package entornos.de.programación;

import java.util.Scanner;

public class actRepaso11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca su numero");
        int n = sc.nextInt();
        senar(n);
         
    }
    static void senar(int n){
        if (n%2!=0){
            System.out.println("el número es impar");
        }else{
            System.out.println("el numero no es impar.");
        }
    }
}