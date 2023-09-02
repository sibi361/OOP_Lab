import java.util.Scanner;

class Book {
    String title, author;
    int edition;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    void display() {
        System.out.println(title + ", edition " + edition);
    }

    static void showBooksFromAuthor(Book books[], String author) {
        boolean found = false;

        System.out.println("\nBooks written by author: " + author + ": ");
        for (int i = 0; i < books.length; i++)
            if (books[i].author.equals(author)) {
                found = true;
                books[i].display();
            }

        if (!found)
            System.out.println("No books found from given author");
    }
}

class Q6_Book {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books to input: ");
        n = sc.nextInt();
        Book books[] = new Book[n];

        System.out.println("Enter book details in this format: " +
                "title author edition");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book " + (i + 1) + ": ");
            books[i] = new Book(sc.next(), sc.next(), sc.nextInt());
        }

        System.out.print("\nEnter author to show books from: ");
        Book.showBooksFromAuthor(books, sc.next());

        sc.close();
        System.out.println();
    }
}
