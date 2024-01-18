import java.util.Scanner;

public class RadioVolumen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el radio: ");
        float n = scanner.nextFloat();
        System.out.println("introduzca la altura: ");
        float b = scanner.nextFloat();
        System.out.println("si desea calcular el area pulse 1, si desea calcular el volumen pulse 2: ");
        float c = scanner.nextFloat();
        area(c, n ,b);

    }

    static void area(float c, float n, float b) {
        if (c == 1) {
            System.out.println(2 * 3.14 * (n + b));
        }
        else if (c == 2){
            System.out.println(3.14 * n * b);
        }
        if(c != 1 && c!=2){
            System.out.println("portate serio");
        }        
        }
        
}