class Square {
    static int square(int a) {
        return a * a;
    }

    static double square(double a) {
        return a * a;
    }
}

class A5_Square {
    public static void main(String args[]) {
        System.out.println(Square.square(3));
        System.out.println(Square.square(0.2));
    }
}
