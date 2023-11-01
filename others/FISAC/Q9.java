class A {
}

class B extends A {
}

class Node<T> {
}

class NewClass<T> implements Comparable<T> {
    public int compareTo(T obj) {
        return 0;
    }
}

class Q9 {
    public static void main(String args[]) {
        Node<B> nc = new Node<>();
        // Node<A> ns = nc; // error: incompatible types:
        // Node<B> cannot be converted to Node<A> because a generic
        // class variable of one type cannot contain an instance of
        // the same generic class variable of another type

        NewClass<String> node = new NewClass<>();
        Comparable<String> comp = node;
        // parent generic class variable can contain an instance of a
        // child generic class instance
    }
}
