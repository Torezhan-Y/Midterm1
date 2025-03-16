class CreditCardConfirmer{
    public boolean confirmCard(String cardNum){
        return cardNum.replace(" ", "").length() == 16; // Removes spaces and checks if the length is exactly 16 digits
    }
}
// Adapter pattern: Bridges the gap between credit card validation and the payment system
class CreditCardPAdapter implements PaymentMethod {
    CreditCardPayment creditCardPayment;
    CreditCardConfirmer confirmer;
    String cardNum;

    public CreditCardPAdapter(String cardNum) {
        this.creditCardPayment = new CreditCardPayment();
        this.confirmer = new CreditCardConfirmer();
        this.cardNum = cardNum;
    }

    public void processPayment(double amount) {
        if (!confirmer.confirmCard(cardNum)) { // If the card number is invalid, throw an exception
            throw new IllegalArgumentException("Ups! The number of credit card is wrong");
        }
        creditCardPayment.processPayment(amount);
        System.out.println("The transaction was successful!");
    }
}

//Here we use the Adapter Pattern to connect the credit card payment system with the card validation system
//The adapter makes sure that only valid credit cards can be used. Without it, the two systems wouldn’t work together properly.