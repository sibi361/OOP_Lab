class Test_Bit_Shift {
    public static void main(String[] args) {
        byte b = (byte) 2;
        byte c = (byte) 384;

        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));

        System.out.println();

        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));

        System.out.println("-----------------------");
        /*--------------------------------------------------*/
        // int overflow
        int e = 65536;
        e = -20;

        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));

        e >>= 1;
        System.out.println();

        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));
    }
}