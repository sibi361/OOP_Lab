import java.util.Scanner;

class A3_String_Concatenation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        System.out.print("Enter number of strings: ");
        n = sc.nextInt();

        // to read the newline on pressing enter
        // otherwise it will be read within loop
        sc.nextLine();

        String str_new = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            str_new = str_new.concat(sc.nextLine());
        }

        System.out.println("\nAfter concatenation:\n" + str_new + "\n");
        sc.close();
    }
}