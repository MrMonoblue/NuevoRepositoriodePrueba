import java.util.Scanner;

public class actRepaso3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea calcular el área del cuadrado (1) o del triangulo?(2) ");
        int question = sc.nextInt();

        switch (question) {
            case 1 -> {
                System.out.println("introduzca la medida del lado: ");
                int a = sc.nextInt();
                int area = cuadrado(a);
                System.out.println("el area del cuadrado es: " + area + " metros cuadrados");

            }
            case 2 -> {
                System.out.println("introduzca la base seguido de la altura: ");
                int b = sc.nextInt();
                int h = sc.nextInt();
                int area = triangulo(b, h);
                System.out.println("el area de su triangulo es de: " + area + " metros cuadrados");
            }

        }
    }

    static int cuadrado(int a) {
        int area = a * a;
        return area;
    }

    static int triangulo(int b, int h) {
        int area = (b * h) / 2;
        return area;
    }
}