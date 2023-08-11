class A3_test_boolean {
    public static void main(String[] args) {
        boolean x = true;
        // int y = (int) x;
        // Type mismatch: cannot convert from boolean to int

        // int z = (int) x;
        // even this won't work

        int zz = x ? 1 : 0; // solution
        System.out.print(zz);
    }
};