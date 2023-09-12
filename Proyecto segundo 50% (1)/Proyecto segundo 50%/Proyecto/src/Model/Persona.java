package Model;

public class Persona {
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;

    private long id;
    private long telefono;

    public Persona(String nombre, String apellido, long id, long telefono, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.id = id;
        this.telefono = telefono;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String toStringPersona() {
        return "\n Informacion" + "\nNombre :" + nombre + "\nApellido: " + apellido + "\nid: " + id
                + "\nTelefono: " + telefono + "\nUsuario: " + usuario + "\nPassword: " + password;

    }

}
