import java.util.Scanner;

class Q1_String_Statistics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        int characters = 0, words = 0, lines = 0, vowels = 0;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        characters = str.length();
        if (characters != 0)
            words = 1;

        for (int i = 0; i < characters; i++) {
            switch (str.charAt(i)) {
                case ' ':
                    words++;
                    break;
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels++;
                    break;
                case '\n':
                    lines++;
                    break;
            }
        }

        System.out.println("\nCharacters: " + characters +
                "\nWords: " + words +
                "\nLines: " + lines +
                "\nVowels: " + vowels);
        sc.close();
    }
}
