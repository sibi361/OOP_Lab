class A2_ternary_smallest_largest {
    public static void main(String[] args) {
        int a = 2, b = 1, c = -10;
        int smallest, largest;

        smallest = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
        largest = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        // if (a < b)
        // if (a < c)
        // smallest = a;
        // else
        // smallest = c;
        // else {
        // if (b < c)
        // smallest = b;
        // else
        // smallest = c;
        // }

        // if (a > b)
        // if (a > c)
        // largest = a;
        // else
        // largest = c;
        // else {
        // if (b > c)
        // largest = b;
        // else
        // largest = c;
        // }

        System.out.println("Smallest: " + smallest);
        System.out.println();
        System.out.println("Largest: " + largest);
        System.out.println();
    }
};