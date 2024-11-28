
public class tablaMultimplicar {
    public static void main(String[] args ){
        int numero;
        

        for (int i=1;i<12;i++){
            if (i==1){
                numero=1;
                for (int j=0;j<12;j++){
                    int resultado = numero*j;
                System.out.println(numero + " * " + j + " = " + resultado);
                }
                continue;

            } 
            
            if(i==2){
                System.out.println("------------------");
                numero=2;
                for (int j=0;j<12;j++){
                    int resultado = numero*j;
                System.out.println(numero + " * " + j + " = " + resultado);
                }
                continue;

            } 
           
            if(i==3){
                System.out.println("------------------");
                numero=3;
                for (int j=0;j<12;j++){
                    int resultado = numero*j;
                System.out.println(numero + " * " + j + " = " + resultado);
                }
                continue;

            } 
            
            if(i==4){
                System.out.println("------------------");
                numero=4;
                for (int j=0;j<12;j++){
                    int resultado = numero*j;
                System.out.println(numero + " * " + j + " = " + resultado);
                }
                continue;

            } 
      
            if(i==5){
                System.out.println("------------------");
                numero=5;
                for (int j=0;j<12;j++){
                    int resultado = numero*j;
                System.out.println(numero + " * " + j + " = " + resultado);
                }
                break;

            } 
            

        }

    }
}

