import java.util.Scanner;

public class Tabla_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumatorioN = 0;
        
        for (int i=0; i < 10; i++){
            System.out.println("los múltiplos de qué numero necesitas?");
            int n = sc.nextInt();
            sumatorioN += n;
            
        }
        
        System.out.println(sumatorioN/10);
        
    }
}