import java.util.Scanner;

class Q1_Armstrong_number_checker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String inp = sc.next();
        sc.close();
        // String inp = "1634";

        int inp_num, inp_len, inp_num_backup, digit;
        inp_len = inp.length();
        inp_num = inp_num_backup = Integer.parseInt(inp);
        double sum = 0;

        for (int i = 0; i < inp_len; i++) {
            digit = inp_num % 10;
            sum += java.lang.Math.pow(digit, inp_len);
            inp_num /= 10;
        }

        if (sum == inp_num_backup)
            System.out.println(inp + " is an Armstrong number");
        else
            System.out.println(inp + " is NOT an Armstrong number");
        System.out.println();
    }
}
