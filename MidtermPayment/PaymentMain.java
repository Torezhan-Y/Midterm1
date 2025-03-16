import java.util.Scanner;
class PaymentMain{ // Main class that handles user input and runs the payment process
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Your payment method (Credit card, PayPal, Crypto): ");
        String method= scan.nextLine();
        PaymentMethod paymentMethod;

        // If you choose Credit Card, ask for card number
        if(method.equals("Credit card")){
            System.out.println("Credit card number(with spaces): ");
            String cardNum=scan.nextLine();
            paymentMethod=new CreditCardPAdapter(cardNum);
        }
        else{
            paymentMethod= PaymentFactory.createPayment(method); // Use Factory Method to create other payment methods
        }
        System.out.println("Amount of money for transaction: ");
        double amount= scan.nextDouble();

        // Creating a transaction and processing payment
        Transaction transaction= new Transaction(amount);
        try{
            paymentMethod.processPayment(amount);
            transaction.complete();  // Mark transaction as completed

        }
        catch(Exception e){
            e.printStackTrace();
            transaction.fail(); // Mark transaction as failed
        }
        System.out.println("Transaction status is " + transaction.getStatus());
    }
}