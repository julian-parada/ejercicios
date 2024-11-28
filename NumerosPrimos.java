import java.util.Scanner;
public class NumerosPrimos{
    public static void main(String[] args){
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese dos numeros positivos por favor");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();     
        if (numero1 > 0 & numero2 > 0){
            if (numero1<numero2){
                for(int i=numero1;i<numero2;i++){
                    if (i % 1 == 0 & i % i == 0 & i % 2 != 0 & i % 3 != 0 & i % 5 != 0){
                        System.out.print("los numeros primos son" );
                        System.out.println(i);
                    }
                }

                if(numero2<numero1){
                    for(int i=numero2;i<numero1;i++){
                        if (i % 1 == 0 & i % i == 0 & i % 2 != 0 & i % 3 != 0 & i % 5 != 0){
                            System.out.print("los numeros primos son" );
                            System.out.println(i);
                        }
                    }
                    if (numero1 == numero2){
                        System.out.print("los numeros que ingresaste son iguales");
                    }
                }
            }

        } else {
            System.out.println("los numeros que ingresaste no son positivos");
        }
    }
    

}