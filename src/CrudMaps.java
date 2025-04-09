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
                case 3 : // Actualizar
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    if (productos.containsKey(idActualizar)) {
                        scanner.nextLine(); // limpiar buffer
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Nuevo precio: ");
                        double nuevoPrecio = scanner.nextDouble();
                        productos.put(idActualizar, new Producto(nuevoNombre, nuevoPrecio));
                        System.out.println(" Producto actualizado.");
                    } else {
                        System.out.println(" Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (productos.containsKey(idEliminar)) {
                        productos.remove(idEliminar);
                        System.out.println(" Producto eliminado.");
                    } else {
                        System.out.println(" Producto no encontrado.");
                    }
                    break;
            }

        } while(opcion != 0);
    }
}
