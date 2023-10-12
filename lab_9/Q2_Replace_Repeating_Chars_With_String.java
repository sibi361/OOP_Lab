import java.util.Scanner;

class Q2_Replace_Repeating_Chars_With_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str, replaceWith;
        char prev;
        int i;

        // System.out.print("Enter string: ");
        // str = sc.nextLine();
        // System.out.print("Enter string to replace repeating characters with: ");
        // replaceWith = sc.nextLine();
        // sc.close();

        str = "aaaabcccdefghii";
        replaceWith = "X";
        prev = '\0';
        boolean printed = false, wasRepeating = false;
        System.out.println();
        // String n = "";

        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                if (wasRepeating) {
                    System.out.print('\b' + replaceWith);
                    wasRepeating = false;
                }
                prev = str.charAt(i);
                System.out.print(str.charAt(i));
            } else
                wasRepeating = true;
        }

        if (wasRepeating)
            System.out.print('\b' + replaceWith);

        System.out.println();

        // System.out.println("\nAfter replacing:\n" + str + "\n");
        sc.close();
    }
}
