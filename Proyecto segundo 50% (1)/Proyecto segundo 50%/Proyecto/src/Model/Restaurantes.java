package Model;

public class Restaurantes {
    private String nombre;
    private String localidad;
    private String correoElectronico;
    private long id;
    private long telefono;

    public Restaurantes(String nombre, String localidad, String correoElectronico, long id, long telefono) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.correoElectronico = correoElectronico;
        this.id = id;
        this.telefono = telefono;

    }

    public Restaurantes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public String toStringRestaurante() {
        return "\nInformación" + "\nNombre: " + nombre + "\nApellido: " + localidad + "\nCorreo Electronico"
                + correoElectronico + "\nid: " + id
                + "\nTelefono: " + telefono;

    }
}
