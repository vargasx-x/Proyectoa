package Model;
import java.util.ArrayList;

public class Receta {
    private String nombre;
    private int tiempoPreparacionHoras;
    private int personas;
    private ArrayList<Ingrediente> ingredientes;

    public Receta(String nombre, int tiempoPreparacionHoras, int personas, ArrayList<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.tiempoPreparacionHoras = tiempoPreparacionHoras;
        this.personas = personas;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacionHoras() {
        return tiempoPreparacionHoras;
    }

    public int getPersonas() {
        return personas;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
