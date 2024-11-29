import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el radio al usuario
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Calcular el área
        double area = Math.PI * Math.pow(radio, 2);
        
        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);
    }
}
