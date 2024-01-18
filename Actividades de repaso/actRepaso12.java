package javaapplication1;

import java.util.Scanner;

public class actRepaso12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca sus numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a < b){
            senar(a, b);
        }else {
            senar(b, a);
        }
         
    }
    static void senar(int menor, int mayor){
        for (int i = menor; i <= mayor; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}