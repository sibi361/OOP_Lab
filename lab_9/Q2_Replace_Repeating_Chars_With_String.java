import java.util.Scanner;

class Q2_Replace_Repeating_Chars_With_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str, replaceWith;
        char previous, current;
        boolean wasRepeating;
        StringBuffer newString;

        System.out.print("\nEnter string: ");
        str = sc.nextLine();
        System.out.print("Enter string to replace repeating characters with: ");
        replaceWith = sc.nextLine();

        // str = "aaaabcccdefghii";
        // replaceWith = "X";

        previous = '\0';
        wasRepeating = false;
        newString = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if (current != previous) {
                if (wasRepeating) {
                    newString.deleteCharAt(newString.length() - 1);
                    newString.append(replaceWith);
                    wasRepeating = false;
                }
                previous = current;
                newString.append(current);
            } else
                wasRepeating = true;
        }

        if (wasRepeating) {
            newString.deleteCharAt(newString.length() - 1);
            newString.append(replaceWith);
        }

        System.out.println("\nAfter replacing:\n" + newString + "\n");

        sc.close();
    }
}
