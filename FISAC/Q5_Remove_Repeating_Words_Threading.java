import java.util.Scanner;

class StringOperations extends Thread {
    Scanner sc;
    String str, words[], words_unique[], words_repeated_printed[];
    int i = 0, j = 0;

    StringOperations() {
        sc = new Scanner(System.in);
    }

    synchronized void readString() {
        System.out.print("Enter string: ");
        str = sc.nextLine();
    }

    synchronized void findRepeating() {
        words = str.split("\s");
        words_unique = new String[words.length];
        words_repeated_printed = new String[words.length];

        System.out.println("\nRepeating words:");
        for (String word : words)
            if (!contains(words_unique, word))
                words_unique[i++] = word;
            else if (!contains(words_repeated_printed, word)) {
                System.out.println(word);
                words_repeated_printed[j++] = word;
            }
    }

    synchronized void deleteRepeating() {
        if (words_unique.length == 0)
            findRepeating();

        System.out.println("\nGiven string after removing repeating words:");
        for (String word : words_unique)
            if (word != null)
                System.out.print(word + " ");
        System.out.println();
    }

    static boolean contains(String[] words, String key) {
        for (String word : words)
            if (word != null && word.equals(key))
                return true;
        return false;
    }
}

class Reader extends Thread {
    StringOperations sops;

    Reader(StringOperations sops) {
        this.sops = sops;
    }

    public void start() {
        sops.readString();
    }
}

class FindRepeating extends Thread {
    StringOperations sops;

    FindRepeating(StringOperations sops) {
        this.sops = sops;
    }

    public void start() {
        sops.findRepeating();
    }
}

class DeleteRepeating extends Thread {
    StringOperations sops;

    DeleteRepeating(StringOperations sops) {
        this.sops = sops;
    }

    public void start() {
        sops.deleteRepeating();
    }
}

class Q5_Remove_Repeating_Words_Threading {
    public static void main(String args[]) {
        StringOperations sops = new StringOperations();

        Reader reader = new Reader(sops);
        FindRepeating list_rpt = new FindRepeating(sops);
        DeleteRepeating delete_rpt = new DeleteRepeating(sops);

        reader.start();
        list_rpt.start();
        delete_rpt.start();

        System.out.println();
    }
}
