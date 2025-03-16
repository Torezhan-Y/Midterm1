interface PaymentMethod{    // Interface for different payment methods
    void processPayment(double amount);
}
// Concrete implementation for credit card payments
class CreditCardPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Credit card payment of " +amount+ " is in process");
    }
}

// Concrete implementation for PayPal payments
class PayPalPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Paypal payment of " +amount+  " is in process");
    }
}

// Concrete implementation for cryptocurrency payments
class CryptoPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Crypto payment of " +amount+ " is in process");
    }
}


