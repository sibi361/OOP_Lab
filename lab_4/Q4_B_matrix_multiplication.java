import java.util.Scanner;

class Q4_B_matrix_multiplication {
    public static void main(String args[]) {
        int m, n, o, p;
        // m = n = o = p = 3;
        // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int b[][] = { { 1, 1, -1 }, { 1, 2, 0 }, { -1, 0, 10 } };

        // m = p = 1;
        // n = o = 2;
        // int a[][] = new int[1][2];
        // a[0][0] = 1;
        // a[0][1] = 2;
        // int b[][] = { { 3 }, { 4 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns of first matrix as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.print("\nEnter rows and columns of second matrix as m n: ");
        o = sc.nextInt();
        p = sc.nextInt();

        if (n != o) {
            System.out.print("\nERROR: Number of columns of first matrix must " +
                    "be equal to the number of rows in the second matrix\n");
            System.exit(0);
        }

        // initializing matrices
        int a[][] = new int[m][n];
        int b[][] = new int[o][p];
        int c[][] = new int[m][p];

        // reading matrices from user
        System.out.println("\nEnter values of first matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("\nEnter values of second matrix: ");
        for (int i = 0; i < o; i++)
            for (int j = 0; j < p; j++)
                b[i][j] = sc.nextInt();
        sc.close();

        // calculating product
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }

        System.out.println("\nSolution:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\n*\n");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\n=\n");

        // printing output matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }

        System.out.println();
    }
}
