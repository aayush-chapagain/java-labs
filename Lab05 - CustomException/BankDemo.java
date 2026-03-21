class InsufficientFundException extends Exception {
    InsufficientFundException(String message) {
        super(message);
    }
}
class BankAccount {
    int balance = 5000;
    void withdraw(int amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(2000);
            acc.withdraw(4000);
        } catch (InsufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}