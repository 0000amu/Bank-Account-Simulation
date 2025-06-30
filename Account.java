import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: ₹" + amount);
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
        System.out.println("Current Balance: ₹" + balance);
    }
}
