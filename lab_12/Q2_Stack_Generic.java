import java.util.Scanner;
import java.util.EmptyStackException;

class StackOverflowException extends Exception {
    public String toString() {
        return "StackOverflowException: Stack overflowed";
    }
}

class Stack<T> {
    private int DEFAULT_MAX_SIZE = 100, max_size, top;
    private T stack[];

    public Stack() {
        this.max_size = DEFAULT_MAX_SIZE;
        initializeStack();
    }

    public Stack(int user_max_size) {
        this.max_size = user_max_size;
        initializeStack();
    }

    private void initializeStack() {
        top = -1;
        stack = (T[]) new Object[max_size];
    }

    public void push(T item) throws StackOverflowException {
        if (top == this.max_size - 1)
            throw new StackOverflowException();
        this.stack[++top] = item;
    }

    public T pop() throws EmptyStackException {
        if (top == -1)
            throw new EmptyStackException();

        return this.stack[top--];
    }
}

class Student {
    private String name;
    private float mark;

    void getInput(Scanner sc) {
        System.out.print("\nEnter student name and mark: ");
        name = sc.next();
        mark = sc.nextFloat();
    }

    void display() {
        System.out.println("Name: " + name + "\nMark: " + mark);
    }
}

class Q2_Stack_Generic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student temp;
        int count;

        System.out.print("Enter student count: ");
        count = sc.nextInt();

        // size set one less than original to demonstrate overflow
        Stack<Student> st = new Stack<Student>(count - 1);

        for (int i = 0; i < count; i++) {
            temp = new Student();
            temp.getInput(sc);
            try {
                st.push(temp);
                System.out.println("Pushed student " + (i + 1) + " onto stack");
            } catch (StackOverflowException e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < count; i++) {
            try {
                temp = st.pop();
                System.out.println("\nPopped student " + (i + 1));
                temp.display();
            } catch (EmptyStackException e) {
                System.out.println("EmptyStackException: Stack Underflow");
            }
        }

        System.out.println();
        sc.close();
    }
}
