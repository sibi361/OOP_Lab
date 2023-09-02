import java.util.Scanner;

class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

class Q1_Box_Volume {
    public static void main(String args[]) {
        double volume;

        Scanner sc = new Scanner(System.in);

        // Box b = new Box(2, 3, 4.5);

        System.out.print("Enter box dimensions as width height depth: ");
        Box b = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();

        volume = b.getVolume();
        System.out.println("Volume of box = " + volume + " unit^3");
    }
}
