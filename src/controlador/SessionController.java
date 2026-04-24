package controlador;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class SessionController {

    private final List<Usuario> usuariosRegistrados = new ArrayList<>();
    private Usuario usuarioActual;

    public SessionController() {
        // Inicializar la lista con el usuario admin (DOCENTE) y un alumno de prueba.
        usuariosRegistrados.add(new Usuario("admin", "admin123", "DOCENTE"));
        usuariosRegistrados.add(new Usuario("alumno", "test1234", "ESTUDIANTE"));
    }

    public boolean iniciarSesion(String u, String p) {
        // Si el usuario o la contraseña son nulos o están vacíos, retorna false inmediatamente.
        if (u == null || u.trim().isEmpty() || p == null || p.trim().isEmpty()) {
            return false;
        }
            // Crear un ciclo FOR que recorra 'usuariosRegistrados'.
        for (Usuario usuario : usuariosRegistrados) {
            // Validar si las credenciales coinciden y asignar el usuario actual
            if (usuario.validarCredenciales(u, p)) {
                // Asignar el 'usuarioActual'
                this.usuarioActual = usuario;
                return true; // Retorna true porque se encontró el usuario
                }
            }
            return false;
    }

    public void registrarEstudiante(String u, String p) {
        // Crear la lógica para agregar un nuevo ESTUDIANTE a la lista.
        Usuario nuevoEstudiante = new Usuario(u, p, "ESTUDIANTE");
        usuariosRegistrados.add(nuevoEstudiante);
        // Recuerda lanzar un IllegalArgumentException si los campos están vacíos.
        if (u == null || u.trim().isEmpty() || p == null || p.trim().isEmpty()) {
            throw new IllegalArgumentException("El usuario y la contraseña no pueden estar vacíos.");
        }
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
}