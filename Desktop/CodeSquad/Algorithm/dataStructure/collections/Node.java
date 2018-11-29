package dataStructure.collections;

public class Node<T> {
    public T data;
    public Node<T> prev;
    public Node<T> next;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[" +this.data.toString() + "]";
    }
}
