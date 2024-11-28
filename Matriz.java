import java.util.Scanner;
public class Matriz {
    int fila1;
    int fila2;
    int columna1;
    int columna2;
    int primerMatriz;
    int segundoMatriz;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("va a ingresar el numero de filas y columnas, resuerde que el numero de filas de la primera matriz debe ser igual al numero de columnas de la segunda matriz");
        System.out.println("ingrese el  numero de filas para la primera matriz");
        int fila1 = scanner.nextInt(); 
        System.out.println("ingrese el numero de columnas para la primer matriz");
        int columna1 = scanner.nextInt(); 
        System.out.println("ingrese el  numero de filas para la segunda matriz");
        int fila2 = scanner.nextInt(); 
        System.out.println("ingrese el numero de columnas para la segunda matriz");
        int columna2 = scanner.nextInt();
        if (fila1==columna2){
            int[][] primerMatriz = new int[fila1][columna1];
            int[][] segundoMatriz = new int[fila2][columna2];
            for (int i=0; i<fila1;i++){
                for (int j=0; j<columna1;j++){
                    System.out.println("ingrese el numero de la primera mmatiz " + primerMatriz[i][j]);
                    primerMatriz[i][j]=scanner.nextInt();                    
                }
            }
   
            for (int i=0; i<fila2;i++){
                for (int j=0; j<columna2;j++){
                    System.out.println("ingrese el numero de la segunda matiz " + segundoMatriz[i][j]);
                    segundoMatriz[i][j]=scanner.nextInt();                    
                }
            }
            int[][] resultado = new int[fila1][columna2];
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna2; j++) {
                    for (int k = 0; k < columna1; k++) {
                        resultado[i][j] += primerMatriz[i][k] * segundoMatriz[k][j];
                    }
                }        
            }
            System.out.println("El resultado de la multiplicación es:");
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna2; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }


        } else{
            System.out.println("no son igulaes");
        }
        scanner.close();
    }
   
}
