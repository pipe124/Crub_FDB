
package modelo;

public class Administrador {
    private int id_administrador;
    private String nombre;
    private String correo;
    private String contraseña;

    // Constructor vacío
    public Administrador() {
    }

    // Constructor completo
    public Administrador(int id_administrador, String nombre, String correo, String contraseña) {
        this.id_administrador = id_administrador;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}