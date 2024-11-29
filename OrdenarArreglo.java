import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el tamaño del arreglo
        System.out.print("Introduce el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        // Llenar el arreglo con números
        System.out.println("Introduce los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        // Ordenación por burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        
        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
