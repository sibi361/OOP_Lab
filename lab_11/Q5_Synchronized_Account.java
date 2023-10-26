class Account {
    int accno;
    float balance;

    Account(int accountNo) {
        accno = accountNo;
        balance = 0;
    }

    synchronized void deposit(float amount) {
        System.out.println("\nDepositing " + amount + " into account number "
                + accno);
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    synchronized void withdraw(float amount) {
        System.out.println("\nWithdrawing " + amount + " from account number "
                + accno);
        balance -= amount;
        System.out.println("New balance: " + balance);
    }
}

class AccountOperator extends Thread {
    Account obj;
    float amount;
    int depositOrWithdraw;

    AccountOperator(Account obj, int depositOrWithdraw, float amount) {
        this.obj = obj;
        this.amount = amount;
        this.depositOrWithdraw = depositOrWithdraw;
    }

    public void run() {
        switch (depositOrWithdraw) {
            case 0:
                obj.deposit(amount);
                break;
            case 1:
                obj.withdraw(amount);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}

class Q5_Synchronized_Account {
    public static void main(String args[]) {

        Account acc1 = new Account(123456);

        AccountOperator depositor = new AccountOperator(acc1, 0, 1000);
        AccountOperator withdrawer = new AccountOperator(acc1, 1, 500);

        depositor.start();
        withdrawer.start();
    }
}
