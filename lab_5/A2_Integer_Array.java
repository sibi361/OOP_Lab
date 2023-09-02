import java.util.Scanner;

class IntArray {
    int array[];

    IntArray(int size) {
        array = new int[size];
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    void display() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    void displayLargest() {
        int largest = 0;

        for (int i = 1; i < array.length; i++)
            if (array[i] > array[largest])
                largest = i;

        System.out.println("\nLargest value : " + array[largest]);
    }

    void displayAverage() {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println("\nAverage = " + (sum / array.length));
    }

    void sortArray() {
        int temp;
        boolean swapped = false;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }
}

class A2_Integer_Array {
    public static void main(String args[]) {
        IntArray arr = new IntArray(10);

        arr.getInput();
        arr.display();
        arr.displayLargest();
        arr.displayAverage();

        System.out.println("\nArray after sorting:");
        arr.sortArray();
        arr.display();
    }
}
