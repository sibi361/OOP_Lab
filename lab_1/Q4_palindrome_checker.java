import java.util.Scanner;

class Q4_palindrome_checker {
    static boolean is_palindrome(String input) {
        int len = input.length();

        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Enter an integer: ");
        String num = String.valueOf(scanner.nextInt());
        scanner.close();

        // String num = "123454321";
        // String num = "123456789";

        if (is_palindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is NOT a palindrome");

        System.out.println();
    }
}
