import java.util.Scanner;

public class InventarioProductos {
    // Constantes
    private static final int MAX_PRODUCTOS = 100;
    private static final double IMPUESTO = 0.16; // 16% de impuesto

    // Arrays para almacenar la información de los productos
    private static String[] nombres = new String[MAX_PRODUCTOS];
    private static int[] cantidades = new int[MAX_PRODUCTOS];
    private static double[] precios = new double[MAX_PRODUCTOS];
    private static int numProductos = 0;

    // Scanner para entrada de datos
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarCantidad();
                    break;
                case 3:
                    generarReporte();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        System.out.println("Gracias por usar el sistema de inventario.");
    }

    // Método para mostrar el menú principal
    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Actualizar cantidad");
        System.out.println("3. Generar reporte");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para agregar un producto
    private static void agregarProducto() {
        if (numProductos < MAX_PRODUCTOS) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            nombres[numProductos] = nombre;
            cantidades[numProductos] = cantidad;
            precios[numProductos] = precio;
            numProductos++;

            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más productos. Inventario lleno.");
        }
    }

    // Método para actualizar la cantidad de un producto
    private static void actualizarCantidad() {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < numProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                System.out.print("Ingrese la nueva cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                cantidades[i] = cantidad;
                encontrado = true;
                System.out.println("Cantidad actualizada exitosamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para calcular el valor total del inventario
    private static double calcularValorTotal() {
        double total = 0.0;

        for (int i = 0; i < numProductos; i++) {
            total += cantidades[i] * precios[i];
        }

        return total;
    }

    // Método para generar un reporte del inventario
    private static void generarReporte() {
        System.out.println("\n--- REPORTE DE INVENTARIO ---");

        for (int i = 0; i < numProductos; i++) {
            double valorProducto = cantidades[i] * precios[i];
            System.out.printf("Producto: %s | Cantidad: %d | Precio: %.2f | Valor Total: %.2f\n",
                    nombres[i], cantidades[i], precios[i], valorProducto);
        }

        double valorTotalInventario = calcularValorTotal();
        System.out.printf("Valor Total del Inventario: %.2f\n", valorTotalInventario);
        double valorTotalConImpuesto = valorTotalInventario * (1 + IMPUESTO);
        System.out.printf("Valor Total con Impuesto (%.0f%%): %.2f\n", IMPUESTO * 100, valorTotalConImpuesto);
    }
}
