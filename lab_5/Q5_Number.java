import java.util.Scanner;

class Number {
    private double num;

    Number(double input) {
        num = input;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }

    boolean isPrime() {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.pow(num, 0.5); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    boolean isArmstrong() {
        long input = (long) num;
        int inp_len = Long.toString(input).length();
        int digit, sum = 0;
        for (int i = 0; i < inp_len; i++) {
            digit = (int) input % 10;
            sum += java.lang.Math.pow(digit, inp_len);
            input /= 10;
        }
        return num == sum;
    }
}

class Q5_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        Number n = new Number(sc.nextDouble());
        // Number n = new Number(370.0); // armstrong

        System.out.println("\nn.isZero(): " + n.isZero());
        System.out.println("\nn.isPositive(): " + n.isPositive());
        System.out.println("\nn.isNegative(): " + n.isNegative());
        System.out.println("\nn.isOdd(): " + n.isOdd());
        System.out.println("\nn.isEven(): " + n.isEven());
        System.out.println("\nn.isPrime(): " + n.isPrime());
        System.out.println("\nn.isArmstrong(): " + n.isArmstrong());
        sc.close();
        System.out.println();
    }
}
