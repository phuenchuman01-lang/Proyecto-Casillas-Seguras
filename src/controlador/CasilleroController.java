package controlador;

import modelo.Casillero;
import persistencia.JsonManager;
import java.util.List;

public class CasilleroController {

    private final List<Casillero> listaCasilleros;

    public CasilleroController() {  //Carga los 10 casilleros disponibles de forma automatica.
        this.listaCasilleros = JsonManager.cargarCasilleros();
    }

    public List<Casillero> obtenerTodosLosCasilleros() {        //Retorna los casilleros para la vista del admin.
        return this.listaCasilleros;
    }

    public Casillero buscarCasilleroPorEstudiante(String username) {    // Busca si un estudiante ya posee un casillero asignado
        for (Casillero c : listaCasilleros) {
            if (c.getUsernameDueño() != null && c.getUsernameDueño().equals(username)) {
                return c;
            }
        }
        return null;        //Estudiante sin casillero.
    }

    // ==========================================
    //   OPERACIONES DEL ESTUDIANTE / ADMIN
    // ==========================================

    public void registrarCasillero(int numero, String username) {
        Casillero c = obtenerCasilleroPorNumero(numero);
        if (c == null) throw new RuntimeException("Casillero no existente");

        if (!c.estaDisponible()){
            throw new RuntimeException("Casillero ya ocupado");
        }

        Casillero casilleroPrevio = buscarCasilleroPorEstudiante(username);
        if (casilleroPrevio != null) {
            throw new RuntimeException("El estudiante ya posee un casillero");
        }

        c.ocupar(username);
        JsonManager.guardarCasilleros(listaCasilleros);
    }

    public void agregarObjetoACasillero(int numero, String objeto) {
        Casillero c = obtenerCasilleroPorNumero(numero);
        if (c == null) throw new IllegalArgumentException("Casillero no encontrado.");

        c.agregarObjeto(objeto);
        JsonManager.guardarCasilleros(listaCasilleros);
    }

    public void quitarObjetoDeCasillero(int numero, String objeto) {
        Casillero c = obtenerCasilleroPorNumero(numero);
        if (c == null) throw new IllegalArgumentException("Casillero no encontrado.");

        boolean eliminado = c.quitarObjeto(objeto);
        if (!eliminado) {
            throw new IllegalArgumentException("El objeto no existía en el casillero.");
        }
        JsonManager.guardarCasilleros(listaCasilleros);
    }

    public void liberarCasillero(int numero) {
        Casillero c = obtenerCasilleroPorNumero(numero);
        if (c == null) throw new IllegalArgumentException("Casillero no encontrado.");

        c.liberar();
        JsonManager.guardarCasilleros(listaCasilleros);
    }

    // ==========================================
    //   OPERACIONES EXCLUSIVAS DEL ADMINISTRADOR
    // ==========================================

    public void moverContenidoDeCasillero(int numeroOrigen, int numeroDestino) {
        // Obtener casillero 'origen' y 'destino'. Validar que ambos existan.
        // Si el origen estaDisponible(), lanzar IllegalStateException (no hay nada que mover).
        // Si el destino NO esta Disponible, lanzar IllegalStateException (colisión).
        // Pasar los objetos al nuevo casillero de destino y verificar que este correcto para poder liberar el casillero de origen
        // Liberar el casillero de origen.
        // Guardar en el JSON.
    }

    public void enlazarEstudianteACasillero(int numero, String username) {
        // Validar que exista el casillero y que esté disponible.
        // Verificar que el estudiante no tenga ya otro casillero.
        // Ocupar el casillero.
        // Guardar en el JSON.
    }

    //metodo auxiliar

    private Casillero obtenerCasilleroPorNumero(int numero) {
        for (Casillero c : listaCasilleros) {
            if (c.getNumero() == numero) return c;
        }
        return null;
    }
}