import java.util.Scanner;

public class Tabla_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué factorial quieres saber?");
        int j = sc.nextInt();
        int factorial = 1;
        
        for (int i = j; i > 0; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}