import java.util.Scanner;

class OddArraySizeException extends Exception {
    public String toString() {
        return "\nOddArraySizeException: Count must be even";
    }
}

class ArraySearcher extends Thread {
    int array[], key;
    boolean found = false;

    ArraySearcher(int[] array, int key) {
        this.array = array;
        this.key = key;
    }

    public void start(int start_i, int end_i) {
        for (int i = start_i; i < end_i; i++)
            if (array[i] == key) {
                found = true;
                System.out.println("\nSearch term found at position " + (i + 1));
            }
    }
}

class Q6_Array_Searcher_Even_Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, arr[], key;

        System.out.print("\nEnter count: ");
        n = sc.nextInt();

        arr = new int[1];
        try {
            arr = getArray(sc, n);
        } catch (OddArraySizeException e) {
            System.out.println(e);
            System.exit(0);
        }

        System.out.print("\nEnter search term: ");
        key = sc.nextInt();

        ArraySearcher as_first_thread = new ArraySearcher(arr, key);
        ArraySearcher as_second_thread = new ArraySearcher(arr, key);

        as_first_thread.start(0, n / 2);
        as_second_thread.start(n / 2, n);

        if (!as_first_thread.found && !as_second_thread.found)
            System.out.println("\nSearch term NOT found in array");

        System.out.println();
        sc.close();
    }

    static int[] getArray(Scanner sc, int n) throws OddArraySizeException {
        if (n % 2 != 0)
            throw new OddArraySizeException();

        int[] temp = new int[n];

        System.out.println("\nEnter elements:");
        for (int i = 0; i < n; i++)
            temp[i] = sc.nextInt();

        return temp;
    }
}
