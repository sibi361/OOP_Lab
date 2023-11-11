import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class NumOps {
    static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list)
            sum += num.doubleValue();
        return sum;
    }

    static double product(List<? extends Number> list) {
        double prod = 1;
        for (Number num : list)
            prod *= num.doubleValue();
        return prod;
    }
}

class Q4_Sum_Product_Generics_Wildcard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt;
        ArrayList<Double> listDouble;
        int count;

        System.out.print("Enter count: ");
        count = sc.nextInt();

        listInt = new ArrayList<Integer>(count);

        System.out.print("\nEnter integer elements: ");
        for (int i = 0; i < count; i++)
            listInt.add(sc.nextInt());

        System.out.println("Sum of all Integer elements = " +
                NumOps.sum(listInt));

        listDouble = new ArrayList<Double>(count);

        System.out.print("\nEnter double elements: ");
        for (int i = 0; i < count; i++)
            listDouble.add(sc.nextDouble());

        System.out.println("Product of all Double elements = " +
                NumOps.product(listDouble));

        System.out.println();
        sc.close();
    }
}
