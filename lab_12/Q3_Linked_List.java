import java.util.Scanner;
import java.lang.NullPointerException;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head;
    T obj;

    public LinkedList(T firstObj) {
        head = new Node<T>(firstObj);
    }

    public void append(T item) {
        Node<T> temp = head;

        try {
            while (temp.next != null)
                temp = temp.next;
        } catch (NullPointerException e) {
        }

        temp.next = new Node<T>(item);
    }

    public void traverse() {
        Node<T> temp = head;

        try {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } catch (NullPointerException e) {
            System.out.println();
        }
    }
}

class Q3_Linked_List {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count;
        LinkedList<Integer> listInt;
        LinkedList<String> listStr;

        System.out.print("Enter count: ");
        count = sc.nextInt();

        System.out.print("\nEnter integer elements: ");
        listInt = new LinkedList<Integer>(sc.nextInt());

        for (int i = 0; i < count - 1; i++)
            listInt.append(sc.nextInt());

        System.out.println("\nPrinting integer linked list:");
        listInt.traverse();

        System.out.print("\nEnter string elements: ");
        listStr = new LinkedList<String>(sc.next());

        for (int i = 0; i < count - 1; i++)
            listStr.append(sc.next());

        System.out.println("\nPrinting string linked list:");
        listStr.traverse();

        System.out.println();
        sc.close();
    }
}
