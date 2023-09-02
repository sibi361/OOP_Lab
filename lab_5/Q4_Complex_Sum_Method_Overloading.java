import java.util.Scanner;

class Complex {
    int a, b; // a + ib

    Complex(int a) {
        this.a = a;
    }

    Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static Complex add(int num1, Complex num2) {
        return new Complex(num1 + num2.a, num2.b);
    }

    static Complex add(Complex num1, Complex num2) {
        return new Complex(num1.a + num2.a, num1.b + num2.b);
    }
}

class Q4_Complex_Sum_Method_Overloading {
    public static void main(String args[]) {
        int temp;
        Complex comp1, comp2, tempc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adding integer and complex number");
        System.out.print("Enter integer: ");
        temp = sc.nextInt();
        System.out.print("Enter complex number a + ib as a b: ");
        comp1 = new Complex(sc.nextInt(), sc.nextInt());

        tempc = Complex.add(temp, comp1);
        System.out.println("Sum of given integer and complex number = " +
                tempc.a + " + i" + tempc.b);

        System.out.println("\nAdding two complex numbers");
        System.out.print("Enter first complex number a + ib as a b: ");
        comp1 = new Complex(sc.nextInt(), sc.nextInt());
        System.out.print("Enter second complex number a + ib as a b: ");
        comp2 = new Complex(sc.nextInt(), sc.nextInt());

        tempc = Complex.add(comp1, comp2);
        System.out.println("Sum of given integer and complex number = " +
                tempc.a + " + i" + tempc.b);

        sc.close();
        System.out.println();
    }
}
