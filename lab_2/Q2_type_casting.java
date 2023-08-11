import java.util.Scanner;

class Q2_type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer = sc.nextInt();
        System.out.print("Enter double (big integer): ");
        double double_ = sc.nextDouble();
        System.out.print("Enter character: ");
        char character = sc.next().charAt(0);
        sc.close();

        byte int_byte = (byte) integer;
        int char_int = (int) character;
        byte double_byte = (byte) double_;
        int double_int = (int) double_;

        System.out.println("int to byte: " + integer + " -> " + int_byte);
        System.out.println("char to int: " + character + " -> " + char_int);
        System.out.println("double to byte: " + double_ + " -> " + double_byte);
        System.out.println("double to int: " + double_ + " -> " + double_int);

        System.out.println();
    }
}
