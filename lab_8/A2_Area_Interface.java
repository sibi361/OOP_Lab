import java.util.Scanner;

interface Area {
    final float pi = 3.14152817F;

    void display();

    void calculate();
}

class Square implements Area {
    float side_length;
    double area;

    Square(float side) {
        side_length = side;
    }

    public void calculate() {
        area = Math.pow(side_length, 2);
    }

    public void display() {
        System.out.println("Area is = " + area);
    }
}

class Triangle implements Area {
    float base, height;
    double area;

    Triangle(float b, float h) {
        base = b;
        height = h;
    }

    public void calculate() {
        area = 0.5 * base * height;
    }

    public void display() {
        System.out.println("Area is = " + area);
    }
}

class A2_Area_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nFor square enter side length: ");
        Square s = new Square(sc.nextFloat());
        s.calculate();
        s.display();

        System.out.print("\nFor triangle, enter base and height: ");
        Triangle t = new Triangle(sc.nextFloat(), sc.nextFloat());
        t.calculate();
        t.display();

        sc.close();
        System.out.println();
    }
};
