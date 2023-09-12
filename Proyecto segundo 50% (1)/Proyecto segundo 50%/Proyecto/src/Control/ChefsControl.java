package Control;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Chefs;

public class ChefsControl {

    private ArrayList<Chefs> chefsList;
    // Crear una variable de instancia para el objeto Scanner

    public ChefsControl(ArrayList<Chefs> chefsList) {
        this.chefsList = chefsList;

    }

    public ChefsControl() {
        this.chefsList = new ArrayList<>(); // Inicializar la colección chefs con un ArrayList vacío

    }

    public ArrayList<Chefs> getChefs() {
        return chefsList;
    }

    public void setChefs(ArrayList<Chefs> chefsList) {
        this.chefsList = chefsList;
    }

    public void agregarChefs(Chefs chef) {
        String nombre = "", apellido = "", usuario = "", password = "";
        long id = 0, telefono = 0;
        boolean valido = false;
        boolean resultado = false;
        Scanner sc = new Scanner(System.in);
        PersonaControl pc = new PersonaControl();
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su Apellido");
        apellido = sc.nextLine();
        while (!valido) {
            try {
                System.out.println("Ingrese su Identificacion");
                id = Long.parseLong(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;

        while (!valido) {
            try {
                System.out.println("Ingrese su telefono");
                telefono = Long.parseLong(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;

        resultado = pc.confirmarAgregarPersona(nombre, apellido, id, telefono);
        if (resultado) {
            chef = new Chefs(); // Crear un nuevo objeto Chefs
            chef.setNombre(nombre);
            chef.setApellido(apellido);
            chef.setId(id);
            chef.setTelefono(telefono);
            chef.setUsuario(usuario);
            chef.setPassword(password);

            chefsList.add(chef); // Agregar el chef a la lista
            System.out.println("Agregado exitosamente");
            System.out.println(" usuario asignado: " + usuario);
            System.out.println("password asignada: " + password);
            System.out.println("Por favor sea pasciente mientras lo asignamos a un restaurante");
        } else {
            System.out.println("Error al agregar");
        }
    }

    public void mostrarChefs(ArrayList<Chefs> chefsList) {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < chefsList.size(); i++) {
            System.out
                    .println("[" + (i + 1) + "]" + chefsList.get(i).getNombre() + " " + chefsList.get(i).getApellido());
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
        if (num > 0 && num <= chefsList
                .size()) {
            System.out.println(
                    chefsList.get(num - 1)
                            .toStringPersona());
        } else {
            System.out.println(
                    "Comando ivalido");
        }

    }

    public static String usuarioChef(String nombre, String apellido, long id) {
        String user = nombre + String.valueOf(id).substring(String.valueOf(id).length() - 2) + apellido + "@RODVAR.com";
        return user;
    }

    public static String passwordChef(String nombre, String apellido, long id) {
        String password = nombre.substring(0, 2) +
                String.valueOf(id).substring(String.valueOf(id).length() - 4) +
                apellido.substring(apellido.length() - 2);
        password = password.replace("4", "A");
        password = password.replace('0', 'O');
        return password;
    }
   

    public void chefsEstablecido(ArrayList<Chefs> chefsList) {
        Chefs c1 = new Chefs("Julian", "Tapias", 1010L, 3229803452L, "Julian10Tapias@RODVAR.com", "Ju1O1Oas");
        Chefs c2 = new Chefs("Karen", "Rosas", 2020L, 1890234563L, "Karen20Rosas@RODVAR.com", "Ka2O2Oas");
        Chefs c3 = new Chefs("Carlos", "Vargas", 3030L, 3214567823L, "Carlos30Vargas@RODVAR.com", "Va3O3Oas");
        Chefs c4 = new Chefs("Mildred", "Piñeros", 4040, 3479087213L, "Mildred40Piñeros@RODVAR.com", "Mi4O4Oos");
        Chefs c5 = new Chefs("Walter", "Silva", 5050, 3214589032L, "Walter50Silva@RODVAR.com", "Wa5O5Ova");
        chefsList.add(c1);
        chefsList.add(c2);
        chefsList.add(c3);
        chefsList.add(c4);
        chefsList.add(c5);
    }

}
