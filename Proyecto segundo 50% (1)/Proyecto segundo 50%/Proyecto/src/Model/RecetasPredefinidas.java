package Model;
import java.util.ArrayList;

public class RecetasPredefinidas {
    public static Receta crearEnsaladaCesar() {
        ArrayList<Ingrediente> ingredientesEnsaladaCesar = new ArrayList<>();
        ingredientesEnsaladaCesar.add(new Ingrediente("Lechuga", "gramos", 0.2, "Mercado local", 10));
        ingredientesEnsaladaCesar.add(new Ingrediente("Pollo a la parrilla", "gramos", 0.6, "Supermercado A", 250));
        ingredientesEnsaladaCesar.add(new Ingrediente("Pan tostado", "unidades", 0.1, "Panadería C", 80));
        ingredientesEnsaladaCesar.add(new Ingrediente("Salsa César", "mililitros", 0.5, "Supermercado B", 120));

        return new Receta("Ensalada César", 1, 2, ingredientesEnsaladaCesar);
    }

    public static Receta crearSopaTomate() {
        ArrayList<Ingrediente> ingredientesSopaTomate = new ArrayList<>();
        ingredientesSopaTomate.add(new Ingrediente("Tomates", "gramos", 0.4, "Mercado local", 40));
        ingredientesSopaTomate.add(new Ingrediente("Cebolla", "gramos", 0.2, "Mercado local", 20));
        ingredientesSopaTomate.add(new Ingrediente("Caldo de pollo", "mililitros", 0.4, "Supermercado A", 30));
        ingredientesSopaTomate.add(new Ingrediente("Crema", "mililitros", 0.5, "Supermercado B", 80));

        return new Receta("Sopa de Tomate", 1, 4, ingredientesSopaTomate);
    }

    public static Receta crearPizzaMargarita() {
        ArrayList<Ingrediente> ingredientesPizzaMargarita = new ArrayList<>();
        ingredientesPizzaMargarita.add(new Ingrediente("Masa de pizza", "gramos", 0.3, "Panadería C", 200));
        ingredientesPizzaMargarita.add(new Ingrediente("Salsa de tomate", "mililitros", 0.3, "Supermercado B", 40));
        ingredientesPizzaMargarita.add(new Ingrediente("Mozzarella", "gramos", 0.4, "Supermercado A", 180));
        ingredientesPizzaMargarita.add(new Ingrediente("Albahaca fresca", "gramos", 0.1, "Mercado local", 5));

        return new Receta("Pizza Margarita", 1, 4, ingredientesPizzaMargarita);
    }

    public static Receta crearSushi() {
        ArrayList<Ingrediente> ingredientesSushi = new ArrayList<>();
        ingredientesSushi.add(new Ingrediente("Arroz para sushi", "gramos", 0.4, "Supermercado B", 180));
        ingredientesSushi.add(new Ingrediente("Salmón fresco", "gramos", 0.8, "Pescadería D", 250));
        ingredientesSushi.add(new Ingrediente("Alga nori", "unidades", 0.2, "Tienda de productos asiáticos", 30));
        ingredientesSushi.add(new Ingrediente("Aguacate", "unidades", 0.6, "Mercado local", 120));

        return new Receta("Sushi", 2, 2, ingredientesSushi);
    }
}
