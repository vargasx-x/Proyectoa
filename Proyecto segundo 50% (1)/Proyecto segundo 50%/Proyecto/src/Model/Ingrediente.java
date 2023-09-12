package Model;
import java.util.ArrayList;

public class Ingrediente {
    private String nombre;
    private String unidad;
    private double precioPorUnidad;
    private String lugarDeCompra;
    private int caloriasPorUnidad;

    public Ingrediente(String nombre, String unidad, double precioPorUnidad, String lugarDeCompra, int caloriasPorUnidad) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.precioPorUnidad = precioPorUnidad;
        this.lugarDeCompra = lugarDeCompra;
        this.caloriasPorUnidad = caloriasPorUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public String getLugarDeCompra() {
        return lugarDeCompra;
    }

    public int getCaloriasPorUnidad() {
        return caloriasPorUnidad;
    }
}
