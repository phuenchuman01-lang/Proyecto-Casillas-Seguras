import modelo.Usuario;
public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("katherine", "ufro2026", "Estudiante");

        System.out.println("--- Bienvenido a Casillas-Seguras ---");
        System.out.println("Usuario registrado: " + user1.getUsername());

        String intentoUsuario = "katherine";
        String intentoPass = "ufro2026";

        if (user1.validarCredenciales(intentoUsuario, intentoPass)) {
            System.out.println("Login exitoso. Rol: " + user1.getRol());
        } else {
            System.out.println("Error: Credenciales incorrectas.");
        }

        System.out.println("\nProbando con contraseña errónea...");
        if (user1.validarCredenciales("katherine", "12345")) {
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Acceso denegado. El sistema funciona correctamente.");
        }
    }
}