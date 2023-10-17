import java.util.Scanner;

class UserDefinedException extends Exception {
    private String msg;

    public UserDefinedException() {
        msg = "Division by zero is invalid";
    }

    public UserDefinedException(float num) {
        msg = num + " cannot be divided by zero as division "
        + "by zero is mot defined";
    }

    public String getMessage() {
        return msg;
    }
}

class Q4_User_Defined_Exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a, b;

        System.out.print("\nEnter a and b: ");
        a = sc.nextFloat();
        b = sc.nextFloat();

        try {
            division(a, b);
        } catch (UserDefinedException e) {
            System.out.println("\nCaught UserDefinedException: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }

    static void division(float num1, float num2) throws UserDefinedException {
        if (num2 == 0)
            throw new UserDefinedException(num1);

        System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
