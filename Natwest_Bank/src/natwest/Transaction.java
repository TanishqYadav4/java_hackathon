package natwest;
import java.time.LocalDateTime;

class Transaction {
    private double amount;
    private long accountNumber;
    private LocalDateTime date;

    public Transaction(double amount, long accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.date = LocalDateTime.now();
    }

    // Getters and setters

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction Amount: " + amount + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Date: " + date;
    }

    public String withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Amount can not be negative");
        }

        if (amount > this.amount) {
            throw new InsufficientFundsException("Insufficient funds to withdraw.");
        }

        this.amount -= amount;
        return "Transaction Is Success";
    }

    public String deposit(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Amount can not be negative");
        }
        this.amount += amount;
        return "Transaction Is Success";
    }

    public String transferAmount(double amount, long targetAccountNumber) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        this.amount -= amount;
        return "Transaction Is Success";
    }
}

