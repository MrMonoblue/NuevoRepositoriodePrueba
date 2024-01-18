package JavaApplication1;

import java.util.Scanner;

public class esfera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor = cual(a, b, c);
        System.out.println(mayor);
    }
    static int cual (int a, int b, int c){
        int n = a > b ? a : b;
        int mayor = c > n ? c : n;
        return mayor;
        
    }
}