package Control;

import Model.Persona;

public class PersonaControl {
    private Persona persona;

    public boolean confirmarAgregarPersona(String nombre, String apellido, long id,
            long telefono) {
        persona = new Persona();

        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setId(id);
        persona.setTelefono(telefono);

        if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)
                && persona.getId() == id
                && persona.getTelefono() == telefono) {
            return true;
        }
        return false;

    }

}