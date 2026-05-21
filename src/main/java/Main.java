import modelo.Usuario;
import modelo.Casillero;
import modelo.ObjetoInventario;
import modelo.AsignacionCasillero;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulandor Sistema Casillas-Seguras ===");


        Usuario estudiante = new Usuario("21.744.405-5", "Katherine Llanquinao", "k.llanquinao01@ufromail.cl", "Ingeniería Civil Informática");
        System.out.println("Estudiante registrado: " + estudiante);


        Casillero casillero = new Casillero("A-10");
        System.out.println("Estado inicial: " + casillero);


        AsignacionCasillero asignacion = new AsignacionCasillero(estudiante, casillero);
        System.out.println(asignacion);
        System.out.println("Estado post-asignación: " + casillero);

        ObjetoInventario mochila = new ObjetoInventario("OBJ-01", "Mochila con cuadernos", "General");
        ObjetoInventario notebook = new ObjetoInventario("OBJ-02", "Notebook Asus", "Electrónico");

        casillero.agregarObjeto(mochila);
        casillero.agregarObjeto(notebook);

        System.out.println("Estado final: " + casillero);
    }
}