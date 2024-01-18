package entornos.de.programación;

import java.util.Scanner;
import java.util.Arrays;

public class arrayPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Longitud?: ");
        int longitud = sc.nextInt();
        System.out.println("Fi?: ");
        int fi = sc.nextInt();
        
        
        
        for(int i=0; i<omplirParells(longitud, fi).length; i++){
            System.out.print(omplirParells(longitud, fi)[i] + " ");
        }
        

        
    }

    static int[] omplirParells(int l, int f){
        int arr[] = new int[l];
        for(int i = 0; i < arr.length;){
            int j = (int) (Math.random() * (f-2) + 2);
            if(j%2 == 0){
                arr[i]=j;
                i++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
    
}

