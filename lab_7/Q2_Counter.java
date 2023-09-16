class Counter {
    static int c;

    Counter() {
        c++;
    }

    void display() {
        System.out.println("Counter is at " + c);
    }
}

class Q2_Counter {
    public static void main(String args[]) {
        Counter c;
        c = new Counter();
        c = new Counter();
        c = new Counter();
        c = new Counter();
        c = new Counter();
        c.display();
    }
}
