import java.util.Scanner;

class Q_A2_a_Series_sine {
    static double fact(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String args[]) {
        System.out.println("Sine Calculator\n");
        int n, num;
        double x, power, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degrees in radians: ");
        x = sc.nextDouble();
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        sc.close();

        // x = 1.57079632679; // 90 degrees in radians; sin(90) = 1
        // x = 0.523598775; // 30 degrees in radians; sin(30) = 0.5
        // n = 20;

        for (int i = 1; i <= n; i++) {
            num = 2 * i - 1;
            power = java.lang.Math.pow(x, num);

            if (i % 2 == 0)
                sum -= power / fact(num);
            else
                sum += power / fact(num);
        }
        System.out.println("\nsin(" + x + ") = " + sum);

        System.out.println();
    }
}
