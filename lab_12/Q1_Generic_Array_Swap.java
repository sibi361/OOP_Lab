import java.util.Scanner;

class Q1_Generic_Array_Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count;
        Integer arr[];

        System.out.print("\nEnter array size: ");
        count = sc.nextInt();
        arr = new Integer[count];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < count; i++)
            arr[i] = sc.nextInt();

        ArrayExchangePos(sc, arr);

        sc.close();
    }

    static <T> void ArrayExchangePos(Scanner sc, T[] arr) {
        int i, j;
        T temp;

        System.out.print("Enter positions to exchange: ");
        i = sc.nextInt() - 1;
        j = sc.nextInt() - 1;

        if (i > arr.length - 1 || j > arr.length - 1 || i < 0 || j < 0)
            System.out.println("\nInvalid position given\n");

        else if (i != j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            System.out.println("\nPrinting array after sorting: ");
            printArray(arr);
        }
    }

    static <T> void printArray(T[] arr) {
        for (T item : arr)
            System.out.print(item + " ");
        System.out.println();
    }
}
