
import java.util.Scanner;
public class 2.1 {

    public static void main (String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		while (numero != 0) {
			//el bucle funcionará hasta que el usuario le introduzca un 0.
			
			if (numero > 0) {
                System.out.println("Su numero " + numero + " es positivo");
				//si el numero introducido es mayor que 0 le imprimiremos que es positivo
			} 
            else { 
                System.out.println("Su numero " + numero + " es negativo");
				//si la condición del if sale false, imprimimos que el numero es negativo
			}
                        
			if (numero %2 == 0){
				System.out.println("Su numero " + numero + " es par");
				//si se comprueba que el modulo entre el numero y 2 es 0 determinamos que el numero es par
			}
			else{
				System.out.println("Su numero " + numero + " es impar");
				//si la condicion de este if da false imprimimos que es impar
			}                        
			
			System.out.println("El cuadrado de " + numero + " es " + (numero*numero));
			//imprimimos el resultante de las operaciones arriba mencionadas
			break;
			//salimos del bucle y volvemos a preguntar por un numero al usuario.
		
		}   
		
        
	}

}