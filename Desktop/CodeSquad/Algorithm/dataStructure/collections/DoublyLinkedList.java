package dataStructure.collections;

public class DoublyLinkedList<T> implements DoublyLinkedListCollection<T> {
    private Node<T> head = new Node<>();
    private Node<T> tail = new Node<>();
    private int count = 0;

    public DoublyLinkedList() {
        head.next = tail;
        tail.prev = head;
        head.prev = tail.next = null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(T data) {
        Node<T> node = new Node(data);
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;

        count++;
    }

    @Override
    public void put(int index, T data) {
        if(size() <= index || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = head.next;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        node.data = data;
    }

    @Override
    public void addFirst(T data) {
        Node node = new Node(data);
        node.prev = head.next.prev;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

        count++;
    }

    @Override
    public void addLast(T data) {
        Node<T> node = new Node(data);
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;

        count++;
    }

    @Override
    public T removeFirst() {
        if(head.next == tail.prev) {
            throw new NullPointerException();
        }

        Node<T> node = head.next;
        head.next = head.next.next;
        head.next.prev.next = null;
        head.next.prev = head.next.prev.prev;
        head.next.prev.prev = null;
        head.next.prev = head;

        count--;
        return node.data;
    }

    @Override
    public T removeLast() {
        if(head.next == tail.prev) {
            throw new NullPointerException();
        }

        Node<T> node = tail.prev;
        tail.prev = tail.prev.prev;
        tail.prev.next.prev = null;
        tail.prev.next.next = null;
        tail.prev.next = tail;

        count--;
        return node.data;
    }

    @Override
    public T get(int index) {
        if(size() <= index || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = head.next;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public T remove(int index) {
        if(size() <= index || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> prevNode = head;
        for(int i = 0; i < index; i++) {
            prevNode = prevNode.next;
        }

        Node<T> nextNode = tail;
        for(int i = 0; i < size() - index - 1; i++) {
            nextNode = nextNode.prev;
        }

        Node<T> node = nextNode.prev;

        prevNode.next = nextNode;
        prevNode.next.prev.next = null;
        nextNode.prev = null;
        nextNode.prev = prevNode;

        count--;

        return node.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> node = head;
        while((node = node.next) != null && node.next != null) {
            sb.append(node.toString());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DoublyLinkedListCollection<String> list = new DoublyLinkedList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.toString()); // [1] [2]

        list.addFirst("3");
        System.out.println(list.toString()); // [3] [1] [2]

        System.out.println(list.size()); // 3

        System.out.println(list.removeFirst()); // 3
        System.out.println(list.toString()); // [1] [2]

        System.out.println(list.removeLast()); // 2
        System.out.println(list.toString()); // [1]

        list.add("4");
        System.out.println(list.get(1)); // 4

        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9"); // [1] [4] [5] [6] [7] [8] [9]
        System.out.println(list.toString());

        System.out.println(list.remove(3)); // 6
        System.out.println(list.remove(5)); // 9
    }
}
