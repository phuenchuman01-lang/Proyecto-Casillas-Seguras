package modelo;

import java.util.ArrayList;
import java.util.List;

public class Casillero {
    private String idCasillero;
    private String estado;
    private List<ObjetoInventario> inventario;

    public Casillero(String idCasillero) {
        this.idCasillero = idCasillero;
        this.estado = "Disponible";
        this.inventario = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoInventario objeto) {
        this.inventario.add(objeto);
    }

    public void vaciarInventario() {
        this.inventario.clear();
    }

    public String getIdCasillero() { return idCasillero; }
    public void setIdCasillero(String idCasillero) { this.idCasillero = idCasillero; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<ObjetoInventario> getInventario() { return inventario; }

    @Override
    public String toString() {
        return "Casillero N°: " + idCasillero + " | Estado: " + estado + " | Objetos: " + inventario.size();
    }
}