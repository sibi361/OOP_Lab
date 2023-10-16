import java.util.Scanner;

class A2_Array_NegativeArraySizeException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count;
        int arr[] = {};

        System.out.print("\nEnter array size: ");
        count = sc.nextInt();

        try {
            arr = new int[count];
            insertElementIntoArray(sc, arr, count);
        } catch (NegativeArraySizeException e) {
            System.out.println("\nCaught NegativeArraySizeException: " +
                    "Array size cannot be negative");
        } finally {
            System.out.println();
            sc.close();
        }
    }

    static void insertElementIntoArray(Scanner sc, int[] arr, int count)
            throws ArrayIndexOutOfBoundsException {
        int pos, temp;

        System.out.print("Enter position to insert at: ");
        pos = sc.nextInt();
        System.out.print("Enter element: ");
        temp = sc.nextInt();

        arr[pos - 1] = temp;
        System.out.println("\n" + temp + " successfully inserted into array");

        System.out.println("\nPrinting array contents:");
        for (int i = 0; i < count; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
