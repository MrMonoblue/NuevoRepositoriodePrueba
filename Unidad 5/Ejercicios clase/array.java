package entornos.de.programación;

public class arrays {

    public static void main(String[] args) {
        double r[] = new double[10];
        int suma = 0;

        for (int i = 0; i < r.length ; i++) {
            r[i] = (int) (Math.random() * 100 + 1);
            suma += r [i];
            System.out.println(r[i]);                   /* imprime cada valor del array*/

        }
        System.out.println(suma);
    }
    
}