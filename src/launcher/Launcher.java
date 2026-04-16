package launcher;

import controlador.SessionController;
import vista.VentanaLogin;

public class Launcher {
    public static void main(String[] args) {
        // 1. Creamos el controlador (que ya tiene a tu admin adentro)
        SessionController sesionGlobal = new SessionController();

        // 2. Le pasamos el controlador a la ventana
        VentanaLogin ventana = new VentanaLogin(sesionGlobal);
        ventana.mostrarVentana();
    }
}