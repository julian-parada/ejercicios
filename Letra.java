import java.util.Scanner;
public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombre = new String[1];
        for (int i=0; i<1;i++ ){
            nombre[i] = scanner.nextLine();

        }

        for (String letra:nombre){
            System.out.println(letra + " ");
        }

    }

    
}