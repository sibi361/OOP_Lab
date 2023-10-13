import java.util.Scanner;

public class Q2_ArrayOverflowException_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count, arr[], pos, temp;

        System.out.print("Enter array size: ");
        count = sc.nextInt();

        arr = new int[count];

        System.out.print("Enter element to insert: ");
        temp = sc.nextInt();
        System.out.print("Enter position to insert element at: ");
        pos = sc.nextInt();

        try {
            arr[pos - 1] = temp;
            System.out.println("\n" + temp +
                    " successfully inserted at position " +
                    pos
                    + "\nPrinting array:");
            for (int i = 0; i < count; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Allowed values for position are 1 to " +
                    count);
        }

        sc.close();
    }
}
