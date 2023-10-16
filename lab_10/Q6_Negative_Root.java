import java.util.Scanner;

class Q6_Negative_Root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("\nEnter number to calculate square root: ");
        num = sc.nextInt();

        try {
            if (num < 0)
                throw new ArithmeticException("Input number must NOT be negative");
            System.out.println("\nSquare root of " +
                    num + " = " +
                    java.lang.Math.pow(num, 0.5));
        } catch (ArithmeticException e) {
            System.out.println("\nCaught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }
}
