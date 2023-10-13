import java.util.Scanner;

public class Q1_NumberFormatException_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input;
        double num;

        System.out.print("Enter string to convert to integer: ");
        input = sc.next();

        try {
            num = Double.parseDouble(input);
            System.out.println("\nGiven string after converting to double: " + num);
        } catch (NumberFormatException e) {
            System.out.println("\nError: Invalid input. Enter a valid decimal number.");
        }

        sc.close();
    }
}
