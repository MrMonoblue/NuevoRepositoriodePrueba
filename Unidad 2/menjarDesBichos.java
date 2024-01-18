package entornos.de.programación;

import java.util.Scanner;

public class menjarDesBichos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la cantidad de pienso, el numero de animales y la cantidad de comida por animal: ");
        double kp = sc.nextDouble();
        double an = sc.nextDouble();
        double kpPorAn = kp / an;
        
        if(kpPorAn < 1){
            System.out.println("compra mas pienso");
        }else{
            System.out.println("tienes " + kpPorAn + "kg de pienso para cada bicho.");
        }

    }

}