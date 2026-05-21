package modelo;

public class Usuario {
    private String rut;
    private String nombre;
    private String correo;
    private String carrera;

    public Usuario(String rut, String nombre, String correo, String carrera) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() {
        return nombre + " (" + carrera + ") - RUT: " + rut;
    }
}