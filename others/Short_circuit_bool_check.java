class Short_circuit_bool_check {
    public static void main(String args[]) {

        int m, n, o;
        m = n = o = 1;
        // n = 2;
        // o = 3;

        // first one was true, next not checked
        if (m++ == 1 || n++ == 1 || o++ == 1)
            System.out.println("|| " + m + " " + n + " " + o);

        // logical checks all
        m = n = o = 1;
        if (m++ == 1 | n++ == 1 | o++ == 1)
            System.out.println("| " + m + " " + n + " " + o);

        m = n = o = 0;
        if (m++ == 1 && n++ == 1 && o++ == 1)
            System.out.println("&& " + m + " " + n + " " + o);
        System.out.println("&& " + m + " " + n + " " + o);

        m = n = o = 0;
        if (m++ == 1 & n++ == 1 & o++ == 1)
            System.out.println("& " + m + " " + n + " " + o);
        System.out.println("& " + m + " " + n + " " + o);
    }
}
