abstract class Payment {
    private String transactionId;
    private double amount;
    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public String gettransactionId() {
        return transactionId;
    }
    public double getamount() {
        return amount;
    }
abstract void processPayment();
}
class CreditCard extends Payment {
    CreditCard(String transactionId, double amount) {
        super(transactionId, amount);
    }
    void processPayment() {
        System.out.println("Processing Credit Card Payment");
        double a = 0.02 * getamount();
        double total = getamount() + a;
        System.out.println("Transaction ID: " + gettransactionId());
        System.out.println("Original Amount: " + getamount());
        System.out.println("Convenience Fee: " + a);
        System.out.println("Total Amount: " + total);
    }
}
class UPI extends Payment {
    private String upiid;

    UPI(String transactionId, double amount, String upiid) {
        super(transactionId, amount);
        this.upiid = upiid;
    }
    void processPayment() {
        System.out.println("UPI Payment");

        if (upiid != null && !upiid.isEmpty()) {
            System.out.println("Transaction ID: " + gettransactionId());
            System.out.println("Amount: " + getamount());
            System.out.println("UPI ID: " + upiid);
            System.out.println("Payment successful");
        } else {
            System.out.println("Invalid UPIid.");
        }
    }
}
class PaymentProcessor {
    public void process(Payment payment) {
        payment.processPayment();
    }
}
public class SmartPay {
    public static void main(String[] args) {
        Payment p1 = new CreditCard("xyz1234", 3000);
        Payment p2 = new UPI("txn300", 5000, "abcff@upi");
        PaymentProcessor proc = new PaymentProcessor();
        proc.process(p1);
        proc.process(p2);
    }
}