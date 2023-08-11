import java.util.Scanner;

class Q1_Area_Circumference {
    public static void main(String[] args) {
        float area, circumference;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = scanner.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = scanner.nextFloat();
        scanner.close();

        // int length, breadth;
        // length = 10;
        // breadth = 20;

        area = length * breadth;
        System.out.println("Area of rectangle with length " + length +
                " and breadth " + breadth + " = " + area);
        System.out.println();

        circumference = 2 * (length + breadth);
        System.out.println("Circumference of rectangle with length " + length +
                " and breadth " + breadth + " = " + circumference);

        System.out.println();
    }
};
