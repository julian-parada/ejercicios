import java.util.Scanner;
public class Products {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
   
        String[] names = new String[5];
        for (String name:names){
            System.out.println("Enter products names");
            System.out.println(name);
        }
        int[] quantityProduct = new int[5];
        for (int i=0; i<quantityProduct.length; i++){
            System.out.println("Enter products quantity");
            quantityProduct[i]=scanner.nextInt();
        }
        double[]  priceProduct = new double [5];
        for (int i=0; i<priceProduct.length; i++){
            System.out.println("Enter products price");
            priceProduct[i]=scanner.nextDouble();
        }
        boolean modify = true;
        while (modify){
            System.out.println("You want to modify some data? (s/n): ");
            scanner.nextLine(); 
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("s")){
                System.out.println("that you want to modify?");
                System.out.println("1. You want to modify the product");
                System.out.println("2. you want to change the quantity of the product");
                System.out.println("3. you want to change the price of the product");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                    for (int i=0; i<names.length; i++){
                        System.out.println("Enter the number you're modifying" + i + names[i]); 
                    }

                    int newProduct = scanner.nextInt();
                    names[newProduct] = scanner.nextLine();   
                        break;

                    case 2: 
                    for (int i=0; i<quantityProduct.length; i++){
                        System.out.println("Enter the number you're modifying" + i + names[i] + quantityProduct[i]); 
                    }
                    newProduct = scanner.nextInt();
                    quantityProduct[newProduct] = scanner.nextInt();   
                        break;
                    
                    case 3:
                    for (int i=0; i<priceProduct.length; i++){
                        System.out.println("Enter the number you're modifying" + i + names[i] + quantityProduct[i] + priceProduct[i]); 
                    }
                    newProduct = scanner.nextInt();
                    priceProduct[newProduct] = scanner.nextInt();   
                        break;

                
                    default:
                    System.out.println("Invalid option.");
                        break;
                }


            } else{
                modify = false;
            }

        }
        for (int i=0; i<names.length; i++){
            System.out.println("product: " + names[i] + " quantity: " + quantityProduct[i] + " price:" + priceProduct[i]);

        }
    scanner.close();

    }

    @Override
    public String toString() {
        return "Main []";
    }

}

