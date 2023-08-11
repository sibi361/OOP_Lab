import java.util.Scanner;

class Q5_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for n!: ");
        int n = scanner.nextInt();
        scanner.close();

        // int n = 5;
        double fact = 1;

        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        System.out.println(n + "! = " + (int) fact);

        System.out.println();
    }
};
