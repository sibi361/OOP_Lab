import java.util.Scanner;

abstract class Area {
    final float pi = 3.14152817F;
    float length, breadth, radius, side_length, base, height;
    double area;

    void display() {
        System.out.println("Area is = " + area);
    }
}

class Rect extends Area {
    Rect(float len, float br) {
        length = len;
        breadth = br;
    }

    void calculate() {
        area = length * breadth;
    }
}

class Circle extends Area {
    Circle(float rad) {
        radius = rad;
    }

    void calculate() {
        area = pi * Math.pow(radius, 2);
    }
}

class Square extends Area {
    Square(float side) {
        side_length = side;
    }

    void calculate() {
        area = Math.pow(side_length, 2);
    }
}

class Triangle extends Area {
    Triangle(float b, float h) {
        base = b;
        height = h;
    }

    void calculate() {
        area = 0.5 * base * height;
    }
}

class Q2_Area_Abstract_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nFor rectangle enter length and breadth: ");
        Rect r = new Rect(sc.nextFloat(), sc.nextFloat());
        r.calculate();
        r.display();

        System.out.println("\nFor circle, enter radius: ");
        Circle c = new Circle(sc.nextFloat());
        c.calculate();
        c.display();

        System.out.print("\nFor square, enter side length: ");
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
}
