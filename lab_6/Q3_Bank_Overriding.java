abstract class Bank {
    String name;
    int interestRate;

    int getRateOfInterest() {
        return interestRate;
    }

    void calculateInterest(int balance) {
        System.out.println("Interest can be calculated only for a bank account like SBI or AXIS");
    }
}

class SBI extends Bank {
    SBI() {
        interestRate = 8;
    }

    void calculateInterest(int balance) {
        System.out.println("Calculated interest for SBI = " + (balance * interestRate / 100));
    }
}

class ICICI extends Bank {
    ICICI() {
        interestRate = 7;
    }

    void calculateInterest(int balance) {
        System.out.println("Calculated interest for ICICI = " + (balance * interestRate / 100));
    }
}

class AXIS extends Bank {
    AXIS() {
        interestRate = 9;
    }

    void calculateInterest(int balance) {
        System.out.println("Calculated interest for AXIS = " + (balance * interestRate / 100));
    }
}

public class Q3_Bank_Overriding {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        Bank bank;

        bank = sbi;
        System.out.println("SBI: interest rate: " + bank.getRateOfInterest() + "%");
        bank.calculateInterest(1345);
        System.out.println();

        bank = icici;
        System.out.println("ICICI: interest rate: " + bank.getRateOfInterest() + "%");
        bank.calculateInterest(3432);
        System.out.println();

        bank = axis;
        System.out.println("AXIS: interest rate: " + bank.getRateOfInterest() + "%");
        bank.calculateInterest(234);
        System.out.println();
    }
}
