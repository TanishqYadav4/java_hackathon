package natwest;

import java.util.List;
import java.util.Scanner;

public class NatWestBankApp {
    public static void main(String[] args) throws InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to NatWest Banking");

        System.out.println("Do you want to do banking with us? (Yes/No)");
        String bankingChoice = scanner.nextLine();

        if (bankingChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Enter your customer details: (First Name, Last Name, Address, City, Phone Number)");
            String customerInput = scanner.nextLine();
            CustomerOperations customer = Customer.generateCustomer(customerInput);
            System.out.println("Your Customer Details:");
            System.out.println(customer.toString());

            System.out.println("Do you want to create an account? (Yes/No)");
            String accountChoice = scanner.nextLine();

            if (accountChoice.equalsIgnoreCase("Yes")) {
                System.out.println("Select the Account type from the following:");
                List<Category> accountCategories = Category.displayAccountCategories();
                accountCategories.forEach(category -> System.out.println(category.getTypeId() + ". " + category.getTypeName()));
                int selectedCategory = scanner.nextInt();

                System.out.println("Enter the initial deposit amount:");
                double initialDeposit = scanner.nextDouble();
                if (initialDeposit < 0) {
                    System.out.println("Error : deposited amount can not be negative.");
                    return;
                }
                AccountOperations account = Account.generateAccount(Double.toString(initialDeposit), customer.getCustomerId());
                System.out.println("Your Account Details:");
                System.out.println(account.toString());

                scanner.nextLine(); // Consume newline

                System.out.println("Do you want to perform a transaction? (Yes/No)");
                String transactionChoice = scanner.nextLine();

                if (transactionChoice.equalsIgnoreCase("Yes")) {
                    System.out.println("Select the following option:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Transfer");
                    int transactionOption = scanner.nextInt();

                    Transaction transaction = new Transaction(0, account.getAccountNumber());

                    if (transactionOption == 1) {
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        try {
                            System.out.println(transaction.withdraw(depositAmount));
                        } catch (InsufficientFundsException e) {
                            System.out.println("Error: " + e.getMessage());
                            return;
                        }
                    } else if (transactionOption == 2) {
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            System.out.println(transaction.withdraw(withdrawAmount));
                        } catch (InsufficientFundsException e) {
                            System.out.println("Error: " + e.getMessage());
                            return;
                        }
                    } else if (transactionOption == 3) {
                        System.out.println("Enter amount to transfer:");
                        double transferAmount = scanner.nextDouble();
                        try {
                            System.out.println(transaction.withdraw(transferAmount));
                        } catch (InsufficientFundsException e) {
                            System.out.println("Error: " + e.getMessage());
                            return;
                        }
                        System.out.println("Enter target account number:");
                        long targetAccountNumber = scanner.nextLong();
                        System.out.println(transaction.transferAmount(transferAmount, targetAccountNumber));
                    }
                }
            }
        }

        System.out.println("Thank you for using NatWest Banking!");
    }
}