import java.util.Scanner;

class Q4_A_matrix_addition {
    public static void main(String args[]) {
        int m, n;
        // m = n = 3;
        // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int b[][] = { { 1, 1, -1 }, { 1, 2, 0 }, { -1, 0, 10 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();

        // initializing matrices
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        // reading matrices from user
        System.out.println("\nEnter values of first matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("\nEnter values of second matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();
        sc.close();

        // calculating sum
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("\nSolution:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\n+\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\n=\n");

        // printing output matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }

        System.out.println();
    }
}
