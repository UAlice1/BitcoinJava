public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard cc = new CreditCard("1234-5678-9876-5432");
        PayPal pp = new PayPal("alice@example.com");
        Bitcoin btc = new Bitcoin("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        // Call overloaded methods
        processor.processPayment(cc);
        processor.processPayment(pp);
        processor.processPayment(btc);
    }
}

// Payment method classes
class CreditCard {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

class PayPal {
    String email;

    PayPal(String email) {
        this.email = email;
    }
}

class Bitcoin {
    String walletAddress;

    Bitcoin(String walletAddress) {
        this.walletAddress = walletAddress;
    }
}

// PaymentProcessor class with overloaded methods
class PaymentProcessor {

    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card payment for card number: " + creditCard.cardNumber);
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal payment for email: " + payPal.email);
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin payment for wallet: " + bitcoin.walletAddress);
    }
}
