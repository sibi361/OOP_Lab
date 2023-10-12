import java.util.Scanner;

class Q2_Replace_Repeating_Chars_With_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str, replaceWith;
        char prev;

        // String REPEATING_CHARACTERS_REGEX = ".*(\\w)\1+.*";
        String REPEATING_CHARACTERS_REGEX = ".*aa.*";

        // System.out.print("Enter string: ");
        // str = sc.nextLine();
        // System.out.print("Enter string to replace repeating characters with: ");
        // replaceWith = sc.nextLine();
        sc.close();
        str = "aaZbbbbcccddd";
        replaceWith = "X";
        prev = str.charAt(0);
        boolean printed = false, rpt = false;
        System.out.println();
        String n = "";

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                prev = str.charAt(i);
                if (printed) {
                    n += replaceWith;
                }
                printed = false;
                rpt = false;

            } else
                rpt = true;

            if (!printed) {
                printed = true;
                if (!rpt)
                    n += str.charAt(i);
            }

        }
        System.out.println(n);

        // System.out.println("\nAfter replacing:\n" + str + "\n");
        sc.close();
    }
}
