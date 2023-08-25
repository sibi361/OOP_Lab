import java.util.Scanner;

class A2_array_largest_smallest_finder {
    public static void main(String args[]) {
        int n, smallest, largest;
        // int arr[] = { 2, 7, 6, 9, 5 };
        // n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of elements in array: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        // reading array from user
        System.out.println("\nEnter values of array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        smallest = largest = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < smallest)
                smallest = arr[i];
            else if (arr[i] > largest)
                largest = arr[i];

        System.out.println("\nSmallest number in given array: " + smallest);
        System.out.println("\nLargest number in given array: " + largest);

        System.out.println();
    }

}
