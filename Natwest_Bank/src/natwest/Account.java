package natwest;

import java.time.LocalDateTime;
import java.util.UUID;



class Account implements AccountOperations {
    private static long accountNumberCounter = 100000;

    private long accountNumber;
    private double accountBalance;
    private Category accountType;
    private UUID customerId;
    private LocalDateTime dateOpened;

    public Account(double initialBalance, Category accountType, UUID customerId) {
        this.accountNumber = accountNumberCounter++;
        this.accountBalance = initialBalance;
        this.accountType = accountType;
        this.customerId = customerId;
        this.dateOpened = LocalDateTime.now();
    }

    // Getters and setters

    public static long getAccountNumberCounter() {
        return accountNumberCounter;
    }

    public static void setAccountNumberCounter(long accountNumberCounter) {
        Account.accountNumberCounter = accountNumberCounter;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Category getAccountType() {
        return accountType;
    }

    public void setAccountType(Category accountType) {
        this.accountType = accountType;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDateTime dateOpened) {
        this.dateOpened = dateOpened;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
                "Account Type: " + accountType.getTypeName() + "\n" +
                "Account Balance: " + accountBalance + "\n" +
                "Date Opened: " + dateOpened;
    }

    public static Account generateAccount(String input, UUID customerId) {
        double initialBalance = Double.parseDouble(input);
        return new Account(initialBalance, Category.displayAccountCategories().get(0), customerId);
    }
}
