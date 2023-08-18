import java.util.Scanner;

class Q_A2_b_Series_sum {
    public static void main(String args[]) {
        int n;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of terms: ");
        n = sc.nextInt();
        sc.close();
        // n = 5;

        System.out.println();
        for (double i = 1; i <= n; i++) {
            System.out.print("(1/" + (int) i + ") * " + (int) i + " ");
            if (i != n)
                System.out.print("+ ");

            sum += 1 / i * i;
        }

        System.out.println("= " + sum);
        System.out.println();
    }
}
