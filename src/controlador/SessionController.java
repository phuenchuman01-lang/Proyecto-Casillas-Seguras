package controlador;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class SessionController {

    private final List<Usuario> usuariosRegistrados = new ArrayList<>();
    private Usuario usuarioActual;

    public SessionController() {
        // Inicializar la lista con el usuario admin (DOCENTE) y un alumno de prueba.
    }

    public boolean iniciarSesion(String u, String p) {
        // Crear un ciclo FOR que recorra 'usuariosRegistrados'.
        // Validar si las credenciales coinciden y asignar el 'usuarioActual'.

        return false; // Retorno temporal para que no marque error
    }

    public void registrarEstudiante(String u, String p) {
        // Crear la lógica para agregar un nuevo ESTUDIANTE a la lista.
        // Recuerda lanzar un IllegalArgumentException si los campos están vacíos.
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
}