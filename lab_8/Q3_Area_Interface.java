import java.util.Scanner;

interface Area {
    final float pi = 3.14152817F;

    void calculate();

    void display();
}

class Rect implements Area {
    float length, breadth;
    double area;

    Rect(float len, float br) {
        length = len;
        breadth = br;
    }

    public void calculate() {
        area = length * breadth;
    }

    public void display() {
        System.out.println("Area is = " + area);
    }
}

class Circle implements Area {
    float radius;
    double area;

    Circle(float rad) {
        radius = rad;
    }

    public void calculate() {
        area = pi * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("Area is = " + area);
    }
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

class Q3_Area_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nFor rectangle enter length and breadth: ");
        Rect r = new Rect(sc.nextFloat(), sc.nextFloat());
        r.calculate();
        r.display();

        System.out.print("\nFor circle, enter radius: ");
        Circle c = new Circle(sc.nextFloat());
        c.calculate();
        c.display();

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
