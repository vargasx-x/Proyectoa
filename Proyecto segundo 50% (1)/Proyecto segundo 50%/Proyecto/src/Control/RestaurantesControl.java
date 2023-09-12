package Control;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Restaurantes;

public class RestaurantesControl {

    private Restaurantes restaurantes;

    private ArrayList<Restaurantes> restaurantesList;
    // Crear una variable de instancia para el objeto Scanner

    public RestaurantesControl(ArrayList<Restaurantes> restaurantesList) {
        this.restaurantesList = restaurantesList;

    }

    public RestaurantesControl() {
        this.restaurantesList = new ArrayList<>(); // Inicializar la colección restaurantess con un ArrayList vacío

    }

    public ArrayList<Restaurantes> getRestaurantes() {
        return restaurantesList;
    }

    public void setrestaurantess(ArrayList<Restaurantes> restaurantesList) {
        this.restaurantesList = restaurantesList;
    }

    public void agregarRestaurantes(Restaurantes restaurantes) {
        String nombre = "", localidad = "", correoElectronico = "";
        long id = 0, telefono = 0;
        boolean valido = false;
        boolean resultado = false;
        Scanner sc = new Scanner(System.in);
        RestaurantesControl rc = new RestaurantesControl();

        System.out.println("Ingrese el nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese la Localidad");
        localidad = sc.nextLine();
        System.out.println("Ingrese el correro electronico");
        correoElectronico = sc.nextLine();
        while (!valido) {
            try {
                System.out.println("Ingrese la Identificacion");
                id = Long.parseLong(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;

        while (!valido) {
            try {
                System.out.println("Ingrese el telefono");
                telefono = Long.parseLong(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;

        resultado = rc.confirmarAgregarRestaurante(nombre, localidad, correoElectronico, id, telefono);
        if (resultado) {
            restaurantes = new Restaurantes(); // Crear un nuevo objeto restaurantess
            restaurantes.setNombre(nombre);
            restaurantes.setLocalidad(localidad);
            restaurantes.setCorreoElectronico(correoElectronico);
            restaurantes.setId(id);
            restaurantes.setTelefono(telefono);

            restaurantesList.add(restaurantes); // Agregar el restaurantes a la lista
            System.out.println("Agregado exitosamente");
        } else {
            System.out.println("Error al agregar");
        }
    }

    public void mostrarRestaurantes(ArrayList<Restaurantes> restaurantesList) {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < restaurantesList.size(); i++) {
            System.out
                    .println("[" + (i + 1) + "]" + restaurantesList.get(i).getNombre() + " "
                            + restaurantesList.get(i).getLocalidad());
        }
        while (!valido) {
            try {
                System.out.println(
                        "Por favor ingrese el número del chef que desea ver sus datos");
                num = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;
        if (num > 0 && num <= restaurantesList
                .size()) {
            System.out.println(
                    restaurantesList.get(num - 1)
                            .toStringRestaurante());
        } else {
            System.out.println(
                    "Comando ivalido");
        }

    }

    public boolean confirmarAgregarRestaurante(String nombre, String localidad, String correoElectronico, long id,
            long telefono) {
        restaurantes = new Restaurantes();
        restaurantes.setNombre(nombre);
        restaurantes.setLocalidad(localidad);
        restaurantes.setCorreoElectronico(correoElectronico);
        restaurantes.setId(id);
        restaurantes.setTelefono(telefono);

        if (restaurantes.getNombre().equalsIgnoreCase(nombre) && restaurantes.getLocalidad().equalsIgnoreCase(localidad)
                && restaurantes.getCorreoElectronico().equalsIgnoreCase(correoElectronico)
                && restaurantes.getId() == id
                && restaurantes.getTelefono() == telefono) {
            return true;
        }
        return false;

    }

    public void restaurantesEstablecido(ArrayList<Restaurantes> RestaurantesList) {
        Restaurantes c1 = new Restaurantes("SalsaBor", "Santa Barbara", "salsabor2341@RODVAR.com", 101010L,1800918080L);
        Restaurantes c2 = new Restaurantes("ResCar", "Venecia", "rescar23@RODVAR.com", 202020L, 123821912L);
        Restaurantes c3 = new Restaurantes("Sabor del Lago", "El laguito", "sarlago45@RODVAR.com", 303030L, 123123123L);
        Restaurantes c4 = new Restaurantes("UP Restaurant", " UPTC", "uprest90@RODVAR.com", 404040L, 123812381L);
        Restaurantes c5 = new Restaurantes("Sabor del Magdalena", "Magdalena", "magdasabor01", 505050L, 41987386123L);
        restaurantesList.add(c1);
        restaurantesList.add(c2);
        restaurantesList.add(c3);
        restaurantesList.add(c4);
        restaurantesList.add(c5);
    }
}
