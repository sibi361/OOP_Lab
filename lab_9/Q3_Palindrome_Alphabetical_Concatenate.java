import java.util.Scanner;

class Q3_Palindrome_Alphabetical_Concatenate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        int option;

        System.out.print("Enter string: ");
        str = sc.nextLine();

        System.out.print("1 Check for palindrome\n" +
                "2 Write in alphabetical order\n" +
                "3 Reverse the string\n" +
                "4 Concatenating with reversed string\n" +
                "\nEnter option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                if (isPalindrome(str))
                    System.out.println("\nGiven string is a palindrome\n");
                else
                    System.out.println("\nGiven string is NOT a palindrome.\n");
                break;

            case 2:
                str = sortAlphabetically(str);
                System.out.println("\nGiven string after sorting alphabetically:\n" + str);
                break;

            case 3:
                str = reverse(str);
                System.out.println("Given string after reversing:\n");
                System.out.println(str);
                break;

            case 4:
                str = concatenateWithReverse(str);
                System.out.println("Given string after concatenating with reverse:\n");
                System.out.println(str);
                break;

            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }

    static String reverse(String str) {
        return (new StringBuffer(str)).reverse().toString();
    }

    static String concatenateWithReverse(String str) {
        return str.concat(reverse(str));
    }

    static boolean isPalindrome(String str) {
        int n = str.length();

        boolean flag = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = false;
                break;
            }
        }

        if (flag)
            return true;
        else
            return false;

    }

    static String sortAlphabetically(String input) {
        StringBuffer str = new StringBuffer(input);
        char key, temp;
        int n = str.length();

        // insertion sort
        for (int i = 0; i < n; i++) {
            key = str.charAt(i);
            for (int j = i; j >= 0 && str.charAt(j) > key; j--) {
                temp = str.charAt(j);
                str.setCharAt(j, str.charAt(j - 1));
                str.setCharAt(j - 1, temp);
            }
        }

        return str.toString();
    }
}
