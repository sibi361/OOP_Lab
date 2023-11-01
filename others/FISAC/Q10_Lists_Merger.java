import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class ListOps {
    static List<Integer> predicateTest(List<Integer> list) {
        List<Integer> list_new;
        int len;
        Predicate<Integer> predicateIsEven;

        len = list.size();
        if (len == 0)
            return null;

        predicateIsEven = i -> (i % 2 == 0);
        list_new = new ArrayList<>(len);

        for (int i = 0; i < len; i++)
            if (predicateIsEven.test(list.get(i)))
                list_new.add(list.get(i));

        return list_new;
    }

    static <T> List<T> merge(List<T> a, List<T> b) {
        int len_a, len_b, n, i, j, k;
        List<T> merged;

        len_a = a.size();
        len_b = b.size();

        if (len_a == 0 && len_b == 0)
            return null;
        else if (len_a == 0)
            return new ArrayList<>(b);
        else if (len_b == 0)
            return new ArrayList<>(a);

        merged = new ArrayList<>(len_a + len_b);

        n = len_a > len_b ? len_a : len_b;
        i = j = k = 0;

        for (; i < n; i = i + 2) {
            merged.add(a.get(j++));
            merged.add(b.get(k++));
        }

        // adding trailing elements
        for (; j < len_a; j++)
            merged.add(a.get(j));

        for (; k < len_b; k++)
            merged.add(b.get(k));

        return merged;
    }
}

class Q10_Lists_Merger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        System.out.print("\nEnter length of array 1 and array 2: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.print("\nEnter array 1: ");
        for (int i = 0; i < n1; i++)
            arr1.add(sc.nextInt());

        System.out.print("\nEnter array 2: ");
        for (int i = 0; i < n2; i++)
            arr2.add(sc.nextInt());

        List<Integer> predicateSatisfied = ListOps.predicateTest(arr1);

        System.out.println("\nElements satisfying predicate, i.e. are even:");
        for (Integer i : predicateSatisfied)
            System.out.print(i + " ");
        System.out.println();

        List<Integer> merged = ListOps.merge(arr1, arr2);

        System.out.println("\nAfter alternate merging:");
        for (Integer i : merged)
            System.out.print(i + " ");
        System.out.println();

        // // throws compile time error due to type mismatch
        // ArrayList<String> arr3 = new ArrayList<String>();
        // arr3.add("abc");
        // arr3.add("def");
        // List<Integer> merged = ListOps.merge(arr1, arr3);

        System.out.println();
        sc.close();
    }
}
