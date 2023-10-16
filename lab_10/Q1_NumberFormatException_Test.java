import java.util.Scanner;

class Q1_NumberFormatException_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input;
        double num;

        System.out.print("\nEnter string to convert to number: ");
        input = sc.next();

        try {
            num = Double.parseDouble(input);
            System.out.println("\nGiven string after converting to number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("\nCaught NumberFormatException: Input contains " +
                    "non-numeric characters.");
        } finally {
            System.out.println();
            sc.close();
        }
    }
}
