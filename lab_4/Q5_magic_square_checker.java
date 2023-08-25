import java.util.Scanner;

class Q5_magic_square_checker {
    public static void main(String args[]) {
        int m, n, diag_sum = 0, temp_sum = 0;
        boolean magic_square = true;
        // m = n = 3;
        // int mat[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();

        if (m != n) {
            System.out.println("\nERROR: Magic square must be a square matrix " +
                    " i.e. have the same number of rows and columns\n");
            System.exit(0);
        }

        int mat[][] = new int[m][n];

        // reading matrix from user
        System.out.println("\nEnter values of matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        sc.close();

        // calculating diagonal sum
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (i == j)
                    diag_sum += mat[i][j];

        // checking rows
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                temp_sum += mat[i][j];
            if (temp_sum != diag_sum) {
                magic_square = false;
                break;
            }
            temp_sum = 0;
        }

        // checking columns
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                temp_sum += mat[i][j];
            if (temp_sum != diag_sum) {
                magic_square = false;
                break;
            }
            temp_sum = 0;
        }

        // checking non-principle diagonal
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--)
                temp_sum += mat[i][j];
            if (temp_sum != diag_sum) {
                magic_square = false;
                break;
            }
            temp_sum = 0;
        }

        System.out.println("\nThe given matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }

        if (magic_square)
            System.out.print("\nis a magic square");
        else
            System.out.print("\nis NOT a magic square");

        System.out.println();
    }
}
