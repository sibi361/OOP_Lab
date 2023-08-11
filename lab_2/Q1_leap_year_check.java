import java.util.Scanner;

class Q1_leap_year_check {
    static boolean is_leap(int y) {
        if (y % 4 == 0)
            if (y % 100 == 0) {
                if (y % 400 == 0)
                    return true;
            } else
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        // int year = 2024;

        boolean result = is_leap(year);

        if (result)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is NOT a leap year");

        System.out.println();

    }
};
