
    import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
            System.out.println("ingrese un numero segun la operacion que desee realizar");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. salir del programa");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("ingrese los numero que deseas sumar");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int suma1 = num1 + num2;
                System.err.println("la suma de sus dos numeros es = " + suma1);
                    
                    break;
                    case 2:
                    System.out.println("ingrese los numero que deseas resta");
                    int num11 = scanner.nextInt();
                    int num22 = scanner.nextInt();
                    int suma11 = num11 - num22;
                    System.err.println("la resta de sus dos numeros es = " + suma11);
                    break;

                    case 3:
                    System.out.println("ingrese los numero que deseas multiplicacion");
                    int num111 = scanner.nextInt();
                    int num222 = scanner.nextInt();
                    int suma111 = num111 * num222;
                    System.err.println("la multiplicacion de sus dos numeros es = " + suma111);

                    break;
                    case 4:
                    System.out.println("ingrese los numero que deseas division");
                    int num = scanner.nextInt();
                    int nume = scanner.nextInt();
                    int suma = num / nume;
                    System.err.println("la division de sus dos numeros es = " + suma);


            
                default:
                    break;
            }

        
    }
    
}


