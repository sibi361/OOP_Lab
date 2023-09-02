class A3_Swap {
    public static void main(String args[]) {
        int x = 2, y = 5, temp;

        System.out.println("Swap by value:");
        System.out.println("Before swap x = " + x + ", y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap x = " + x + ", y = " + y);
    }
}
