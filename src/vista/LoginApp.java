package vista;

import modelo.Usuario;
import java.util.Scanner;

    public class LoginApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Usuario admin = new Usuario("funcionario_ufro", "1234", "Funcionario");

            System.out.println("--- BIENVENIDO A CASILLAS-SEGURAS ---");
            System.out.print("Ingrese nombre: ");
            String user = sc.nextLine();

            System.out.print("Ingrese pass: ");
            String pass = sc.nextLine();

            if (admin.validarCredenciales(user, pass)) {
                admin.setCuentaValidada(true);
                System.out.println("Acceso correcto como: " + admin.getRol());
            } else {
                System.out.println("Credenciales inválidas.");
            }
        }
    }
