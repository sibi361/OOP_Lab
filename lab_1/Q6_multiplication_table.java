import java.util.Scanner;

class Q6_multiplication_table {
    public static void main(String[] args) {
        int MAX_TABLE_COUNT = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for multiplication table: ");
        int n = scanner.nextInt();
        scanner.close();

        // int n = 8;

        for (int i = 1; i < MAX_TABLE_COUNT + 1; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        System.out.println();
    }
};
