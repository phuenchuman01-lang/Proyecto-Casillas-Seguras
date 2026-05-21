package modelo;

import java.time.LocalDate;

public class AsignacionCasillero {
    private Usuario estudiante;
    private Casillero casillero;
    private LocalDate fechaAsignacion;

    public AsignacionCasillero(Usuario estudiante, Casillero casillero) {
        this.estudiante = estudiante;
        this.casillero = casillero;
        this.fechaAsignacion = LocalDate.now();
        this.casillero.setEstado("Ocupado");
    }

    public Usuario getEstudiante() { return estudiante; }
    public Casillero getCasillero() { return casillero; }
    public LocalDate getFechaAsignacion() { return fechaAsignacion; }

    @Override
    public String toString() {
        return "Asignación: " + estudiante.getNombre() + " -> Casillero " + casillero.getIdCasillero();
    }
}
