package dataStructure.collections;

import java.util.List;

public class DoublyLinkedList<T> implements DoublyLinkedListCollection {
    private Node<T> head = new Node<>();
    private Node<T> tail = new Node<>();

    public DoublyLinkedList() {
        head.next = tail;
        tail.prev = head;
        head.prev = tail.next = null;
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> node = head;
        while((node = node.next) != null && node.next != null) {
            count++;
        }
        return count;
    }

    @Override
    public boolean add(Node data) {
        data.prev = tail.prev;
        data.next = tail;
        tail.prev.next = data;
        tail.prev = data;
        return true;
    }

    @Override
    public boolean put(int index, Node data) {
        return false;
    }

    @Override
    public boolean addFirst(Node data) {
        data.prev = head.next.prev;
        data.next = head.next;
        head.next.prev = data;
        head.next = data;
        return true;
    }

    @Override
    public boolean addLast(Node data) {
        data.prev = tail.prev;
        data.next = tail;
        tail.prev.next = data;
        tail.prev = data;
        return true;
    }

    @Override
    public Node<T> removeFirst() {
        if(head.next == tail.prev) {
            throw new NullPointerException();
        }
        Node<T> node = head.next;
        head.next = head.next.next;
        head.next.prev.next = null;
        head.next.prev = head.next.prev.prev;
        head.next.prev.prev = null;
        head.next.prev = head;
        return node;
    }

    @Override
    public Node<T> removeLast() {
        if(head.next == tail.prev) {
            throw new NullPointerException();
        }
        Node<T> node = tail.prev;
        tail.prev = tail.prev.prev;
        tail.prev.next.prev = null;
        tail.prev.next.next = null;
        tail.prev.next = tail;
        return node;
    }

    @Override
    public Node<T> get(int index) {
        if(size() <= index) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head.next;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public Node<T> remove(int index) {
        return null;
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
        list.add(new Node(1));
        list.add(new Node(2));
        System.out.println(list.toString()); // [1] [2]

        list.addFirst(new Node(3));
        System.out.println(list.toString()); // [3] [1] [2]

        System.out.println(list.size()); // 3

        System.out.println(list.removeFirst().toString()); // [3]
        System.out.println(list.toString()); // [1] [2]

        System.out.println(list.removeLast().toString()); // [2]
        System.out.println(list.toString()); // [1]

        list.add(new Node(4));
        System.out.println(list.get(1).toString()); // [4]
    }
}
