import java.util.Scanner;
public class numeroPrimos {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero ");
        int numero=scanner.nextInt();

        for (int i=1;i<=numero;i++){
            if(i % 2 == 0){
            } else {
                System.out.println(i + " es numero impar");
                continue;
            }
        }   
    }
}
