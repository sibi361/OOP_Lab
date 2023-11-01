import java.util.Scanner;

class InvalidStringException extends Exception {
    public String toString() {
        return "InvalidStringException: No word found starting with a vowel.";
    }
}

class VowelWordsCounter extends Thread {
    String str;

    VowelWordsCounter(String str) {
        this.str = str;
    }

    public void start() {
        try {
            System.out.println("Number of words beginning with a vowel = " + countFirstLettertVowels(str));
        } catch (InvalidStringException e) {
            System.out.println(e);
        }
    }

    static int countFirstLettertVowels(String str) throws InvalidStringException {
        String[] words = str.split("\s");
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < words.length; i++)
            if (vowels.indexOf(words[i].charAt(0)) != -1)
                count++;

        if (count == 0)
            throw new InvalidStringException();

        return count;
    }
}

class WordLengthFinder extends Thread {
    String str;

    WordLengthFinder(String s) {
        str = s;
    }

    public void start() {
        String[] words = str.split("\s");

        System.out.println("\nWord\tLength");
        for (int i = 0; i < words.length; i++)
            System.out.println(words[i] + "\t" + words[i].length());
    }
}

class Q2_Vowel_Counter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("\nEnter string: ");
        str = sc.nextLine();
        System.out.println();

        Thread t1 = new VowelWordsCounter(str);
        Thread t2 = new WordLengthFinder(str);

        t1.start();
        t2.start();

        System.out.println();
        sc.close();
    }
}
