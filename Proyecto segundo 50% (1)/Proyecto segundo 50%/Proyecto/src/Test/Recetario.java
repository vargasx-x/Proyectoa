package Test;

import java.util.ArrayList;
import java.util.Scanner;
import Control.AdministradorControl;
import Control.ChefsControl;
import Control.RestaurantesControl;
import Model.Administradores;
import Model.Chefs;
import Model.RecetasPredefinidas;
import Model.Receta;
import Model.Restaurantes;

public class Recetario {
    public static void main(String[] args) {
        int opcion = 0;
        boolean valido = false;
        Scanner sc = new Scanner(System.in);
        Chefs chefs = new Chefs();
        ChefsControl chefsControl = new ChefsControl();
        Administradores admins = new Administradores();
        AdministradorControl adminControl = new AdministradorControl();
        Restaurantes restaurantes = new Restaurantes();
        RestaurantesControl restaurantesControl = new RestaurantesControl();

        Receta ensaladaCesar = RecetasPredefinidas.crearEnsaladaCesar();
        Receta sopaTomate = RecetasPredefinidas.crearSopaTomate();
        Receta pizzaMargarita = RecetasPredefinidas.crearPizzaMargarita();
        Receta sushi = RecetasPredefinidas.crearSushi();
        

        while (opcion != 5) {
            while (!valido) {
                try {
                    System.out.println("Ingrese la opción a realizar:" +
                            "\n1. Ingresar como administrador principal" +
                            "\n2. Registrar como chef" +
                            "\n3. Ingresar como administrador de restaurante" +
                            "\n4. Ingresar como chef de restaurante" +
                            "\n5. Salir");
                    opcion = Integer.parseInt(sc.nextLine());
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. Ingrese una opción válida.");
                }
            }
            valido = false;

            switch (opcion) {
                case 1:
                    adminControl.sesionSuperAdmin();

                    int adminOpcion = 0;
                    while (adminOpcion != 3) {
                        while (!valido) {
                            try {
                                System.out.println("Ingrese la opción a realizar:" +
                                        "\n1. Crear cadena de restaurantes" +
                                        "\n2. Volver" +
                                        "\n3. Terminar programa");
                                adminOpcion = Integer.parseInt(sc.nextLine());
                                valido = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Número inválido. Ingrese una opción válida.");
                            }
                        }
                        valido = false;

                        switch (adminOpcion) {
                            case 1:
                                restaurantesControl.agregarRestaurantes(restaurantes);
                                System.out.println("Agregue un administrador para gestionar el lugar");
                                adminControl.agregarAdministradores(admins);
                                break;
                            case 2:
                                break;
                            case 3:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }
                    break;

                case 2:
                    chefsControl.agregarChefs(chefs);
                    break;

                case 3:
                    restaurantesControl.mostrarRestaurantes(restaurantesControl.getRestaurantes());
                    break;

                case 4:
                    // Implementar el ingreso como chef de restaurante
                    break;

                case 5:
                    sc.close();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
