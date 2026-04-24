package modelo;

public class Usuario {
    private String nombre;
    private String contrasena;
    private String rol;
    private boolean cuentaValidada;

    public Usuario(String nombre, String contrasena, String rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
        this.cuentaValidada = false;
    }

    public boolean validarCredenciales(String user, String pass) {
        return this.nombre.equals(user) && this.contrasena.equals(pass);
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public boolean isCuentaValidada() {
        return cuentaValidada;
    }

    public void setCuentaValidada(boolean cuentaValidada) {
        this.cuentaValidada = cuentaValidada;
    }
}
