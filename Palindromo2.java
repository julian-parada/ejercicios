import java.util.Scanner;

public class Palindromo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        String alreves = "";
        String op;
        String num = "";
        int nuvNum;

        System.out.println("¿Qué deseas ingresar?");
        System.out.println("a. Número");
        System.out.println("b. Palabra");

        op = scanner.nextLine();

        if (op.equals("a")) {
            System.out.println("Ingrese el número:");
            try {
                num = scanner.nextLine();
                nuvNum = Integer.parseInt(num);
                String numeroComoString = Integer.toString(nuvNum);
                alreves = new StringBuilder(numeroComoString).reverse().toString();

                if (numeroComoString.equals(alreves)) {
                    System.out.println("El número " + num + " es un palíndromo.");
                } else {
                    System.out.println("El número " + num + " no es un palíndromo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("¡Error! Por favor, ingrese un número válido.");
            }
        } else if (op.equals("b")) {
            System.out.println("Digite una palabra:");
            palabra = scanner.nextLine();
            alreves = new StringBuilder(palabra).reverse().toString();

            if (palabra.equals(alreves)) {
                System.out.println("La palabra " + palabra + " es un palíndromo.");
            } else {
                System.out.println("La palabra " + palabra + " no es un palíndromo.");
            }
        } else {
            System.out.println("Lo que ingresaste es incorrecto.");
        }

        scanner.close();
    }

    @Override
    public String toString() {
        return "Palindromo []";
    }
}

