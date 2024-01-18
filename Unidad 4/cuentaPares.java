package entornos.de.programación;

import java.util.Scanner;

public class cuentaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el limite superior: ");
        int n = sc.nextInt();
        nombresParells( n);
        
    }

    static void nombresParells(int n){
        int contador = 0;
        for (int i = 1; contador < n; i++){
            if(i%2==0){
               contador++;
               
               System.out.println(i);
            }
        }
        
    }

}