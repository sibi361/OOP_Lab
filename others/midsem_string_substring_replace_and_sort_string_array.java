import java.util.Scanner;

interface Demo_utility {
    void exist();
}

class One_String implements Demo_utility {
    String key, oneD[], backup[];
    int count, exists;

    One_String() {
        count = 0;
        input();
    }

    One_String(int user_count) {
        count = user_count;
        input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        // if (count == 0) {
        // System.out.print("\nEnter count: ");
        // count = sc.nextInt();
        // }
        count = 4;
        oneD = new String[count];
        backup = new String[count];

        // oneD[0] = "wimball";
        // oneD[1] = "penpencilball";
        // oneD[2] = "handballdef";
        // oneD[3] = "dbc";

        oneD[0] = "wimbll";
        oneD[1] = "penpencilbll";
        oneD[2] = "handblldef";
        oneD[3] = "dbc";

        // System.out.println("\nEnter elements: ");
        // for (int i = 0; i < count; i++)
        // oneD[i] = sc.next();

        // backing up oneD
        for (int i = 0; i < count; i++)
            backup[i] = oneD[i];
    }

    void perform() {
        System.out.println("performing");
    }

    public void exist() {
        int found_count = 0;
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter key: ");
        // key = sc.next();
        key = "ball";

        // checking for key
        for (int i = 0; i < count; i++) {
            if (oneD[i].indexOf(key) == -1)
                oneD[i] = reverse(oneD[i]);
            else {
                found_count += 1;
                oneD[i] = replace(oneD[i], key);
            }
        }

        if (found_count != 0)
            exists = 1;

        System.out.println("Key occurance count: " + found_count);
    }

    String reverse(String inp) {
        return (new StringBuffer(inp)).reverse().toString();
    }

    String replace(String inp, String key) {
        int i;
        i = inp.indexOf(key);
        StringBuffer s = new StringBuffer(inp);
        StringBuffer s2 = new StringBuffer();

        s2.append(s.substring(0, i + 1));
        s2.append("cbmm");
        s2.append(s.substring(i + key.length()));

        return s2.toString();
    }
}

class Actual extends One_String {
    Actual() {
        super();
        exists = 0;
    }

    Actual(int user_count) {
        super(user_count);
        exists = 0;
    }

    void perform() {
        exist();

        if (exists == 0) {// key not found at all
            sort();
            System.out.println("\nKey not found at all\n" +
                    "\nDisplaying original array after sorting: \n");

            for (int i = 0; i < count; i++)
                System.out.print(backup[i] + " ");
        } else {
            System.out.println("\nDisplaying array after finding key at least once: \n");

            for (int i = 0; i < count; i++)
                System.out.print(oneD[i] + " ");
        }
        System.out.println();
    }

    void sort() {
        String temp;
        int j;
        boolean swapped = false;

        // bubble sort
        for (int i = 0; i < count - 1; i++) {
            for (j = 0; j < count - i - 1; j++)
                // swapping
                if (backup[j].compareTo(backup[j + 1]) > 0) {
                    swapped = true;
                    temp = backup[j];
                    backup[j] = backup[j + 1];
                    backup[j + 1] = temp;
                }
            if (!swapped)
                break;
        }
    }
}

class Main {
    public static void main(String args[]) {
        Actual a = new Actual();
        One_String b = a;

        // dynamic method dispatch
        b.perform();

        System.out.println();
    }
}