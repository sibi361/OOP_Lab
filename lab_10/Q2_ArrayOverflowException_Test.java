import java.util.Scanner;

class Q2_ArrayOverflowException_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count, arr[];

        System.out.print("\nEnter array size: ");
        count = sc.nextInt();

        arr = new int[count];

        insertElementIntoArray(sc, arr, count);
    }

    static void insertElementIntoArray(Scanner sc, int[] arr, int count)
            throws ArrayIndexOutOfBoundsException {
        int pos, temp;

        System.out.print("Enter position to insert at: ");
        pos = sc.nextInt();

        System.out.print("Enter element: ");
        temp = sc.nextInt();

        try {
            arr[pos - 1] = temp;
            System.out.println("\n" + temp + " successfully inserted into array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "\nCaught ArrayIndexOutOfBoundsException: Given position " +
                            "is invalid. Valid positions are 1 to "
                            + count);
        } finally {
            System.out.println("\nPrinting array contents:");
            for (int item : arr)
                System.out.print(item + " ");
            System.out.println("\n");
            sc.close();
        }
    }
}
