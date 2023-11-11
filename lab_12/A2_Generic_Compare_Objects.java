import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

class Comparator {
    static <T extends Comparable<T>> T findLargest(T a, T b, T c) {
        return (a.compareTo(b) > 0) ? (a.compareTo(c) > 0) ? a : c : (b.compareTo(c) > 0) ? b : c;
    }

    static <T extends Comparable<T>> T findSmallest(T a, T b, T c) {
        return (a.compareTo(b) < 0) ? (a.compareTo(c) < 0) ? a : c : (b.compareTo(c) < 0) ? b : c;
    }
}

class A2_Generic_Compare_Objects {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers to compare: ");

        System.out.print("\nLargest integer: " +
                Comparator.findLargest(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        System.out.print("\n\nEnter three strings to compare: ");

        System.out.print("\nLargest string: " +
                Comparator.findLargest(sc.next(), sc.next(), sc.next()));

        System.out.println();
        sc.close();
    }
}
