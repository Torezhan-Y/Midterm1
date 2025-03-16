import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose coffee: ");
        String cof=scan.nextLine();
        Coffee coffee=CoffeeFactory.createCoffee(cof); // Creating base coffee

        // Adding toppings using decorators
        while (true){
            System.out.println("Any toppings? (milk, caramel syrup, whipped cream, chocolate syrup, no): ");
            String topping = scan.nextLine().toLowerCase();
            if (topping.equals("no")) // Exit loop if no topping is selected
                break;
            if (topping.equals("milk")){
                coffee= new MilkDecorator(coffee);
            }   else if(topping.equals("caramel syrup")){
                coffee=new CaramelDecorator(coffee);
            } else if(topping.equals("whipped cream")){
                coffee= new WhippedCreamDecorator(coffee);
            } else if(topping.equals("chocolate syrup")){
                coffee= new ChocolateDecorator(coffee);
            }  else{
                System.out.println("There is no such topping!");
            }
        }
        // Displaying the final order details
        System.out.println("Your order: " + coffee.getDescription());  // Displaying final order
        System.out.println("Total price: "+ coffee.getCost()+'$');  // Displaying total cost
    }
}
