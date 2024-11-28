import java.util.Scanner;
public class Inventory {
    private int price;
    private boolean quantity;
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the product quantity");
    String[] names = new String[5];
        for (int i=0;i<names.length;i++){
            System.out.println("Enter the product name " + (i+1) + " : ");
            names[i]= scanner.nextLine();
        }
        System.out.println("The products are ");
        for (String name : names){
            System.out.println(name);
        }
        double[] price= new double[5];
        
        for (int i=0;i<price.length;i++){
            System.out.println("Enter the price of the product " + (names[i]) + ": "); 
            price[i]= scanner.nextInt();
        }
        int[] quantity=new int[5];
        for (int i=0;i<quantity.length;i++){
            System.out.println("Enter the product quantity " + (names[i]) + ": "); 
            quantity[i]= scanner.nextInt();
        }
        boolean modify = true;
        while (modify){
            System.out.println("You want to modify some data? (si/no): ");
            scanner.nextLine(); 
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("si")){
                System.out.println("that you want to modify? ");
                System.out.println("1. You want to modify the product ");
                System.out.println("2. you want to change the quantity of the product ");
                System.out.println("3. you want to change the price of the product ");
                int opction = scanner.nextInt();
                switch (opction) {
                    case 1:
                    for (int i=0; i<names.length; i++){
                        System.out.println("Enter the number you're modifying " + i + " " + names[i]); 
                    }
                    int index = scanner.nextInt();
                    System.out.println("Enter the new product ");
                    names[index] = scanner.nextLine();   
                        break;

                    case 2: 
                    for (int i=0; i<quantity.length; i++){
                        System.out.println("Enter the number you're modifying" + i + " " + names[i] + " " + quantity[i]); 
                    }
                    int newProduct = scanner.nextInt();
                    System.out.println(" Enter the new quantity "); 
                    quantity[newProduct] = scanner.nextInt();   
                        break;
                    
                    case 3:
                    for (int i=0; i<price.length; i++){
                        System.out.println("Enter the number you're modifying" + i + " " + names[i] + " " + quantity[i] + " " + price[i]); 
                    }
                    System.out.println(" Enter the new price ");
                    newProduct = scanner.nextInt();
                    price[newProduct] = scanner.nextInt();   
                        break;

                
                    default:
                    System.out.println("Invalid option.");
                        break;
                }
                


            } else{
                modify = false;
            }
 

        }
        double[] result=new double[5]; 
        for (int i=0;i<result.length;i++){ 
            result[i]= price[i] * quantity[i] ;
        }       
        for (int i=0; i<names.length; i++){
            System.out.println("product: " + names[i] + " quantity: " + quantity[i] + " price:" + price[i] + " result = " + result[i]);

        }
        scanner.close();

    }
    @Override
    public String toString() {
        return "Main []";
    }
}