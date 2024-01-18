package EjerciciosInternet;

import java.util.Scanner;

import java.util.ArrayList;

public class numeroInvertido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su número: ");
        int n = sc.nextInt();
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 0; i <= numero.size(); i++) {
            numero.add(n % 10);
            if(n>1){
            n = n/10;
            }else{
                break;
            }
            if(n == 0){
                System.out.println("0");
                break;
            }
        }
        System.out.println(numero);
    }

}