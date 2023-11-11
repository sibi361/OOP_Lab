import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Printer {
    static <T extends List> void print(T list) {
        for (Object obj : list)
            System.out.print(obj + " ");
        System.out.println();
    }
}

class A1_Generic_Array_Printer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt;
        ArrayList<String> listString;
        int count;

        System.out.print("Enter count: ");
        count = sc.nextInt();

        listInt = new ArrayList<Integer>(count);

        System.out.print("\nEnter integer elements: ");
        for (int i = 0; i < count; i++)
            listInt.add(sc.nextInt());

        System.out.println("Printing integer array:");
        Printer.print(listInt);

        listString = new ArrayList<String>(count);

        System.out.print("\nEnter strings: ");
        for (int i = 0; i < count; i++)
            listString.add(sc.next());

        System.out.println("Product string array:");
        Printer.print(listString);

        System.out.println();
        sc.close();
    }
}
