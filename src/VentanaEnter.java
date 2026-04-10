import javax.swing.JFrame; //biblioteca para las ventanas
//La idea de esta ventana sera dar una bienvenida a los usuarios. se pude registrar o iniciar sesion. Por ahora esta en blanco.
public class VentanaEnter {
    private JFrame frame;
    public VentanaEnter() {
        frame = new JFrame("Casillas Seguras - Inicio");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarVentana() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}