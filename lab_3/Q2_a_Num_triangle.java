import java.util.Scanner;

class Q2_a_Num_triangle {
    public static void main(String args[]) {
        System.out.println("Floyd's Triangle\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();
        // int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();
    }
}
