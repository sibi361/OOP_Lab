import java.util.Scanner;

class A4_Phone_Num_Display {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str, str_split[], area_code = "", num_split[], num;

        System.out.println("Enter phone number in the following format" +
                "[(555) 555-5555]:");
        str = sc.nextLine();
        sc.close();

        if (str.length() > 14 || str.length() == 0) {
            System.out.println("Invalid phone number");
            System.exit(0);
        }

        str_split = str.split("\\s+");

        if (str_split[0].charAt(0) == '(' &&
                str_split[0].charAt(4) == ')')
            area_code = str_split[0].substring(1, 4);
        else {
            System.out.println("Invalid phone number");
            System.exit(0);
        }

        num_split = str_split[1].split("-");
        num = num_split[0].concat(num_split[1]);

        System.out.println("\nArea code: " + area_code);
        System.out.println("Seven digit number: " + num + "\n");
    }
}