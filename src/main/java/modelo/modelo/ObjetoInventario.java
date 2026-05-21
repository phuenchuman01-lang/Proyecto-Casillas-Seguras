package modelo;

public class ObjetoInventario {
    private String idObjeto;
    private String descripcion;
    private String categoria;

    public ObjetoInventario(String idObjeto, String descripcion, String categoria) {
        this.idObjeto = idObjeto;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getIdObjeto() { return idObjeto; }
    public void setIdObjeto(String idObjeto) { this.idObjeto = idObjeto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "[" + categoria + "] " + descripcion;
    }
}
