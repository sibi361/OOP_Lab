import java.util.Scanner;

class Q3_bitwise_mul_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        int bitwise_multiply_two = num << 1;
        int bitwise_divide_two = num >> 1;

        System.out.println(num + " * 2 = " + bitwise_multiply_two);
        System.out.println(num + " / 2 = " + bitwise_divide_two);

        System.out.println();
    }
}