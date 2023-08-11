import java.util.Scanner;

class A1_test_exps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Given a = " + a + " and b = " + b);
        System.out.println();
        System.out.println("(a << 2) + (b >> 2) = " + (a << 2) + (b >> 2));
        System.out.println("(b > 0) = " + (b > 0));
        System.out.println("(a + b * 100) / 10 = " + ((a + b * 100) / 10));
        System.out.println("a & b = " + (a & b));
        System.out.println();
    }
};
