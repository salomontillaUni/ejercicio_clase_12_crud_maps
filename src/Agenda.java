import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
    public static void main(String[] args) {
        // TreeMap para que los contactos se ordenen alfabéticamente por el nombre.
        Map<String, String> agenda = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú
            System.out.println("\n--- Menú de la Agenda ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar número por nombre");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de la entrada

            switch (opcion) {
                case 1:
                    // Agregar contacto
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono de " + nombre + ": ");
                    String numero = scanner.nextLine();
                    agenda.put(nombre, numero);
                    System.out.println("Contacto agregado.");
                    break;

                case 2:
                    // Buscar número por nombre
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    if (agenda.containsKey(nombreBuscar)) {
                        System.out.println("El número de " + nombreBuscar + " es: " + agenda.get(nombreBuscar));
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;

                case 3:
                    // Eliminar contacto
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    if (agenda.containsKey(nombreEliminar)) {
                        agenda.remove(nombreEliminar);
                        System.out.println("Contacto eliminado.");
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;

                case 4:
                    // Mostrar todos los contactos
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        System.out.println("\n--- Contactos en la agenda ---");
                        for (Map.Entry<String, String> entry : agenda.entrySet()) {
                            System.out.println("Nombre: " + entry.getKey() + " | Teléfono: " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo de la agenda...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

