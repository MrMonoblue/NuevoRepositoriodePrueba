package entornos.de.programación;

import java.util.Scanner;



public class verga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 5 números: ");
        int array[] = new int[5];
        
        for (int i = 0; i < array.length; i++){
            int n = sc.nextInt();
            array[i] = n;
           System.out.print(array[n]); 
        }
        
    }

}
