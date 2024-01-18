import java.util.Scanner;

public class segundosEn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el numero de dias, de horas y de minutos: ");
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = cuentasegundos(d, h, m);
        System.out.print(s);
    }

    static int cuentasegundos(int d, int h, int m){
        int s = (d * 86400) + (h * 3600) + (m * 60);
        return s;
    }

}