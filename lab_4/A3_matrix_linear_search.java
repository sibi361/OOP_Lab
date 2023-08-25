import java.util.Scanner;

class A3_matrix_linear_search {
    public static void main(String args[]) {
        int m, n, searchQuery;
        // m = n = 3;
        // searchQuery = 4;
        // int mat[][] = { { 4, 2, 3 }, { 4, 5, 4 }, { 7, 8, 4 } };

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

        System.out.print("\nEnter search query: ");
        searchQuery = sc.nextInt();
        sc.close();

        System.out.println("\n" + searchQuery + " is found at:");

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == searchQuery) {
                    System.out.println("a[" + i + "][" + j + "]");
                }

        System.out.println();
    }
}
