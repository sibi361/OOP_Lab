import java.util.Scanner;

class EvenNumberException extends Exception {
    private String msg;

    public EvenNumberException() {
        msg = "Given number is even. Please enter odd numbers only " +
                "as they bring more luck when compared to even numbers";
    }

    public EvenNumberException(int num) {
        msg = num + " is an even number. Please enter odd numbers only " +
                "as they bring more luck when compared to even numbers";
    }

    public String getMessage() {
        return msg;
    }
}

class A3_EvenNumberException {
    public static void main(String args[]) throws EvenNumberException {
        Scanner sc = new Scanner(System.in);

        try {
            tellFortune(sc);
        } catch (EvenNumberException e) {
            System.out.println("\nCaught EvenNumberException: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }

    static void tellFortune(Scanner sc) throws EvenNumberException {
        int i, temp;

        i = 0;
        System.out.print("\nEnter five numbers to find luck: ");
        while (i++ < 5) {
            temp = sc.nextInt();
            if (temp % 2 == 0)
                throw new EvenNumberException(temp);
        }

        System.out.println("\nYou have very good fortune!");
    }
}
