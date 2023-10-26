class MultiplicationTable extends Thread {
    int n;

    MultiplicationTable(int n) {
        this.n = n;
    }

    public void start() {
        System.out.println("\nPrinting multiplication table for " + n + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
    }
}

class Q4_Priority {
    public static void main(String args[]) {

        MultiplicationTable five = new MultiplicationTable(5);
        MultiplicationTable ten = new MultiplicationTable(10);

        five.setPriority(1);
        ten.setPriority(10);

        ten.start();
        five.start();
    }
}
