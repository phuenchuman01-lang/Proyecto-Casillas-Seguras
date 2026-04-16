package vista;

import controlador.SessionController;
import javax.swing.*;
import java.awt.*;

public class MenuEstudiante {
    private JFrame frame = new JFrame("Panel de Estudiante");

    public MenuEstudiante(SessionController session) {
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Bienvenido Alumno: " + session.getUsuarioActual().getUsername(), SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titulo, BorderLayout.NORTH);

        JButton btnRegistrarCasillero = new JButton("Registrar mi Casillero");
        frame.add(btnRegistrarCasillero, BorderLayout.CENTER);

        JButton btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.addActionListener(e -> {
            session.cerrarSesion();
            frame.dispose();
            new VentanaLogin(session).mostrarVentana();
        });
        frame.add(btnCerrarSesion, BorderLayout.SOUTH);
    }

    public void mostrarVentana() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}