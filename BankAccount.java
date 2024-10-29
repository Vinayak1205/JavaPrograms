import java.util.Scanner;


abstract class Account {
    protected String customerName;
    protected String accountNumber;
    protected double balance;

    public Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public abstract void withdraw(double amount);
}


class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber);
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest deposited: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


class CurrentAccount extends Account {
    private double minimumBalance;
    private double serviceCharge;

    public CurrentAccount(String customerName, String accountNumber, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge applied: " + serviceCharge);
            System.out.println("New balance after service charge: " + balance);
        }
    }
}

public class Bank {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SavingsAccount savingsAccount = createSavingsAccount(scanner);
    CurrentAccount currentAccount = createCurrentAccount(scanner);

    while (true) {
        System.out.println("Choose an operation:");
        System.out.println("1. Deposit to Savings Account");
        System.out.println("2. Withdraw from Savings Account");
        System.out.println("3. Compute Interest on Savings Account");
        System.out.println("4. Display Savings Account Balance");
        System.out.println("5. Deposit to Current Account");
        System.out.println("6. Withdraw from Current Account");
        System.out.println("7. Display Current Account Balance");
        System.out.println("8. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double savingsDeposit = scanner.nextDouble();
                savingsAccount.deposit(savingsDeposit);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double savingsWithdraw = scanner.nextDouble();
                savingsAccount.withdraw(savingsWithdraw);
                break;
            case 3:
                savingsAccount.computeAndDepositInterest();
                break;
            case 4:
                savingsAccount.displayBalance();
                break;
            case 5:
                System.out.print("Enter amount to deposit: ");
                double currentDeposit = scanner.nextDouble();
                currentAccount.deposit(currentDeposit);
                break;
            case 6:
                System.out.print("Enter amount to withdraw: ");
                double currentWithdraw = scanner.nextDouble();
                currentAccount.withdraw(currentWithdraw);
                break;
            case 7:
                currentAccount.displayBalance();
                break;
            case 8:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}


private static SavingsAccount createSavingsAccount(Scanner scanner) {
    System.out.print("Enter customer name for Savings Account: ");
    String savingsCustomerName = scanner.nextLine();
    System.out.print("Enter account number for Savings Account: ");
    String savingsAccountNumber = scanner.nextLine();
    System.out.print("Enter interest rate for Savings Account: ");
    double savingsInterestRate = scanner.nextDouble();
    return new SavingsAccount(savingsCustomerName, savingsAccountNumber, savingsInterestRate);
}

private static CurrentAccount createCurrentAccount(Scanner scanner) {
    scanner.nextLine(); // Consume newline
    System.out.print("Enter customer name for Current Account: ");
    String currentCustomerName = scanner.nextLine();
    System.out.print("Enter account number for Current Account: ");
    String currentAccountNumber = scanner.nextLine();
    System.out.print("Enter minimum balance for Current Account: ");
    double minimumBalance = scanner.nextDouble();
    System.out.print("Enter service charge for Current Account: ");
    double serviceCharge = scanner.nextDouble();
    return new CurrentAccount(currentCustomerName, currentAccountNumber, minimumBalance, serviceCharge);
}

}
