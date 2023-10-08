import java.util.Scanner;

class A1_String_Array_Sort_Alphabetical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st_array[], key, temp;
        int n;

        System.out.print("Enter number of strings: ");
        n = sc.nextInt();

        // to read the newline on pressing enter
        // otherwise it will be read within loop
        sc.nextLine();

        st_array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            st_array[i] = sc.nextLine();
        }
        sc.close();

        for (int i = 1; i < n; i++) {
            key = st_array[i];
            for (int j = i - 1; j >= 0 &&
                    st_array[j].compareTo(key) >= 0; j--) {
                temp = st_array[j];
                st_array[j] = st_array[j + 1];
                st_array[j + 1] = temp;
            }
        }

        System.out.println("\nString array after arranging in alphabetical order:");
        for (int i = 0; i < n; i++)
            System.out.println(st_array[i]);
        System.out.println();
    }
}