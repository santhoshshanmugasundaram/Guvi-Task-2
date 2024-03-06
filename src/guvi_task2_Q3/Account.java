package guvi_task2_Q3;

import java.util.Scanner;

class Account {
    private double balance;

    // Constructor with no arguments
    public Account() {
        balance = 0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an account with initial balance
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);

        // Perform operations
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


//output: 
//	Enter initial balance:
//		1000
//		1. Deposit
//		2. Withdraw
//		3. Display Balance
//		4. Exit
//		Enter your choice:
//		2
//		Enter amount to withdraw:
//		500
//		1. Deposit
//		2. Withdraw
//		3. Display Balance
//		4. Exit
//		Enter your choice:
//		3
//		Current balance: 500.0
//		1. Deposit
//		2. Withdraw
//		3. Display Balance
//		4. Exit
//		Enter your choice:
//		4
//		Exiting program.