import java.util.Scanner;

class Q4_Compare_Convert_Switch_Case_Substring_Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str, str2;
        int option, result;

        System.out.print("\n1 Compare two strings\n" +
                "2 Switch character cases\n" +
                "3 Check whether an entered string is a substring of the other\n" +
                "\nEnter option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter string 1: ");
                str = sc.next();
                System.out.print("Enter string 2: ");
                str2 = sc.next();
                result = str.compareTo(str2);
                if (result < 0)
                    System.out.println("\nstring 1 < string 2\n");
                else if (result > 0)
                    System.out.println("\nstring 1 > string 2\n");
                else
                    System.out.println("\nGiven strings are identical\n");
                break;

            case 2:
                System.out.print("Enter string: ");
                sc.nextLine();
                str = sc.nextLine();
                str = swapCase(str);
                System.out.println("\nGiven string after swapping cases:\n" + str);
                break;

            case 3:
                System.out.print("Enter string 1: ");
                str = sc.next();
                System.out.print("Enter string 2: ");
                str2 = sc.next();
                if (str2.contains(str))
                    System.out.println("String 1 is substring of string 2:\n");
                else
                    System.out.println("String 1 is NOT a substring of string 2:\n");
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }

    static String swapCase(String input) {
        StringBuffer str = new StringBuffer(input);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
                str.setCharAt(i, str.substring(i, i + 1).toLowerCase().charAt(0));
            else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                str.setCharAt(i, str.substring(i, i + 1).toUpperCase().charAt(0));
        }

        return str.toString();
    }
}
