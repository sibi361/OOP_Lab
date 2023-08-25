import java.util.Scanner;

class Q3_matrix_symmetric_checker {
    public static void main(String args[]) {
        int m, n;
        boolean symmetric = true;
        // m = n = 3;
        // int mat[][] = { { 1, 1, -1 }, { 1, 2, 0 }, { -1, 0, 10 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();

        if (m != n) {
            System.out.print("\nThe given matrix is NOT symmetric as the number " +
                    "of rows do not match the number of columns\n");
            System.exit(0);
        }

        int mat[][] = new int[m][n];

        // reading matrix from user
        System.out.println("\nEnter values: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        sc.close();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[j][i]) {
                    symmetric = false;
                    break;
                }

        if (symmetric)
            System.out.print("\nThe given matrix is symmetric");
        else
            System.out.print("\nThe given matrix is NOT symmetric");

        System.out.println("\n");
    }
}
