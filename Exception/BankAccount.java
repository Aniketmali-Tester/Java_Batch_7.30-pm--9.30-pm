package Exception;

public class BankAccount {



        double balance = 500.00;

        public void withdraw(double amount) {
            // Enforcing logical boundaries using throw
            if (amount > balance) {
                throw new IllegalArgumentException("Withdrawal denied: Insufficient funds.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: $" + balance);
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount();

            try {
                account.withdraw(400.00); // This will fail the logical condition
            } catch (IllegalArgumentException e) {
                System.out.println("Error caught: " + e.getMessage());
            }
        }
    }


