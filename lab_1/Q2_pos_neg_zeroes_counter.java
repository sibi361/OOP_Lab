import java.util.Scanner;

class Q2_pos_neg_zeroes_counter {
    public static void main(String[] args) {
        int n = 10;
        int negative = 0, zeroes = 0, positive = 0, input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + n + " numbers:");
        while (n > 0) {
            input = scanner.nextInt();

            if (input < 0)
                negative++;
            else if (input == 0)
                zeroes++;
            else
                positive++;

            n--;
        }

        scanner.close();

        System.out.println("Count of negative: " + negative);
        System.out.println("Count zeroes: " + zeroes);
        System.out.println("Count of positive: " + positive);

        System.out.println();
    }
};
