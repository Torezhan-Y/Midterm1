class PaymentFactory { // Factory pattern: Creates different payment methods dynamically
    public static PaymentMethod createPayment(String type) {
        if (type.equalsIgnoreCase("Credit card")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        } else if (type.equalsIgnoreCase("Crypto")) {
            return new CryptoPayment();
        } else {
            throw new IllegalArgumentException("There is no such payment type");
        }
    }
}

//Here we use the Factory Method in to create different types of payments.
// Instead of manually creating objects, we just call createPayment(), and it gives us the right payment method.
// This makes it easy to add new payment options in the future.