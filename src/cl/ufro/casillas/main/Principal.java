package cl.ufro.casillas.main;

import modelo.Usuario;
import modelo.Casillero;
import modelo.Item;

    public class Principal {
        public static void main(String[] args) {
            Usuario estudianteMecanica = new Usuario("Bastian_UFRO", "12345", "Estudiante");
            Casillero casilleroD1 = new Casillero(101);

            System.out.println("--- Iniciando Casillas-Seguras ---");
            String userDigitado = "Bastian_UFRO";
            String passDigitada = "12345";

            if (estudianteMecanica.validarCredenciales(userDigitado, passDigitada)) {
                System.out.println("Login exitoso. Bienvenido, " + estudianteMecanica.getNombre());
                casilleroD1.asignarUsuario(estudianteMecanica);
                casilleroD1.agregarItem(new Item("Kit de Llaves", "Llaves Allen punta de bola"));

                System.out.println("Estado actual: " + casilleroD1.toString());
            } else {
                System.out.println("Error de autenticación.");
            }
        }
    }

