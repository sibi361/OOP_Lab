class Q4_type_conversion_data_loss {
    public static void main(String[] args) {
        int x = 10;
        double y = x;
        System.out.println(y);
        // // 10 becomes 10.0

        // double x = 10.5;
        // int y = x;
        // System.out.println(y);
        // // Type mismatch: cannot convert from double to int

        // double x = 10.5;
        // int y = (int) x;
        // System.out.println(y);
        // // 10.5 -> 10 i.e. explicit type cast
    }
}