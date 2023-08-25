import java.util.Scanner;

class A5_matrix_trace_norm {
    public static void main(String args[]) {
        int m, n, trace = 0;
        float sum = 0, norm;
        // m = n = 3;
        // int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns as m n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int mat[][] = new int[m][n];

        // reading matrix from user
        System.out.println("\nEnter values: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        sc.close();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum += (float) Math.pow(mat[i][j], 2);

        norm = (float) Math.pow(sum, 0.5);
        System.out.println("\nNorm of the given matrix = " + norm);

        if (m != n) {
            System.out.print("\nTrace can be calculated only for square matrix\n");
        } else {
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    if (i == j)
                        trace += mat[i][j];
            System.out.print("\nTrace of the given matrix = " + trace + "\n");
        }
        System.out.println();
    }
}
