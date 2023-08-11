import java.util.Scanner;

class Q5_calculator {
    static float calculate(float x, float y, char op) {
        switch (op) {
            case 43:
                return x + y;
            case 45:
                return x - y;
            case 42:
                return x * y;
            case 47:
                return x / y;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Example expression: 5 * 6");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Enter expression (Q to quit):");
            String input = sc.nextLine();
            // String input = "10 / 5";
            int inp_len = input.length();

            if (inp_len == 0) {
                System.out.println("Invalid expression. Remember to have spaces b/w literals.");
                break;
            } else if (input.charAt(0) == 'Q' || input.charAt(0) == 'q')
                break;

            String[] inp_split = input.trim().split("\\s+");
            if (inp_split.length != 3) {
                System.out.println("Invalid expression. Expression must have 3 literals.");
                System.out.println("For eg. 5 * 6");
            }

            float a = Float.parseFloat(inp_split[0]);
            float b = Float.parseFloat(inp_split[2]);
            char operation = inp_split[1].charAt(0);

            float result = calculate(a, b, operation);
            System.out.println("Answer = " + result);

            System.out.println();
        }
        sc.close();

    }
}
