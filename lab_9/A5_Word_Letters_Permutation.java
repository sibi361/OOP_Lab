import java.util.Scanner;

class A5_Word_Letters_Permutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp;
        int count, inp_len;

        System.out.print("Enter a five letter word: ");
        inp = sc.next();
        inp_len = inp.length();
        count = 0;

        if (inp_len != 5) {
            System.out.println("\nEnter a five letter word");
            System.exit(0);
        }

        for (int i = 0; i < inp_len; i++)
            for (int j = 0; j < inp_len; j++)
                for (int k = 0; k < inp_len; k++)
                    // avoid character repeatition
                    if (i != j &&
                            j != k &&
                            k != i) {
                        // "" necessary to avoid ASCII value addition
                        System.out.println("" +
                                inp.charAt(i) +
                                inp.charAt(j) +
                                inp.charAt(k));
                        count++;
                    }

        System.out.println("\nWord count: " + count);

        sc.close();
    }
}
