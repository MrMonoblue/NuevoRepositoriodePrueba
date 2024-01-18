package programacion;

import java.util.Scanner;

public class Programacion {

    public static void main(String[] args) {
        //declaramos las variables y guardamos los valores por defecto.
        boolean login;
        String nombreDeUsuario = "usuario1";
        String contraseña = "asdfg";

        //llamamos a la funcion que va a verificar los datos
        login = logear(nombreDeUsuario, contraseña);
        
        //Al volver de la función nos imprimirá un mensaje dependiendo del valor de retorno.
        if(login){
            System.out.println("Bienvenido " + nombreDeUsuario);
        }else{
            System.out.println("Alerta¡ Intruso¡");
        }
    }

    //funcion booleana que devolverá si se ha verificado la informacion
    static boolean logear(String user, String pass) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        boolean login = false;
        //inicializamos un for con limite de indices 2 (ya que 0->2 = 3 posiciones)
        //y como condición de salida adicional, verificamos que login siga siendo false para ahorrarnos un break.
        for (int i = 0; i <= 2 && login == false; i++) {
            System.out.println("Nombre de usuario?");
            String username = sc.nextLine();
            System.out.println("introduzca su contraseña");
            String password = sc.nextLine();
            if (user.equals(username) && pass.equals(password)) {
                login = true;
            }
            if (!user.equals(username) && !pass.equals(login) && intentos < 3) {
                login = false;
                intentos++;
            }
            if (!user.equals(username) && !pass.equals(login) && intentos == 3) {
                login = false;
                System.out.println("pongase en contacto con el administrador");
            }

        }
        
        //devolvemos el valor que haya obtenido el booleano al salir del for.
        return login;

    }

}