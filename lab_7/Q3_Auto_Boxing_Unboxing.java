class Q3_Auto_Boxing_Unboxing {
    public static void main(String args[]) {
        // auto boxing
        Byte wrapped_b = -2;
        Short wrapped_s = -1;
        Integer wrapped_in = 1;
        Long wrapped_l = (long) 988775421;
        Float wrapped_f = 2.4F;
        Double wrapped_d = 123.456;
        Character wrapped_c = 'Z';

        // auto unboxing
        byte b = wrapped_b;
        short s = wrapped_s;
        int in = wrapped_in;
        long l = wrapped_l;
        float f = wrapped_f;
        double d = wrapped_d;
        char c = wrapped_c;

        System.out.println("After auto-unboxing: ");
        System.out.println("Byte : " + b);
        System.out.println("Short : " + s);
        System.out.println("Integer : " + in);
        System.out.println("Long : " + l);
        System.out.println("Float : " + f);
        System.out.println("Double : " + d);
        System.out.println("Character : " + c);
        System.out.println();
    }
}
