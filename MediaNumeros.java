import java.util.Scanner;
public class MediaNumeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3, suma;
        double media;

        System.out.println("vamos a ingresar tres numeros ");

        System.out.println("ingrese el primer numero ");
        numero1= scanner.nextInt();
        System.out.println("ingrese el segundo numero ");
        numero2= scanner.nextInt();
        System.out.println("ingrese el tercer numero ");
        numero3= scanner.nextInt();
        
        suma = numero1+numero2+numero3;

        media = suma / 3;

        System.out.println( "la media de los numeros que ingresaste es :" + media);
        


        
    }



    
}
