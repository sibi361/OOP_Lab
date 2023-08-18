import java.util.Scanner;

class Q3_Prime_num_generator {
    public static void main(String args[]) {
        System.out.println("Prime number generator\n");

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        // m = 1
        // n = 15;

        if (m > n) {
            System.out.println("\nstart cannot be greater than end");
            System.exit(0);
        }
        if (m < 2)
            m = 2;
        if (n < 2)
            n = 2;

        System.out.println("\nPrime numbers from " + m + " till " +
                n + ":");

        boolean prime = true;
        double divisor_limit;
        for (int i = m; i <= n; i++) {
            prime = true;
            divisor_limit = java.lang.Math.pow(i, 0.5);

            for (int j = 2; j <= divisor_limit; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(i);
        }
        System.out.println();
    }
}
