package javaapplication1;

import java.util.Scanner;

public class numinv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("hasta que numero quieres calcular los primos? ");
        int n = sc.nextInt();
        int n1 = n/1000;
        int n2 = (n%1000) / 100;
        int n3 = (n%100) / 10;
        int n4 = (n%10);
        System.out.println(n4 + "" +  n3 + "" + n2+ "" +  n1);

    }
}