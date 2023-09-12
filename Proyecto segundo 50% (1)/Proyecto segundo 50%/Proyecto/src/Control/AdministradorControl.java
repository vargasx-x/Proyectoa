package Control;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Administradores;

public class AdministradorControl {
    private Administradores administradores;
    private ArrayList<Administradores> administradoresList;

    public AdministradorControl(ArrayList<Administradores> administradoresList) {
        this.administradoresList = administradoresList;

    }

    public AdministradorControl() {
        this.administradoresList = new ArrayList<>(); // Inicializar la colección admins con un ArrayList vacío

    }

    public ArrayList<Administradores> getAdministradores() {
        return administradoresList;
    }

    public void setAdministradores(ArrayList<Administradores> administradores) {
        this.administradoresList = administradores;
    }

    public void agregarAdministradores(Administradores administradores) {
        String nombre = "", apellido = "", usuario = "", password = "";
        long id = 0, telefono = 0;
        boolean valido = false;
        boolean resultado = false;
        Scanner sc = new Scanner(System.in);
        PersonaControl pc = new PersonaControl();
        System.out.println("Ingrese el nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido");
        apellido = sc.nextLine();
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
        usuario = usuarioAdministrador(nombre, apellido, id);
        password = passwordAdministrador(nombre, apellido, id);

        resultado = pc.confirmarAgregarPersona(nombre, apellido, id, telefono);
        if (resultado) {
            administradores = new Administradores(); // Crear un nuevo objeto admins
            administradores.setNombre(nombre);
            administradores.setApellido(apellido);
            administradores.setId(id);
            administradores.setTelefono(telefono);
            administradores.setUsuario(usuario);
            administradores.setPassword(password);

            administradoresList.add(administradores); // Agregar el admin
            System.out.println("Agregado exitosamente");
            System.out.println(" usuario asignado: " + usuario);
            System.out.println("password asignada: " + password);
        } else {
            System.out.println("Error al agregar");
        }
    }

    // para mostrar los administradores
    public void mostrarAdministradores(ArrayList<Administradores> administradoresList) {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < administradoresList.size(); i++) {
            System.out
                    .println("[" + (i + 1) + "]" + administradoresList.get(i).getNombre() + " "
                            + administradoresList.get(i).getApellido());
        }
        while (!valido) {
            try {
                System.out.println(
                        "Por favor ingrese el número del administrador que desea ver sus datos");
                num = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Digito invalido, por favor ingrese un dato valido");
            }
        }
        valido = false;
        if (num > 0 && num <= administradoresList
                .size()) {
            System.out.println(
                    administradoresList.get(num - 1)
                            .toStringPersona());
        } else {
            System.out.println(
                    "Comando ivalido");
        }

    }

    // el login del super admin
    public void sesionSuperAdmin() {
        Scanner sc = new Scanner(System.in);
        String admin = "admin", password = "password";
        int w = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Muy buenos dias, por favor inicie sesion");
            System.out.println("Ingrese su usuario");
            String admin2 = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String password2 = sc.nextLine();
            if (admin2.equals(admin) && password2.equals(password)) {
                System.out.println("Bienvenido");
                break;
            } else {
                if (i < 5) {
                    System.out.println(
                            "contraseña incorrecta, vuelve a intentar");
                    System.out.println("le quedan [" + (5 - (i))
                            + "] Intentos");
                } else {
                    System.out.println(
                            "Ha agotado todos los intentos, la plataforma se ha bloqueado");
                    w = 10;
                    System.exit(i);
                }
            }
        }
    }

    public static String usuarioAdministrador(String nombre, String apellido, long id) {
        String user = nombre + String.valueOf(id).substring(String.valueOf(id).length() - 2) + apellido + "@RODVAR.com";
        return user;
    }

    public static String passwordAdministrador(String nombre, String apellido, long id) {
        String password = nombre.substring(0, 2) +
                String.valueOf(id).substring(String.valueOf(id).length() - 4) +
                apellido.substring(apellido.length() - 2);
        password = password.replace("4", "A");
        password = password.replace('0', 'O');
        return password;
    }

    public boolean confirmarAgregarPersona(String nombre, String apellido, long id, long telefono) {
        administradores = new Administradores();

        administradores.setNombre(nombre);
        administradores.setApellido(apellido);
        administradores.setId(id);
        administradores.setTelefono(telefono);
        if (administradores.getNombre().equalsIgnoreCase(nombre)
                && administradores.getApellido().equalsIgnoreCase(apellido)
                && administradores.getId() == id
                && administradores.getTelefono() == telefono) {
            return true;
        }
        return false;

    }

}
