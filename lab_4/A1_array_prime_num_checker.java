import java.util.Scanner;

class A1_array_prime_num_checker {
    public static void main(String args[]) {
        int n;
        // int arr[] = { 2, 7, 6, 9, 5 };
        // n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of elements in array: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        // reading array from user
        System.out.println("Enter values of array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        System.out.println("\nPrinting prime numbers in the given array:");
        for (int i = 0; i < n; i++)
            if (isPrime(arr[i]))
                System.out.print(arr[i] + " ");

        System.out.println("\n");
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
