public class Fizz_buzz {

int acomuladorDos = 0;
    public static void main(String[] args){
        int acomulador = 0;
        int acomulador1 =0;
        int acomulador2 =0;

        for (int i=1;i<100;i++){
            if(i%3==0){
                
                acomulador += 1;
                System.out.println("fizz" + acomulador);
                if(i%5==0){
                    acomulador2 += 1;
                    System.out.println("buzz" + acomulador2); 

                    if(i%3==0 & i%5==0){
                        acomulador1 += 1;
                        System.out.println("fizzBuzz" + acomulador1);

                    }
                }
            } else{
                System.out.println(" " + i + " no es multiplo ni de 3 ni de 5 ");

            }

        } 
    }
    
}
