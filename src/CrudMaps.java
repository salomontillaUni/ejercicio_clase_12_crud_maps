import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Producto> productos = new HashMap<>();
        int opcion;
        do {
            System.out.println("\n--- Menú CRUD de Productos ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // Crear
                    System.out.print("ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    productos.put(id, new Producto(nombre, precio));
                    System.out.println(" Producto agregado.");
                    break;
                case 2: // Listar
                    if (productos.isEmpty()) {
                        System.out.println(" No hay productos.");
                    } else {
                        System.out.println("--- Lista de productos ---");
                        // Recorriendo con for-each + entrySet()
                        for (Map.Entry<Integer, Producto> entrada : productos.entrySet()) {
                            System.out.println("ID: " + entrada.getKey() + " → " + entrada.getValue());
                        }
                    }
                    break;
            }

        } while(opcion != 0);
    }
}
