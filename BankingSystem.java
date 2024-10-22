import java.util.Scanner;

class BankAccount {
    private String customerName;
    private double balance;

    public BankAccount(String customerName) {
        this.customerName = customerName;
        this.balance = 0.0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Customer: " + customerName + ", Balance: $" + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[15];

        // Create 15 bank accounts
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter the name for customer " + (i + 1) + ": ");
            String name = scanner.nextLine();
            accounts[i] = new BankAccount(name);
        }

        // Menu for banking operations
        int choice;
        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter customer number (1-15): ");
                    int depositCustomerIndex = scanner.nextInt() - 1;
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    accounts[depositCustomerIndex].deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter customer number (1-15): ");
                    int withdrawCustomerIndex = scanner.nextInt() - 1;
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    accounts[withdrawCustomerIndex].withdraw(withdrawAmount);
                    break;

                case 3: // Display Account Information
                    System.out.print("Enter customer number (1-15): ");
                    int infoCustomerIndex = scanner.nextInt() - 1;
                    accounts[infoCustomerIndex].displayAccountInfo();
                    break;

                case 4: // Exit
                    System.out.println("Exiting the banking system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
