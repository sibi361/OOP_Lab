import java.util.Scanner;

class A4_array_merge {
    public static void main(String args[]) {
        System.out.println("Array Merger\n");

        int m, n, o = 0, temp;
        boolean swapped = false;
        // m = 3;
        // n = 4;
        // int a[] = { 5, 6, 7 };
        // int b[] = { 1, 2, 3, 4 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array 1: ");
        m = sc.nextInt();
        System.out.print("Enter length of array 2: ");
        n = sc.nextInt();

        int a[] = new int[m];
        int b[] = new int[n];
        System.out.print("Enter array 1 elements: ");
        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter array 1 elements: ");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        sc.close();

        int c[] = new int[m + n];
        for (int i = 0; i < m; i++)
            c[o++] = a[i];
        for (int i = 0; i < n; i++)
            c[o++] = b[i];

        System.out.println("\nNew array after merging:");
        for (int i = 0; i < o; i++)
            System.out.print(c[i] + " ");

        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o - i - 1; j++)
                if (c[j] > c[j + 1]) {
                    temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }

        System.out.println("\nNew array after merging and sorting:");
        for (int i = 0; i < o; i++)
            System.out.print(c[i] + " ");

        System.out.println("\n");
    }
}
