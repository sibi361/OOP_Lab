import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

class CollectionCounter<T extends Collection<Integer>> {
    T list;
    int primeCount;

    CollectionCounter(T obj) {
        list = obj;
    }

    int count() {
        for (Integer num : list)
            if (isPrime(num))
                primeCount++;

        return primeCount;
    }

    static boolean isPrime(Integer n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

class Q8_Collections_Prime_Counter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter count: ");
        n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        CollectionCounter<ArrayList<Integer>> counter = new CollectionCounter<ArrayList<Integer>>(list);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("\nPrime number count = " + counter.count());

        System.out.println();
        sc.close();
    }
}
