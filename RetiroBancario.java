public class RetiroBancario {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int numeroDeSemanas = 4;
     
        double saldoFinal = saldoInicial - (retiroSemanal * numeroDeSemanas);
    
        System.out.printf("El saldo final en la cuenta es: $%.2f%n", saldoFinal);
    }
}
