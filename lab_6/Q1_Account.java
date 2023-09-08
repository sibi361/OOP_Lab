import java.util.Scanner;
import java.util.Random;

abstract class Account {
    String name, type;
    int accno;
    float balance, minimumBalance, interestRate, interest, penaltyAmount;

    void deposit(float amount) {
        System.out.println("Depositing " + amount + " into account number "
                + accno);
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    void getData() {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter name and balance: ");
        name = sc.next();
        balance = sc.nextFloat();
        sc.close();

        Random rng = new Random();
        accno = rng.nextInt(99999 - 10000) + 10000;

        System.out.println("\nAccount number generated for " + name + ": " + accno);
    }

    void displayBalance() {
        System.out.println("Current balance of account number " + accno + ": "
                + balance + "\n");
    }

    void withdraw(float amount) {
        System.out.println("Withdrawing " + amount + " from account number "
                + accno);
        balance -= amount;
        System.out.println("New balance: " + balance);
    }

    void computeInterest() {
        if (interestRate == 0) {
            System.out.println("No interest provided for Current Account\n");
            return;
        }

        interest = balance * interestRate / 100;
        System.out.println("Interest for account number " + accno + ": "
                + interest);
        System.out.println("Based on interest rate " + interestRate + "%");
        deposit(interest);
        displayBalance();
    }

    void checkMinimumBalance() {
        if (minimumBalance == 0)
            System.out.println("Mminimum balance need not be kept for Savings Account\n");

        else if (balance < minimumBalance) {
            System.out.println("Minimum balance of " + minimumBalance + " is NOT being maintained");
            withdraw(penaltyAmount);
            System.out.println("Penalty of " + penaltyAmount + " imposed\n");
            displayBalance();
        }

        else
            System.out.println("Minimum balance is being maintained, no penalty levied\n");
    }
}

class SavingsAccount extends Account {
    SavingsAccount() {
        type = "savings";
        interestRate = 3;
        minimumBalance = penaltyAmount = 0;
    }
}

class CurrentAccount extends Account {
    CurrentAccount() {
        type = "current";
        interestRate = 0;
        minimumBalance = 2000;
        penaltyAmount = 1000;
    }
}

class Q1_Account {
    public static void main(String args[]) {
        Scanner sc = new java.util.Scanner(System.in);
        int option;
        // option = 0;

        System.out.println("Enter 0 for savings account and " +
                "1 for current account: ");
        option = sc.nextInt();
        switch (option) {
            case 0:
                SavingsAccount sa = new SavingsAccount();
                sa.getData();
                testAccount(sa);
                break;
            case 1:
                CurrentAccount ca = new CurrentAccount();
                ca.getData();
                testAccount(ca);
                break;
            default:
                System.out.println("Invalid option given\n");

        }
        sc.close();
    }

    static void testAccount(Account acc) {
        acc.deposit(1000);
        acc.withdraw(500);
        acc.computeInterest();
        acc.checkMinimumBalance();
    }
}
