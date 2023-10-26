import java.util.Scanner;

class ImplementRunnablePrintOdd implements Runnable {
    public void run() {
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

class ExtendsThreadPrintOdd extends Thread {
    public void run() {
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Q1_Thread_Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for implementing Runnable interface\n" +
                "and 2 for extending Thread class: ");

        switch (sc.nextInt()) {
            case 1:
                new Thread(new ImplementRunnablePrintOdd()).start();
                break;
            case 2:
                new ExtendsThreadPrintOdd().start();
                break;
            default:
                System.out.println("Error: Invalid option");
        }

        sc.close();
    }
}
