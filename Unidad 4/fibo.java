public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que termino de la secuencia desea saber: ");
        int n = sc.nextInt();
        /* Declaramos la variable n de tipo int y la igualamos al input dle usuario */
        n = fibo(n);
        /* igualamos la variable n al resultado de la funcion */
        System.out.println(n);
    }

    static int fibo(int n) {
        /* importante al definir la funcion definir la variable y su tipo */
        if (n == 1) {
            /* caso base donde le indicamos cuando debe detenerse la recursividad */
            return 1;
        } else if (n == 0) {
            /* segundo caso base si es necesario */
            return 0;
        } else {
            n = fibo(n - 1) + fibo(n - 2);
            /*ejecuta n veces el 'loop' y va dumando los numeros 1 y 2 veces inferiores  hasta llegar al caso base que rompe la recursividad (linea 16)*/
        }
        return n;
        /* reasigna el valor obtenido en el bucle a la variable n */
    }

}