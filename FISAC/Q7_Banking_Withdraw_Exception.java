import java.util.Scanner;

class NotEnoughBalanceException extends Exception {
    public String toString() {
        return "NotEnoughBalanceException: Account balance is insufficient";
    }
}

class Account {
    int accNo;
    float balance;

    Account(int accountNo, float openingBalance) {
        accNo = accountNo;
        this.balance = openingBalance;
    }

    void getBalance() {
        System.out.println("Current balance for account number " +
                accNo + ": " + balance);
    }

    void deposit(float amount) {
        System.out.println("\nDepositing " + amount + " into account number "
                + accNo);
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    void withdraw(float amount) throws NotEnoughBalanceException {
        System.out.println("\nWithdrawing " + amount + " from account number "
                + accNo);

        if (amount > balance)
            throw new NotEnoughBalanceException();

        balance -= amount;
        System.out.println("New balance: " + balance);
    }
}

class Q7_Banking_Withdraw_Exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account acc;
        float temp;

        System.out.print("Enter opening balance: ");
        acc = new Account(123456, sc.nextFloat());

        while (true) {
            System.out.print("\n1 Show balance\n" +
                    "2 Deposit\n" +
                    "3 Withdraw\n" +
                    "4 Exit\n" +
                    "Enter option: ");

            switch (sc.nextInt()) {
                case 1:
                    acc.getBalance();
                    break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    acc.deposit(sc.nextFloat());
                    break;

                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    try {
                        acc.withdraw(sc.nextFloat());
                    } catch (NotEnoughBalanceException e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
