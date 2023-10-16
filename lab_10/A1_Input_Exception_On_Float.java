import java.util.Scanner;

class Input_Exception extends Exception {
    private String msg;

    public Input_Exception() {
        msg = "Only integers are allowed. Please do not enter float number.";
    }

    public String getMessage() {
        return msg;
    }
}

public class A1_Input_Exception_On_Float {
    public static void main(String args[]) throws Input_Exception {
        Scanner sc = new Scanner(System.in);

        try {
            sumNumbers(sc);
        } catch (Input_Exception e) {
            System.out.println("\nCaught Input_Exception: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }

    static void sumNumbers(Scanner sc) throws Input_Exception {
        int sum;
        float temp;
        sum = 0;

        while (true) {
            System.out.print("\nEnter integer (-1 to quit): ");
            temp = sc.nextFloat();

            if (temp == -1)
                break;
            else if (temp / (int) temp != 1)
                throw new Input_Exception();

            sum += temp;
        }
        System.out.println("\nSum = " + sum);
    }
}
