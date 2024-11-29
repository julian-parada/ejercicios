public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, contar = 10;
        
        System.out.print("Secuencia Fibonacci: ");
        System.out.print(n1 + " " + n2);  // Mostrar los dos primeros números
        
        // Generar el resto de la secuencia
        for (i = 2; i < contar; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
