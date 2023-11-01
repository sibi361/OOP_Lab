import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class ListOps {
    static ArrayList<Integer> predicateTest(ArrayList<Integer> list) {
        ArrayList<Integer> list_new;
        int len;
        Predicate<Integer> predicateIsEven;

        len = list.size();
        if (len == 0)
            return new ArrayList<>();

        predicateIsEven = i -> (i % 2 == 0);
        list_new = new ArrayList<Integer>(len);

        for (int i = 0; i < len; i++)
            if (predicateIsEven.test(list.get(i)))
                list_new.add(list.get(i));

        return list_new;
    }

    static <T> ArrayList<T> merge(ArrayList<T> a, ArrayList<T> b) {
        int len_a, len_b, n, i, j, k;
        ArrayList<T> merged;

        len_a = a.size();
        len_b = b.size();

        if (len_a == 0 && len_b == 0)
            return new ArrayList<>();
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
        while (j < len_a)
            merged.add(a.get(j++));

        while (k < len_b)
            merged.add(b.get(k++));

        return merged;
    }
}

class Q10_Lists_Merger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        // Integer demonstration
        ArrayList<Integer> arr1, arr2, predicateSatisfied, merged;

        arr1 = new ArrayList<Integer>();
        arr2 = new ArrayList<Integer>();

        System.out.print("\nEnter length of array 1 and array 2: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.print("\nEnter array 1: ");
        for (int i = 0; i < n1; i++)
            arr1.add(sc.nextInt());

        System.out.print("\nEnter array 2: ");
        for (int i = 0; i < n2; i++)
            arr2.add(sc.nextInt());

        predicateSatisfied = ListOps.predicateTest(arr1);
        System.out.println("\nElements satisfying predicate, i.e. are even:");
        for (Integer i : predicateSatisfied)
            System.out.print(i + " ");

        merged = ListOps.merge(arr1, arr2);

        System.out.println("\n\nAfter alternate merging:");
        for (Integer i : merged)
            System.out.print(i + " ");
        System.out.println();

        // // compile thrown in case of type mismatch
        // ArrayList<String> arr3 = new ArrayList<String>();
        // arr3.add("abc");
        // arr3.add("def");
        // List<Integer> merged = ListOps.merge(arr1, arr3);

        // strings demonstration
        ArrayList<String> arr3, arr4, merged_strings;

        arr3 = new ArrayList<String>();
        arr4 = new ArrayList<String>();
        arr3.add("abc");
        arr3.add("ghi");
        arr4.add("def");
        arr4.add("jkl");

        merged_strings = ListOps.merge(arr3, arr4);

        System.out.println("\nStrings after alternate merging:");
        for (String str : merged_strings)
            System.out.print(str + " ");
        System.out.println();

        System.out.println();
        sc.close();
    }
}
