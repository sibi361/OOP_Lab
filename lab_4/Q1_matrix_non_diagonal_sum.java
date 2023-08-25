import java.util.Scanner;

class Q1_matrix_non_diagonal_sum {
    public static void main(String args[]) {
        int m, n, sum = 0;
        // m = n = 3;
        // int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();

        if (m != n) {
            System.out.println("\nERROR: Diagonal sum can be done only for square matrices\n");
            System.exit(0);
        }

        int mat[][] = new int[m][n];

        // reading matrix from user
        System.out.println("\nEnter values: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        sc.close();

        System.out.println("\nPrinting non-principle diagonal elements of given matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (i != j) {
                    System.out.print(mat[i][j] + "\t");
                    sum += mat[i][j];
                } else
                    System.out.print("\t");
            System.out.println();
        }

        System.out.println("\nSum of non-principle diagonal elements = " + sum);

        System.out.println();
    }
}
