import java.util.Scanner;

public class LoginDos {
    public static void main(String[] args) {
        String nombre = "", edad = "";
        String usuario_ing = "", pass_ing = "", usuario_final;
        String usuario = "", pass = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextLine();

        System.out.println("Ingrese una Contraseña segura: ");
        pass = entrada.nextLine();

        usuario_final = nombre.substring(0,3) + edad.substring(0,1);
        System.out.println("Se ha generado su nombre de Usuario: " + usuario_final);

        System.out.println("Ingrese su nombre de Usuario: ");
        usuario_ing = entrada.nextLine();

        System.out.println("Ingrese su contraseña: ");
        pass_ing = entrada.nextLine();

        if(usuario_ing.equalsIgnoreCase(usuario_final) && pass_ing.equals(pass)){
            System.out.println("Inicio de sesion correcto..");
        }else{
            System.out.println("Nombre de Usuario o Contraseña incorrectos..");
            System.out.println("intentelo nuevamente..");
        }
    }
}
