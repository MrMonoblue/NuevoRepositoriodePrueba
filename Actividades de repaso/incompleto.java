package Entornos.de.programación;

import java.util.Scanner;

public class actRepaso15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca la primera hora minutos y segundos: ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        boolean compruebah1 = Comprueba(h1, m1, s1);
        
        while (!compruebah1) {
            System.out.println("la 1ra hora introducida no es correcta.");
            System.out.print("introduzca la primera hora minutos y segundos: ");
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            s1 = sc.nextInt();
            compruebah1 = Comprueba(h1, m1, s1);
        }
        System.out.print("introduzcala 2da hora minutos y segundos: ");
        long h2 = sc.nextInt();
        long m2 = sc.nextInt();
        long s2 = sc.nextInt();
        boolean compruebah2 = Comprueba(h2, m2, s2);
        
        while (!compruebah2) {
            System.out.println("la 2da hora introducida no es correcta.");
            System.out.print("introduzcala 2da hora minutos y segundos: ");
            h2 = sc.nextInt();
            m2 = sc.nextInt();
            s2 = sc.nextInt();
            compruebah2 = Comprueba(h2, m2, s2);

        }
        System.out.print("introduzca 1ra fecha: dia mes y año: ");
        int d1 = sc.nextInt();
        int mes1 = sc.nextInt();
        int a1 = sc.nextInt();
        boolean compruebaD1 = CompruebaDate(d1, mes1, a1);
        
        while (!compruebaD1) {
            System.out.println("la 1ra FECHA introducida no es correcta.");
            System.out.print("introduzca 1ra fecha: dia mes y año: ");
            d1 = sc.nextInt();
            mes1 = sc.nextInt();
            a1 = sc.nextInt();
            compruebaD1 = CompruebaDate(d1, mes1, a1);

        }
        System.out.print("introduzca 2da fecha: dia mes y año: ");
        int d2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int a2 = sc.nextInt();
        boolean compruebaD2 = CompruebaDate2(d2, mes2, a2);
        
        while (!compruebaD2) {
            System.out.println("la 2da FECHA introducida no es correcta.");
            System.out.print("introduzca 2da fecha: dia mes y año: ");
            d2 = sc.nextInt();
            mes2 = sc.nextInt();
            a2 = sc.nextInt();
            compruebaD2 = CompruebaDate2(d2, mes2, a2);
        }
         

        if (compruebah1 && compruebah2 && compruebaD1 && compruebaD2) {            
            long incHr = h1 > h2 ? (h1 - h2) : (h2 - h1);
            long incMin = m1 > m2 ? (m1 - m2) : (m2 - m1);
            long incSeg = s1 > s2 ? (s1 - s2) : (s2 - s1);
            long incDia = d1 > d2 ? (d1 - d2) : (d2 - d1);
            long incMes = mes1 > mes2 ? (mes1 - mes2) : (mes2 - mes1);
            long incAny = a1 > a2 ? (a1 - a2) : (a2 - a1);
            double cantDias = IncrementoDias(incDia, incMes, incAny);
            long cantSegundos = incrementoSegundos(incHr, incMin, incSeg);
            long resultado = (incHr * 3600) + (incMin * 60) + incSeg + (incDia * 86400) + (incMes * 2592000) + (incAny * 31536000);
            System.out.println("la cantidad de dias entre las dos fechas es de: " + cantDias);
            System.out.println("la cantidad de segundos entre las dos horas es de: " + cantSegundos);
            System.out.println("el numero de segundos entre esas fechas y horas es de: " + resultado);

        }
        

    }
    static double IncrementoDias(double incDia, double incMes, double incAny){
        double cantDias;
        if (incDia =)
        
    }
    static long incrementoSegundos(long incHr, long incMin, long incSeg){
        long cantSegundos = incSeg + (incMin * 60)+ (incHr * 3600);
        return cantSegundos;
    }

    static boolean Comprueba(int h, int m, int s) {
        boolean compruebah1 = true;
        if ((h > 24 || h < 0) || (m < 0 || m > 59) || (s < 0 || s > 59)) {
            compruebah1 = false;
            return compruebah1;
        }
        return compruebah1;

    }

    static boolean Comprueba(long h, long m, long s) {
        boolean compruebah2 = true;
        if ((h > 24 || h < 0) || (m < 0 || m > 59) || (s < 0 || s > 59)) {
            compruebah2 = false;
            return compruebah2;
        }
        return compruebah2;

    }

    static boolean CompruebaDate(int d1, int mes1, int a1) {
        boolean compruebaD1 = true;
        if (a1 >= 0) {
            switch (mes1) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (d1 > 31 || d1 < 1) {
                        compruebaD1 = false;
                    } else {
                        compruebaD1 = true;
                    }

                }
                case 2 -> {
                    if (d1 > 28 || d1 < 1) {
                        compruebaD1 = false;
                    } else {
                        compruebaD1 = true;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (d1 <= 30 && d1 >= 1) {
                        compruebaD1 = true;
                    } else {
                        compruebaD1 = false;
                    }
                }
                default -> {
                    compruebaD1 = false;
                }

            }

        }
        return compruebaD1;
    }

    static boolean CompruebaDate2(int d2, int mes2, int a2) {
        boolean compruebaD2 = true;
        if (a2 >= 0) {
            switch (mes2) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (d2 > 31 || d2 < 1) {
                        compruebaD2 = false;
                    } else {
                        compruebaD2 = true;
                    }

                }
                case 2 -> {
                    if (d2 > 28 || d2 < 1) {
                        compruebaD2 = false;
                    } else {
                        compruebaD2 = true;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (d2 <= 30 && d2 >= 1) {
                        compruebaD2 = true;
                    } else {
                        compruebaD2 = false;
                    }
                }
                default -> {
                    compruebaD2 = false;
                }

            }
        }
        return compruebaD2;
    }
}