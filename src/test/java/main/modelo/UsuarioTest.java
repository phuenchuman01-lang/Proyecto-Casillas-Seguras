package main.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testValidarCredencialesCorrectas() {

        Usuario estudiante = new Estudiante("192837", "Pablo Clavito", "pablo.c", "pass123", "Mecánica");


        assertTrue(estudiante.validarCredenciales("pablo.c", "pass123"),
                "El login debería ser exitoso con las credenciales correctas.");
    }

    @Test
    void testValidarCredencialesIncorrectas() {

        Usuario docente = new Docente("0000", "Profe Pedrito", "admin.p", "admin123");


        assertFalse(docente.validarCredenciales("admin.p", "claven't"),
                "El login debería fallar si la contraseña es incorrecta.");


        assertFalse(docente.validarCredenciales("admin't", "admin123"),
                "El login debería fallar si el nombre de usuario es incorrecto.");
    }

    @Test
    void testAsignacionAutomaticaDeRoles() {
        Usuario estudiante = new Estudiante("111", "Ana", "ana1", "pass", "Informática");
        Usuario docente = new Docente("222", "Ene", "ene2", "pass");


        assertEquals("estudiante", estudiante.getRol());
        assertEquals("docente", docente.getRol());
    }
}