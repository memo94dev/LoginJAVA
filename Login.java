import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        String usuario = "", pass = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre de Usuario: ");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su nombre de Contraseña: ");
        pass = entrada.nextLine();

        if(usuario.equalsIgnoreCase("memo") && pass.equals("12345")){
            System.out.println("Inicio de sesion correcto..");
        }else{
            System.out.println("Nombre de Usuario o Contraseña incorrectos..");
            System.out.println("intentelo nuevamente..");
        }
    }
}