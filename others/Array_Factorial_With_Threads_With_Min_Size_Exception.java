import java.util.Scanner;

class TooLessSizeException extends Exception {
    String msg;

    TooLessSizeException(String inputMessage) {
        msg = inputMessage;
    }

    public String toString() {
        return msg;
    }
}

class Factorial {
    static double fact(int n) {
        double factorial = 1;

        if (n < 0)
            n *= -1;

        for (int i = n; i > 1; i--)
            factorial *= i;

        return factorial;
    }
}

class EvenFactorial extends Thread {
    int arr[];

    EvenFactorial(int[] arr) {
        this.arr = arr;
    }

    public void start() {
        for (int i : arr)
            if (i % 2 == 0)
                System.out.println("From thread Even: Factorial of " + i + " = " + Factorial.fact(i));
    }
}

class OddFactorial extends Thread {
    int arr[];

    OddFactorial(int[] arr) {
        this.arr = arr;
    }

    public void start() {
        for (int i : arr)
            if (i % 2 != 0)
                System.out.println("From thread Odd: Factorial of " + i + " = " + Factorial.fact(i));
    }
}

class Array_Factorial_With_Threads_With_Min_Size_Exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[0];

        try {
            arr = getArray(sc);
        } catch (TooLessSizeException e) {
            System.out.println("Caught TooLessSizeException: " + e);
        }

        EvenFactorial obj_even = new EvenFactorial(arr);
        OddFactorial obj_odd = new OddFactorial(arr);

        obj_even.start();
        obj_odd.start();

        System.out.println();
        sc.close();
    }

    static int[] getArray(Scanner sc) throws TooLessSizeException {
        int count, MINIMUM_SIZE, temp[];

        MINIMUM_SIZE = 3;

        System.out.print("Enter count: ");
        count = sc.nextInt();

        if (count < MINIMUM_SIZE)
            throw new TooLessSizeException("Too less size. Minimum size is " + MINIMUM_SIZE);

        temp = new int[count];

        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
            temp[i] = sc.nextInt();

        return temp;
    }
}
