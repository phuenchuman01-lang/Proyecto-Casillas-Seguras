package modelo;

import java.util.ArrayList;
import java.util.List;

public class Casillero {
    private int numero;
    private String estado;
    private Usuario usuarioAsignado;
    private List<Item> inventario;

    public Casillero(int numero) {
        this.numero = numero;
        this.estado = "Disponible";
        this.inventario = new ArrayList<>();
    }

    public void asignarUsuario(Usuario usuario) {
        this.usuarioAsignado = usuario;
        this.estado = "Ocupado";
    }

    public void agregarItem(Item objeto) {
        if (estado.equals("Ocupado")) {
            this.inventario.add(objeto);
        }
    }

    public int getNumero() { return numero; }
    public String getEstado() { return estado; }
    public List<Item> getInventario() { return inventario; }

    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        String info = "Casillero #" + numero + " [" + estado + "]";
        if (usuarioAsignado != null) {
            info += " - Usuario: " + usuarioAsignado.getNombre();
        }
        return info;
    }
}
