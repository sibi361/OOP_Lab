import java.util.Scanner;

class Q4_Array_linear_search {
    public static void main(String args[]) {
        System.out.println("Array Linear Search\n");
        Scanner sc = new Scanner(System.in);

        int n, searchQuery;
        boolean found = false;

        n = 9;
        // searchQuery = 1;
        // int arr[] = { 1, 2, 3, 1, 2, 1, 5, 6, 7 };

        System.out.print("Enter length of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("\nEnter search query: ");
        searchQuery = sc.nextInt();
        sc.close();

        System.out.println("\nThe value is found at location(s):");

        for (int i = 0; i < n; i++)
            if (arr[i] == searchQuery) {
                found = true;
                System.out.print("a[" + i + "] ");
            }

        if (!found)
            System.out.println("Search query not found in array\n");

        System.out.println("\n");

    }
}
