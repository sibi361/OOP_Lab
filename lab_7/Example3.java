class Example3 {
    static int num;
    static String mystr;
    static {
        num = 97;
        mystr = "Static keyword in Java";
    }

    public static void main(String args[]) {
        System.out.println("Valueof num=" + num);
        System.out.println("Valueof mystr=" + mystr);
    }
}
