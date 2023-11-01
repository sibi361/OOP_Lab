import java.util.Scanner;

class ReadStrings extends Thread {
    Scanner sc;
    String strings[];
    int n;

    ReadStrings(Scanner sc) {
        this.sc = sc;

        System.out.print("Enter count of strings: ");
        n = sc.nextInt();

        strings = new String[n];
    }

    public void start() {
        System.out.println("Enter strings:");
        sc.nextLine();
        for (int i = 0; i < n; i++)
            strings[i] = sc.nextLine();
    }

    String[] getStrings() {
        return strings;
    }
}

class VowelCharacterDisplay extends Thread {
    String strings[];

    VowelCharacterDisplay(ReadStrings reader) {
        strings = reader.getStrings();
    }

    public void start() {
        int count_vowels = 0, count_chars = 0;
        String vowel_characters = "aeiou";

        for (String str : strings) {
            count_vowels = 0;
            count_chars = str.replace("\s", "").length();

            for (int i = 0; i < str.length(); i++) {
                if (vowel_characters.indexOf(str.charAt(i)) != -1)
                    count_vowels++;
            }

            System.out.println("\nString: " + str + "\nContains " + count_vowels +
                    " vowels and " + count_chars + " characters");
        }
    }
}

class StringsSorter extends Thread {
    String strings[];
    int n;
    boolean swapped = false;

    StringsSorter(ReadStrings reader) {
        strings = reader.getStrings();
    }

    public void start() {
        n = strings.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }

        System.out.println("\nStrings after sorting:");
        for (String str : strings)
            System.out.println(str);
    }
}

class SubstringFinder extends Thread {
    Scanner sc;
    ReadStrings stringsReader;
    String key;

    SubstringFinder(Scanner sc, ReadStrings reader) {
        this.sc = sc;
        stringsReader = reader;
    }

    public void start() {
        boolean found = false;

        System.out.print("\nEnter substring to search: ");
        key = sc.next();

        System.out.println("\nStrings containing substring:");
        for (String str : stringsReader.getStrings())
            if (str.contains(key)) {
                found = true;
                System.out.println(str);
            }

        if (!found)
            System.out.println("No strings contained the given substring");
    }
}

class Q4_String_Statistics_Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ReadStrings reader = new ReadStrings(sc);
        VowelCharacterDisplay statistics = new VowelCharacterDisplay(reader);
        StringsSorter sorter = new StringsSorter(reader);
        SubstringFinder subFinder = new SubstringFinder(sc, reader);

        reader.start();
        statistics.start();
        sorter.start();
        subFinder.start();

        System.out.println();
        sc.close();
    }
}
